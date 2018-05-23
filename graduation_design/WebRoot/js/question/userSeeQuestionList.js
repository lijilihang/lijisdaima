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
        offset: offsets,
      }
      var vueBody = this;
      $.ajax({
        url: getQuestionListPath,
        type: 'get',
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
     /* {value:1548,name: '幽州'},
      {value:535, name: '荆州'},
      {value:510, name: '兖州'},
      {value:634, name: '益州'},
      {value:735, name: '西凉'}*/
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
    }
  }
})