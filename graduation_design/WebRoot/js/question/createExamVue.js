new Vue({
  el: '#createExamPage',
  data: {
    examTitle: "",
    examScore: "",
    examDescription: "",
    examStartDate: "",
    examEndDate: "",
    errorMessage: "",
  },
  created: function() {
  },
  mounted() {
  },
  methods: {
    goBackPage: function() {
      window.location.href=gobacks;
    },
    verify: function() {
      if (this.examTitle == '') {
        this.errorMessage = "请填写问卷标题";
        return true;
      } else if (this.examStartDate == '') {
        this.errorMessage = "请填写问卷开始时间";
        return true;
      } else if (this.examEndDate == '') {
        this.errorMessage = "请填写问卷结束时间";
        return true;
      } else {
        this.errorMessage = "";
        return false;
      }
    },
    submitInput: function() {
      this.examStartDate = $("#startDate").val();
      this.examEndDate = $("#endDate").val();
      if (this.verify()) {
        layer.open({
          type: 1,
          title: false,
          closeBtn: 0,
          shadeClose: true,
          skin: 'successPassword',
          content: this.errorMessage,
        });
        return;
      }
      var param = {
              examTitle: this.examTitle,
              examScore: this.examScore,
              examDescription: this.examDescription,
              examBeginTime: this.examStartDate,
              examEndTime: this.examEndDate,
            };
      var data = JSON.stringify(param);
      $.ajax({
        url: createExamMessage,
        type: 'POST',
        data: param,
        dataType: 'JSON',
        success: function(data) {
          if (data.status == "1") {
            window.location.href=goExamListPath;
          }
        },
      })
    },
  }
})