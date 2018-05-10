new Vue({
  el: '#realName',
  data: {
    trueName: "",
    myPhone: "",
    idetifyNumber: "",
    email: "",
  },
  created: function() {
    this.getUserMessage();
  },
  mounted() {
  },
  methods: {
    getUserMessage: function() {
      var vueBody = this;
      $.ajax({
        url: getRealNameMessagePath,
        dataType: 'JSON',
        success: function(data) {
          vueBody.trueName = data[0].umName;
          vueBody.myPhone = data[0].umPhone;
          vueBody.idetifyNumber = data[0].umIdentifyNum;
          vueBody.email = data[0].umEmail;
        },
      })
    },
    resetRealName: function() {
      this.trueName = "";
      this.myPhone = "";
      this.idetifyNumber = "";
      this.email = "";
      this.getUserMessage();
    },
    changeRealNameMessage: function() {
      if (this.trueName == "" || this.myPhone == "" || this.idetifyNumber == "" || this.email == "") {
        layer.open({
          type: 1,
          title: false,
          closeBtn: 0,
          shadeClose: true,
          skin: 'successPassword',
          content: '请填写完整信息'
        });
        return;
      }
      var vueBody = this;
      $.ajax({
        url: changeRealNameMessagePath,
        type: 'POST',
        data: {
          umName: this.trueName,
          umPhone: this.myPhone,
          umEmail: this.email,
          umIdentifyNum: this.idetifyNumber,
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
              content: '实名认证成功'
              });
            vueBody.getUserMessage();
          }
          
        },
      })
    },
  }
})