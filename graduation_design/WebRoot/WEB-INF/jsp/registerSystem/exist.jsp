<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="icon" href="images/logo.ico">
<title>新广货运联盟-注册页面</title>
<link rel="stylesheet" href="css/login.css" />
<body>
<div class="register-container">
	<h1>该手机号或者邮箱已经注册，可以直接登录</h1>
	<form action="" method="post" id="registerForm">
    	
        
		<a href="${pageContext.request.contextPath }/goRegister">
		<button type="button" class="register-tis">取消</button>
	</a>
	<a href="${pageContext.request.contextPath }/goLogin">
		<button type="button" class="register-tis" style="background:#F0AD4E">登录</button>
	</a>
	<%-- <a href="${pageContext.request.contextPath }/goLogin">
        <button class="register-tis" style="background:#F0AD4E;">登录</button>
        </a> --%>
	</form>
	
</div>
<script src="js/jquery.min.js"></script>
<script src="js/common.js"></script>
<!--背景图片自动更换-->
<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>
<!--表单验证-->
<script src="js/jquery.validate.min.js?var1.14.0"></script>
</body>
</html>