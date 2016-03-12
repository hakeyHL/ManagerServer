package cn.yunqitong.ms.ms.logic;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import cn.yunqitong.dwz.ResultModel;
import cn.yunqitong.ms.ms.dao.client.TUsersMapper;
import cn.yunqitong.ms.ms.dao.model.TUsers;
import cn.yunqitong.ms.ms.dao.model.TUsersExample;
import cn.yunqitong.util.CipherUtil;

@Service
public class CommonLogic {
	protected Logger log=Logger.getLogger(CommonLogic.class);
	@Autowired
	private TUsersMapper userMapper;
	/**
	 * 初始化选中管理员密码
	 * @param ids
	 * @return
	 */
	public ResultModel formatPwd(Long[] ids) {
		log.info("初始化密码...");
		ResultModel result=new ResultModel();
		for(int i=0;i<ids.length;i++){
			try {
				TUsers user = userMapper.selectByPrimaryKey(ids[i]);
				user.setPassword(CipherUtil.encryptWithSHA256("111111"));
				userMapper.updateByPrimaryKeySelective(user);
			} catch (Exception e) {
				log.error("初始化管理员密码失败");
				result.setStatusCode("300");
				result.setMessage("初始化密码失败");
				return result;
			}
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("初始化密码成功");
		return result;
	}
	/**
	 * 修改当前认证用户密码
	 * @return
	 */
	public ResultModel changePwd(String newPassword) {
		ResultModel result=new ResultModel();
		log.info("进入修改用户密码方法");
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		String name = authentication.getName();
		log.info("查询当前登录用户为"+name);
		TUsersExample example=new TUsersExample();
		example.createCriteria().andNameEqualTo(name);
		List<TUsers> selectByExample = userMapper.selectByExample(example);
		if(selectByExample!=null&&selectByExample.size()>0){
			log.info("获取当前用户信息....");
			//取第一个
			TUsers tUsers = selectByExample.get(0);
			if(tUsers!=null){
				log.info("更新当前用户信息....");
				//非空
				tUsers.setPassword(CipherUtil.encryptWithSHA256(newPassword));
				try {
					userMapper.updateByPrimaryKey(tUsers);
				} catch (Exception e) {
					result.setStatusCode("300");
					result.setMessage("修改密码失败");
					return result;
				}
			}
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("修改密码成功");
		return result;
	}
	
}
