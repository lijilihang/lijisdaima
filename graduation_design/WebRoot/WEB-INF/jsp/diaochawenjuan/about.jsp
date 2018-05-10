<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
    <title>关于我们</title>
    <link rel="stylesheet" type="text/css" href="Assets/css/reset.css"/>



    <script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>


<!--加-->
    <script type="text/javascript" src="js/jquery.dataTables.js"></script>
    <script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
    <script type="text/javascript" src="js/layer/layer.js"></script>
    <script type="text/javascript" src="js/layui/layui.js"></script>


    <script type="text/javascript" src="Assets/js/js_z.js"></script>
    <link rel="stylesheet" type="text/css" href="Assets/plugins/FlexSlider/flexslider.css">
    <script type="text/javascript" src="Assets/plugins/FlexSlider/jquery.flexslider.js"></script>
    <script type="text/javascript" src="Assets/js/main.js"></script>
    <link rel="stylesheet" type="text/css" href="Assets/css/thems.css">
    <link rel="stylesheet" type="text/css" href="Assets/css/responsive.css">



<!--加-->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/dataTables.bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/jquery.dataTables.css">


<!--Echarts-->
    <script type="text/javascript" src="js/echarts.js"></script>
    <script type="text/javascript" src="js/echarts_js/data.js"></script>
    <script type="text/javascript" src="js/echarts_js/echart2.js"></script>
    <script type="text/javascript" src="js/echarts_js/echart4.js"></script>
    <script type="text/javascript" src="js/echarts_js/public.js"></script>




    <script language="javascript">
        $(window).load(function() {

            $('.flexslider').flexslider({
                animation: "slide"
            });
        });
    </script>

    <script type="text/javascript">
        var webRoot= '${pageContext.request.contextPath}/showEchartPie';

        map1.init;



//
    </script>


    <script type="text/javascript">
       <!--var webRoot1= 'js/mapjson/china.json';-->
        var webRootmap= '${pageContext.request.contextPath}/goEchartsMap';


        //map1.init;
    </script>


    <script type="text/javascript">

    </script>


</head>

<style type="text/css">

    <!---------------layer---->
    /**{margin: 0px;padding: 0px}*/
    
    #layer1{
        display: none;
        height: 245px;
    }

    .input_test li {
        display: list-item;
        text-align: -webkit-match-parent;
        height:48px;
        width:170px;
        pading-left:60px;
    }

    .input_test p{
        height:20px;
        width:170px;
    }
    .input_test input{
        padding-left: 2px;
        width: 300px;
        height: 20px;
    }
    .input_test{
        margin-left:85px;
        height: 230px;
    }
    /*标题*/
    .layui-layer-title{
        text-align: center;
    }


    /*-----------------------------*/

    .table-bordered {
        /*border: 0px;*/
    }


    td{
        text-align:center;
    }
   /* element.style {
        line-height: 4px;
        float: left;
    }*/


    th{
        text-align:center;
    }
    #div1{border-style:solid; border-width:0px;border-color:black;margin : 10px 0px 10px 10px;width:700px;height: 300px;align:center}



    table.dataTable tbody td {
        /*padding: 8px 10px;*/
        padding-top: 5px;
        padding-right: 5px;
        padding-bottom: 5px;
        padding-left: 5px;
    }

    body {
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
        font-size: 12px;
        line-height: 1.42857143;
        color: #333;
        background-color: #fff;
    }


    div.dataTables_wrapper div.dataTables_filter input {
        margin-right: 41em;
        display: inline-block;
        width: auto;
    }




    .dataTables_wrapper .dataTables_paginate .paginate_button:hover {
        border: 1px solid #1e66c3;
        background: linear-gradient(to bottom, #1e66c3 0%, #1e66c3 100%);

    }
    #layer1 input:focus
    {
        background-color:yellow;
    }

    .col-sm-12 {
        width: auto;
    }



    .nav>li>a:focus, .nav>li>a:hover {
        text-decoration: none;
         background-color: #004587;
    }


    a:focus, a:hover {
        color: #23527c;
        text-decoration: none;
    }


    .col-sm-7 {
        width: 35%;
    }


    table { table-layout:fixed; word-break: break-all; word-wrap: break-word;}


    .btn-group-sm>.btn, .btn-sm {
        padding: 5px 5px;
        font-size: 9px;
        line-height: 1.5;
        border-radius: 3px;
    }
    .scd_r .s_ctn {
        width: 100%;
        padding: 0px 0;
        line-height: 100%;
    }


    .col-sm-7{
        margin-bottom: 40px;
        margin-left: 170px;
    }

    .layui-layer-iframe .layui-layer-btn, .layui-layer-page .layui-layer-btn{
        padding-top: 0px;
    }
    .layui-layer-title{
        margin-bottom: 10px;
    }

    #china-map {
        width:900px;
        height: 500px;
        margin: auto;
    }
    #rooback {
        background: #004587;
        border: 1px;
      color: white;
        margin-top: 10px;
    }
    #rooback1 {
        background: #004587;
        border: 1px;
        color: white;
        margin-top: 10px;
    }


</style>







<body>
<!--头部-->
<div class="header">
    <div class="head clearfix">
        <div class="logo"><a href=""><img src="Assets/images/logo.jpg" alt="视维科技"/></a></div>
        <ul class="nav clearfix">
            <li>
                <a href="${pageContext.request.contextPath}/goIndexRegister1">首页</a></li>
            <li class="now">
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
            <input name="" type="text" class="text">
            <input name="" type="submit" class="btn" value="">
        </div>
        <div class="nav_m">
            <span class="n_icon">&nbsp;</span>
            <ul>
                <li><a href="index.html">首页</a></li>
                <li class="now"><a href="about.html">关于我们</a></li>
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
<div class="banner banner_s"><h1 class="hh">产品运营</h1></div>
<!--幻灯片-->
<div class="scd clearfix">
    <div class="scd_l" >

        <ul class="s_nav" >
            <i>&nbsp;</i>
            <li><a href="#" class="aaa">公司简介</a></li>
            <li><a href="#" class="bbb">企业文化</a></li>
            <li><a href="#" class="ccc">发展历程</a></li>
            <li><a href="#" class="ddd">资质荣誉</a></li>
            <li><a href="#" class="eee">合作伙伴</a></li>
        </ul>
    </div>
    <!--选项一-->
    <div class="scd_r">
        <div class="head">公司简介<em>COMPANY PROFILE</em></div>
        <div class="s_ctn">
            <div class="about">

                <div class="space_hx">&nbsp;</div>





                <div id="layer1">

                    <ul class="input_test">
                        <li>
                            <label for="inp_name">电话：</label>
                            <input id="phone" class="input_out" name="" type="text" onfocus="this.className='input_on';this.onmouseout=''" onblur="this.className='input_off';this.onmouseout=function(){this.className='input_out'};" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'" />

                        </li>
                        <li>
                            <label for="inp_email">密码：</label>
                            <input id="password" class="input_out" name="" type="text" onfocus="this.className='input_on';this.onmouseout=''" onblur="this.className='input_off';this.onmouseout=function(){this.className='input_out'};" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'" />
                        </li>
                        <li>
                            <label for="inp_web">邮箱：</label>
                            <input id="email" class="input_out" name="" type="text" onfocus="this.className='input_on';this.onmouseout=''" onblur="this.className='input_off';this.onmouseout=function(){this.className='input_out'};" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'" />
                        </li>
                        <li>
                            <label for="inp_web">城市：</label>
                            <input id="city" class="input_out" name="" type="text" onfocus="this.className='input_on';this.onmouseout=''" onblur="this.className='input_off';this.onmouseout=function(){this.className='input_out'};" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'" />
                        </li>
                        <li>
                            <label for="inp_web">注册名：</label>
                            <input id="loginname" class="input_out" name="" type="text" onfocus="this.className='input_on';this.onmouseout=''" onblur="this.className='input_off';this.onmouseout=function(){this.className='input_out'};" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'" />
                        </li>
                    </ul>
                </div>




                <div class="row-fluid" id="div1" >

                <!--<div align="center"><select name="select" id="select_k1" class="xla_k">
                    <option value="选择品牌">选择品牌</option>
                    <option value="选择品牌1">选择品牌1</option>
                    <option value="选择品牌2">选择品牌2</option>
                </select></div>-->

                    <table id="example"   class="display table-striped table-bordered table-hover table-condensed" cellspacing="0"  style="margin:auto">
                        <thead>
                        <tr>
                            <th><input type='checkbox' name='checkList' id='all_checked' value=''></th>
                            <th>ID</th>
                            <th>电话</th>
                            <th>密码</th>
                            <th>真电子邮箱</th>
                            <th >居住城市</th>
                            <th >注册名</th>
                            <th>编辑</th>
                        </tr>
                        </thead>
                    </table>
                </div>




            </div>
        </div>
    </div>
    <!--选项二-->
    <div class="scd_b" style="width: 710px;">
        <div class="head">企业文化<em>COMPANY PROFILE</em></div>
        <button id='rooback1' class='' type='button' style='float:right'>返回上一级</button>
        <div class="s_ctn">
            <div class="about">


                <div id="main" style="width: 750px;height:400px;"></div>
                <div id="main1" style="width: 750px;height:400px;"></div>


            </div>
        </div>
    </div>
    <!--选项三-->
    <div class="scd_c" style="width: 710px;">
        <div class="head">发展历程<em>COMPANY PROFILE</em></div>
        <div class="s_ctn">
            <div class="about">

                <div id="main3" style="width: 750px;height:500px;"></div>
            </div>
        </div>
    </div>
    <!--选项四-->
    <div class="scd_d" style="width: 710px;">
        <div class="head">资质荣誉<em>COMPANY PROFILE</em></div>
        <button id='rooback' class='' type='button' style='float:right'>返回上一级</button>

        <div class="s_ctn">
            <div class="about">
                <div id="china-map"></div>


            </div>
        </div>
    </div>
    <!--选项五-->
    <div class="scd_e" style="width: 710px;">
        <div class="head">合作伙伴<em>COMPANY PROFILE</em></div>
        <div class="s_ctn">
            <div class="about">
                <img src="Assets/upload/pic5.jpg" alt=""/>
                <div class="space_hx">&nbsp;</div>
                <div style="border-top:1px solid #ddd; padding-top:30px; font-size:14px; color:#777;">
                    <h1 style="font-size:24px; color:#333333; font-weight:normal;">视维科技555</h1>
                    <p style="margin-top:50px; text-indent:2em;">深圳市视维科技有限公司成立于2004年，是全球智能数字终端产品、应用服务软件以及视频服务系统的主要提供商之一，是集研发、生产、销售于一体的软件企业和高新技术企业。</p>
                    <p style="margin-top:50px; text-indent:2em;">视维科技成立至今，成功研发了全系列的数字电视机顶盒产品，销售覆盖全球五十多个国家，并在海外设立办事处，积极拓展全球市场，成为中东、欧洲、非洲、美洲、澳大利亚等五十多个国家和地区的数字电视机顶盒及相关终端产品的主要供应商，同时，视维科技拥有自己的统一开发平台、能够进行快速实施产品开发和投放市场、能够为客户提供综合性视频端到端解决方案的企业。</p>
                    <p style="margin-top:50px; text-indent:2em;">目前，视维科技拥有员工近400人，组建了一支极具敬业、创造和进取精神的高素质管理团队。公司的研发团队是一大批具有多年从事数字视讯产品开发经验的行业顶尖人才，包括各种获得专业资格认证的硬件、软件高级工程师与工程技术人员，其中3位还曾荣获国家广电部和科技部的科学技术奖。公司在产品设计、项目管理、软件开发等方面具有雄厚的技术实力和丰富的实践经验。</p>
                    <p style="margin-top:50px; text-indent:2em;">视维科技秉承“科技以人为本”的理念，以高科技为依托，良好的运营模式和服务质量为基石，坚持以最先进的技术、最稳定的性能和最优质的质量服务于广大用户。我们致力于使“视维科技”（SOWELL）成为数字电视领域内最有影响力的品牌，让越来越多的人享受到数字电视带来的乐趣。 </p>
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


<script type="text/javascript">










    function fun(s) {
        alert("aaa"+s);
        var a=table.fnGetNodes();
        alert(table.fnGetData(a[0]))
    }
    function deletet(s) {
        alert(s);
        var nTrs = table.fnGetNodes();//fnGetNodes获取表格所有行，nTrs[i]表示第i行tr

        for(var i = 0; i < nTrs.length; i++){
            var t = table.fnGetData(nTrs[i]);
            console.log("aaaaaa:" + t[2]);//获取一行第3列数据

        }
    }
    $(function () {










        //提示信息
        var lang = {
            //
            "searching": "hao",
            //"scrollX": true,
            "sProcessing": "加载中...",
            "sLengthMenu": "每页 _MENU_ 项",
            "sZeroRecords": "没有匹配结果",
            "sInfo": "当前显示第 _START_ 至 _END_ 项，共 _TOTAL_ 项。",
            "sInfoEmpty": "当前显示第 0 至 0 项，共 0 项",
            "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
            "sInfoPostFix": "",
             "sSearch": "搜索:",
            "sUrl": "",
            "sEmptyTable": "表中数据为空",
            "sLoadingRecords": "载入中...",
            "sInfoThousands": ",",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "上一页",
                "sNext": "下一页",
                "sLast": "末页",
                "sJump": "跳转"
            },
            "oAria": {
                "sSortAscending": ": 以升序排列此列",
                "sSortDescending": ": 以降序排列此列"
            }
        };

        //初始化表格
        /*     $( selector ).DataTable();
               $( selector ).dataTable().api();
               new $.fn.dataTable.Api( selector );  */
        var table = $("#example").dataTable({

            /* dom: 'Bfrtip',
            buttons: ['colvis', 'excel', 'print'], */


            //dom: 'Bfrtip',
            // buttons: ['colvis', 'excel', 'print'],
            // lengthMenu: [ 20, 30, 40, 50, 100 ],//代表你可以把表格设置为每页 20/30/40/50/100 条数据显示
            //lengthMenu: [ [10, 25, 50, -1], [10, 25, 50, "所有"] ],
            /*第一个数组是具体的值，理解为 <option value=""></option> value 对应的值
                                    第二个数组是用来显示的文字，理解为 <option value="">显示的文字</option>这里需要提的是，数字要 >0 ，
                                     但是有个特殊值 -1 它代表显示全部数据*/
            search: {
                caseInsensitive: false //关掉区分大小写过滤
            },

            //scrollY: 400,//设置表格高度为400
            scrollCollapse: false,//允许表格调整高度
            paging:true,//使用分页
            language:lang,  //提示信息,上面
            autoWidth: false,  //禁用自动调整列宽
            stripeClasses: ["odd", "even"],  //为奇偶行加上样式，兼容不支持CSS伪类的场合
            processing: true,  //隐藏加载提示,自行处理
            serverSide: true,  //启用服务器端分页
            searching: true,  //原生搜索
            orderMulti: false,  //启用多列排序
            ordering:false,

            //sScrollX: "100%",/*是否开启水平或上下滚动条默认值：空 （字符串类型）*/
            bScrollCollapse: false,
            /*sScrollY: "100%",
            bPaginate: false,*/

            // scrollX:false,
            lengthChange:false,
            //order: [],  //取消默认排序查询,否则复选框一列会出现小箭头
            //order: [[ 4, 'asc' ]],//在index为四的列按升序排列
            renderer: "jquery-ui",  //渲染样式：Bootstrap和jquery-ui,bootstrap
            pagingType: "full_numbers",  //分页样式：simple,simple_numbers,full,full_numbers
            //列表表头字段
            /* columns: [
                {title:"编号", data: "Id" },
                {title:"姓名", data: "Name" },
                {title:"性别", data: "Sex" }
            ], */
            columns: [
                {data: null},
                {data: "umId"},//"width":"6px"
                { data: "umPhone" },
                {data: "umPassword" },
                // {title:"真实名字", data: "u_name" },
                //{title:"身份证号码", data: "u_identify_num" },
                { data: "umEmail"},
                { data: "umCity" },
                {data: "umName"},

                // {title:"编111辑", data: "u_id" },
                { data: null }
                /*{title:"角1色", data: "u_id",render:function(a,b,c,d){
                return a.
                    return "<button onclick='fun()'>编辑</button><button onclick='deletet(6)'>删除</button>"
                } }*/
                //  {title:"注册11名", data: "u_id" }

            ],
            columnDefs: [{

                targets: 0,
                data:null,
                width: "1px",
                defaultContent: "<input type='checkbox' name='checkList' id='test_checked' value=''>"
            },




                {
                    targets: -1,
                    defaultContent: "<div class='btn-group'>"+
                    "<button id='editRow' class='btn btn-primary btn-sm' type='button' style='float:left'>编辑</button>" +"&nbsp;"+"&nbsp;"+

                    "<button id='delRow' class='btn btn-primary btn-sm' type='button' style='float:right'>删除</button>"+
                    "</div>"
                }],
            ajax: function (data, callback, settings) {//callback必须被执行，DataTables才能获取到数据;且将返回的数据作为callback()的唯一参数.(参数中可以配置Datatable的页面信息)
                //封装请求参数
                //data 发送给服务器的数据  settings:Datatables的设置对象
                 //alert($(".form-control").val());
                var param = {};
                param.limit = data.length;//页面显示记录条数，在页面显示每页显示多少项的时候
                param.start = data.start;//开始的记录序号
                param.page = (data.start/data.length)+1;//当前页码
                param.selsectPhone=$(".form-control").val();
                $(".form-control").attr("placeholder","请输入要查询的电话");
                //console.log(param);
                //ajax请求数据
                $.ajax({
                    type: "GET",
                    url: "${pageContext.request.contextPath}/requestAjax",
                    cache: false,  //禁用缓存
                    data: param,  //传入组装的参数
                    dataType: "json",
                    success: function (result) {
                        var j=JSON.stringify(result);
                         //alert(j.toString())
                        setTimeout(function () {
                            var returnData = {};
                            returnData.draw = data.draw;//这里直接自行返回了draw计数器,应该由后台返回
                            returnData.recordsTotal = data.length;//返回数据全部记录
                            returnData.recordsFiltered = result[0].umLoginName-1;// (由 ?? 项结果过滤)后台不实现过滤功能，每次查询均视作全部结果
                            returnData.data = result;//.data;//返回的数据列表
                            console.log(returnData);
                            //调用DataTables提供的callback方法，代表数据已封装完成并传回DataTables进行渲染
                            //此时的数据需确保正确无误，异常判断应在执行此回调前自行处理完毕
                            callback(returnData);
                        }, 200);
                    }
                });
            },







        }).api()
        // table.search("请输入要查询的电话");//赋值
        //此处需调用api()方法,否则返回的是JQuery对象而不是DataTables的API对象

        /* $('#example').on( 'page.dt', function () {
        var info = table.page.info();
        $('#pageInfo').html( 'Showing page: '+info.page+' of '+info.pages );
        } );//当页面发生改变 时触发事件 */


//删除   "<button id='delRow' class='btn btn-primary btn-sm' type='button'>删除</button>"+
        $("#example").on("click", "#delRow", function () {
            // alert(111);
            var tables=$("#example").DataTable();
            var data=tables.row($(this).parents("tr")).data();
            //var data = table.api().row($(this).parents("tr")).data();
            var u_id=data.umId;
            //alert(u_id);
            if(confirm("是否确认删除这条信息?")){
                //$(function ().table.ajax.reload();
                //table.settings()[0].ajax.param = param;

                //table.ajax.reload(null,false);//刷新保持当前页面
                $.ajax({
                    url:"${pageContext.request.contextPath}/goDeleteTable?u_id="+u_id,
                    // type:"",
                    dataType: "json",
                    cache: "false",
                    success:function(data){
                    //alert(data);
                        if(data == "1"){
                            // alert("abc");
                            table.ajax.reload(null,false);
                            showSuccess("<sp:message code='sys.oper.success'/>");
                            //table.api().row().remove().draw(false);
                        }else{
                            //showFail("<sp:message code='sys.oper.fail'/>");
                        }
                    },
                    error:function(err){
                        showFail("Server Connection Error...");
                    }
                });
            }
        });



        //修改
        $("#example").on("click", "#editRow", function () {
        
            var tables=$("#example").DataTable();
            var data=tables.row($(this).parents("tr")).data();
            var id=data.umId;
            var phone=data.umPhone;
            var password=data.umPassword;
            var email=data.umEmail;
            var city=data.umCity;
            var loginname=data.umName;
            //alert(id);
            layer.open({
                title:"用户信息",
                type: 1,
                skin: 'layui-layer-rim', //加上边框
                area: ['600px', '360px'], //宽高
                btn: ['确定','取消'],
                yes: function (index, layero) {
                    var json = {
                        "umId": id,
                        "umPhone": $("#phone").val(),
                        "umPassword": $("#password").val(),
                        "umEmail": $("#email").val(),
                        "umCity": $("#city").val(),
                        "umName": $("#loginname").val()
                    };
                    j=JSON.stringify(json);
                    //alert(j.toString());
                    $.ajax({
                        type: "POST",
                        url: "${pageContext.request.contextPath}/goUpdateTable",
                        contentType: "application/json; charset=utf-8",
                        data: JSON.stringify(json),
                        dataType: "json",
                        success: function (data) {
                            if (data== true) {
                                table.ajax.reload(null,false);
                            } else if (data == false) {

                                table.ajax.reload(null,false);
                            }
                        }
                    });
                    layer.close(index);
                    //table.ajax.reload();
                },
                content:$("#layer1")


            });

            $("#phone").val(phone);
            $("#password").val(password);
            $("#email").val(email);
            $("#city").val(city);
            $("#loginname").val(loginname);

        });







    });

    //全选
    $("#all_checked").click(function(){
        $('[name=checkList]:checkbox').prop('checked',this.checked);//checked为true时为默认显示的状态
    });




</script>



<!--地图-->
<script>
    var myChart = echarts.init(document.getElementById('china-map'));
    var mapStack = [];
    var timeFn = null;
    var curMap = {};
    loadMap('china', 'china');



    $("#rooback").on("click",function () {
       // alert("aaa");
        var map = mapStack.pop();
        if (!mapStack.length && !map) {
            alert('已经到达最上一级地图了');
            return;
        }
        loadMap(map.mapCode, map.mapName);

    })
//    $("#rooback").click(function () {
//        alert("aaa")
//    })

    myChart.on('dblclick', function(params) {
        clearTimeout(timeFn);
       // alert("a")
        //由于单击事件和双击事件冲突，故单击的响应事件延迟250毫秒执行
        timeFn = setTimeout(function(){
            var name = params.name;
            // alert(params.mapName);
            // var mapCode = cityMap[name];
            var mapCode =emProvance[name];
            // alert(mapCode);
            if (!mapCode) {
                alert('无此区域地图显示');
                return;
            }
            loadMap(mapCode, name);
            //将上一级地图信息压入mapStack
            mapStack.push({
                mapCode: curMap.mapCode,
                mapName: curMap.mapName
            });
            //alert(mapStack[0].mapCode);
        }, 250);
    });




//    myChart.on('dblclick', function(params) {
//       // alert("qq")
//        //当双击事件发生时，清除单击事件，仅响应双击事件
//        clearTimeout(timeFn);
//        //alert(mapStack.mapCode)
//        var map = mapStack.pop();
//        if (!mapStack.length && !map) {
//            alert('已经到达最上一级地图了');
//            return;
//        }
//        loadMap(map.mapCode, map.mapName);
//    });


    function loadMap(mapCode, mapName) {
    $.get('js/mapjson/geometryProvince/'+mapCode + '.json', function (chinaJson) {
        echarts.registerMap(mapName, chinaJson);
          //alert("aaa");




        option1 = {
            title : {
                text: '分布',
                subtext: '',
                x:'center'
            },
            /*  tooltip : {
                 trigger: 'item'
             }, */

            tooltip:
                    {
                        trigger: 'item',
                        formatter: function (params) {
                            var obj = JSON.parse(JSON.stringify(params));
                            var itemName = obj.name;
                            var dataIndex = obj.dataIndex;
                            var str = "<ur style='text-align:left'><li style='color: #da70d6;font:bolder;'>" + itemName + "</li>";
                            for (var i = 0; i <option1.series.length;i++) {
                                str = str + "<li>" + option1.series[i].name + ":" + option1.series[i].data[dataIndex].value + "</li>";
                            }
                            str = str + "</ul>";

                            return str;
                        }
                    },



            legend: {
                orient: 'vertical',
                x:'left',
                data:['订单量','销量']
            },

            dataRange: {
                x: 'left',
                y: 'bottom',

                splitList: [
                    {start: 1500},
                    {start: 900, end: 1500},
                    {start: 310, end: 1000},
                    {start: 200, end: 300},
                    {start: 10, end: 200, label: '10 到 200（自定义label）'},
                    {start: 5, end: 5, label: '5（自定义特殊颜色）', color: 'black'},
                    {end: 10}
                ],
                color: ['#E0022B', '#E09107', '#A3E00B']
            },
            roam: false,//不能改变地图大小
            layoutCenter: [],
//            mapLocation: {
//                x : 'left',
//                y : 'left'},
            layoutSize:500,
            //scaleLimit:{min:0.8,max:10.0},
            toolbox: {
                show: true,
                orient : 'vertical',
                x: 'right',
                y: 'center',
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            roamController: {

                show: true,
                x: 'right',
//                step:20,
//                height:300,
//                width:300,
//                borderColor:'red',
//                borderWidth:12,
                mapTypeControl: {
                    mapName: true
                }
            },








            series : [

                {
                    name: '订单量',
                    type: 'map',
                    //mapType: mapName,
                    mapLocation: {
                        x : 'left',
                        y : 'left'},
                    roam: false,

                    selectedMode : 'multiple',
                    itemStyle:{
                        normal:{
                            label:{
                                show:true,
                                textStyle: {
                                    color: "rgb(249, 249, 249)"
                                }
                            }
                        },
                        emphasis:{label:{show:true}}
                    },
                    data:[


                    ]
                },


                {
                    name: '销量',
                    type: 'map',
                    mapType: mapName,
                    roam: false,


                    itemStyle:{
                        normal:{
                            label:{
                                show:true,
                                textStyle: {
                                    color: "rgb(249, 249, 249)"
                                }
                            }
                        },
                        emphasis:{label:{show:true}}
                    },
                    data:[


                    ]
                }





            ]
        };
        /*  //map.enableScrollWheelZoom(true); //开启滚轮缩放
          myChart.setOption(option);
          myChart.on('mouseover', function (params) {
              var dataIndex = params.dataIndex;
              console.log(params);
          });*/


if(mapName=="china"){



        $.ajax({
            type: "post",
            async: false, //同步执行
            url: webRootmap,
            dataType: "json", //返回数据形式为json
            success: function (result) {
                var j=JSON.stringify(result[0]);
                 //alert(j.toString());
                // alert(rusult.length)
                if (result) {

                    //将返回的category和series对象赋值给options对象内的category和series
                    //因为xAxis是一个数组 这里需要是xAxis[i]的形式
                    //options.xAxis[0].data = result.category;//横坐标
                    /*  for (var i; i < 2; i++) {
                          option.series[i].data = result[i];//数量、名字

                      }*/
                    option1.series[0].data = result[0];
                    option1.series[1].data = result[1];
                    option1.layoutCenter=layaa;
                    option1.roamController.x="right";
//                    option1.layoutSize=100;
//                    option1.scaleLimit.max=10.0;
                    myChart.hideLoading();
                    myChart.setOption(option1);


                    curMap = {
                        mapCode: mapCode,
                        mapName: mapName
                    };
                }
            },
            error: function (errorMsg) {
                alert("图表请求数据失败啦!qqqqqqq");
            }
        });

}else{
    option1.series[0].data = datamap;
    option1.series[1].data = datamap;
    myChart.hideLoading();
    myChart.setOption(option1);


    curMap = {
        mapCode: mapCode,
        mapName: mapName
    };

}



    });
    }




</script>



</body>
<script type="text/javascript">

    var webRoot1 = '${pageContext.request.contextPath}/showEchartBar';
    var webRoot2 = '${pageContext.request.contextPath}/showEchartLine';
    var domBar = document.getElementById('main');
    myChart4 = echarts.init(domBar);
    drillDown.getOptionBar();
    drillDown.initChart(myChart4, optionsBar);


    $('#rooback1').on('click',function(){
        if(idd==1){
    echarts.dispose(domBar);
    var myChart5 = echarts.init(domBar);
    drillDown.getOptionBar();
    drillDown.initChart(myChart5,optionsBar);
    idd=0;

}else {
            alert("已经最上面一层了！");
        }

    });

    //   init 注意事项：
    //
    //    1、再实例化之前请确保相关的js文件已经引入且路径正确；
    //
    //    2、在执行图表对象渲染方法init(dom)的时候，记住这里的dom是一个页面容器元素的对象，请确保这个元素对象是存在的，否则执行了init(dom)方法时会报出尚未定义的错误；
    //s
    //    3、dom元素一定要指定其大小，关于元素的大小我么可以通过css进行设置：

</script>

</html>
