new Vue({
  el: '#changePassward',
  data: {
    oriPassword: "",
    newPassword: "",
    mateNewPassword: "",
    errorMessage: "",
  },
  created: function() {
    
  },
  mounted() {
  },
  methods: {
    resetPassword: function() {
      this.oriPassword = "";
      this.newPassword = "";
      this.mateNewPassword = "";
    },
    matchPassword: function() {

      if (this.newPassword == this.mateNewPassword) {
        return true;
      } else {
        return false;
      }
    },
    submitPassword: function() {
      var vueBody = this;
      if (this.newPassword.length < 6) {
        this.errorMessage = "新密码长度不少于六个字符！";
        return;
      }
      if (!this.matchPassword()) {
        this.errorMessage = "两次输入的新密码不匹配";
        return;
      } else {
        this.errorMessage = "";
        $.ajax({
          url: changePasswordPath,
          type: 'POST',
          data: {
            oriPassword: this.oriPassword,
            newPassword: this.newPassword,
            mateNewPassword: this.mateNewPassword,
          },
          dataType: 'JSON',
          success: function(data) {
            if (data.status == "1") {
              layer.open({
                type: 1,
                title: false,
                closeBtn: 0,
                shadeClose: true,
                skin: 'successPassword',
                content: '修改密码成功'
                });
            } else if (data.status == "0") {
              vueBody.errorMessage = "初始密码错误！";
            } else if (data.status == "2") {
              vueBody.errorMessage = "操作失败";
            } 
          },
         })
      }
    },
  }
})