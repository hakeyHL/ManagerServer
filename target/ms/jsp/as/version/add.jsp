<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div class="pageContent">
	<form method="post" action="<%=basePath%>as/version/add" method="post"
		enctype="multipart/form-data" class="pageForm required-validate"
		onsubmit="return iframeCallback(this, dialogAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>版本名称：</label> <input name="name" type="text" size="30"
					class="required" value="" />
			</p>
			<p>
				<label>build号：</label> <input name="build" type="text" size="30"
					class="required" value="" />
			</p>
			<p>
				<label>平台：</label> <select name="platform" class="required">
					<option value="android">android手机客户端</option>
					<option value="androidtv">安卓电视</option>
					<option value="iphone">苹果手机</option>
					<option value="pc_apple">苹果电脑客户端</option>
					<option value="pc_window">windows电脑客户端</option>
					<option value="pc_window_xp">windows_xp电脑客户端</option>
				</select>
			</p>
			<p>
				<label>文件：</label> <input type="file" name="vserionFile"
					class="required" />
			</p>
			<p style="margin-top:5px">
				<label>更新说明：</label>
				<textarea name="remark" rows="" cols=""
					style="height:180px;width:205px" class="required"></textarea>
			</p>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">保存</button>
						</div>
					</div>
				</li>
				<li>
					<div class="button">
						<div class="buttonContent">
							<button type="button" class="close">取消</button>
						</div>
					</div></li>
			</ul>
		</div>
	</form>
</div>
