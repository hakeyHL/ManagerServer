<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="cn.yunqitong.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<form id="pagerForm" method="post" action="<%=basePath%>as/version/list">
	<input type="hidden" name="pageNum" value="${pageInfo.pageNum}" />
	<input type="hidden" name="numPerPage" value="${pageInfo.pageSize}" />
</form>

<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="<%=basePath%>as/version/list" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					平台：
				<select name="platform" class="required">
					<option value="" ${model.platform ==null? 'selected="selected"' : ''}>所有</option>
					<option value="android" ${model.platform =='android'? 'selected="selected"' : ''}>android手机客户端</option>
					<option value="androidtv" ${model.platform =='androidtv'? 'selected="selected"' : ''}>安卓电视</option>
					<option value="iphone" ${model.platform =='iphone'? 'selected="selected"' : ''}>苹果手机</option>
					<option value="pc_apple" ${model.platform =='pc_apple'? 'selected="selected"' : ''}>苹果电脑客户端</option>
					<option value="pc_window" ${model.platform =='pc_window'? 'selected="selected"' : ''}>window电脑客户端</option>
					<option value="pc_window_xp" ${model.platform =='pc_window'? 'selected="selected"' : ''}>window-XP电脑客户端</option>
				</select>
				</td>
				<td>
					版本号：<input type="text" name="name" value="${model.name}"/>
				</td>
				
				<td>
					发布时间：<input type="text" name="publishTime" value="${model.publishTime}" class="date" readonly="true" />
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>

<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<%=basePath%>jsp/as/version/add.jsp" target="dialog" width="550" height="420"><span>上传版本</span></a></li>
			<!--  
			<li><a class="delete" href="<%=basePath%>version/delete?name={sid_user}" target="ajaxTodo" title="确定要删除吗?"><span>删除版本</span></a></li>
			-->
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="80">版本</th>
				<th width="80">build号</th>
				<th width="80">发布时间</th>
				<th width="80">文件名</th>
				<th width="80">文件大小</th>
				<th width="80">平台</th>
				<th width="80">备注</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${pageInfo.list}" varStatus="s">
				<tr target="sid_user" rel="1">
					<td>${item.name}</td>
					<td>${item.build}</td>
					<td>${item.createtimeString}</td>
					<td><a target="_blank" href="<%=PropertyFactory.getProperty("file_domain_url")%>${item.apppath}/${item.firewirename}">${item.firewirename}</a></td>
					<td>${item.firewiresizeStr}</td>
					<td>${item.platform}</td>
					<td>${item.remark}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20" ${pageInfo.pageSize eq 20 ? 'selected="selected"' : ''}>20</option>
				<option value="50" ${pageInfo.pageSize eq 50 ? 'selected="selected"' : ''}>50</option>
				<option value="100" ${pageInfo.pageSize eq 100 ? 'selected="selected"' : ''}>100</option>
				<option value="200" ${pageInfo.pageSize eq 200 ? 'selected="selected"' : ''}>200</option>
			</select>
			<span>条，共${pageInfo.total}条</span>
		</div>
		<div class="pagination" targetType="navTab" totalCount="${pageInfo.total}" numPerPage="${pageInfo.pageSize}" pageNumShown="10" currentPage="${pageInfo.pageNum}"></div>
	</div>
</div>
