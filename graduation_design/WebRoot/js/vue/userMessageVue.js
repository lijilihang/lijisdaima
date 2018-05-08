new Vue({
  el: '#userMessages',
  data: {
    userNameId: '',
    phoneNumber: '',
    userEmail: '',
    userAddress: '',
    userBirthday: '',
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
        },
      })
    },
    changeUserMessage: function() {
      var vueBody = this;
      $.ajax({
        url: changeUserMessage,
        type: 'POST',
        data: {
          userNameId: this.userNameId,
          phoneNumber: this.phoneNumber,
          userEmail: this.userEmail,
          userAddress: this.userAddress,
          userBirthday: this.userBirthday,
        },
        dataType: 'JSON',
        success: function(data) {
          
        },
      })
    }
  }
})