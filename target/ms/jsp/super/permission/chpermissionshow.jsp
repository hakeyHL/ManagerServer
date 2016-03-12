<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ page language="java" import="cn.yunqitong.util.*" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<div class="pageHeader">
	<form onsubmit="return iframeCallback(this, dialogAjaxDone);" action="<%=basePath%>super/permission/chmpermission" method="post">
	<div class="searchBar">
	<input name="roleid" type="hidden" value="${roleid}"></input>
		<table class="table" width="100%" layoutH="138">
		<tbody>
			<c:forEach var="item" items="${authorityList}" varStatus="s">
				 <tr target="sid" rel="${item.authorityid}">
				  	<td><input id="${item.authorityid }" name='ids' value='${item.authorityid }' <c:if test="${item.used == 1 }">checked</c:if> type='checkbox'></td>	
					<td>${item.resourceName}</td>
			</c:forEach>
		</tbody>
	</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">确定</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
