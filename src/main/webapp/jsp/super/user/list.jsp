<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ page language="java" import="cn.yunqitong.util.*" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<%-- <form id="pagerForm" method="post" action="<%=basePath%>super/user/list">
	<input type="hidden" name="pageNum" value="${pageInfo.pageNum}" />
	<input type="hidden" name="numPerPage" value="${pageInfo.pageSize}" />
</form>
 --%>
<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="<%=basePath%>super/user/list" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					管理员名称：
				</td>
					<td><input id="name" name="name" type='text'></td>
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
			<li><a class="add"   target="dialog"  height="420" href="<%=basePath %>super/user/addshow" ><span>添加管理员</span></a></li>
			<li><a class="edit"   target="dialog"  height="420" href="<%=basePath %>super/user/getById?id={sid}" ><span>修改管理员</span></a></li>
			<li><a class="edit"   target="dialog"  height="420" href="<%=basePath %>super/user/changerole/show?id={sid}" ><span>修改管理员角色</span></a></li>
			<li><a class="delete"   href="<%=basePath %>super/user/delete"   target="selectedTodo" rel="ids" postType="string" title="确定要删除该管理员吗？这将同时也删除此用户所对应的权限和角色信息!"><span>删除管理员</span></a></li>
			<li><a class="edit"   href="<%=basePath %>common/user/formatpass"   target="selectedTodo" rel="ids" postType="string" title="确定要初始化密码吗？"><span>初始化密码</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="22"><input type="checkbox" id="checkAll" group="ids" class="checkboxCtrl"></th>	
				<th width="22">序号</th>
				<th width="120" >管理员名称</th>
				<th width="120" >管理员id</th>
				<th width="120" >角色id</th>
				<th width="120" >角色名称</th>
				<th width="120" >拥有权限</th>
				</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${pageInfo.list}" varStatus="s">
				 <tr target="sid" rel="${item.id}">
				  	<td><input id="${item.id }" name='ids' value='${item.id }' type='checkbox'></td>	
					<td align="center">${s.count + (pageInfo.pageNum-1)*pageInfo.pageSize}</td>
					<td>${item.name}</td>
					<td>${item.id}</td>
					<td>${item.roleid}</td>
					<td>${item.rolename}</td>
					<td>${item.permissions}</td>
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
