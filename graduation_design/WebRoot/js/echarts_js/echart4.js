var idd=0;
//运动鞋
var ydx={
    aa:"aa",
    legend:[
        "重庆",
        "四川",
        "贵州",
        "北京",
        "上海"
    ],
    series:[
        {
            name:"总数比较",
            type:"pie",
            barWidth:40,
            stack:null,
            data:[
                {
                    name:"重庆",
                    value:13
                },
                {
                    name:"四川",
                    value:22
                },
                {
                    name:"贵州",
                    value:28
                },
                {
                    name:"北京",
                    value:66
                },
                {
                    name:"上海",
                    value:56
                }

            ]
        }
    ]
}
//袜子
var wz={
    aa:"aa",
    legend:[
        "重庆",
        "四川",
        "贵州",
        "北京",
        "上海"
    ],
    series:[
        {
            name:"总数比较",
            type:"pie",
            barWidth:40,
            stack:null,
            data:[
                {
                    name:"重庆",
                    value:20
                },
                {
                    name:"四川",
                    value:89
                },
                {
                    name:"贵州",
                    value:11
                },
                {
                    name:"北京",
                    value:68
                },
                {
                    name:"上海",
                    value:16
                }

            ]
        }
    ]
}
//高跟鞋
var ggx={
    aa:"aa",
    legend:[
        "重庆",
        "四川",
        "贵州",
        "北京",
        "上海"
    ],
    series:[
        {
            name:"总数比较",
            type:"pie",
            barWidth:40,
            stack:null,
            data:[
                {
                    name:"重庆",
                    value:23
                },
                {
                    name:"四川",
                    value:72
                },
                {
                    name:"贵州",
                    value:28
                },
                {
                    name:"北京",
                    value:36
                },
                {
                    name:"上海",
                    value:96
                }

            ]
        }
    ]
}

//裤子
var kz={
    aa:"aa",
    legend:[
        "重庆",
        "四川",
        "贵州",
        "北京",
        "上海"
    ],
    series:[
        {
            name:"总数比较",
            type:"pie",
            barWidth:40,
            stack:null,
            data:[
                {
                    name:"重庆",
                    value:23
                },
                {
                    name:"四川",
                    value:72
                },
                {
                    name:"贵州",
                    value:28
                },
                {
                    name:"北京",
                    value:36
                },
                {
                    name:"上海",
                    value:96
                }

            ]
        }
    ]
}



//雪纺衫
var xfs={
    aa:"aa",
    legend:[
        "重庆",
        "四川",
        "贵州",
        "北京",
        "上海"
    ],
    series:[
        {
            name:"总数比较",
            type:"pie",
            barWidth:40,
            stack:null,
            data:[
                {
                    name:"重庆",
                    value:23
                },
                {
                    name:"四川",
                    value:72
                },
                {
                    name:"贵州",
                    value:28
                },
                {
                    name:"北京",
                    value:36
                },
                {
                    name:"上海",
                    value:96
                }

            ]
        }
    ]
}



//羊毛衫
var yms={
    aa:"aa",
    legend:[
        "重庆",
        "四川",
        "贵州",
        "北京",
        "上海"
    ],
    series:[
        {
            name:"总数比较",
            type:"pie",
            barWidth:40,
            stack:null,
            data:[
                {
                    name:"重庆",
                    value:23
                },
                {
                    name:"四川",
                    value:72
                },
                {
                    name:"贵州",
                    value:28
                },
                {
                    name:"北京",
                    value:36
                },
                {
                    name:"上海",
                    value:96
                }

            ]
        }
    ]
}



//衬衫
var cs={
    aa:"aa",
    legend:[
        "重庆",
        "四川",
        "贵州",
        "北京",
        "上海"
    ],
    series:[
        {
            name:"总数比较",
            type:"pie",
            barWidth:40,
            stack:null,
            data:[
                {
                    name:"重庆",
                    value:23
                },
                {
                    name:"四川",
                    value:72
                },
                {
                    name:"贵州",
                    value:28
                },
                {
                    name:"北京",
                    value:36
                },
                {
                    name:"上海",
                    value:96
                }

            ]
        }
    ]
}



var leibieMap={
    "运动鞋1":ydx.series,
    "运动鞋2":ydx.legend,
    "袜子1":wz.series,
    "袜子2":wz.legend,
    "高跟鞋1":ggx.series,
    "高跟鞋2":ggx.legend,
    "裤子1":kz.series,
    "裤子2":kz.legend,
    "雪纺衫1":xfs.series,
    "雪纺衫2":xfs.legend,
    "羊毛衫1":yms.series,
    "羊毛衫2":yms.legend,
    "衬衫1":cs.series,
    "衬衫2":cs.legend
}



var optionsBar = {
    color : [ '#3398DB' ],
    title : {
        text : "000",
        subtext : "",
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
    xAxis : [ {
        type : 'category',
        data : []
    } ],
    yAxis : [ {
        type : 'value',
        splitArea : {
            show : true
        }
    } ],
    series : [ {
        barWidth : '60%'
    }
    ]
};

var drillDown={
    getOptionBar:function () {

       $.ajax({
            type : "post",
            async : false, //同步执行
            url : webRoot1,
            dataType : "json", //返回数据形式为json
            success : function(result) {

                if (result) {
                    //将返回的category和series对象赋值给options对象内的category和series
                    //因为xAxis是一个数组 这里需要是xAxis[i]的形式

                    optionsBar.xAxis[0].data = result.category;//横坐标
                    optionsBar.series = result.series;//数量、名字
                    optionsBar.title.text = "柱状图";//数量、名字

                    optionsBar.legend.data = result.legend;// 数据分组
                    //return options;


                }
            },
            error : function(errorMsg) {
               // alert("图表请求数据失败啦!11");
            }
        });

        
    },







    getOptionPie:function () {
        var optionsPie = null;
        optionsPie = {
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
            series : [ {
                barWidth : '60%'
            }
            ]
        };

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
                    optionsPie.series = result.series;//数量、名字
                    optionsPie.legend.data = result.legend;// 数据分组

                   // return options;

                }
            },
            error : function(errorMsg) {
                alert("图表请求数据失败啦222!");
            }
        });



    },



    initChart : function (myChart,optionsBar) {

        myChart.setOption(optionsBar);
        myChart.on('click',function(params) {
            idd=1;
            var pieName=params.name;
            var pieName1=pieName+"1";
            var pieName2=pieName+"2";
            //alert(pieName1);
            //alert(params.name);
            // 销毁之前的echarts实例
            echarts.dispose(domBar);
            // 初始化一个新的实例
            var myChartPie = echarts.init(domBar);


            var optionsPie = null;
            optionsPie = {
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
                series : [ {
                    barWidth : '60%'
                }
                ]
            };

            // $.ajax({
            //     type : "post",
            //     async : false, //同步执行
            //     url :webRoot,
            //     dataType : "json", //返回数据形式为json
            //     success : function(result) {
            //         //alert(JSON.stringify(result));
            //         if (result) {
            //             //将返回的category和series对象赋值给options对象内的category和series
            //             //因为xAxis是一个数组 这里需要是xAxis[i]的形式
            //             //options.xAxis[0].data = result.category;//横坐标
            //
            //             // alert(JSON.stringify(result.series).toString());
            //             // alert(result.legend);
            //             optionsPie.series = result.series;//数量、名字
            //             optionsPie.legend.data = result.legend;// 数据分组
            //             optionsPie.title.text=pieName;
            //             // return options;
            //
            //         }
            //     },
            //     error : function(errorMsg) {
            //         alert("图表请求数据失败啦222!");
            //     }
            // });

            // optionsPie.series = ydx.series;
            // optionsPie.legend.data = ydx.legend;
            // optionsPie.title.text=pieName;
            // optionsPie.series = leibieMap[pieName].series;
            // optionsPie.legend.data = leibieMap[pieName].legend;
            // optionsPie.title.text=pieName;
            //
            //
           // alert(leibieMap[pieName1.toString()]);
             optionsPie.series = leibieMap[pieName1];
             optionsPie.legend.data = leibieMap[pieName2];
             optionsPie.title.text=pieName;



            myChartPie.setOption(optionsPie, true);

        });
    }


}







