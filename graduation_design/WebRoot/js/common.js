//打开字滑入效果
window.onload = function() {
  $(".connect p").eq(0).animate({
    "left" : "0%"
  }, 600);
  $(".connect p").eq(1).animate({
    "left" : "0%"
  }, 400);
};
//jquery.validate表单验证
$(document).ready(function() {

  /*$("#submit").click(function() {
    $.ajax({
      url : mypath,
      data : {
        "umPhone" : $("#number").val()
      },

      success : function(data) {
        if (jQuery.isEmptyObject(data)) {
          //<label id="number-error" class="error" for="number" style="display: block;">手机号码格式错误</label>
          //alert("用户名不存在！");
          //$("#number").after('<label id="number-error" class="error" for="number">用户名已存在</label>');
        } else {
          alert("ok2");
          $("#number-error").remove();
        }
      }
    });
  });
*/
//异步验证登陆用户名密码
  $("#submit1").click(function() {
    $.ajax({
      type: 'get',
      contentType: "application/json;charset=utf-8",//发送数据时的格式
      url : mypath2,
      data : {
        "umPhone" : $("#number1").val(),
        "umPassword" : $("#umPassword1").val(),
        "umVcode" : $("#vcode").val(),
      },
      dataType: "json",//服务器返回的数据类
      success : function(data) {
        //var j=JSON.stringify(data);
        //var j = JSON.parse(data);
        if(data[0].response==false){

        }else{
        if(data[0].umPhone==false){
          alert("用户名不存在！");
          getNewImg();
        }else{
          if(data[0].umPassword==false){
            alert("用户名和密码不匹配！");
            getNewImg();
          }else{
            if(data[0].vcode==false){
              alert("验证码输入错误！");
              getNewImg();
            }else{
              window.location.href=mypath3;
            }
          }
        }
      }

      }
    });
  });



  //异步验证注册信息
    /*$("#submit2").click(function() {
      $.ajax({
        contentType: "application/json;charset=utf-8",//发送数据时的格式
        url : mypath4,
        data : {
          "umPhone" : $("#umPhone2").val(),
          "umPassword" : $("#umPassword2").val(),
          "umPasswordl" : $("#unPassworda2").val(),
          "umName" : $("#umName2").val(),
          "umIdentifyNum" : $("#umIdentifyNum2").val(),
          "umEmail" : $("#umEmail2").val(),
          "umCity" : $("#umCity2").val()

        },
         dataType: "json",//服务器返回的数据类
        success : function(data) {
          var j=JSON.stringify(data);
          alert(j.toString());


        }
      });
    });*/



  $("#umPhone2").blur(function() {
    $.ajax({
      contentType: "application/json;charset=utf-8",//发送数据时的格式
      url : mypath4,
      data : {
        "umPhone" : $("#umPhone2").val()
      },
       dataType: "json",//服务器返回的数据类
      success : function(data) {
        if(data.umPhone==2){
          alert("用户名已存在！");
          $("#registerForm").attr("onsubmit", "return false");

        }else if(data.umPhone==1){
          $("#registerForm").attr("onsubmit", "return true");
        }else{
          $("#registerForm").attr("onsubmit", "return false");
        }s
      }
    });
  });


  $("#loginForm").validate({
    rules : {
      umPhone : {
        required : true, //必填
        umPhone : true,
      },
      umPassword : {
        required : true,
        minlength : 3,
        maxlength : 32,
        //umPassword :true
      //umPassword:true,
      },
    vcode: {
      required:true,
      minlength : 4,
      maxlength : 4,
    }
    },
    //错误信息提示
    messages : {
      umPhone : {
        required : "必须填写电话号码",
      },
      umPassword : {
        required : "必须填写密码",
        minlength : "密码至少为3个字符",
        maxlength : "密码至多为32个字符",
      },
    vcode:{
      required:"必须填写验证码",
      minlength : "验证码为4个字母",
      maxlength : "验证码为4个字母",
    },
    },
  });
  //注册表单验证
  $("#registerForm").validate({
    rules : {
      umPhone : {
        required : true, //必填
        minlength : 2, //最少6个字符
        maxlength : 32, //最多20个字符


      /*remote:{
        url:"http://kouss.com/demo/Sharelink/remote.json",//用户名重复检查，别跨域调用
        type:"post",
      },*/
      },
      umPassword : {
        required : true,
        minlength : 3,
        maxlength : 32,
      },
      umEmail : {
        required : true,
        umEmail : true,

      },
      umPasswordl : {
        required : true,
        minlength : 3,
        equalTo : '.pass'
      },
      umName : {
        required : true,
        umName : true,
      },
      umIdentifyNum : {
        required : true,
        umIdentifyNum : true, //自定义的规则
      //digits:true,//整数
      }
    },
    //错误信息提示
    messages : {
      umPhone : {
        required : "必须填写姓名",
        minlength : "姓名至少为2个字符",
        maxlength : "姓名至多为32个字符",
        remote : "姓名已存在",
      },
      umPassword : {
        required : "必须填写密码",
        minlength : "密码至少为3个字符",
        maxlength : "密码至多为32个字符",
      },
      umEmail : {
        required : "请输入邮箱地址",
        digits : "请输入正确的email地址",
      },
      umPasswordl : {
        required : "请再次输入密码",
        minlength : "确认密码不能少于3个字符",
        equalTo : "两次输入密码不一致", //与另一个元素相同
      },
      umName : {
        required : "请输入真实姓名",
        minlength : "真实姓名不能少于2个字符",
        maxlength : "真实姓名至多为32个字符",
      },
      /*phone_number:{
        required:"请输入手机号码",
        digits:"请输入正确的手机号码",
      },*/
      umIdentifyNum : {
        required : "请输入身份证号码",
      //digits:"请输入正确的手机号码",
      },
    },
  });

    //pwv=false;
    //alert(pwv);

  //添加自定义验证规则
  jQuery.validator.addMethod("umPhone", function(value, element) {
    var length = value.length;
    var umPhone = /^(1[35678]{1}[0-9]{9})$/
    return this.optional(element) || (length == 11 && umPhone.test(value));
  }, "手机号码格式错误");
//this.optional(element)用于表单控件的值不为空时才触发验证。

  /*jQuery.validator.addMethod("umPassword2", function(value, element) {
    var pwv=true;//true不显示错误，false显示错误
    $("#submit").click(function() {
      $.ajax({
        url : mypath2,
        data : {
          "umPhone" : $("#number").val(),
          "umPassword" : $("#umPassword").val()
        },
                 async:true,
        success : function(data) {
          //pwv=false;
          pwv=JSON.parse(data);
          //alert(pwv)
          //alert(pwv)
          if(pwv==false){
            pwv=false;
          }
          //return pwv;
        }
      });
    });

  //return true;
    //alert(pwv);
    return pwv;//true不显示错误，false显示错误
  }, "密码错误");*/

  jQuery.validator.addMethod("umEmail", function(value, element) {
    var length = value.length;
    var umEmail = /^([a-zA-Z_0-9]{1,}@[a-zA-Z0-9]{1,}(.[a-zA-Z]{1,}){1,})$/
    //var email = /^((.[a-zA-Z]{1,}){1,})$/
    return this.optional(element) || (umEmail.test(value));
  }, "邮箱格式错误");

  /*jQuery.validator.addMethod("vcode", function(value, element) {
    var length = value.length;
    var vcode = /^([a-zA-Z_0-9]{1,}@[a-zA-Z0-9]{1,}(.[a-zA-Z]{1,}){1,})$/
    return this.optional(element) ||(vcode.test(value));
  }, "验证码错误");*/
  jQuery.validator.addMethod("umIdentifyNum", function(value, element) {
    var length = value.length;
    var umIdentifyNum = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/; //验证身份证
    return this.optional(element) || (umIdentifyNum.test(value));
  }, "身份证号码错误");
  jQuery.validator.addMethod("umName", function(value, element) {
    var length = value.length;
    var umName = /^[\u4e00-\u9fa5]{2,}$/g;
    //alert("a");
    return this.optional(element) || (umName.test(value));
  }, "请输入正确的姓名");
});