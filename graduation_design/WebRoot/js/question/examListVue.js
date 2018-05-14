new Vue({
  el: '#examListPage',
  data: {
    examId: "",
    examTitle: "",
    examStartDate: "",
    examEndDate: "",
    examCreateTime: "",
    items: [],
  },
  created: function() {
    this.getList();
  },
  mounted() {
  },
  methods: {
    getList: function() {
      var vueBody = this;
      $.ajax({
        url: getExamListPath,
        type: 'POST',
        dataType: 'JSON',
        success: function(data) {
          for (var i = 0; i<data.length; i++) {
            vueBody.items.push(data[i]);
          }
        },
      })
    },
    goEdit: function(id) {
      $.ajax({
        url: getQuestionPath,
        type: 'POST',
        data: {examId: id},
        dataType: 'JSON',
        success: function(data) {
          if (data.status == "1") {
            localStorage.setItem("examId", id);
            window.location.href = goShowLinkPath;
          } else {
            localStorage.setItem("examId", id);
            window.location.href = getCreateQuestionPath;
          }
        },
      })
    },
    deleteExam: function(examId) {
      layer.confirm('您确定要删除？', {
          btn: ['确定','取消'] //按钮
        }, function(){
        $.ajax({
          url: deleteExamPath,
          type: 'POST',
          data: {examId: examId},
          dataType: 'JSON',
          success: function(data) {
            if (data.status == "1") {
              layer.msg('删除成功', {icon: 1, time: 1000}, function() {
                window.location.href = goSelfPath;
              });
            } else {
              layer.msg('删除失败', {icon: 0, time: 1000});
            }
          },
        })
        }, function(){
          layer.msg('好的', {
            time: 1000, //1s后自动关闭
        });
      });
    }
  }
})