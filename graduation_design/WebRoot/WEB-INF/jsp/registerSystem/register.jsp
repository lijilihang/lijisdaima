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
	<h1>注册</h1>
	<form action="${pageContext.request.contextPath }/register" method="post" id="registerForm" onsubmit="">
    	<div>
			<input type="text" name="umPhone" class="umPhone" placeholder="输入手机号码" id="umPhone2"/>
		</div>
        <div>
			<input type="password" name="umPassword" class="umPassword" id="umPassword2" placeholder="输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="password" name="umPasswordl" class="umPasswordl" id="unPassworda2" placeholder="再次输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="text" name="umName" class="umName" placeholder="真实姓名" id="umName2" autocomplete="off"/>
		</div>
        <div>
			<input type="text" name="umIdentifyNum" class="umIdentifyNum" id="umIdentifyNum2" placeholder="输入身份证号码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="email" name="umEmail" class="umEmail" id="umEmail2" placeholder="输入邮箱地址" oncontextmenu="return false" onpaste="return false" />
		</div>
       <!--  <div>
			<input type="email" name="email" class="email" placeholder="输入手机验证码" oncontextmenu="return false" onpaste="return false" style="width:170px;" />
            <button type="button" style="width:90px;">点击获取</button>
		</div> -->
        <div>
        	<input type="text" name="umCity" id="umCity2" placeholder="输入所在城市 选填">
        </div>
       <!--  <div>
			<input type="text" name="cell_number" class="cell_number" placeholder="输入座机号码 选填" autocomplete="off" id="number"/>
		</div> -->
        <div style="float:left; margin-top:10px; margin-left:20px">
			注册即代表同意<a style="color: red;text-decoration:none" href="agreement.html" target="_blank">&laquo;注册协议&raquo;</a>
		</div>
		<button id="submit2" type="submit">注 册</button>
        <button type="reset" style="background:#F0AD4E;">重 置</button>
	</form>
	<a href="${pageContext.request.contextPath }/goLogin">
		<button type="button" class="register-tis">已经有账号？</button>
	</a>
</div>
<script type="text/javascript">
		
	
		window.mypath4 = "${pageContext.request.contextPath }/validRegister";
	</script>
<script src="js/jquery.min.js"></script>
<script src="js/common.js"></script>
<!--背景图片自动更换-->
<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>
<!--表单验证-->
<script src="js/jquery.validate.min.js?var1.14.0"></script>
</body>
</html>