package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>首页</title>\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("resources/dwz/themes/default/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("resources/dwz/themes/css/core.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("resources/dwz/themes/css/print.css\" rel=\"stylesheet\" type=\"text/css\" media=\"print\"/>\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("resources/dwz/uploadify/css/uploadify.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<!--[if IE]>\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("resources/dwz/themes/css/ieHack.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!--[if lt IE 9]><script src=\"");
      out.print(basePath);
      out.write("resources/dwz/js/speedup.js\" type=\"text/javascript\"></script><script src=\"");
      out.print(basePath);
      out.write("resources/dwz/js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script><![endif]-->\r\n");
      out.write("<!--[if gte IE 9]><!--><script src=\"");
      out.print(basePath);
      out.write("resources/dwz/js/jquery-2.1.4.min.js\" type=\"text/javascript\"></script><!--<![endif]-->\r\n");
      out.write(" \r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/js/jquery.cookie.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/js/jquery.validate.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/js/jquery.bgiframe.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/xheditor/xheditor-1.2.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/xheditor/xheditor_lang/zh-cn.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/uploadify/scripts/jquery.uploadify.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/bin/dwz.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resources/dwz/js/dwz.regional.zh.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\tDWZ.init(\"");
      out.print(basePath);
      out.write("resources/dwz/dwz.frag.xml\", {\r\n");
      out.write("//\t\tloginUrl:\"");
      out.print(basePath);
      out.write("resources/dwz/login_dialog.html\", loginTitle:\"登录\",\t// 弹出登录对话框\r\n");
      out.write("\t\tloginUrl:\"");
      out.print(basePath);
      out.write("jsp/login.jsp\",\t// 跳到登录页面\r\n");
      out.write("\t\tstatusCode:{ok:200, error:300, timeout:301}, //【可选】\r\n");
      out.write("\t\tpageInfo:{pageNum:\"pageNum\", numPerPage:\"numPerPage\", orderField:\"orderField\", orderDirection:\"orderDirection\"}, //【可选】\r\n");
      out.write("\t\tkeys: {statusCode:\"statusCode\", message:\"message\"}, //【可选】\r\n");
      out.write("\t\tui:{hideMode:'offsets'}, //【可选】hideMode:navTab组件切换的隐藏方式，支持的值有’display’，’offsets’负数偏移位置的值，默认值为’display’\r\n");
      out.write("\t\tdebug:true,\t// 调试模式 【true|false】\r\n");
      out.write("\t\tcallback:function(){\r\n");
      out.write("\t\t\tinitEnv();\r\n");
      out.write("\t\t\t$(\"#themeList\").theme({themeBase:\"");
      out.print(basePath);
      out.write("resources/dwz/themes\"}); // themeBase 相对于index页面的主题base路径\r\n");
      out.write("\t\t\t//navTab.openTab(\"yhglLiNav\",\"");
      out.print(path);
      out.write("/yxt/companyController/findByCondition\",{title:\"用户管理\",fresh:false,data:{}});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body scroll=\"no\">\r\n");
      out.write("\t<div id=\"layout\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div class=\"headerNav\">\r\n");
      out.write("\t\t\t\t<span style=\"padding-left:25px;position: absolute;top: 8px;font-size:25px;font-weight:500;color:white\">云企通综合管理系统   </span>\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:void(0);\">");
      if (_jspx_meth_sec_005fauthentication_005f0(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("loginout\">退出</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"leftside\">\r\n");
      out.write("\t\t\t<div id=\"sidebar_s\">\r\n");
      out.write("\t\t\t\t<div class=\"collapse\">\r\n");
      out.write("\t\t\t\t\t<div class=\"toggleCollapse\"><div></div></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"toggleCollapse\"><h2>主菜单</h2><div>收缩</div></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"accordion\" fillSpace=\"sidebar\">\r\n");
      out.write("\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f0.setParent(null);
      // /jsp/index.jsp(76,4) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f0.setAccess("hasRole('admin')");
      int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t<div class=\"accordionHeader\">\r\n");
        out.write("\t\t\t\t\t\t<h2><span>Folder</span>超级管理员</h2>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"accordionContent\">\r\n");
        out.write("\t\t\t\t\t\t<ul class=\"tree treeFolder\">\r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("super/role/list\" target=\"navTab\" rel=\"role\">角色管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("super/permission/list\" target=\"navTab\" rel=\"role\">权限管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("as/version/list\" target=\"navTab\" rel=\"version\">云企通版本管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("super/user/list\" target=\"navTab\" rel=\"admin\">系统管理员管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("common/user/changepwd/show\" target=\"dialog\" rel=\"admin\">修改密码</a></li>\r\n");
        out.write("\t\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"accordionHeader\">\r\n");
      out.write("\t\t\t\t\t\t<h2><span>Folder</span>系统管理员</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"accordionContent\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"tree treeFolder\">\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f1.setParent(null);
      // /jsp/index.jsp(95,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f1.setAccess("hasRole('as')");
      int _jspx_eval_sec_005fauthorize_005f1 = _jspx_th_sec_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/as\" target=\"_blank\" rel=\"zoomlocal\">AS管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f1);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f2.setParent(null);
      // /jsp/index.jsp(98,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f2.setAccess("hasRole('xxx')");
      int _jspx_eval_sec_005fauthorize_005f2 = _jspx_th_sec_005fauthorize_005f2.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/ps\" target=\"navTab\" rel=\"zoomserver\">PS管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f2);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f3 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f3.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f3.setParent(null);
      // /jsp/index.jsp(101,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f3.setAccess("hasRole('oss')");
      int _jspx_eval_sec_005fauthorize_005f3 = _jspx_th_sec_005fauthorize_005f3.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/oss\" target=\"_blank\">OSS管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f3);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f4 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f4.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f4.setParent(null);
      // /jsp/index.jsp(104,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f4.setAccess("hasRole('bss')");
      int _jspx_eval_sec_005fauthorize_005f4 = _jspx_th_sec_005fauthorize_005f4.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/bss\" target=\"_blank\" rel=\"user\">BSS管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f4);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f5 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f5.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f5.setParent(null);
      // /jsp/index.jsp(107,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f5.setAccess("hasRole('chuanadapter')");
      int _jspx_eval_sec_005fauthorize_005f5 = _jspx_th_sec_005fauthorize_005f5.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/chuanadapter\" target=\"_blank\" rel=\"user\">四川联通adapter管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f5);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f6 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f6.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f6.setParent(null);
      // /jsp/index.jsp(110,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f6.setAccess("hasRole('lianjiabss')");
      int _jspx_eval_sec_005fauthorize_005f6 = _jspx_th_sec_005fauthorize_005f6.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/lianjiabss\" target=\"_blank\" rel=\"user\">恋家bss管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f6);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f7 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f7.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f7.setParent(null);
      // /jsp/index.jsp(113,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f7.setAccess("hasRole('lianjiadss')");
      int _jspx_eval_sec_005fauthorize_005f7 = _jspx_th_sec_005fauthorize_005f7.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/lianjiadss\" target=\"_blank\" rel=\"user\">恋家ds管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f7);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f8 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f8.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f8.setParent(null);
      // /jsp/index.jsp(116,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f8.setAccess("hasRole('media')");
      int _jspx_eval_sec_005fauthorize_005f8 = _jspx_th_sec_005fauthorize_005f8.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/media\" target=\"_blank\" rel=\"user\">恋家 MediaServer管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f8);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f9 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f9.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f9.setParent(null);
      // /jsp/index.jsp(121,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f9.setAccess("hasRole('admin')");
      int _jspx_eval_sec_005fauthorize_005f9 = _jspx_th_sec_005fauthorize_005f9.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/as\" target=\"_blank\" rel=\"zoomlocal\">AS管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f9);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f10 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f10.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f10.setParent(null);
      // /jsp/index.jsp(124,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f10.setAccess("hasRole('xxx')");
      int _jspx_eval_sec_005fauthorize_005f10 = _jspx_th_sec_005fauthorize_005f10.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/ps\" target=\"navTab\" rel=\"zoomserver\">PS管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f10);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f10);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f11 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f11.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f11.setParent(null);
      // /jsp/index.jsp(127,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f11.setAccess("hasRole('admin')");
      int _jspx_eval_sec_005fauthorize_005f11 = _jspx_th_sec_005fauthorize_005f11.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/oss\" target=\"_blank\">OSS管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f11);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f11);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f12 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f12.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f12.setParent(null);
      // /jsp/index.jsp(130,7) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f12.setAccess("hasRole('admin')");
      int _jspx_eval_sec_005fauthorize_005f12 = _jspx_th_sec_005fauthorize_005f12.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/bss\" target=\"_blank\" rel=\"user\">BSS管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f12);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f12);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f13 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f13.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f13.setParent(null);
      // /jsp/index.jsp(134,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f13.setAccess("hasRole('admin')");
      int _jspx_eval_sec_005fauthorize_005f13 = _jspx_th_sec_005fauthorize_005f13.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/chuanadapter\" target=\"_blank\" rel=\"user\">四川联通adapter管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f13);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f13);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f14 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f14.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f14.setParent(null);
      // /jsp/index.jsp(138,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f14.setAccess("hasRole('admin')");
      int _jspx_eval_sec_005fauthorize_005f14 = _jspx_th_sec_005fauthorize_005f14.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/lianjiabss\" target=\"_blank\" rel=\"user\">恋家bss管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f14);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f14);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f15 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f15.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f15.setParent(null);
      // /jsp/index.jsp(142,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f15.setAccess("hasRole('admin')");
      int _jspx_eval_sec_005fauthorize_005f15 = _jspx_th_sec_005fauthorize_005f15.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/lianjiadss\" target=\"_blank\" rel=\"user\">恋家ds管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f15);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f15);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f16 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_sec_005fauthorize_005f16.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f16.setParent(null);
      // /jsp/index.jsp(145,6) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f16.setAccess("hasRole('admin')");
      int _jspx_eval_sec_005fauthorize_005f16 = _jspx_th_sec_005fauthorize_005f16.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.print(basePath);
        out.write("manager/media\" target=\"_blank\" rel=\"user\">恋家MediaServer管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f16);
        return;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f16);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("common/user/changepwd/show\" target=\"dialog\" rel=\"user\">修改密码</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<div id=\"navTab\" class=\"tabsPage\">\r\n");
      out.write("\t\t\t\t<div class=\"tabsPageHeader\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsPageHeaderContent\" >\r\n");
      out.write("\t\t\t\t\t\t<!-- 显示左右控制时添加 class=\"tabsPageHeaderMargin\" -->\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"navTab-tab\">\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsLeft\">left</div>\r\n");
      out.write("\t\t\t\t\t<!-- 禁用只需要添加一个样式 class=\"tabsLeft tabsLeftDisabled\" -->\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsRight\">right</div>\r\n");
      out.write("\t\t\t\t\t<!-- 禁用只需要添加一个样式 class=\"tabsRight tabsRightDisabled\" -->\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsMore\">more</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"tabsMoreList\">\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"navTab-panel tabsPageContent layoutBox\">\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\">Copyright &copy; 2010 <a href=\"demo_page2.html\" target=\"dialog\">云企通</a> 京ICP备xxxxxxx号-xx</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_sec_005fauthentication_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_sec_005fauthentication_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthentication_005f0.setParent(null);
    // /jsp/index.jsp(61,39) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthentication_005f0.setProperty("name");
    int _jspx_eval_sec_005fauthentication_005f0 = _jspx_th_sec_005fauthentication_005f0.doStartTag();
    if (_jspx_th_sec_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f0);
    return false;
  }
}
