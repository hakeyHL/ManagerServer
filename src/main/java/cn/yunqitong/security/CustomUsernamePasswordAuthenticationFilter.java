package cn.yunqitong.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class CustomUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter{

	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		
		String validateCodeSession = (String)request.getSession().getAttribute("validateCode");
		String validateCodeClient = request.getParameter("validateCode");
		//验证码空值判断。
		if(!(validateCodeSession != null && !validateCodeSession.equals(""))){
			throw new ValidateCodeException("验证码未获取");
		}
		if(!(validateCodeClient != null && !validateCodeClient.equals(""))){
			throw new ValidateCodeException("验证码不能为空");
		}
		//验证码验证。
		if(!validateCodeSession.equals(validateCodeClient)){
			if(logger.isDebugEnabled()){
				logger.debug("validateCodeSession="+validateCodeSession+"   validateCodeClient="+validateCodeClient);
			}
			throw new ValidateCodeException("验证码错误");
		}
		//删除session中验证码
	    request.getSession().removeAttribute("validateCode");
		return super.attemptAuthentication(request, response);  
    }

}
