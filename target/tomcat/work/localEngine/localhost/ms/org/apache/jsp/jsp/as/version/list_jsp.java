package org.apache.jsp.jsp.as.version;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.yunqitong.util.*;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";

      out.write("\r\n");
      out.write("<form id=\"pagerForm\" method=\"post\" action=\"");
      out.print(basePath);
      out.write("as/version/list\">\r\n");
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
      out.write("as/version/list\" method=\"post\">\r\n");
      out.write("\t<div class=\"searchBar\">\r\n");
      out.write("\t\t<table class=\"searchContent\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t平台：\r\n");
      out.write("\t\t\t\t<select name=\"platform\" class=\"required\">\r\n");
      out.write("\t\t\t\t\t<option value=\"\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.platform ==null? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">所有</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"android\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.platform =='android'? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">android手机客户端</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"androidtv\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.platform =='androidtv'? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">安卓电视</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"iphone\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.platform =='iphone'? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">苹果手机</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"pc_apple\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.platform =='pc_apple'? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">苹果电脑客户端</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"pc_window\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.platform =='pc_window'? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">window电脑客户端</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"pc_window_xp\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.platform =='pc_window'? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">window-XP电脑客户端</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t版本号：<input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t发布时间：<input type=\"text\" name=\"publishTime\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.publishTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"date\" readonly=\"true\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
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
      out.write("\r\n");
      out.write("<div class=\"pageContent\">\r\n");
      out.write("\t<div class=\"panelBar\">\r\n");
      out.write("\t\t<ul class=\"toolBar\">\r\n");
      out.write("\t\t\t<li><a class=\"add\" href=\"");
      out.print(basePath);
      out.write("jsp/as/version/add.jsp\" target=\"dialog\" width=\"550\" height=\"420\"><span>上传版本</span></a></li>\r\n");
      out.write("\t\t\t<!--  \r\n");
      out.write("\t\t\t<li><a class=\"delete\" href=\"");
      out.print(basePath);
      out.write("version/delete?name={sid_user}\" target=\"ajaxTodo\" title=\"确定要删除吗?\"><span>删除版本</span></a></li>\r\n");
      out.write("\t\t\t-->\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table class=\"table\" width=\"100%\" layoutH=\"138\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"80\">版本</th>\r\n");
      out.write("\t\t\t\t<th width=\"80\">build号</th>\r\n");
      out.write("\t\t\t\t<th width=\"80\">发布时间</th>\r\n");
      out.write("\t\t\t\t<th width=\"80\">文件名</th>\r\n");
      out.write("\t\t\t\t<th width=\"80\">文件大小</th>\r\n");
      out.write("\t\t\t\t<th width=\"80\">平台</th>\r\n");
      out.write("\t\t\t\t<th width=\"80\">备注</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /jsp/as/version/list.jsp(70,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /jsp/as/version/list.jsp(70,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/as/version/list.jsp(70,3) '${pageInfo.list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageInfo.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /jsp/as/version/list.jsp(70,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("s");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<tr target=\"sid_user\" rel=\"1\">\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.build}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.createtimeString}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td><a target=\"_blank\" href=\"");
            out.print(PropertyFactory.getProperty("file_domain_url"));
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.apppath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.firewirename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.firewirename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a></td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.firewiresizeStr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.platform}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.remark}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
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
      out.write("\t\t\t\t<option value=\"50\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageSize eq 50 ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">50</option>\r\n");
      out.write("\t\t\t\t<option value=\"100\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageSize eq 100 ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">100</option>\r\n");
      out.write("\t\t\t\t<option value=\"200\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageSize eq 200 ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">200</option>\r\n");
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
}
