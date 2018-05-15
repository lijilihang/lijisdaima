new Vue({
  el: '#form1',
  data: {
    items: [],
    offsets: 0,
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
      localStorage.setItem("examId", $("#examIdValHidden").val());
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
    submitFunction: function() {
      localStorage.setItem("examId", $("#examIdValHidden").val());
      var subject = [];
      $(".field").each(function(index){
        var eachQuestion = {};
        var option = '';
        var indexA = index + 1;
        var names = indexA + "";
        var a = $(this).find(".radioSize").length;
        var b = $(this).find(".radioSize").attr("type");
        if (a > 0 && b == "checkbox") {
          eachQuestion["examId"] = localStorage.getItem("examId")
          eachQuestion["type"] = "checkbox";
          $('[name=' + names + '][checked]').each(function(index) {
            var v = $(this).val();
            option = option + v + '|'
          })
          eachQuestion["value"] = option;
          eachQuestion["questionNum"] = names;
        } else if(a > 0 && b == "radio") {
          eachQuestion["examId"] = localStorage.getItem("examId")
          var val = $('input:radio[name=' + names + ']:checked').val();
          eachQuestion["type"] = "radio";
          //option.push(val);
          option = option + val;
          eachQuestion["value"] = option;
          eachQuestion["questionNum"] = names;
        } else {
          eachQuestion["examId"] = localStorage.getItem("examId")
          eachQuestion["type"] = "textarea";
          var h = $(this).find(".inputArea").val();
          //option.push(h);
          option = option + h;
          eachQuestion["value"] = option;
          eachQuestion["questionNum"] = names;
        }
        subject.push(eachQuestion);
      })
      console.log(subject);
      $.ajax({
        type: "POST",
        url: submitAnswerPathss,
        dataType: "json",
        contentType: "application/json",
        data: JSON.stringify(subject),
        success: function(data){
          
        }
      });
    },
  }
})