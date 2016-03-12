package cn.yunqitong.ms.ms.logic;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yunqitong.dwz.ResultModel;
import cn.yunqitong.ms.ms.dao.client.TAuthorityMapper;
import cn.yunqitong.ms.ms.dao.client.TRoleAuthorityMapper;
import cn.yunqitong.ms.ms.dao.client.TUserRolesMapper;
import cn.yunqitong.ms.ms.dao.model.TAuthority;
import cn.yunqitong.ms.ms.dao.model.TAuthorityExample;
import cn.yunqitong.ms.ms.dao.model.TRole;
import cn.yunqitong.ms.ms.dao.model.TRoleAuthority;
import cn.yunqitong.ms.ms.dao.model.TRoleAuthorityExample;
import cn.yunqitong.ms.ms.dao.model.TUserRoles;
import cn.yunqitong.ms.ms.dao.model.TUserRolesExample;
import cn.yunqitong.util.IDGenerator;
import cn.yunqitong.util.PageInfoUtil;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class ManagerPermissionLogic {
	protected Logger log = Logger.getLogger(ManagerPermissionLogic.class);
	@Autowired
	private TAuthorityMapper authorityMapper;
	@Autowired
	private TRoleAuthorityMapper roleAuthorityMapper;
	@Autowired
	private TUserRolesMapper tuerRolesMapper;
	/**
	 * 查询权限列表列表
	 * @param tRole
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	public PageInfoUtil getPageInfo(TAuthority tAuthority, Integer pageNum, Integer numPerPage) {
		PageInfoUtil pageInfo = new PageInfoUtil();
		if (pageNum == null) {
			pageNum = 1;
		}
		if (numPerPage == null) {
			numPerPage = 20;
		}
		TAuthorityExample example = new TAuthorityExample();
		if (tAuthority.getResourceName()!=null&&!tAuthority.getResourceName().equals("")) {
			example.createCriteria().andResourceNameLike("%"+tAuthority.getResourceName()+"%");
		}
		// 分页处理
		PageHelper.startPage(pageNum, numPerPage);
		// 执行查询
		List<TAuthority> list = authorityMapper.selectByExample(example);
		// 取分页信息
		PageInfo<TAuthority> pageInfo1 = new PageInfo<TAuthority>(list);
		// 返回处理结果
		pageInfo.setTotal(pageInfo1.getTotal());
		pageInfo.setList(list);
		pageInfo.setPageNum(pageInfo1.getPageNum());
		pageInfo.setPageSize(pageInfo1.getPageSize());
		return pageInfo;
	}
	
	/**
	 * 通过权限id查询权限
	 * 
	 * @param tUsers
	 * @return
	 */
	public TAuthority getPermissionBYId(TAuthority tAuthoritys) {
		TAuthority tAuthority = authorityMapper.selectByPrimaryKey(tAuthoritys.getAuthorityid());
		if (tAuthority == null) {
			// 如果未查到
			log.error("权限不存在");
		}
		return tAuthority;
	}

	/**
	 * 更改权限属性
	 * 
	 * @param tUsers
	 * @return
	 */
	public ResultModel editPermission(TAuthority tAuthority) {
		ResultModel result = new ResultModel();
		int count = authorityMapper.updateByPrimaryKeySelective(tAuthority);
		if (count < 1) {
			log.error("更新权限信息失败");
			result.setStatusCode("300");
			result.setMessage("更新失败,请稍后重试");
			return result;
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("更新权限信息成功");
		return result;
	}

	/**
	 * 添加一个权限
	 * @param tUsers
	 * @return
	 */
	public ResultModel addPermission(TAuthority tAuthority) {
		ResultModel result = new ResultModel();
		tAuthority.setAuthorityid(IDGenerator.getId());
		log.info("向数据库中添加权限");
		int count = authorityMapper.insertSelective(tAuthority);
		if (count < 1) {
			log.error("添加权限失败");
			result.setStatusCode("300");
			result.setMessage("添加失败,请稍后重试");
			return result;
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("添加权限成功");
		return result;
	}
	/**
	 * 查询所有权限并根据角色id做过滤标记显示
	 * @param roleid 角色id
	 * @return
	 */
	public List<TAuthority> getPermissionFilterBYRoleId(String roleid) {
		//设计权限表,角色权限表
		//1.查询所有权限
		TAuthorityExample authorityExample=new TAuthorityExample();
		authorityExample.createCriteria().andAuthorityidIsNotNull();
		List<TAuthority> authorityList = authorityMapper.selectByExample(authorityExample);
		//根据角色id查询该角色下的所有权限
		TRoleAuthorityExample roleAuthorityExample=new TRoleAuthorityExample();
		roleAuthorityExample.createCriteria().andRoleIdEqualTo(roleid);
		List<TRoleAuthority> authorityListByRoleId = roleAuthorityMapper.selectByExample(roleAuthorityExample);
		if(authorityList!=null&&authorityList.size()>0){
			//如果权限列表查询不为空,则遍历权限列表
			for(TAuthority authority:authorityList){
				if(authorityListByRoleId!=null&authorityListByRoleId.size()>0){
					//如果按照此角色id从角色-权限表查询到数据,则遍历此查询结果
					for(TRoleAuthority roleAuthority:authorityListByRoleId){
						if(roleAuthority.getAuthorityId().equals(authority.getAuthorityid())){
							//如果权限列表中的权限与该角色用户的权限匹配,则标记拥有
							authority.setUsed(1);
						}
					}
				}
			}
		}
		//2.查询该用户所拥有的权限
		return authorityList;
	}
	/**
	 * 更改角色权限
	 * @param roleid 角色id
	 * @param ids    选择的权限
	 * @return
	 */
	public ResultModel chRolePermission(String roleid, String[] ids) {
		ResultModel result=new ResultModel();
		//1.删除t_role_authority表中的此roleid映射关系
		TRoleAuthorityExample roleAuthorityExample=new TRoleAuthorityExample();
		roleAuthorityExample.createCriteria().andRoleIdEqualTo(roleid);
		try {
			roleAuthorityMapper.deleteByExample(roleAuthorityExample);
		} catch (Exception e) {
			log.error("从角色、权限表中删除数据时异常...");
			result.setStatusCode("300");
			result.setMessage("操作失败");
		}
		//2.插入t_role_authority表roleid和 authorityid的映射关系
		for(int i=0;i<ids.length;i++){
			TRoleAuthority record=new TRoleAuthority();
			record.setRoleId(roleid);
			record.setAuthorityId(ids[i]);
			try {
				roleAuthorityMapper.insert(record);
			} catch (Exception e) {
				log.error("向角色、权限表中插入数据时异常...");
				result.setStatusCode("300");
				result.setMessage("操作失败");
			}
		}
		//3.更新role-user表中的字段属性  name字段为权限名称 此表还有自身id user_id user_name  role_id 
		//用户和角色的对应关系没有发生改变,变的是因为角色对应的权限的变更使得角色*权限的数量改变
		//当角色对应的权限有变更无非为两种  1、增加了  2、减少了
		  //1.增加了:
		      //   对应用户-角色表中就应该是  查询拥有该角色的记录,id随机生成,再按照相同的数据只有name(权限)不同增加记录
		  //好吧,目前这种状态是无法判断是增加了还是减少了。
		//设计思想应该是:查询用户-角色表中角色id为此角色的记录,设置name字段值为指定统一字符串
		//计算上次查询的记录结果数量,获得一条记录,按照角色-权限表中该角色拥有多少个权限数量,根据权限id查询权限名称设置到name
		TUserRolesExample userRoleExample=new TUserRolesExample();
		userRoleExample.createCriteria().andRoleIdEqualTo(roleid);
		List<TUserRoles> userROleList = tuerRolesMapper.selectByExample(userRoleExample);
		TUserRoles userRoleUse=null;
		if(userROleList!=null&&userROleList.size()>0){
			//如果查询结果不为空,随便获取一条记录作为基准
			log.info("查询到用户角色表中该角色的记录,取第一条赋值..");
			userRoleUse=userROleList.get(0);
			for(TUserRoles userRoles:userROleList){
				log.info("从用户角色表中删除此角色关联的记录");
				//删除数据
				tuerRolesMapper.deleteByPrimaryKey(userRoles.getId());
			}
		}
		if(userRoleUse!=null){
			log.info("如果上述赋值成功,取赋值结果根据角色对应权限数量向用户,角色表中插入数据");
			//如果第一步操作成功,那么现在传进来ids已经为该角色下的所有权限了,根据这些权限id获取权限名称,赋值
			for(int i=0;i<ids.length;i++){
				TAuthority authority = authorityMapper.selectByPrimaryKey(ids[i]);
				TUserRoles record=new TUserRoles();
				record.setId(new Date().getTime());
				record.setRoleId(userRoleUse.getRoleId());
				record.setUserId(userRoleUse.getUserId());
				record.setUserName(userRoleUse.getUserName());
				record.setName(authority.getResourceName());
				//向用户-角色表中插入数据
				tuerRolesMapper.insert(record);
			}
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("操作成功");
		return result;
	}
	/**
	 * 删除权限
	 * @param ids
	 * @return
	 */
	public ResultModel chDeletePermission(String[] ids) {
		ResultModel result=new ResultModel();
		log.info("删除权限..start ");
		/*
		 * 1.通过权限id获得权限名
		 * 2.从角色权限表中删除此权限对应的所有记录
		 * 3.从用户角色表中删除权限名为此权限名的所有记录
		 * 4.从权限表中删除此权限
		*/
		for(int i=0;i<ids.length;i++){
			TAuthority authority = authorityMapper.selectByPrimaryKey(ids[i]);
			if(authority!=null){
				//查询到,获得权限名
				String authorityName=authority.getResourceName();
				if(authorityName.equals("admin")){
					result.setStatusCode("300");
					result.setMessage("admin权限不可删除!");
					return result;
				}
				log.info("获得权限名"+authorityName);
				TRoleAuthorityExample roleAuthorityExample=new TRoleAuthorityExample();
				roleAuthorityExample.createCriteria().andAuthorityIdEqualTo(ids[i]);
				log.info("从角色权限表中删除此权限所对应的多有记录");
				try {
					roleAuthorityMapper.deleteByExample(roleAuthorityExample);
				} catch (Exception e) {
					log.error("从角色权限表中删除权限id为"+ids[i]+"的记录时异常");
					result.setStatusCode("300");
					result.setMessage("从角色权限表中删除"+authorityName+"权限时失败");
					return result;
				}
				//从用户角色表中删除权限名为此权限名的所有记录
				TUserRolesExample userRoleExample=new TUserRolesExample();
				userRoleExample.createCriteria().andNameEqualTo(authorityName);
				log.info("从用户角色表中删除此权限所对应的多有记录");
				try {
					tuerRolesMapper.deleteByExample(userRoleExample);
				} catch (Exception e) {
					log.error("从用户角色表中删除权限名为"+authorityName+"的记录时异常");
					result.setStatusCode("300");
					result.setMessage("从用户角色表中删除权限名为"+authorityName+"的记录时异常");
					return result;
				}
				log.info("从权限表中删除此记录");
				int count = authorityMapper.deleteByPrimaryKey(ids[i]);
				if(count<1){
					log.error("从权限表中删除此权限失败"+ids[i]);
					result.setStatusCode("300");
					result.setMessage("从权限表中删除此权限失败"+ids[i]);
					return result;
				}
			}
		}
		result.setCallbackType("closeCurrent");
		result.setStatusCode("200");
		result.setMessage("操作成功!");
		return result;
	}
}
