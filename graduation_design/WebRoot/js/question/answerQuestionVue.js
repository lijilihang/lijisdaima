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
          for (var i = data.length - 1; i>=0; i--) {
            vueBody.items.push(data[i]);
          }
        },
      })
    }
  }
})