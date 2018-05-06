<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<title>首页</title>




<link rel="stylesheet" type="text/css" href="Assets/css/reset.css"/>
<script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="Assets/js/js_z.js"></script>
<link rel="stylesheet" type="text/css" href="Assets/plugins/FlexSlider/flexslider.css">
<script type="text/javascript" src="Assets/plugins/FlexSlider/jquery.flexslider.js"></script>
<script type="text/javascript" src="Assets/js/main.js"></script>
<link rel="stylesheet" type="text/css" href="Assets/css/thems.css">
<link rel="stylesheet" type="text/css" href="Assets/css/responsive.css">



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
            <li class="now">
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
            <li><a href="${pageContext.request.contextPath}/goUserMessageList">产品产品</a>
            	<ul class="sub">
            		<li><a href="#">标题一的</a></li>
            		<li><a href="#">标题一的</a></li>
            		<li><a href="#">标题三的</a></li>
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
        	
        	
        	<!--<button type="button">登录</button>
        	<button type="button">注册</button>-->
        </div>
        <div class="nav_m">
        	<span class="n_icon">&nbsp;</span>
            <ul>
            	<li class="now"><a href="index.html">首页</a></li>
                <li><a href="about.html">关于我们</a></li>
                <li><a href="solution.html">问卷服务</a></li>
                <li><a href="product.html">产品</a></li>
                <li><a href="service.html">服务</a></li>
                <li><a href="contact.html">联系我们</a></li>
            </ul>
        </div>
    </div>
</div>
<!--头部-->
<!--幻灯片-->
<div class="banner">
	<div class="slider">
        <div class="flexslider">
        	<div style="position:absolute;width:180px;height:100px;z-index:9999;right:10px;top:248px;color: #a4a4a5;font-size: 20px; ">
                   调查问卷系统
            </div>
          <ul class="slides">
          	
            <li>
                <img src="Assets/upload/banner.jpg" alt="" />
                
           
            </li>
            <li>
                <img src="Assets/upload/1.jpg" alt="" />
            </li>
            <li>
                <img src="Assets/upload/3.jpg" alt="" />
            </li>
          </ul>
        </div>
    </div>
</div>
<!--幻灯片-->
<div class="space_hx">&nbsp;</div>
<div class="i_box slt">
	<div class="box_h">
		
        <div class="title"><a href="solution.html">
        	免费使用
            <div class="line line_l">&nbsp;</div>
            
            <div class="line line_r">&nbsp;</div>
        </div>
        
        <p>FREE</p>
        <div class="animal"><a href="#">免费使用</a></div>
    </div>
    
    
    
    
    
    <!--  ssssss-->
    <div class="box_m">
    	<ul class="solution i_solution clearfix">
        	<li>
            	<div class="l_up">
                    <div class="tu"><img src="Assets/images/icon2.png" alt=""/></div>
                    <div class="title">互联网视频流媒体系统</div>
                    <div class="more"><a href="solution.html"><img src="Assets/images/icon1.png" alt=""/></a></div>
                </div>
                <div class="l_dn">
                    <div class="l_line"><span>&nbsp;</span></div>
                    <p>提供了一个开放的应用上传，发布，交流，分享的网络平台，打造更加便利的电视应用生态圈。</p>
                    <a href="">MORE</a>
				</div>
            </li>
            <li>
            	<div class="l_up">
                    <div class="tu"><img src="Assets/images/icon3.png" alt=""/></div>
                    <div class="title">OTT综合业务管理系统</div>
                    <div class="more"><a href=""><img src="Assets/images/icon1.png" alt=""/></a></div>
                </div>
                <div class="l_dn">
                    <div class="l_line"><span>&nbsp;</span></div>
                    <p>提供了一个开放的应用上传，发布，交流，分享的网络平台，打造更加便利的电视应用生态圈。</p>
                    <a href="">MORE</a>
				</div>
            </li>
            <li>
            	<div class="l_up">
                    <div class="tu"><img src="Assets/images/icon4.png" alt=""/></div>
                    <div class="title">广告业务管理系统</div>
                    <div class="more"><a href=""><img src="Assets/images/icon1.png" alt=""/></a></div>
                </div>
                <div class="l_dn">
                    <div class="l_line"><span>&nbsp;</span></div>
                    <p>提供了一个开放的应用上传，发布，交流，分享的网络平台，打造更加便利的电视应用生态圈。</p>
                    <a href="">MORE</a>
				</div>
            </li>
            <li>
            	<div class="l_up">
                    <div class="tu"><img src="Assets/images/icon5.png" alt=""/></div>
                    <div class="title">视频编码系统</div>
                    <div class="more"><a href=""><img src="Assets/images/icon1.png" alt=""/></a></div>
                </div>
                <div class="l_dn">
                    <div class="l_line"><span>&nbsp;</span></div>
                    <p>提供了一个开放的应用上传，发布，交流，分享的网络平台，打造更加便利的电视应用生态圈。</p>
                    <a href="">MORE</a>
				</div>
            </li>
        </ul>
    </div>
<!-- sssssssssssss -->
</div>
<div class="space_hx">&nbsp;</div>
<div class="i_box fw">
	<div class="fw_bg"><img src="Assets/images/bg_b.jpg" alt=""/></div>
    <div class="fw_m">
        <div class="box_h">
            <div class="title">
                服&nbsp;&nbsp;&nbsp;&nbsp;务
                <div class="line line_l">&nbsp;</div>
                <div class="line line_r">&nbsp;</div>
            </div>
            <p>SERVICE</p>
        </div>
        <div class="box_m">
            <ul class="solution service clearfix">
            	<li>
                	<a href="">
                        <div class="tu tu_a">&nbsp;</div>
                        <div class="name">系统集成服务</div>
                        <p>SYSTEM INTEGRATION SERVICES</p>
                        <div class="f_line">&nbsp;</div>
                    </a>
                </li>
                <li>
                	<a href="">
                        <div class="tu tu_b">&nbsp;</div>
                        <div class="name">网络部署服务</div>
                        <p>NETWORK DEPLOYMENT SERVICES</p>
                        <div class="f_line">&nbsp;</div>
                    </a>
                </li>
                <li>
                	<a href="">
                        <div class="tu tu_c">&nbsp;</div>
                        <div class="name">OTT运营推广服务</div>
                        <p>OTT OPERATION PROMOTION SERVICES</p>
                        <div class="f_line">&nbsp;</div>
                    </a>
                </li>
                <li>
                	<a href="">
                        <div class="tu tu_d">&nbsp;</div>
                        <div class="name">技术支持服务</div>
                        <p>TECHNICAL SUPPORT SERVICES</p>
                        <div class="f_line">&nbsp;</div>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</div>


</body>
</html>
