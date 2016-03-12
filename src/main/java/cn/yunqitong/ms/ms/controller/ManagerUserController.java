package cn.yunqitong.ms.ms.controller;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.yunqitong.dwz.ResultModel;
import cn.yunqitong.ms.ms.dao.model.TRole;
import cn.yunqitong.ms.ms.dao.model.TUsers;
import cn.yunqitong.ms.ms.logic.ManagerUserLogic;
import cn.yunqitong.util.HttpsUtil;
import cn.yunqitong.util.PageInfoUtil;
@Controller
@RequestMapping("/super")
public class ManagerUserController {
	@Autowired
	private ManagerUserLogic managerUserLogic;
	/**
	 * 查询管理员列表
	 * @param tUsers
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/user/list")
	public ModelAndView list(TUsers tUsers,Integer pageNum, Integer numPerPage){
		ModelAndView mv = new ModelAndView("super/user/list");
		PageInfoUtil  pageInfo = this.managerUserLogic.getPageInfo(tUsers,pageNum, numPerPage);
		mv.addObject("pageInfo", pageInfo);
		return mv;
	}
	/**
	 * 通过管理员id查询管理员
	 * @param tUsers
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/user/getById")
	public ModelAndView getBYId(TUsers tUsers) {
		ModelAndView mv = new ModelAndView("super/user/edit");
		TUsers tUser = this.managerUserLogic.getUserBYId(tUsers);
		mv.addObject("tUser", tUser);
		return mv;
	}
	/**
	 * 编辑管理员
	 * @param tUsers
	 * @return
	 */
	@RequestMapping("/user/edit")
	public String  editUser(TUsers tUsers,HttpServletResponse response) {
		ResultModel result = this.managerUserLogic.editUser(tUsers);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	
	/**
	 * 添加管理员
	 * @param tUsers
	 * @param pageNum
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/user/add")
	public String addUser(TUsers tUsers,HttpServletResponse response){
		ResultModel result = this.managerUserLogic.addUser(tUsers);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	/**
	 * 添加管理员(界面展示)
	 * @param tUsers
	 * @param pageNum 
	 * @param numPerPage
	 * @return
	 */
	@RequestMapping("/user/addshow")
	public ModelAndView addUser(){
		ModelAndView mv = new ModelAndView("super/user/add");
		return mv;
	}
	/**
	 * 更改用户角色(show)
	 * @param tUsers
	 * @param response
	 * @return
	 */
	@RequestMapping("/user/changerole/show")
	public ModelAndView chUserPermissionShow(TUsers tUsers){
		ModelAndView mv = new ModelAndView("super/user/changerole");
		List<TRole> roles = this.managerUserLogic.showUserPermission(tUsers);
		mv.addObject("tUsers",tUsers);
		mv.addObject("roles",roles);
		return mv;
	}
	/**
	 *更改管理员角色
	 * @param ids 角色ids
	 * @param id  用户id
	 * @param response 操作结果
	 * @return
	 */
	@RequestMapping("/user/changerole")
	public String chUserPermission(@RequestParam("ids") String []ids,@RequestParam("id")Long id,HttpServletResponse response){
		ResultModel result = this.managerUserLogic.chUserRoles(id,ids);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	/**
	 * 删除用户
	 * @param ids
	 * @param response
	 * @return
	 */
	@RequestMapping("/user/delete")
	public String chDeleterPermission(@RequestParam("ids") Long []ids,HttpServletResponse response){
		ResultModel result = this.managerUserLogic.chDeleteUser(ids);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
}
