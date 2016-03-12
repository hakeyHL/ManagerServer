package cn.yunqitong.ms.ms.controller;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.yunqitong.dwz.ResultModel;
import cn.yunqitong.ms.ms.dao.model.TAuthority;
import cn.yunqitong.ms.ms.logic.ManagerPermissionLogic;
import cn.yunqitong.util.HttpsUtil;
import cn.yunqitong.util.PageInfoUtil;
@Controller
@RequestMapping("super")
public class ManagerPermissionController {
	protected Logger log=Logger.getLogger(ManagerRoleController.class);
	@Autowired
	private ManagerPermissionLogic permissionLogic;
	/**
	 * 查询权限列表
	 * @param tRole
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/permission/list")
	public ModelAndView list(TAuthority tAuthority,Integer pageNum, Integer numPerPage){
		ModelAndView mv = new ModelAndView("super/permission/list");
		PageInfoUtil  pageInfo = this.permissionLogic.getPageInfo(tAuthority,pageNum, numPerPage);
		mv.addObject("pageInfo", pageInfo);
		return mv;
	}
	/**
	 * 通过权限id查询权限
	 * @param tUsers
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/permission/getById")
	public ModelAndView getBYId(TAuthority tAuthoritys) {
		ModelAndView mv = new ModelAndView("super/permission/edit");
		TAuthority tAuthority = this.permissionLogic.getPermissionBYId(tAuthoritys);
		mv.addObject("tAuthority", tAuthority);
		return mv;
	}
	/**
	 * 编辑权限
	 * @param tUsers
	 * @return
	 */
	@RequestMapping("/permission/edit")
	public String  editUser(TAuthority tAuthoritys,HttpServletResponse response) {
		ResultModel result = this.permissionLogic.editPermission(tAuthoritys);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	
	/**
	 * 添加权限
	 * @param tUsers
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/permission/add")
	public String addUser(TAuthority tAuthority,HttpServletResponse response){
		ResultModel result = this.permissionLogic.addPermission(tAuthority);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	/**
	 * 添加权限(界面展示)
	 * @param tUsers
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/permission/addshow")
	public ModelAndView addUser(){
		ModelAndView mv = new ModelAndView("super/permission/add");
		return mv;
	}
	/**
	 * 更改角色权限(界面展示)
	 * @param roleid 角色id
	 * @return
	 */
	@RequestMapping("/permission/chmpermission/show")
	public ModelAndView chpermissionshow(String roleid){
		List<TAuthority> authorityList=permissionLogic.getPermissionFilterBYRoleId(roleid);
		ModelAndView mv = new ModelAndView("super/permission/chpermissionshow");
		mv.addObject("authorityList", authorityList);
		mv.addObject("roleid", roleid);
		return mv;
	}
	/**
	 * 更改角色权限
	 * @param ids
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping("/permission/chmpermission")
	public String chUserPermission(@RequestParam("ids") String []ids,String roleid,HttpServletResponse response){
		ResultModel result = this.permissionLogic.chRolePermission(roleid,ids);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	/**
	 * 删除此权限及其相关关联
	 * @param ids  权限id
	 * @param response  操作结果
	 * @return
	 */
	@RequestMapping("/permission/delete")
	public String chDeleterPermission(@RequestParam("ids") String []ids,HttpServletResponse response){
		ResultModel result = this.permissionLogic.chDeletePermission(ids);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
}
