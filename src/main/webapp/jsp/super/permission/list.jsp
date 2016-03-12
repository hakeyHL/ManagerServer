<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ page language="java" import="cn.yunqitong.util.*" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<form id="pagerForm" method="post" action="<%=basePath%>super/permission/list">
	<input type="hidden" name="pageNum" value="${pageInfo.pageNum}" />
	<input type="hidden" name="numPerPage" value="${pageInfo.pageSize}" />
</form>

<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="<%=basePath%>super/permission/list" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					权限名称：
				</td>
					<td><input id="resourceName" name="resourceName" type='text'></td>
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
			<li><a class="add"   target="dialog"  height="420" href="<%=basePath %>super/permission/addshow" ><span>添加权限</span></a></li>
			<li><a class="edit"   target="dialog"  height="420" href="<%=basePath %>super/permission/getById?authorityid={sid}" ><span>编辑权限</span></a></li>
			<li><a class="delete"   href="<%=basePath %>super/permission/delete"   target="selectedTodo" rel="ids" postType="string" title="确定要删除该权限吗？这将导致所有用户和角色永久失去此权限!"><span>删除权限</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="22"><input type="checkbox" id="checkAll" group="ids" class="checkboxCtrl"></th>	
				<th width="22">序号</th>
				<th width="120" >权限名称</th>
				<th width="120" >权限id</th>
				</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${pageInfo.list}" varStatus="s">
				 <tr target="sid" rel="${item.authorityid}">
				  	<td><input id="${item.authorityid }" name='ids' value='${item.authorityid }' type='checkbox'></td>	
					<td align="center">${s.count + (pageInfo.pageNum-1)*pageInfo.pageSize}</td>
					<td>${item.resourceName}</td>
					<td>${item.authorityid}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20" ${pageInfo.pageSize eq 20 ? 'selected="selected"' : ''}>20</option>
			</select>
			<span>条，共${pageInfo.total}条</span>
		</div>
		<div class="pagination" targetType="navTab" totalCount="${pageInfo.total}" numPerPage="${pageInfo.pageSize}" pageNumShown="10" currentPage="${pageInfo.pageNum}"></div>
	</div>
</div>
