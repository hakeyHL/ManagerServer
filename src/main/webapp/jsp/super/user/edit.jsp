<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<form method="post" action="<%=basePath%>super/user/edit"
		method="post" class="pageForm required-validate"
		onsubmit="return iframeCallback(this, dialogAjaxDone);">
<div class="pageContent">
		<input name="id" type="hidden" value="${tUser.id}"></input>
		<input name="name" type="hidden" value="${tUser.name}"></input>
		<input name="password" type="hidden" value="${tUser.password}"></input>
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>用户名称:</label>
				<label>
			      <label>${tUser.name}</label>
				</label>
			</p>
			<p>
				<label>是否可用：</label> <select name="enabled" onselect="">
					<option ${accountVo.type== 1? 'selected="selected"
						' : ''} value="1">可用</option>
					<option ${accountVo.type== 0? 'selected="selected"
						' : ''} value="0">不可用</option>
				</select>
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