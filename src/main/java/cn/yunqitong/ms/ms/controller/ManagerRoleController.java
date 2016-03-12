package cn.yunqitong.ms.ms.controller;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.yunqitong.dwz.ResultModel;
import cn.yunqitong.ms.ms.dao.client.TRoleMapper;
import cn.yunqitong.ms.ms.dao.model.TRole;
import cn.yunqitong.ms.ms.dao.model.TUsers;
import cn.yunqitong.ms.ms.logic.ManagerRoleLogic;
import cn.yunqitong.util.HttpsUtil;
import cn.yunqitong.util.PageInfoUtil;
@Controller
@RequestMapping("/super")
public class ManagerRoleController {
	protected Logger log=Logger.getLogger(ManagerRoleController.class);
	@Autowired
	private ManagerRoleLogic roleLogic;
	/**
	 * 查询角色列表
	 * @param tRole
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/role/list")
	public ModelAndView list(TRole tRole,Integer pageNum, Integer numPerPage){
		ModelAndView mv = new ModelAndView("super/role/list");
		PageInfoUtil  pageInfo = this.roleLogic.getPageInfo(tRole,pageNum, numPerPage);
		mv.addObject("pageInfo", pageInfo);
		return mv;
	}
	/**
	 * 通过角色id查询角色
	 * @param tUsers
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/role/getById")
	public ModelAndView getBYId(TRole tRoles) {
		ModelAndView mv = new ModelAndView("super/role/edit");
		TRole tRole = this.roleLogic.getRoleBYId(tRoles);
		mv.addObject("tRole", tRole);
		return mv;
	}
	/**
	 * 编辑角色
	 * @param tUsers
	 * @return
	 */
	@RequestMapping("/role/edit")
	public String  editUser(TRole tRoles,HttpServletResponse response) {
		ResultModel result = this.roleLogic.editRole(tRoles);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	
	/**
	 * 添加角色
	 * @param tUsers
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/role/add")
	public String addUser(TRole tRole,HttpServletResponse response){
		ResultModel result = this.roleLogic.addRole(tRole);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	/**
	 * 添加角色(界面展示)
	 * @param tUsers
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/role/addshow")
	public ModelAndView addUser(){
		ModelAndView mv = new ModelAndView("super/role/add");
		return mv;
	}
	/**
	 * 删除角色
	 * @param ids
	 * @param response
	 * @return
	 */
	@RequestMapping("/role/delete")
	public String chDeleterPermission(@RequestParam("ids") String []ids,HttpServletResponse response){
		ResultModel result = this.roleLogic.chDeleteRole(ids);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
}
