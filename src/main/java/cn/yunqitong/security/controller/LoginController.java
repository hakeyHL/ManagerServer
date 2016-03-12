package cn.yunqitong.security.controller;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.yunqitong.dwz.ResultModel;
import net.sf.json.JSONObject;
@Controller
public class LoginController {
	@RequestMapping("/loginChoose")
	public void loginChoose(HttpServletRequest req, HttpServletResponse resp){
		boolean isAjax = "XMLHttpRequest".equals(req.getHeader("X-Requested-With"));
		try{
			if (isAjax) {
				ResultModel resultModel = new ResultModel();
				resultModel.setStatusCode("301");
				JSONObject jsonObject = JSONObject.fromObject(resultModel);
				PrintWriter out = resp.getWriter();
				out.print(jsonObject.toString());
				out.flush();
				out.close();
				return;
			} else {
				String path = req.getContextPath();
				String basePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + path + "/";
				resp.sendRedirect(basePath + "jsp/login.jsp");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
