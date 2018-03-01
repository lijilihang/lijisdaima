<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>ECharts</title>
        <link rel="stylesheet" type="text/css" href="css/main.css"/>
        <script type="text/javascript" src="js/jquery.min.js"></script>
         <script type="text/javascript" src="js/echarts.js"></script>
        <style>#china-map {width:1000px; height: 1000px;margin: auto;}</style>
    </head>
    <body>        

        <div id="china-map"></div>
        
        <script>
        
        $.get('js/mapjson/china.json', function (chinaJson) {
        echarts.registerMap('china', chinaJson);
        
         
          
          
          
          
          
            var myChart = echarts.init(document.getElementById('china-map'));
            var option = {
                tooltip: {
//                    show: false //不显示提示标签
                    formatter: '{b}', //提示标签格式
                    backgroundColor:"#ff7f50",//提示标签背景颜色
                    textStyle:{color:"#fff"} //提示标签字体颜色
                },
                
                
                 /*  tooltip: {  
            trigger: 'item',  
            formatter: function(params) {  
                var res = params.name+'<br/>';  
                var myseries = option.series;  
                for (var i = 0; i < myseries.length; i++) {  
                    for(var j=0;j<myseries[i].data.length;j++){  
                        if(myseries[i].data[j].name==params.name){  
                            res+=myseries[i].name +' : '+myseries[i].data[j].value+'</br>';  
                        }  
                    }  
                }  
                return res;  
            }  
        },   */
                series: [{
                    type: 'map',
                    mapType: 'china',
                    label: {
                        normal: {
                            show: true,//显示省份标签
                            textStyle:{color:"#c71585"}//省份标签字体颜色
                        },    
                        emphasis: {//对应的鼠标悬浮效果
                            show: true,
                            textStyle:{color:"#800080"}
                        } 
                    },
                    itemStyle: {
                        normal: {
                            borderWidth: 0.5,//区域边框宽度
                            borderColor: '#009fe8',//区域边框颜色
                            areaColor:"#ffefd5",//区域颜色
                        },
                        emphasis: {
                            borderWidth: .5,
                            borderColor: '#4b0082',
                            areaColor:"red",//选中省份颜色#ffdead
                        }
                    },
                    data:[
                    
                        {name:'福建', selected:true},
                        {name:'重庆', selected:true}//福建为选中状态
                    ]
                }],
            };
            
            myChart.setOption(option);
            myChart.on('mouseover', function (params) {
                var dataIndex = params.dataIndex;
                console.log(params);
            });
            
             });
        </script>
        
    </body>
</html>
