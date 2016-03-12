package cn.yunqitong.ms.ms.logic;
import java.util.Date;
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
import cn.yunqitong.ms.ms.dao.client.TUsersMapper;
import cn.yunqitong.ms.ms.dao.model.TAuthority;
import cn.yunqitong.ms.ms.dao.model.TRole;
import cn.yunqitong.ms.ms.dao.model.TRoleAuthority;
import cn.yunqitong.ms.ms.dao.model.TRoleAuthorityExample;
import cn.yunqitong.ms.ms.dao.model.TRoleExample;
import cn.yunqitong.ms.ms.dao.model.TUserRoles;
import cn.yunqitong.ms.ms.dao.model.TUserRolesExample;
import cn.yunqitong.ms.ms.dao.model.TUsers;
import cn.yunqitong.ms.ms.dao.model.TUsersExample;
import cn.yunqitong.util.PageInfoUtil;
@Service
public class ManagerUserLogic {
	protected Logger log = Logger.getLogger(ManagerUserLogic.class);
	@Autowired
	private TUsersMapper usersMapper;
	@Autowired
	private TRoleMapper rRoleMapper;
	@Autowired
	private TUserRolesMapper uerRolesMapper;
	@Autowired
	private TAuthorityMapper tauthorityMapper;
	@Autowired
	private TRoleAuthorityMapper troleAuthorityMapper;
	public PageInfoUtil getPageInfo(TUsers tUsers, Integer pageNum, Integer numPerPage) {
		PageInfoUtil pageInfo = new PageInfoUtil();
		if (pageNum == null) {
			pageNum = 1;
		}
		if (numPerPage == null) {
			numPerPage = 20;
		}
		TUsersExample example = new TUsersExample();
		if (tUsers.getName() != null &&! tUsers.getName().equals("")) {
			example.createCriteria().andNameLike("%"+tUsers.getName()+"%");
		}
		//超级管理员为系统默认不得修改,所以这里也不让看见
		example.createCriteria().andNameNotEqualTo("admin");
		// 分页处理
		PageHelper.startPage(pageNum, numPerPage);
		// 执行查询
		List<TUsers> list = usersMapper.selectByExample(example);
		for(TUsers tUser:list){
			StringBuilder sb=new StringBuilder();
			//获取用户id
			Long userId = tUser.getId();
			TUserRolesExample userRoleExample=new TUserRolesExample();
			//根据用户id从用户-角色表 查询角色-角色记录
			userRoleExample.createCriteria().andUserIdEqualTo(userId);
			List<TUserRoles> roleList = uerRolesMapper.selectByExample(userRoleExample);
			if(roleList!=null&&roleList.size()>0){
				//获取权限并赋值
				for(TUserRoles permisson:roleList){
					sb.append(permisson.getName()+"--");
				}
				//如果查询到记录,则赋值
				TUserRoles tUserRoles = roleList.get(0);
				//根据角色id获取角色名称
				TRole roli = rRoleMapper.selectByPrimaryKey(tUserRoles.getRoleId());
				if(roli!=null){
					tUser.setRolename(roli.getRoleName());
				}
				tUser.setRoleid(tUserRoles.getRoleId());
				//附加权限
				tUser.setPermissions(sb.toString());
			}
		}
		// 取分页信息
		PageInfo<TUsers> pageInfo1 = new PageInfo<TUsers>(list);
		// 返回处理结果
		pageInfo.setTotal(pageInfo1.getTotal());
		pageInfo.setList(list);
		pageInfo.setPageNum(pageInfo1.getPageNum());
		pageInfo.setPageSize(pageInfo1.getPageSize());
		return pageInfo;
	}

	/**
	 * 通过用户id查询用户
	 * @param tUsers
	 * @return
	 */
	public TUsers getUserBYId(TUsers tUsers) {
		TUsers tUser = usersMapper.selectByPrimaryKey(tUsers.getId());
		if (tUser == null) {
			// 如果未查到
			log.error("用户不存在");
		}
		return tUser;
	}

	/**
	 * 更改用户属性
	 * 
	 * @param tUsers
	 * @return
	 */
	public ResultModel editUser(TUsers tUsers) {
		ResultModel result = new ResultModel();
		int count = usersMapper.updateByPrimaryKeySelective(tUsers);
		if (tUsers.getEnabled() == false) {

		}
		if (count < 1) {
			log.error("更新用户信息失败");
			result.setStatusCode("300");
			result.setMessage("更新失败,请稍后重试");
			return result;
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("更新用户信息成功");
		return result;
	}

	/**
	 * 添加一个管理员
	 * 
	 * @param tUsers
	 * @return
	 */
	public ResultModel addUser(TUsers tUsers) {
		ResultModel result = new ResultModel();
		tUsers.setId(new Date().getTime());
		tUsers.setPassword("bcb15f821479b4d5772bd0ca866c00ad5f926e3580720659cc80d39c9d09802a");
		log.info("向数据库中添加管理员");
		int count = usersMapper.insertSelective(tUsers);
		if (count < 1) {
			log.error("更新用户信息失败");
			result.setStatusCode("300");
			result.setMessage("更新失败,请稍后重试");
			return result;
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("更新用户信息成功");
		return result;
	}
	/**
	 * 查询所有角色
	 * @param tUsers
	 * @return
	 */
	public List<TRole> showUserPermission(TUsers tUsers) {
		TRoleExample example=new TRoleExample();
		example.createCriteria().andRoleidIsNotNull();
		List<TRole> roleList = rRoleMapper.selectByExample(example);
		if(roleList!=null&&roleList.size()>0){
			for(TRole role:roleList){
				//遍历所有角色,判断是否属于当前用户,如果属于,则做标记
				TUserRolesExample examples=new TUserRolesExample();
				examples.createCriteria().andRoleIdEqualTo(role.getRoleid()).andUserIdEqualTo(tUsers.getId());
				List<TUserRoles> selectByExample = uerRolesMapper.selectByExample(examples);
				if(selectByExample!=null&&selectByExample.size()>0){
					//有匹配,则对此角色已经属于该用户做标记
					role.setUsed(1);
				}
			}
		}
		return roleList;
	}
	/**
	 * 修改用户角色属性
	 * @param tUsers
	 * @param ids
	 * @return
	 */
	public ResultModel chUserRoles(Long id, String[] ids) {
		ResultModel result=new ResultModel();
		try {
			//1.删除该用户下所有关联角色
			TUserRolesExample roleExample=new TUserRolesExample();
			roleExample.createCriteria().andUserIdEqualTo(id);
			uerRolesMapper.deleteByExample(roleExample);
			/*
			 *分析:
			 *   拥有元素:用户id   角色id们
			 *   1.删除用户角色表中该用户的所有记录
			 *   2.根据用户id查询用户
			 *   3.遍历这些角色id们,以此在角色权限表中查询每个角色对应的权限们
			 *   4.以此权限id从权限表中获取权限名称赋值给name属性 
			*/
			TUsers users = usersMapper.selectByPrimaryKey(id);
			for(int i=0;i<ids.length;i++){
				TRoleAuthorityExample roleAuthorityExample=new TRoleAuthorityExample();
				roleAuthorityExample.createCriteria().andRoleIdEqualTo(ids[i]);
				List<TRoleAuthority> roleAuthorityList = troleAuthorityMapper.selectByExample(roleAuthorityExample);
				if(roleAuthorityList!=null&&roleAuthorityList.size()>0){
					for(TRoleAuthority roleAuthority:roleAuthorityList){
						TAuthority authority = tauthorityMapper.selectByPrimaryKey(roleAuthority.getAuthorityId());
						if(authority!=null){
							TUserRoles record=new TUserRoles();
							record.setId(new Date().getTime());
							record.setName(authority.getResourceName());
							record.setRoleId(ids[i]);
							record.setUserId(users.getId());
							record.setUserName(users.getName());
							uerRolesMapper.insert(record);
						}
					}
				}else{
					//如果为空,只能代表该角色还未绑定任何权限,但是要添加进去,只是name属性设置为none
					TUserRoles record2=new TUserRoles();
					record2.setId(new Date().getTime());
					record2.setName("none");
					record2.setRoleId(ids[i]);
					record2.setUserId(users.getId());
					record2.setUserName(users.getName());
					uerRolesMapper.insert(record2);
				}
			}
		} catch (Exception e) {
			log.error("更新用户角色信息时失败"+e.getMessage(),e);
			result.setStatusCode("300");
			result.setMessage("更新用户角色信息失败!");
			return result;
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("更新用户角色信息成功!");
		//3.返回操作结果
		return result;
	}
	/**
	 * 删除管理员
	 * @param ids 管理员id
	 * @return    操作结果
	 */
	public ResultModel chDeleteUser(Long[] ids) {
		log.info("开始删除管理员... start ");
		ResultModel result=new ResultModel();
		/*
		 * 1.从用户角色表中删除所有此用户id匹配的记录
		 * 2.从用户表中删除此用户
		*/
		for(int i=0;i<ids.length;i++){
			TUserRolesExample userRoleExample=new TUserRolesExample();
			userRoleExample.createCriteria().andUserIdEqualTo(ids[i]);
			try {
				log.info("从用户角色表中删除用户"+ids[i]);
				uerRolesMapper.deleteByExample(userRoleExample);
			} catch (Exception e) {
				log.error("从用户角色表中删除此用户记录时异常");
				result.setStatusCode("300");
				result.setMessage("从用户角色表中删除此用户记录时异常");
				return result;
			}
			log.info("从用户表中删除此用户"+ids[i]);
			int count = usersMapper.deleteByPrimaryKey(ids[i]);
			if(count<1){
				log.error("从用户表中删除用户"+ids[i]+"时失败");
				result.setStatusCode("300");
				result.setMessage("从用户表中删除用户时异常");
				return result;
			}
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("更新用户角色信息成功!");
		return result;
	}
}
