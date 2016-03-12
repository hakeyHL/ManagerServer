<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<form method="post" action="<%=basePath%>super/role/edit"
		method="post" class="pageForm required-validate"
		onsubmit="return iframeCallback(this, dialogAjaxDone);">
<div class="pageContent">
		<input name="roleid" type="hidden" value="${tRole.roleid}"></input>
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>角色名称:</label>
				<label>
			      <input name="roleName" type="text" value="${tRole.roleName}"></input>
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