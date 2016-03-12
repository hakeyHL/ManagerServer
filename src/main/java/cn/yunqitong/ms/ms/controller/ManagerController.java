package cn.yunqitong.ms.ms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yunqitong.ms.common.VersionDeclare;
import cn.yunqitong.ms.ms.logic.ManagerLogic;
import cn.yunqitong.util.HttpsUtil;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	@Autowired
	private ManagerLogic managerLogic;
	/**
	 * 跳转至oss管理系统
	 * @return
	 */
	@RequestMapping("/oss")
	public String redirect2OSS() {
		String redirect_url = managerLogic.geToken2OSS();
		return "redirect:"+redirect_url;
	}
	/**
	 * 跳转至as管理系统
	 * @return
	 */
	@RequestMapping("/as")
	public String redirect2AS() {
		String redirect_url = managerLogic.geToken2AS();
		return "redirect:"+redirect_url;
	}
	
	/**
	 * 跳转至as管理系统
	 * @return
	 */
	@RequestMapping("/bss")
	public String redirect2BSS() {
		String redirect_url = managerLogic.geToken2BSS();
		return "redirect:"+redirect_url;
	}
	
	/**
	 * 跳转至联通adapter管理系统
	 * @return
	 */
	@RequestMapping("/chuanadapter")
	public String redirect2chuanAdapter() {
		String redirect_url = managerLogic.geToken2chuanAdapter();
		return "redirect:"+redirect_url;
	}
	/**
	 * 跳转到恋家bss
	 * @return
	 */
	@RequestMapping("/lianjiabss")
	public String redirect2lianjiabss() {
		String redirect_url = managerLogic.geToken2lianjiabss();
		return "redirect:"+redirect_url;
	}
	
	@RequestMapping("/lianjiadss")
	public String redirect2lianjiadss() {
		String redirect_url = managerLogic.geToken2lianjiadss();
		return "redirect:"+redirect_url;
	}
	
	/**
	 * 跳转到MediaServer 恋家
	 * @return
	 */
	@RequestMapping("/media")
	public String redirect2Media() {
		String redirect_url = managerLogic.geToken2Media();
		return "redirect:"+redirect_url;
	}
	
	
	@RequestMapping("/version")
	public String getVersion(HttpServletRequest request, HttpServletResponse response) {
		String msVersion = VersionDeclare.msVersion;
		HttpsUtil.sendAppMessage(msVersion, response);
		return null;
	}
}
