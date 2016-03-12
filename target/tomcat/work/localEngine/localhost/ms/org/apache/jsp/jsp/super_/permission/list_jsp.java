package org.apache.jsp.jsp.super_.permission;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";

      out.write("\r\n");
      out.write("<form id=\"pagerForm\" method=\"post\" action=\"");
      out.print(basePath);
      out.write("super/permission/list\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"pageNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t<input type=\"hidden\" name=\"numPerPage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div class=\"pageHeader\">\r\n");
      out.write("\t<form onsubmit=\"return navTabSearch(this);\" action=\"");
      out.print(basePath);
      out.write("super/permission/list\" method=\"post\">\r\n");
      out.write("\t<div class=\"searchBar\">\r\n");
      out.write("\t\t<table class=\"searchContent\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t权限名称：\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td><input id=\"resourceName\" name=\"resourceName\" type='text'></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div class=\"subBar\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><div class=\"buttonActive\"><div class=\"buttonContent\"><button type=\"submit\">检索</button></div></div></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"pageContent\">\r\n");
      out.write("\t<div class=\"panelBar\">\r\n");
      out.write("\t\t<ul class=\"toolBar\">\r\n");
      out.write("\t\t\t<li><a class=\"add\"   target=\"dialog\"  height=\"420\" href=\"");
      out.print(basePath );
      out.write("super/permission/addshow\" ><span>添加权限</span></a></li>\r\n");
      out.write("\t\t\t<li><a class=\"edit\"   target=\"dialog\"  height=\"420\" href=\"");
      out.print(basePath );
      out.write("super/permission/getById?authorityid={sid}\" ><span>编辑权限</span></a></li>\r\n");
      out.write("\t\t\t<li><a class=\"delete\"   href=\"");
      out.print(basePath );
      out.write("super/permission/delete\"   target=\"selectedTodo\" rel=\"ids\" postType=\"string\" title=\"确定要删除该权限吗？这将导致所有用户和角色永久失去此权限!\"><span>删除权限</span></a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table class=\"table\" width=\"100%\" layoutH=\"138\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"22\"><input type=\"checkbox\" id=\"checkAll\" group=\"ids\" class=\"checkboxCtrl\"></th>\t\r\n");
      out.write("\t\t\t\t<th width=\"22\">序号</th>\r\n");
      out.write("\t\t\t\t<th width=\"120\" >权限名称</th>\r\n");
      out.write("\t\t\t\t<th width=\"120\" >权限id</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div class=\"panelBar\">\r\n");
      out.write("\t\t<div class=\"pages\">\r\n");
      out.write("\t\t\t<span>显示</span>\r\n");
      out.write("\t\t\t<select class=\"combox\" name=\"numPerPage\" onchange=\"navTabPageBreak({numPerPage:this.value})\">\r\n");
      out.write("\t\t\t\t<option value=\"20\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageSize eq 20 ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">20</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<span>条，共");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.total}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("条</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"pagination\" targetType=\"navTab\" totalCount=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.total}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" numPerPage=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" pageNumShown=\"10\" currentPage=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/super/permission/list.jsp(50,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    // /jsp/super/permission/list.jsp(50,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/super/permission/list.jsp(50,3) '${pageInfo.list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageInfo.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /jsp/super/permission/list.jsp(50,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("s");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t <tr target=\"sid\" rel=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.authorityid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t  \t<td><input id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.authorityid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name='ids' value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.authorityid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("' type='checkbox'></td>\t\r\n");
          out.write("\t\t\t\t\t<td align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.count + (pageInfo.pageNum-1)*pageInfo.pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.resourceName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.authorityid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
