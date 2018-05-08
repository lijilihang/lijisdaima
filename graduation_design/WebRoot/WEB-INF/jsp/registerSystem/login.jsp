<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
      + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
  content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="icon" href="images/logo.ico">
<title>调查问卷-登录页面</title>
<link rel="stylesheet" href="css/login.css" />
  <script src="js/jquery.min.js"></script>
<body>
  <div class="login-container">
    <h1>登录</h1>
    <form onsubmit="return false;" action="" method="post" id="loginForm">
      <div>
        <input type="text" name="umPhone" class="umPhone"
          placeholder="输入手机号码" id="number1" />
        <input type="hidden" name = "hiddenGo" id = "hiddenGo" value ="${go }" />
      </div>
      <div>
        <input type="password" name="umPassword" class="umPassword2"
          id="umPassword1" placeholder="密码" oncontextmenu="return false"
          onpaste="return false" />
      </div>
      <div>
        <img id="img" onclick="getNewImg()"
          src="${pageContext.request.contextPath}/vcode"
          style="float:right; position:relative; display:inline-block; margin-top:28px;top:0px;left:0px">
          
          
          <input type="text" id="vcode" name="vcode" placeholder="请输入验证码"
          style="width:150px;position:relative;top:0px;left:0px">
      </div>
      <button id="submit1" type="submit">登 陆</button>
      <button type="reset" style="background:#F0AD4E;">重 置</button>
    </form>
    <a href="${pageContext.request.contextPath }/goRegister">
      <button type="button" class="register-tis">还没有账号？</button>
    </a>
  </div>
  <script type="text/javascript">
    function getNewImg() {
      var imgid = document.getElementById("img");
      imgid.src = "${pageContext.request.contextPath}/vcode?a=" + new Date().getTime();
    }
    window.mypath = "${pageContext.request.contextPath}/loginVali";
    window.mypath2 = "${pageContext.request.contextPath}/loginValidate";
      if ($("#hiddenGo").val() != null && $("#hiddenGo").val() != '') {
        window.mypath3 = "${pageContext.request.contextPath }/" + $("#hiddenGo").val();
      } else {
        window.mypath3 = "${pageContext.request.contextPath }/goIndexRegister1";
      }
    
  </script>

  <script src="js/common.js"></script>
  <!--背景图片自动更换-->
  <script src="js/supersized.3.2.7.min.js"></script>
  <script src="js/supersized-init.js"></script>
  <!--表单验证-->
  <script src="js/jquery.validate.min.js?var1.14.0"></script>
</body>
</html>