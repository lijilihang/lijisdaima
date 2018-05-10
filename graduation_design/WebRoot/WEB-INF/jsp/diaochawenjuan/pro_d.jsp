<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<title>产品详情</title>
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
              <a href="index.html">首页</a></li>
            <li>
              <a href="about.html">产品运营</a>
              <ul class="sub">
                <li><a href="#">用户测评</a></li>
                <li><a href="#">问卷调研</a></li>
                <li><a href="#">创建问卷</a></li>
              </ul>
            </li>
            <li><a href="solution.html">问卷服务</a>
              <ul class="sub">
                <li><a href="#">问卷调研</a></li>
                <li><a href="#">在线测评</a></li>
              </ul>
            </li>
             <li><a href="${pageContext.request.contextPath}/goUserMessageList">我的账户</a>
              <ul class="sub">
                    <li><a href="${pageContext.request.contextPath}/goUserMessageList">基本资料</a></li>
                    <li><a href="${pageContext.request.contextPath}/goChangPassword">修改密码</a></li>
                    <li><a href="${pageContext.request.contextPath}/goRealName">实名认证</a></li>
                    <li><a href="${pageContext.request.contextPath}/goSetUp">个人设置</a></li>
               </ul>
            </li>
            <li><a href="service.html">服务支持</a>
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
          <input name="" type="text" class="text">
            <input name="" type="submit" class="btn" value="">
        </div>
        <div class="nav_m">
          <span class="n_icon">&nbsp;</span>
            <ul>
              <li><a href="index.html">首页</a></li>
                <li><a href="about.html">关于我们</a></li>
                <li><a href="solution.html">问卷服务</a></li>
                <li class="now"><a href="product.html">产品</a></li>
                <li><a href="service.html">服务</a></li>
                <li><a href="contact.html">联系我们</a></li>
            </ul>
        </div>
    </div>
</div>
<!--头部-->
<!--幻灯片-->
<div class="banner banner_s"><img src="Assets/upload/banner_a.jpg" alt=""/></div>
<!--幻灯片-->
<div class="scd clearfix">
  <div class="scd_l">
      <div class="title">
          <span>产品中心</span>
            <i>&nbsp;</i>
        </div>
        <ul class="s_nav">
          <li><a href="">DVB-S数字卫星机顶盒</a><i>&nbsp;</i></li>
            <li><a href="">Android OTT机顶盒</a><i>&nbsp;</i></li>
            <li><a href="">DVB-T数字地面机顶盒</a><i>&nbsp;</i></li>
            <li><a href="">DVB-C数字有线机顶盒</a><i>&nbsp;</i></li>
        </ul>
    </div>
    <div class="scd_r">
      <div class="head">产品<em>PRODUCT</em></div>
        <div class="s_ctn">
          <div class="pro_da clearfix">
              <div class="pro_dal">
                  <h5>S500A</h5>
                    <div class="det">DVB-S2+CA+LAN+USB+WIFI</div>
                    <div class="des">
                      <p>高清有线接收（DVB-S2，MPEG-2/MPEG-4/H2.64）</p>
                        <p>高灵敏度</p>
                        <p>支持可选的CA智能卡槽</p>
                        <p>支持DiSEq C 1.0/1.1/1.2/1.3(USALS)</p>
                        <p>支持Unicable</p>
                        <p>PAL/SECAM/NTSC  视频制式自动/强制转换</p>
                    </div>
                </div>
                <div class="pro_dar"><img src="Assets/upload/pic1.jpg" alt=""/></div>
            </div>
            <div class="pro_db clearfix">
              <div class="h_bg">
                  <p>高清有线接收（DVB-S2，MPEG-2/MPEG-4/H2.64）</p>
                    <p>高灵敏度</p>
                    <p>支持可选的CA智能卡槽</p>
                    <p>支持DiSEq C 1.0/1.1/1.2/1.3(USALS)</p>
                    <p>支持Unicable</p>
                    <p>PAL/SECAM/NTSC  视频制式自动/强制转换盲扫功能</p>
                    <p>支持4：3、16：9和letter box视频输出</p>
                    <p>支持多卫星、网络、PID、指南、多频点搜索</p>
                    <p>可支持多种语言菜单（英语、西班牙语、普通话… …）</p>
                    <p>多语言音频</p>
                    <p>多媒体功能</p>
                    <p>多窗口浏览节目</p>
                </div>
                <div>
                  <p>支持设置8个喜爱的节目群和父母锁功能</p>
                    <p>简单的操作方式</p>
                    <p>支持定时功能</p>
                    <p>支持7天节目预告</p>
                    <p>支持分级节目管理</p>
                    <p>支持USB升级软件及录制功能</p>
                    <p>支持多语言字幕显示</p>
                    <p>电子图文功能</p>
                    <p>支持自动搜索节目功能</p>
                    <p>支持PIP(支持SD频道)</p>
                    <p>低能耗</p>
                    <p>符合CE和RoHS标准</p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="join">
  <div class="bg bg_a"><img src="Assets/images/pic2.jpg" alt=""/></div>
    <div class="wen"><a href=""><img src="Assets/images/pic1.png" alt=""/></a></div>
    <div class="bg bg_b"><img src="Assets/images/bg_c.png" alt=""/></div>
</div>
<div class="f_bg">
  <div class="f_m clearfix">
      <div class="f_logo"><a href=""><img src="Assets/images/logo_b.png" alt=""/></a></div>
        <div class="code"><img src="Assets/upload/code.png" alt=""/></div>
        <div class="f_mr">
          <div class="line">&nbsp;</div>
            <div class="space_hx">&nbsp;</div>
            <span class="tl">联系我们</span>
            <div class="num">
              <a href=""><img src="Assets/images/icon9.png" alt=""/></a>
                <a href=""><img src="Assets/images/icon10.png" alt=""/></a>
                <em>+86-755-2652 6837</em>
            </div>
            <div class="space_hx">&nbsp;</div>
            <div class="line">&nbsp;</div>
        </div>
    </div>
    <div class="bq_bg">
      <div class="bq">
          SOWELL Technology co., Ltd 
            <span>Copyright(c) 2014 更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a> </span>
        </div>
    </div>
</div>
</body>
</html>
