new Vue({
  el: '#userMessages',
  data: {
    userNameId: '',
    phoneNumber: '',
    userEmail: '',
    userAddress: '',
    userBirthday: '',
    imagePath: '',
    formData: new FormData(),
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
        url: getUserMesssagePath,
        dataType: 'JSON',
        success: function(data) {
          vueBody.userNameId = data[0].umNickName;
          vueBody.phoneNumber = data[0].umPhone;
          vueBody.userEmail = data[0].umEmail;
          vueBody.userAddress = data[0].umAddress;
          vueBody.userBirthday = data[0].umBirthday;
          vueBody.imagePath = data[0].umPhotoPath;
        },
      })
    },
    changeUserMessage: function() {
      var vueBody = this;
      console.log(this.userBirthday)
      $.ajax({
        url: changeUserMessagePath,
        type: 'POST',
        data: {
          umNickName: this.userNameId,
          umPhone: this.phoneNumber,
          umEmail: this.userEmail,
          umAddress: this.userAddress,
          umBirthday: this.userBirthday,
        },
        dataType: 'JSON',
        success: function(data) {
          vueBody.getUserMessage();
        },
      })
    },
    onPictureChange(e) {
      this.el = e;
      var files = e.target.files || e.dataTransfer.files;
      var imageType = /^image\//;
      if (!files.length) {
        return;
      }
      this.createImage(files[0]);
    },
    onPictureChange(e) {
      this.el = e;
      var files = e.target.files || e.dataTransfer.files;
      var imageType = /^image\//;
      if (!files.length) {
        return;
      }
      this.createImage(files[0]);
    },
    createImage(file) {
      var reader = new FileReader();
      this.formData.append("file", file);
      var that = this;
      reader.onload = (e) => {
        that.imagePath = e.target.result;
      };
      reader.readAsDataURL(file);

      var data = this.formData;
      var vueBody = this;
      //第二种方式获取formata,但没有用到
      var formDatas = new FormData($("#uploadPic")[0]);
      $.ajax({
        url: changeImage,
        type: 'POST',
        data: data,
        async: false,
        cache: false,
        contentType: false,
        processData: false,
        //dataType:"JSON",
        success: function(result) {
          if (result.status == "1") {
            layer.msg('修改头像成功', {icon: 0, time: 1600});
          }
        },
      })
    },
    triggerChoosePictrue: function() {
      $("#choosePictures ").trigger("click");
    }
  }
})