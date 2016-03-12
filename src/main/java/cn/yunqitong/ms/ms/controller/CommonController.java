package cn.yunqitong.ms.ms.controller;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.yunqitong.dwz.ResultModel;
import cn.yunqitong.ms.ms.logic.CommonLogic;
import cn.yunqitong.util.HttpsUtil;
@Controller
@RequestMapping("common")
public class CommonController {
	@Autowired
	private CommonLogic commonLogic;
	
	/**
	 * 初始化管理员密码
	 * @param ids 管理员id
	 * @param response
	 * @return
	 */
	@RequestMapping("user/formatpass")
	public String formatPwd(@RequestParam("ids")Long ids[],HttpServletResponse response){
		ResultModel result = this.commonLogic.formatPwd(ids);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	/**
	 * 修改管理员密码
	 * @param newPassword 新密码
	 * @param response
	 * @return
	 */
	@RequestMapping("user/changepwd")
	public String changetPwd(@RequestParam("newpwd")String newPassword,HttpServletResponse response){
		ResultModel result = this.commonLogic.changePwd(newPassword);
		JSONObject fromObject = JSONObject.fromObject(result);
		HttpsUtil.sendAppMessage(fromObject.toString(), response);
		return null;
	}
	
	/**
	 * 修改管理员密码(显示)
	 * @return
	 */
	@RequestMapping("user/changepwd/show")
	public ModelAndView changetPwdShow(){
		ModelAndView mv=new ModelAndView("super/user/changepwd");
		return mv;
	}
}
