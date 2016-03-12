<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head >
<title>云讯通系统管理平台</title>
	<link href="<%=basePath %>resources/style/login/login.css"	rel="stylesheet" type="text/css" />
	<!-- 
	<script src="<%=basePath%>resources/js/plugins/sha256.js"	type="text/javascript" />
	<script src="<%=basePath%>resources/dwz/js/jquery-1.11.3.min.js"	type="text/javascript" />
	 -->
	<script src="<%=basePath%>resources/js/plugins/sha256.js" type="text/javascript"></script>
	<script src="<%=basePath%>resources/dwz/js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		function formsubmit(){
			var cipherPass = sha256_digest($("#password").val());
			$("#password").val(cipherPass);
			$("#loginForm").submit();
		}
		$(function(){
		   $('#validateCode').bind('keypress',function(event){
	            if(event.keyCode == "13")    
	            {
	            	formsubmit();
	            }
	        });
		});
	</script>
</head>
<body>
	<form  action="<%=basePath%>loginin" method="post" id="loginForm" >
		<div class="Main">
			<ul>
				<li class="top"></li>
				<li class="top2"></li>
				<li class="topA"></li>
				<li class="topB"><span style="font-size:30px;font-weight:600">云企通综合管理系统
				  </span></li>
            <li class="topC"></li>
            <li class="topD">
                <ul class="login">
                    <li><span class="left">用户名：</span> <span style="left">
                       <input type="text" name="username"  class="txt" />  
                     
                    </span></li>
                    <li><span class="left">密 码：</span> <span style="left">
                      <input type="password" name="password" id="password" class="txt" />  
                    </span></li>
                         <li><span class="left">验证码：</span> <span style="left">
                  		 <input name="validateCode" id="validateCode" type="text" class="txtCode" />  
                  		 <img src="<%=basePath%>getValidateCode"  onclick="this.src='<%=basePath%>getValidateCode?'+Math.random()" style="margin-left:20px;margin-bottom:-8px;cursor:pointer"  width="75" height="26" />
                    </span>
                    </li>
                    <!-- 
                    <li>
                    <span class="left">记住我：</span>
                        <input id="Checkbox1" type="checkbox" />
                    </li>
                     -->
                    
                </ul>
            </li>
            <li class="topE"></li>
            <li class="middle_A"></li>
            <li class="middle_B"></li>
            <li class="middle_C">
            <span class="btn">
				<img alt="" onclick="formsubmit()" style="cursor:pointer" src="<%=basePath %>resources/style/login/btnlogin.gif" />
				</span></li>
				<li class="middle_D"></li>
				<li class="bottom_A"></li>
				<li class="bottom_B"></li>
			</ul>
		</div>
	</form>
</body>
</html>
