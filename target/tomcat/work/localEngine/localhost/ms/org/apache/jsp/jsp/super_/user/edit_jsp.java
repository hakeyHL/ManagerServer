package org.apache.jsp.jsp.super_.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";

      out.write("\r\n");
      out.write("<form method=\"post\" action=\"");
      out.print(basePath);
      out.write("super/user/edit\"\r\n");
      out.write("\t\tmethod=\"post\" class=\"pageForm required-validate\"\r\n");
      out.write("\t\tonsubmit=\"return iframeCallback(this, dialogAjaxDone);\">\r\n");
      out.write("<div class=\"pageContent\">\r\n");
      out.write("\t\t<input name=\"id\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tUser.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t<input name=\"name\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tUser.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t<input name=\"password\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tUser.password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t<div class=\"pageFormContent\" layoutH=\"56\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<label>用户名称:</label>\r\n");
      out.write("\t\t\t\t<label>\r\n");
      out.write("\t\t\t      <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tUser.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</label>\r\n");
      out.write("\t\t\t\t</label>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<label>是否可用：</label> <select name=\"enabled\" onselect=\"\">\r\n");
      out.write("\t\t\t\t\t<option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accountVo.type== 1? 'selected=\"selected\"\r\n						' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" value=\"1\">可用</option>\r\n");
      out.write("\t\t\t\t\t<option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accountVo.type== 0? 'selected=\"selected\"\r\n						' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" value=\"0\">不可用</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"formBar\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><div class=\"buttonActive\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"buttonContent\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\">修改</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"button\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"buttonContent\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\">取消</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>");
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
