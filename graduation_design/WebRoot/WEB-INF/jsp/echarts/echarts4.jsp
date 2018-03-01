<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>ECharts饼状图</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/echarts.js"></script>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 600px;height:400px;"></div>
    <script type="text/javascript">
        $().ready(function() {
            var myChart = echarts.init(document.getElementById('main'));
            //图表显示提示信息
            myChart.showLoading();
            //定义图表options
            var options = {
                //color : [ '#3398DB' ],
                title : {
                    text : "",
                    subtext : "www.zhimengzhe.com",
                    sublink : "http://www.zhimengzhe.com/myblog/?Echarts"
                },
                tooltip : {
                    trigger : 'axis'
                },
                legend : {
                    data : []
                },
                toolbox : {
                    show : true,
                    feature : {
                        mark : false
                    }
                },
                calculable : true,
               /*  xAxis : [ {
                    type : 'category',
                    data : []
                } ],
                yAxis : [ {
                    type : 'value',
                    splitArea : {
                        show : true
                    }
                } ], */
                series : [ {
                    barWidth : '60%'
                } 
                ]
            };
 
            //通过Ajax获取数据
            $.ajax({
                type : "post",
                async : false, //同步执行
                url : "${pageContext.request.contextPath }/showEchartPie",
                dataType : "json", //返回数据形式为json
                success : function(result) {
                    if (result) {
                        //将返回的category和series对象赋值给options对象内的category和series
                        //因为xAxis是一个数组 这里需要是xAxis[i]的形式
                        //options.xAxis[0].data = result.category;//横坐标
                        options.series = result.series;//数量、名字
                        options.legend.data = result.legend;// 数据分组
 
                        myChart.hideLoading();
                        myChart.setOption(options);
                    }
                },
                error : function(errorMsg) {
                    alert("图表请求数据失败啦!");
                }
            });
            
            
          
 
        });
    </script>
</body>
</html>
