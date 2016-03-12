<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link href="<%=basePath%>resources/dwz/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="<%=basePath%>resources/dwz/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="<%=basePath%>resources/dwz/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
<link href="<%=basePath%>resources/dwz/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>
<!--[if IE]>
<link href="<%=basePath%>resources/dwz/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
<![endif]-->
<!--[if lt IE 9]><script src="<%=basePath%>resources/dwz/js/speedup.js" type="text/javascript"></script><script src="<%=basePath%>resources/dwz/js/jquery-1.11.3.min.js" type="text/javascript"></script><![endif]-->
<!--[if gte IE 9]><!--><script src="<%=basePath%>resources/dwz/js/jquery-2.1.4.min.js" type="text/javascript"></script><!--<![endif]-->
 
<script src="<%=basePath%>resources/dwz/js/jquery.cookie.js" type="text/javascript"></script>
<script src="<%=basePath%>resources/dwz/js/jquery.validate.js" type="text/javascript"></script>
<script src="<%=basePath%>resources/dwz/js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="<%=basePath%>resources/dwz/xheditor/xheditor-1.2.2.min.js" type="text/javascript"></script>
<script src="<%=basePath%>resources/dwz/xheditor/xheditor_lang/zh-cn.js" type="text/javascript"></script>
<script src="<%=basePath%>resources/dwz/uploadify/scripts/jquery.uploadify.js" type="text/javascript"></script>

 
 
<script src="<%=basePath%>resources/dwz/bin/dwz.min.js" type="text/javascript"></script>
<script src="<%=basePath%>resources/dwz/js/dwz.regional.zh.js" type="text/javascript"></script>


<script type="text/javascript">
$(function(){
	DWZ.init("<%=basePath%>resources/dwz/dwz.frag.xml", {
//		loginUrl:"<%=basePath%>resources/dwz/login_dialog.html", loginTitle:"登录",	// 弹出登录对话框
		loginUrl:"<%=basePath%>jsp/login.jsp",	// 跳到登录页面
		statusCode:{ok:200, error:300, timeout:301}, //【可选】
		pageInfo:{pageNum:"pageNum", numPerPage:"numPerPage", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
		keys: {statusCode:"statusCode", message:"message"}, //【可选】
		ui:{hideMode:'offsets'}, //【可选】hideMode:navTab组件切换的隐藏方式，支持的值有’display’，’offsets’负数偏移位置的值，默认值为’display’
		debug:true,	// 调试模式 【true|false】
		callback:function(){
			initEnv();
			$("#themeList").theme({themeBase:"<%=basePath%>resources/dwz/themes"}); // themeBase 相对于index页面的主题base路径
			//navTab.openTab("yhglLiNav","<%=path%>/yxt/companyController/findByCondition",{title:"用户管理",fresh:false,data:{}});
		}
	});
});
</script>
</head>
<body scroll="no">
	<div id="layout">
		<div id="header">
			<div class="headerNav">
				<span style="padding-left:25px;position: absolute;top: 8px;font-size:25px;font-weight:500;color:white">云企通综合管理系统   </span>
				<ul class="nav">
					<li><a href="javascript:void(0);"><sec:authentication property="name"/></a></li>
					<li><a href="<%=basePath%>loginout">退出</a></li>
				</ul>
			</div>
		</div>
		<div id="leftside">
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse"><div></div></div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse"><h2>主菜单</h2><div>收缩</div></div>
				
				<div class="accordion" fillSpace="sidebar">
				<sec:authorize access="hasRole('admin')"> 
					<div class="accordionHeader">
						<h2><span>Folder</span>超级管理员</h2>
					</div>
						<div class="accordionContent">
						<ul class="tree treeFolder">
							<li><a href="<%=basePath%>super/role/list" target="navTab" rel="role">角色管理</a></li>
							<li><a href="<%=basePath%>super/permission/list" target="navTab" rel="role">权限管理</a></li>
							<li><a href="<%=basePath%>as/version/list" target="navTab" rel="version">云企通版本管理</a></li>
							<li><a href="<%=basePath%>super/user/list" target="navTab" rel="admin">系统管理员管理</a></li>
							<li><a href="<%=basePath%>common/user/changepwd/show" target="dialog" rel="admin">修改密码</a></li>
						</ul>
					</div>
					</sec:authorize>
					<div class="accordionHeader">
						<h2><span>Folder</span>系统管理员</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree treeFolder">
						<sec:authorize access="hasRole('as')"> 
							<li><a href="<%=basePath%>manager/as" target="_blank" rel="zoomlocal">AS管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('xxx')"> 
							<li><a href="<%=basePath%>manager/ps" target="navTab" rel="zoomserver">PS管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('oss')"> 
							<li><a href="<%=basePath%>manager/oss" target="_blank">OSS管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('bss')"> 
							<li><a href="<%=basePath%>manager/bss" target="_blank" rel="user">BSS管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('chuanadapter')"> 
							<li><a href="<%=basePath%>manager/chuanadapter" target="_blank" rel="user">四川联通adapter管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('lianjiabss')"> 
							<li><a href="<%=basePath%>manager/lianjiabss" target="_blank" rel="user">恋家bss管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('lianjiadss')"> 
							<li><a href="<%=basePath%>manager/lianjiadss" target="_blank" rel="user">恋家ds管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('media')"> 
							<li><a href="<%=basePath%>manager/media" target="_blank" rel="user">恋家 MediaServer管理</a></li>
						</sec:authorize>
						
						
						<sec:authorize access="hasRole('admin')"> 
							<li><a href="<%=basePath%>manager/as" target="_blank" rel="zoomlocal">AS管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('xxx')"> 
							<li><a href="<%=basePath%>manager/ps" target="navTab" rel="zoomserver">PS管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('admin')"> 
							<li><a href="<%=basePath%>manager/oss" target="_blank">OSS管理</a></li>
						</sec:authorize>
							<sec:authorize access="hasRole('admin')"> 
							<li><a href="<%=basePath%>manager/bss" target="_blank" rel="user">BSS管理</a></li>
						</sec:authorize>
						
						<sec:authorize access="hasRole('admin')"> 
							<li><a href="<%=basePath%>manager/chuanadapter" target="_blank" rel="user">四川联通adapter管理</a></li>
						</sec:authorize>
						
						<sec:authorize access="hasRole('admin')"> 
							<li><a href="<%=basePath%>manager/lianjiabss" target="_blank" rel="user">恋家bss管理</a></li>
						</sec:authorize>
						
						<sec:authorize access="hasRole('admin')"> 
							<li><a href="<%=basePath%>manager/lianjiadss" target="_blank" rel="user">恋家ds管理</a></li>
						</sec:authorize>
						<sec:authorize access="hasRole('admin')"> 
							<li><a href="<%=basePath%>manager/media" target="_blank" rel="user">恋家MediaServer管理</a></li>
						</sec:authorize>
						
							<li><a href="<%=basePath%>common/user/changepwd/show" target="dialog" rel="user">修改密码</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="container">
			<div id="navTab" class="tabsPage">
				<div class="tabsPageHeader" >
					<div class="tabsPageHeaderContent" >
						<!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
						<ul class="navTab-tab">
						</ul>
					</div>
					<div class="tabsLeft">left</div>
					<!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
					<div class="tabsRight">right</div>
					<!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
					<div class="tabsMore">more</div>
				</div>
				<ul class="tabsMoreList">
				</ul>
				<div class="navTab-panel tabsPageContent layoutBox">
				 </div>
			</div>
		</div>
	</div>
	<div id="footer">Copyright &copy; 2010 <a href="demo_page2.html" target="dialog">云企通</a> 京ICP备xxxxxxx号-xx</div>
</body>
</html>