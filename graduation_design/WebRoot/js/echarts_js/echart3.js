var map1 ={
    //url:webRoot,

    init:$.get(webRoot1, function (chinaJson) {


        echarts.registerMap('china', chinaJson);







        var myChart = echarts.init(document.getElementById('china-map'));
        option = {
            title : {
                text: '订单量',
                subtext: '纯属虚构',
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
                        for (var i = 0; i <option.series.length;i++) {
                            str = str + "<li>" + option.series[i].name + ":" + option.series[i].data[dataIndex].value + "</li>";
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
                mapTypeControl: {
                    'china': true
                }
            },








            series : [
                {
                    name: '订单量',
                    type: 'map',
                    // mapType: 'china',
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
                },


                {
                    name: '销量',
                    type: 'map',
                    mapType: 'china',
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




        $.ajax({
            type: "post",
            async: false, //同步执行
            url: webRoot2,
            dataType: "json", //返回数据形式为json
            success: function (result) {
                var j=JSON.stringify(result[0]);
                alert(j.toString());
                // alert(rusult.length)
                if (result) {

                    //将返回的category和series对象赋值给options对象内的category和series
                    //因为xAxis是一个数组 这里需要是xAxis[i]的形式
                    //options.xAxis[0].data = result.category;//横坐标
                    /*  for (var i; i < 2; i++) {
                     option.series[i].data = result[i];//数量、名字

                     }*/
                    option.series[0].data = result[0];
                    option.series[1].data = result[1];
                    myChart.hideLoading();
                    myChart.setOption(option);
                }
            },
            error: function (errorMsg) {
                alert("图表请求数据失败啦bbb!");
            }
        });


})



}

/*$().ready(function() {


    });*/
