<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<form method="post" action="<%=basePath%>super/permission/edit"
		method="post" class="pageForm required-validate"
		onsubmit="return iframeCallback(this, dialogAjaxDone);">
<div class="pageContent">
		<input name="authorityid" type="hidden" value="${tAuthority.authorityid}"></input>
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>权限名称:</label>
				<label>
			      <input name="resourceName" type="text" value="${tAuthority.resourceName}"></input>
				</label>
			</p>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">修改</button>
						</div>
					</div></li>
				<li>
					<div class="button">
						<div class="buttonContent">
							<button type="button" class="close">取消</button>
						</div>
					</div>
				</li>
			</ul>
		</div>
</div>
</form>