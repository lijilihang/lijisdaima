var map1 ={
    //url:webRoot,

    init:$().ready(function(){


                    var myChart = echarts.init(document.getElementById('main3'));
                    //图表显示提示信息
                    myChart.showLoading();
                    //定义图表options
                    var options = {
                        //color : [ '#3398DB' ],
                        title : {
                            text : "饼图",
                            subtext : "",
                            sublink : "http://www.zhimengzhe.com/myblog/?Echarts"
                        },
                        tooltip : {
                            trigger : 'item'
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
                        url :webRoot,
                        dataType : "json", //返回数据形式为json
                        success : function(result) {
                            if (result) {
                                //将返回的category和series对象赋值给options对象内的category和series
                                //因为xAxis是一个数组 这里需要是xAxis[i]的形式
                                //options.xAxis[0].data = result.category;//横坐标

                                // alert(JSON.stringify(result.series).toString());
                                // alert(result.legend);
                                options.series = result.series;//数量、名字
                                options.legend.data = result.legend;// 数据分组

                                myChart.hideLoading();
                                myChart.setOption(options);
                            }
                        },
                        error : function(errorMsg) {
                            alert("图表请求数据失败啦222!");
                        }
                    });







    }
    )
}


/*$().ready(function() {


    });*/
