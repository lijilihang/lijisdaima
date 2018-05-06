<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<title>问卷服务</title>
<link rel="stylesheet" type="text/css" href="Assets/css/reset.css"/>
<script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="js/layui/css/layui.css">
<script type="text/javascript" src="js/layui/layui.js"></script>


<link rel="stylesheet" type="text/css" href="Assets/plugins/FlexSlider/flexslider.css">

<link rel="stylesheet" type="text/css" href="Assets/css/thems.css">
<link rel="stylesheet" type="text/css" href="Assets/css/responsive.css">
<link rel="stylesheet" type="text/css" href="Assets/css/question.css">


<script language="javascript">
$(window).load(function() {
  $('.flexslider').flexslider({
	animation: "slide"
  });
});
</script>
</head>

<body>
<!--头部-->
<div class="header">
    <div class="head clearfix">
        <div class="logo"><a href=""><img src="Assets/images/logo.jpg" alt="视维科技"/></a></div>
          <ul class="nav clearfix">
            <li>
            	<a href="${pageContext.request.contextPath}/goIndexRegister1">首页</a></li>
            <li>
            	<a href="${pageContext.request.contextPath}/goAboutRegister">产品运营</a>
            	<ul class="sub">
            		<li><a href="#">用户测评</a></li>
            		<li><a href="#">问卷调研</a></li>
            		<li><a href="#">创建问卷</a></li>
            	</ul>
            </li>
            <li><a href="${pageContext.request.contextPath}/goSolutionRegister">问卷服务</a>
            	<ul class="sub">
            		<li><a href="#">问卷调研</a></li>
            		<li><a href="#">在线测评</a></li>
            		
            	</ul>
            </li>
            <li class="now"><a href="${pageContext.request.contextPath}/goUserMessageList">个人主页</a>
            	<ul class="sub">
            		<li><a href="#">基本资料</a></li>
            		<li><a href="#">修改资料</a></li>
            		<li><a href="#">个人设置</a></li>
            	</ul>
            </li>
            <li><a href="${pageContext.request.contextPath}/goServiceRegister">服务支持</a>
            	<ul class="sub">
            		<li><a href="#">常见问题</a></li>
            		<li><a href="#">产品定价</a></li>
            		<li><a href="#">操作指南</a></li>
            		<li><a href="#">关于我们</a></li>
            		<li><a href="#">咨询客服</a></li>
            	</ul>
            </li>
            
        </ul>
        
        <div class="search">
        	<c:if test="${!(empty userMessage.umPhone) }">
            <a href="#" class="login_regist">${userMessage.umPhone }</a>&nbsp;&nbsp;&nbsp;
            <a href="${pageContext.request.contextPath}/goLayout" class="login_regist">退出</a>
            </c:if>
            <c:if test="${empty userMessage.umPhone }">
            <a href="${pageContext.request.contextPath}/goLogin" class="login_regist">登录</a>
            <a href="${pageContext.request.contextPath}/goRegister" class="login_regist">注册</a>
            </c:if>
        </div>
        <div class="nav_m">
        	<span class="n_icon">&nbsp;</span>
            <ul>
            	<li><a href="index.html">首页</a></li>
                <li><a href="about.html">关于我们</a></li>
                <li class="now"><a href="solution.html">问卷服务</a></li>
                <li><a href="product.html">产品</a></li>
                <li><a href="service.html">服务</a></li>
                <li><a href="contact.html">联系我们</a></li>
            </ul>
        </div>
    </div>
</div>
<!--头部-->
<!--幻灯片-->
<!--幻灯片-->

<div class="banner banner_s"><h1 class="hh">个人主页</h1></div>


<!-- 中心 -->
    <div class="mainContent">
    <div class="mainContentLeft">
    
     <ul class="messageUl">
       <li>
         <a href="${pageContext.request.contextPath}/goUserMessageList" >
          <i class="frontMaterialPicture"></i>
                               基本资料
          <i class="layui-icon">&#xe602;</i>
         </a>
       </li>
       
       <li>
         <a href="${pageContext.request.contextPath}/goChangPassword" class="selectd">
          <i class="frontMaterialPicture"></i>
                        修改密码
          <i class="layui-icon">&#xe602;</i>
         </a>
       </li>
       
       <li>
         <a href="${pageContext.request.contextPath}/goRealName">
          <i class="frontMaterialPicture"></i>
                               实名认证
          <i class="layui-icon">&#xe602;</i>
         </a>
       </li>
       
       <li>
         <a href="${pageContext.request.contextPath}/goSetUp">
          <i class="frontMaterialPicture"></i>
                               个人设置
          <i class="layui-icon">&#xe602;</i>
         </a>
       </li>
       
      
     </ul>
    </div>
    
    <div class="mainContentRight">
      <div class="basicMessageTitle">
                      修改密码
       
      </div>

  <div class="changeUserMessage" style="display: ">
		  <div class="passwordDistence">
	          <label class="layui-form-label">原密码：</label>
	          <div class="layui-input-block">
	            <input type="password" name="password" required="" lay-verify="required" placeholder="请输入原来的密码" autocomplete="off" class="layui-input">
	          </div>
          </div>
          
          <div class="passwordDistence">
	          <label class="layui-form-label">新密码：</label>
	          <div class="layui-input-block">
	            <input type="password" name="password" required="" lay-verify="required" placeholder="请输入新密码" autocomplete="off" class="layui-input">
	          </div>
          </div>
          
          
          <div class="passwordDistence">
	          <label class="layui-form-label">新密码：</label>
	          <div class="layui-input-block">
	            <input type="password" name="password" required="" lay-verify="required" placeholder="请再次输入新密码" autocomplete="off" class="layui-input">
	          </div>
          </div>
          
          <div class="layui-input-block" style="margin-top: 40px;">
		      <button class="layui-btn userMessageButton" style="display: inline-block;" id="submitAllMessage" lay-filter="demo1">立即提交</button>
		      <button type="reset" style="display: inline-block;" class="layui-btn layui-btn-primary userMessageButton">重置</button>
	      </div>
          
          
          
       


  </div>

      
      <div class="basicMessageShow" style="display: none">
      
        <dl>
          <dt>我的昵称:</dt>
          <dd id="nicknamePart">sasd</dd>
        </dl>
        
        <dl>
          <dt>电话:</dt>
          <dd id="myPhone">sasd</dd>
        </dl>
        <dl>
          <dt>邮箱:</dt>
          <dd id="myEmail">sasd</dd>
        </dl>
        <dl>
          <dt>身份证号码:</dt>
          <dd id="myIdentifyNum">sasd</dd>
        </dl>
        <dl>
          <dt>我的地址:</dt>
          <dd id="myAddress">sasd</dd>
        </dl>
        <dl>
          <dt>生日:</dt>
          <dd id="myBirthday">sasd</dd>
        </dl>
      </div>
    
    </div>
    
    
    
    
    	<!-- content -->
    </div>
    
    <!--  -->
<div class="join">
	<div class="bg bg_a"><img src="Assets/images/pic2.jpg" alt=""/></div>
    <div class="wen"><a href=""><img src="Assets/images/pic1.png" alt=""/></a></div>
    <div class="bg bg_b"><img src="Assets/images/bg_c.png" alt=""/></div>
</div>
<div class="f_bg">
	<div class="f_m clearfix">
    	<div class="f_logo"></div>
        <div class="code"><img src="Assets/upload/code.png" alt=""/></div>
        <div class="f_mr">
        	<div class="line">&nbsp;</div>
            <div class="space_hx">&nbsp;</div>
            <span class="tl">联系我们</span>
            <div class="num">
            	<a href=""><img src="Assets/images/icon9.png" alt=""/></a>
                <a href=""><img src="Assets/images/icon10.png" alt=""/></a>
                <em>+18794886718</em>
            </div>
            <div class="space_hx">&nbsp;</div>
            <div class="line">&nbsp;</div>
        </div>
    </div>
    <div class="bq_bg">
    	<div class="bq">

            <span>版权所有：<a href="http://www.mycodes.net/" target="_blank">Forson Li</a> </span>
        </div>
    </div>
</div>
</body>
</html>
