new Vue({
  el: '#linkPages',
  data: {
    myLink: "http://127.0.0.1:8080/graduation_design/goAnswerQuestion?examId=",
    userSeeList: "http://127.0.0.1:8080/graduation_design/goUserSeeQuestionList?examId=",
  },
  created: function() {
    this.changLink();
  },
  mounted() {
  },
  methods: {
    changLink: function() {
      this.myLink = this.myLink + localStorage.getItem("examId");
    },
    copyLink: function() {
      $("#inputLink").select();
      document.execCommand("Copy");
      layer.msg('复制成功');
    },
    goback: function() {
      window.location.href = goExamListPath;
    },
    goUserSeeQuestionList: function() {
      this.userSeeList = this.userSeeList + localStorage.getItem("examId");
      window.location.href = this.userSeeList;
    }
  }
})