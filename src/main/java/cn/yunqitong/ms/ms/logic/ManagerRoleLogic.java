package cn.yunqitong.ms.ms.logic;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.yunqitong.dwz.ResultModel;
import cn.yunqitong.ms.ms.dao.client.TAuthorityMapper;
import cn.yunqitong.ms.ms.dao.client.TRoleAuthorityMapper;
import cn.yunqitong.ms.ms.dao.client.TRoleMapper;
import cn.yunqitong.ms.ms.dao.client.TUserRolesMapper;
import cn.yunqitong.ms.ms.dao.model.TRole;
import cn.yunqitong.ms.ms.dao.model.TRoleAuthority;
import cn.yunqitong.ms.ms.dao.model.TRoleAuthorityExample;
import cn.yunqitong.ms.ms.dao.model.TRoleExample;
import cn.yunqitong.ms.ms.dao.model.TUserRoles;
import cn.yunqitong.ms.ms.dao.model.TUserRolesExample;
import cn.yunqitong.ms.ms.dao.model.TUsers;
import cn.yunqitong.ms.ms.dao.model.TUsersExample;
import cn.yunqitong.util.IDGenerator;
import cn.yunqitong.util.PageInfoUtil;
@Service
public class ManagerRoleLogic {
	protected Logger log = Logger.getLogger(ManagerUserLogic.class);
	@Autowired
	private TRoleMapper rRoleMapper;
	@Autowired
	private TUserRolesMapper uerRolesMapper;
	@Autowired
	private TRoleAuthorityMapper troleAuthorityMapper;
	/**
	 * 查询角色列表列表
	 * @param tRole
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	public PageInfoUtil getPageInfo(TRole tRole, Integer pageNum, Integer numPerPage) {
		PageInfoUtil pageInfo = new PageInfoUtil();
		if (pageNum == null) {
			pageNum = 1;
		}
		if (numPerPage == null) {
			numPerPage = 20;
		}
		TRoleExample example = new TRoleExample();
		if (tRole.getRoleName() != null && !tRole.getRoleName().equals("")) {
			example.createCriteria().andRoleNameLike("%"+tRole.getRoleName()+"%");
		}
		// 分页处理
		PageHelper.startPage(pageNum, numPerPage);
		// 执行查询
		List<TRole> list = rRoleMapper.selectByExample(example);
		// 取分页信息
		PageInfo<TRole> pageInfo1 = new PageInfo<TRole>(list);
		// 返回处理结果
		pageInfo.setTotal(pageInfo1.getTotal());
		pageInfo.setList(list);
		pageInfo.setPageNum(pageInfo1.getPageNum());
		pageInfo.setPageSize(pageInfo1.getPageSize());
		return pageInfo;
	}
	
	/**
	 * 通过角色id查询角色
	 * 
	 * @param tUsers
	 * @return
	 */
	public TRole getRoleBYId(TRole tRoles) {
		TRole tRole = rRoleMapper.selectByPrimaryKey(tRoles.getRoleid());
		if (tRole == null) {
			// 如果未查到
			log.error("角色不存在");
		}
		return tRole;
	}

	/**
	 * 更改角色属性
	 * 
	 * @param tUsers
	 * @return
	 */
	public ResultModel editRole(TRole tRole) {
		ResultModel result = new ResultModel();
		int count = rRoleMapper.updateByPrimaryKeySelective(tRole);
		if (count < 1) {
			log.error("更新角色信息失败");
			result.setStatusCode("300");
			result.setMessage("更新失败,请稍后重试");
			return result;
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("更新角色信息成功");
		return result;
	}

	/**
	 * 添加一个角色
	 * @param tUsers
	 * @return
	 */
	public ResultModel addRole(TRole tRole) {
		ResultModel result = new ResultModel();
		tRole.setRoleid(IDGenerator.getId());
		log.info("向数据库中添加角色");
		int count = rRoleMapper.insertSelective(tRole);
		if (count < 1) {
			log.error("添加角色失败");
			result.setStatusCode("300");
			result.setMessage("添加失败,请稍后重试");
			return result;
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("添加角色成功");
		return result;
	}
	/**
	 * 删除角色
	 * @param ids 角色id
	 * @return    操作结果
	 */
	public ResultModel chDeleteRole(String[] ids) {
		log.info("删除角色  start ...");
		ResultModel result=new ResultModel();
	   /*
	    * 1.从角色权限表中删除此角色id所对应的所有记录
	    * 2.从用户角色表中删除此角色id所对应的所有记录
	    * 3.从角色表中删除此角色
	   */
		for(int i=0;i<ids.length;i++){
			TRoleAuthorityExample roleAuthorityExample=new TRoleAuthorityExample();
			roleAuthorityExample.createCriteria().andRoleIdEqualTo(ids[i]);
			List<TRoleAuthority> roleAuthorityList = troleAuthorityMapper.selectByExample(roleAuthorityExample);
		    if(roleAuthorityList!=null&&roleAuthorityList.size()>0){
		    	TRoleAuthority tRoleAuthority = roleAuthorityList.get(0);
		    	String roleId = tRoleAuthority.getRoleId();
		    	TRole tRole = rRoleMapper.selectByPrimaryKey(roleId);
		    	if(tRole!=null&&tRole.getRoleName().equals("超级管理员")){
		    		result.setStatusCode("300");
					result.setMessage("超级管理员角色不可删除!");
					return result;
		    	}
		    }
			log.info("从角色权限表中删除记录");
			try {
				log.info("从角色权限表中删除角色"+ids[i]+"记录");
				troleAuthorityMapper.deleteByExample(roleAuthorityExample);
			} catch (Exception e) {
				log.error("从角色权限表中删除角色记录时异常");
				result.setStatusCode("300");
				result.setMessage("从角色权限表中删除角色时异常");
				return result;
			}
			log.info("从角色表中删除该角色");
			int count = rRoleMapper.deleteByPrimaryKey(ids[i]);
			if(count<1){
				log.error("从角色表中删除角色"+ids[i]+"时失败");
				result.setStatusCode("300");
				result.setMessage("从角色表中删除角色时异常");
				return result;
			}
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("更新用户角色信息成功!");
		return result;
	}
	
}
