<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ page language="java" import="cn.yunqitong.util.*" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<div class="pageHeader">
	<form onsubmit="return iframeCallback(this, dialogAjaxDone);" action="<%=basePath%>common/user/changepwd" method="post">
	<table class="table" width="100%" layoutH="138">
		<tbody>
				 <tr>
				  	<td> <label> 新密码 </label></td>	
					<td><input name="newpwd" type="password"></input></td>
				</tr>
		</tbody>
	</table>
	<div class="searchBar">
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">确定</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
