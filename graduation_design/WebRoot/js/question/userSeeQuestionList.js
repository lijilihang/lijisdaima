new Vue({
  el: '#form1',
  data: {
    items: [],
    offsets: 0,
    modelTitle: "",
  },
  created: function() {
    this.getQuestionList();
  },
  mounted() {
  },
  methods: {
    triggerRadio: function(event,num) {
      var toggle = event.currentTarget;
      $(toggle).find(".radioSize").trigger("click");
    },
    getQuestionList: function() {
      this.offset = this.offset + 1
      var offsets = this.offset * 10;
      var pages = {
        examId: localStorage.getItem("examId")
      }
      var vueBody = this;
      $.ajax({
        url: getQuestionListPath,
        type: 'POST',
        dataType: 'JSON',
        data: pages,
        success: function(data) {
          for (var i = 0; i < data.length; i++) {
            vueBody.items.push(data[i]);
          }
        },
      })
    },
    goLinkPage: function() {
      window.location.href = goShowLinkPath;
    },
    optionStatisc: function(title,type,index) {
      var questionNum = parseInt(index) - 1;
      var optionNum = this.items[questionNum].option.length;
      var data = {
        type: type,
        questionNum: parseInt(index),
        examId: localStorage.getItem("examId"),
        optionNum: optionNum,
      }
      this.modelTitle = title;
      var myPieChart = echarts.init(document.getElementById('optionPieChar'));
      var optionPie = {
          title: {
              text: '选项情况统计',
              subtext: '数据统计',
              //x: '150',
              left: 'center'
          },
          tooltip : {
              trigger: 'item',
              formatter: "{a} <br/>{b} : {c} ({d}%)"
          },
          toolbox: {
            feature: {
              saveAsImage: {}
            }
          },
          legend: {
              orient: 'vertical',
              // top: 'middle',
        	  x: 'right',
        	  y: 'bottom',
              //bottom: 10,
              //left: 'center',
              data: []
          },
          series : [

              {
                  type: 'pie',
                  radius : '65%',
                  center: ['50%', '50%'],
                  selectedMode: 'single',
                  data:[
                  ],
                  itemStyle: {
                      emphasis: {
                          shadowBlur: 10,
                          shadowOffsetX: 0,
                          shadowColor: 'rgba(0, 0, 0, 0.5)'
                      }
                  }
             }
          ]
      };
      var vueBody = this;
      $.ajax({
          url: getOptionNumPath,
          type: 'POST',
          dataType: 'JSON',
          data: data,
          success: function(result) {
            var optionNumVal = result.value.split(",");
            console.log(optionNumVal);
            for (var i = 0; i < optionNumVal.length - 1; i++) {
              var map = {}
              map.value = optionNumVal[i];
              map.name = vueBody.items[questionNum].option[i].value;
              optionPie.series[0].data.push(map);
              optionPie.legend.data[i] = vueBody.items[questionNum].option[i].value;
            }
            myPieChart.setOption(optionPie);
          },
      })
    },
    questionStatisc: function() {

      this.modelTitle = this.items[0].examTitle;
      var myLineChart = echarts.init(document.getElementById('optionPieChar'));
      optionLine = {
        title: {
          text: '最近七天问答量统计',
          left: 'center'
        },
        tooltip: {
          trigger: 'axis'
        },
        legend: {
          data:['答卷数量'],
          //x: 'right',
          y: 'bottom',
        },
        grid: {
          left: '6%',
          right: '10%',
          bottom: '10%',
          containLabel: true
        },
        toolbox: {
          feature: {
            saveAsImage: {}
          }
        },
        xAxis: {
          type: 'category',
          boundaryGap: false,
          data: []
        },
        yAxis: {
          type: 'value'
        },
        series: [
          {
            name:'答卷数量',
            type:'line',
            stack: '总量',
            data:[]
          },
        ]
      };
      $.ajax({
        url: getTestScoreTotalPath,
        type: 'POST',
        dataType: 'JSON',
        data: {examId: localStorage.getItem("examId")},
        success: function(result) {
          for (var i = 6; i >= 0; i--) {
            optionLine.xAxis.data.push(result[i].testDate);
            optionLine.series[0].data.push(result[i].total);
          }
          myLineChart.setOption(optionLine);
        },
      })
    },
    scoreOptimistic:function() {
      var myBarChart = echarts.init(document.getElementById('optionPieChar'));
      optionBar = {
        title: {
          text: '本问卷分数统计',
          left: 'center'
        },
        tooltip: {
          trigger: 'axis'
        },
        legend: {
          data:['答卷分数数量'],
          //x: 'right',
          y: 'bottom',
        },
        grid: {
          left: '6%',
          right: '10%',
          bottom: '10%',
          containLabel: true
        },
        toolbox: {
          feature: {
            saveAsImage: {}
          }
        },
        xAxis: {
          type: 'category',
          //boundaryGap: false,
          data: []
        },
        yAxis: {
          type: 'value'
        },
        series: [
          {
            name:'答卷分数数量',
            type:'bar',
            stack: '总量',
            data:[]
          },
        ]
      };
      $.ajax({
        url: getLineChartMessagePath,
        type: 'POST',
        dataType: 'JSON',
        data: {examId: localStorage.getItem("examId")},
        success: function(result) {
          console.log(result)
          for (var i = 0; i<result.length; i++) {
            optionBar.xAxis.data.push(result[i].scoreArea);
            optionBar.series[0].data.push(result[i].counts);
          }
          myBarChart.setOption(optionBar);
        },
      })
    }
  }
})