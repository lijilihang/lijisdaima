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
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/layer/layer.js"></script>
<link rel="stylesheet" type="text/css" href="js/layui/css/layui.css">
<script type="text/javascript" src="js/layui/layui.js"></script>
<script type="text/javascript" src="Assets/js/js_z.js"></script>
<script type="text/javascript" src="js/echarts.js"></script>
<link rel="stylesheet" type="text/css"
  href="Assets/plugins/FlexSlider/flexslider.css">
<script type="text/javascript" src="Assets/plugins/FlexSlider/jquery.flexslider.js"></script>
<script type="text/javascript" src="Assets/js/main.js"></script>
<script type="text/javascript" src="js/question/index.js"></script>
<script type="text/javascript" src="js/vue/vue.js"></script>

<link rel="stylesheet" type="text/css" href="Assets/css/thems.css">
<link rel="stylesheet" type="text/css" href="Assets/css/responsive.css">
<link rel="stylesheet" type="text/css" href="css/question/answerQuestion.css">
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
        
          <p></p>
          <p></p>
        </span>
      </div>

      <div id="divQuestion">
        <fieldset class="fieldset" style="" id="fieldset1">
          <div id="divPage1" style="margin:7px 12px;">
            <b>本次问卷题目</b>
            <img alt="" title="分数统计图" class="barPictrue" src="css/question/images/bar.png">
          </div>
 
          
          <div class="field ui-field-contain" id="div1" v-for="item in items">
            <div class="field-label" >
              {{item.title}}
              <span class="req">*</span>
              <span class="qtypetip" v-if="item.type == 'checkbox'">&nbsp;[多选题]</span>
              <span class="qtypetip" v-if="item.type == 'textArea'">&nbsp;[填空题]</span>
              <img alt="" class="piePictrue" @click="optionStatisc(item.title,item.type,item.index)" src="css/question/images/pie.png" data-toggle="modal" data-target="#myModal">
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
      
      
      
      <!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" 
                        aria-hidden="true">×
                </button>
                <h4 class="modal-title" id="myModalLabel">
                   {{modelTitle}}
                </h4>
            </div>
            <div class="modal-body">
              <div id="optionPieChar" class="optionPieChar"></div>
            </div>
            <div class="modal-footer">
                
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
  </form>
  
  
  



  
  
  
  
<script type="text/javascript">
  window.getQuestionListPath = "${pageContext.request.contextPath }/getQuestionList";
  window.goShowLinkPath = "${pageContext.request.contextPath }/goShowLink";
  window.getOptionNumPath = "${pageContext.request.contextPath }/getOptionNum";
  </script>
<script type="text/javascript" src="js/question/userSeeQuestionList.js"></script>
</body>
</html>