<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
  content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="HandheldFriendly" content="true">
<title>问卷服务</title>
<link rel="stylesheet" type="text/css" href="Assets/css/reset.css" />
<script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/layer/layer.js"></script>
<link rel="stylesheet" type="text/css" href="js/layui/css/layui.css">
<script type="text/javascript" src="js/layui/layui.js"></script>
<script type="text/javascript" src="Assets/js/js_z.js"></script>
<link rel="stylesheet" type="text/css"
  href="Assets/plugins/FlexSlider/flexslider.css">
<script type="text/javascript"
  src="Assets/plugins/FlexSlider/jquery.flexslider.js"></script>
<script type="text/javascript" src="Assets/js/main.js"></script>
<script type="text/javascript" src="js/question/index.js"></script>
<script type="text/javascript" src="js/vue/vue.js"></script>

<link rel="stylesheet" type="text/css" href="Assets/css/thems.css">
<link rel="stylesheet" type="text/css" href="Assets/css/responsive.css">
<link rel="stylesheet" type="text/css" href="css/question/answerQuestion.css">
<link rel="stylesheet" type="text/css" href="css/question/submitSuccess.css">
</head>
<body>
  <div class="all">
    <div class="main">
      <p class="message">您提交成功，谢谢您的答卷</p>
      <div class="allButton"><button class="form-control button"><a class="subitA" href="${pageContext.request.contextPath}/goIndexRegister1">查看首页</a></button></div>
    </div>
  </div>

</body>
</html>