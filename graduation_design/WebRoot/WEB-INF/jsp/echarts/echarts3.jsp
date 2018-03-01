<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/echarts.js"></script>
</head>
<body>
 <div id="main" style="width: 600px;height:400px;"></div>
    <script type="text/javascript">
    $().ready(function() {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        myChart.showLoading();
        // 指定图表的配置项和数据
    var  options = {
    tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    legend: {
        data:[]
    },
    toolbox: {
        show : true,
        orient: 'vertical',
        x: 'right',
        y: 'center',
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            data : []
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
    
    ]
};



 $.ajax({
                type : "post",
                async : false, //同步执行
                url : "${pageContext.request.contextPath }/showEchartBarplus",
                dataType : "json", //返回数据形式为json
                success : function(result) {
                    if (result) {
                    /* var j=JSON.stringify(result);
                    alert(j.toString()) */
                        //将返回的category和series对象赋值给options对象内的category和series
                        //因为xAxis是一个数组 这里需要是xAxis[i]的形式
                        options.xAxis[0].data = result.category;//横坐标
                        options.series = result.series;//纵坐标
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
                  
          // 使用刚指定的配置项和数据显示图表。
    </script>
</body>
</html>