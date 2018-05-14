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
<link rel="stylesheet" type="text/css"
  href="css/question/answerQuestion.css">
</head>
<body>


  <form id="form1" method="post"
    action="https://www.wjx.cn/joinnew/processjq.ashx?curid=23373077">




   
    <div id="toptitle">
      <div class="header_left"></div>
      <h1 class="htitle">{{items[0].examTitle}}</h1>
    </div>
   
    <div id="divBackgroundWrap"></div>
    <div id="divContent" class="divContent">
      <div class="checkInMode__head clearfix" id="divCheckInMode"
        style="display:none;">
        <div class="wjxCountDown__wrap game_time">
          <div class="countDown__hold">
            <div class="round round1"></div>
          </div>
          <div class="countDown__hold">
            <div class="round round2"></div>
          </div>
          <div class="countDown__bg"></div>
          <div class="CountDown__frame"></div>
          <div class="countDown__time">
            <div class="countDown__time--num" id="divCGMaxTime">10</div>
            <div class="countDown__time--unit">秒</div>
          </div>
        </div>
        <div class="icon decoration-icon pull-left"></div>
        <div class="schedule-wrap pull-right">
          <div id="schedule">1</div>
          / <span id="cgtotal">5</span>题
        </div>
      </div>

      <div id="divDesc" class="formfield">
        <span class="description">
          <p></p>
          <p>&nbsp; &nbsp; &nbsp;
            &nbsp;您好，为了更好的了解大数据环境下公民个人信息保护的现状，更好的保护自身权利和维护他人的利益，特此设计了问卷，对于您的问卷，我会依据国家相关法律法规，做好保密工作，也希望您能够配合和参与，非常感谢。</p>
          <p>&nbsp; &nbsp; &nbsp; 填写说明：请您将符合您本人情况和意见的答案填写在括号中。</p>
          <p></p>
          <p></p>
        </span>
      </div>

      <div id="divQuestion">
        <fieldset class="fieldset" style="" id="fieldset1">
          <div id="divPage1" style="margin:7px 12px;">
            <b><b>第一部分（单选和多选）</b><br> </b>
          </div>
          
          
          
          
          
          
          
          
          
          
          
          
          
          <div class="field ui-field-contain" id="div1" v-for="item in items">
            <div class="field-label" >
              {{item.title}}
              <span class="req">*</span>
              <span class="qtypetip" v-if="item.type == 'checkbox'">&nbsp;[多选题]</span>
              <span class="qtypetip" v-if="item.type == 'textArea'">&nbsp;[填空题]</span>
            </div>
            <div class="ui-controlgroup">

              <div class="ui-radio" v-if="item.type != 'textArea'" v-for="perOption in item.option" @click="triggerRadio($event,$index)">
                <span class="jqradiowrapper">
                  <input :type="item.type" :value="perOption.id" :name="item.index" class="radioSize">
                </span>
                <div class="label" >{{perOption.value}}</div>
              </div>
              
              <textarea rows="" cols="" v-if="item.type == 'textArea'" class="form-control inputArea"></textarea>
              
              
              
            </div>
            <div class="errorMessage"></div>
          </div>
          
          
          
          
         <!--  <div class="field ui-field-contain" id="div1">
            <div class="field-label" >
                                                 您的建议是什么
              <span class="req">*</span>
              <span class="qtypetip" >&nbsp;[填空题]</span>
            </div>
            <div class="ui-controlgroup">
              <div class="ui-radio" v-for="perOption in item.option" @click="triggerRadio($event,$index)">
                <span class="jqradiowrapper">
                  <input :type="item.type" :value="perOption.id" :name="item.index" class="radioSize">
                </span>
                <div class="label" >{{perOption.value}}</div>
              </div>
              <textarea rows="" cols="" class="form-control inputArea"></textarea>
            </div>
            <div class="errorMessage"></div>
          </div> -->
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        </fieldset>
      </div>













     
      <div class="footer">
        <div class="ValError"></div>
        <div id="divSubmit" style="padding: 10px;">
          <a id="ctlNext" @click="goLinkPage" class="button blue">返回</a>
          <div style="margin:0px 0 10px; padding-top:10px;">
            <a href="/urlreport.aspx?url=23373077"
              style="float: right;color:#aaa;font-size:13px;" class="reportto"
              rel="nofollow"> 举报</a>
            <div style="clear: both;"></div>
          </div>
        </div>

        <div id="divSearch"
          style="background:#020d15;color: #7c7c7c; font-size: 18px; height:50px;
                left: 0; line-height:50px; position: fixed; text-align: center; bottom: 0; width: 100%;
                z-index: 100;display:none;">
        </div>
      </div>
    </div>
    <div id="divPowerBy" style="margin: 0 auto;" class="logofooter">
      <div class="wjfooter">
        <span id="spanPower"><a
          href="https://www.wjx.cn/mobile/index.aspx" target="_blank"
          title=" _不止问卷调查/在线考试"> </a>调查问卷系统</span>
      </div>
    </div>


 

    <input type="hidden" value="1" id="action" name="action"> <input
      type="hidden" value="2018/5/13 20:49:02" id="starttime"
      name="starttime"> <input type="hidden" value="directphone"
      id="source" name="source">
  </form>
  <script type="text/javascript">
  window.getQuestionListPath = "${pageContext.request.contextPath }/getQuestionList";
  window.goShowLinkPath = "${pageContext.request.contextPath }/goShowLink";
  </script>
<script type="text/javascript" src="js/question/userSeeQuestionList.js"></script>
</body>
</html>