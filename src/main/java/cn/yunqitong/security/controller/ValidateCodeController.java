package cn.yunqitong.security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yunqitong.security.logic.ValidateCodeLogic;

@Controller
public class ValidateCodeController {

	@Autowired
	private ValidateCodeLogic validateCodeLogic;
	
	@RequestMapping("/getValidateCode")
	public void writeValidateCode(HttpServletRequest req, HttpServletResponse resp){
		validateCodeLogic.writeCode(req, resp);
	}
}
