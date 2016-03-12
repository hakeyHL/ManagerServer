package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head >\r\n");
      out.write("<title>云讯通系统管理平台</title>\r\n");
      out.write("\t<link href=\"");
      out.print(basePath );
      out.write("resources/style/login/login.css\"\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<!-- \r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("resources/js/plugins/sha256.js\"\ttype=\"text/javascript\" />\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/js/jquery-1.11.3.min.js\"\ttype=\"text/javascript\" />\r\n");
      out.write("\t -->\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("resources/js/plugins/sha256.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction formsubmit(){\r\n");
      out.write("\t\t\tvar cipherPass = sha256_digest($(\"#password\").val());\r\n");
      out.write("\t\t\t$(\"#password\").val(cipherPass);\r\n");
      out.write("\t\t\t$(\"#loginForm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t   $('#validateCode').bind('keypress',function(event){\r\n");
      out.write("\t            if(event.keyCode == \"13\")    \r\n");
      out.write("\t            {\r\n");
      out.write("\t            \tformsubmit();\r\n");
      out.write("\t            }\r\n");
      out.write("\t        });\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form  action=\"");
      out.print(basePath);
      out.write("loginin\" method=\"post\" id=\"loginForm\" >\r\n");
      out.write("\t\t<div class=\"Main\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"top\"></li>\r\n");
      out.write("\t\t\t\t<li class=\"top2\"></li>\r\n");
      out.write("\t\t\t\t<li class=\"topA\"></li>\r\n");
      out.write("\t\t\t\t<li class=\"topB\"><span style=\"font-size:30px;font-weight:600\">云企通综合管理系统\r\n");
      out.write("\t\t\t\t  </span></li>\r\n");
      out.write("            <li class=\"topC\"></li>\r\n");
      out.write("            <li class=\"topD\">\r\n");
      out.write("                <ul class=\"login\">\r\n");
      out.write("                    <li><span class=\"left\">用户名：</span> <span style=\"left\">\r\n");
      out.write("                       <input type=\"text\" name=\"username\"  class=\"txt\" />  \r\n");
      out.write("                     \r\n");
      out.write("                    </span></li>\r\n");
      out.write("                    <li><span class=\"left\">密 码：</span> <span style=\"left\">\r\n");
      out.write("                      <input type=\"password\" name=\"password\" id=\"password\" class=\"txt\" />  \r\n");
      out.write("                    </span></li>\r\n");
      out.write("                         <li><span class=\"left\">验证码：</span> <span style=\"left\">\r\n");
      out.write("                  \t\t <input name=\"validateCode\" id=\"validateCode\" type=\"text\" class=\"txtCode\" />  \r\n");
      out.write("                  \t\t <img src=\"");
      out.print(basePath);
      out.write("getValidateCode\"  onclick=\"this.src='");
      out.print(basePath);
      out.write("getValidateCode?'+Math.random()\" style=\"margin-left:20px;margin-bottom:-8px;cursor:pointer\"  width=\"75\" height=\"26\" />\r\n");
      out.write("                    </span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- \r\n");
      out.write("                    <li>\r\n");
      out.write("                    <span class=\"left\">记住我：</span>\r\n");
      out.write("                        <input id=\"Checkbox1\" type=\"checkbox\" />\r\n");
      out.write("                    </li>\r\n");
      out.write("                     -->\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"topE\"></li>\r\n");
      out.write("            <li class=\"middle_A\"></li>\r\n");
      out.write("            <li class=\"middle_B\"></li>\r\n");
      out.write("            <li class=\"middle_C\">\r\n");
      out.write("            <span class=\"btn\">\r\n");
      out.write("\t\t\t\t<img alt=\"\" onclick=\"formsubmit()\" style=\"cursor:pointer\" src=\"");
      out.print(basePath );
      out.write("resources/style/login/btnlogin.gif\" />\r\n");
      out.write("\t\t\t\t</span></li>\r\n");
      out.write("\t\t\t\t<li class=\"middle_D\"></li>\r\n");
      out.write("\t\t\t\t<li class=\"bottom_A\"></li>\r\n");
      out.write("\t\t\t\t<li class=\"bottom_B\"></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
