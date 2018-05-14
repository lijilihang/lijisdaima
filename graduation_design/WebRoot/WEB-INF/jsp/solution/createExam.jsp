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
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<script type="text/javascript" src="js/layer/layer.js"></script>
<link rel="stylesheet" type="text/css" href="js/layui/css/layui.css">
<script type="text/javascript" src="js/layui/layui.js"></script>
<script type="text/javascript" src="Assets/js/js_z.js"></script>
<link rel="stylesheet" type="text/css" href="Assets/plugins/FlexSlider/flexslider.css">
<script type="text/javascript" src="Assets/plugins/FlexSlider/jquery.flexslider.js"></script>
<script type="text/javascript" src="Assets/js/main.js"></script>
<script type="text/javascript" src="js/question/index.js"></script>
<link rel="stylesheet" type="text/css" href="Assets/css/thems.css">
<link rel="stylesheet" type="text/css" href="Assets/css/responsive.css">
<link rel="stylesheet" type="text/css" href="css/question/createExam.css">
<script type="text/javascript" src="js/vue/vue.js"></script>
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
            <li class="now"><a href="${pageContext.request.contextPath}/goSolutionRegister">问卷服务</a>
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

<div class="banner banner_s"><h1 class="hh">问卷服务</h1></div>


<!-- 中心 -->
<div class="box_m">

  <div class="mainText" id="createExamPage">
    <div class="mainContent">
      <div class="examTitles">问卷标题(必填)</div>
      <input name="examTitle" v-model="examTitle"  id="examTitle" class="form-control examTitleInput" placeholder="请输入不多于20个字符"  />
      <div class="examTitle">问卷分数</div>
      <input name="examTitle" v-model="examScore" placeholder="请输入数字"  id="examTitle" class="form-control examTitleInput" />
      <div class="examTitle">问卷描述</div>
      <input name="examTitle" v-model="examDescription" placeholder="请输入不多于50个字符" id="examTitle" class="form-control examTitleInput" />
      <div class="examTitle">开始时间(必填)</div>
      <input name="examTitle" v-model="examStartDate"  placeholder="请选择时间" id="startDate" class="form-control examTitleInput " />
      <div class="examTitle">结束时间(必填)</div>
      <input name="examTitle" v-model="examEndDate" placeholder="请选择时间" id="endDate" class="form-control examTitleInput " />
      <div class="submitDiv">
        <button class="form-control submitExam" @click="submitInput">提交</button>
        <button class="form-control goback" @click="goBackPage">返回</button>
      </div>
    </div>
    
  </div>




</div>
    
    <!--  -->
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
<script type="text/javascript">
  layui.use('laydate', function(){
      var laydate = layui.laydate;
      laydate.render({
        elem: '#startDate'
      });
  });
  layui.use('laydate', function(){
      var laydate = layui.laydate;
      laydate.render({
        elem: '#endDate'
      });
  });
  window.createExamMessage = "${pageContext.request.contextPath }/createExamMessage";
  window.gobacks = "${pageContext.request.contextPath }/goSolutionRegister";
  window.goExamListPath = "${pageContext.request.contextPath }/goExamList";
</script>
<script type="text/javascript" src="js/question/createExamVue.js"></script>
</body>
</html>