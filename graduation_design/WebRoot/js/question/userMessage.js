$(document).ready(function(){
  $("#editorUserMessage").click(function(){
    $("#userNameId").removeAttr("disabled");
    $("#phoneNumber").removeAttr("disabled");
    $("#userEmail").removeAttr("disabled");
    $("#userIdentifyNum").removeAttr("disabled");
    $("#userAddress").removeAttr("disabled");
    $("#userBirthday").removeAttr("disabled");
    $(".userMessageButton").css("display","inline-block");
  });
  
  $("#submitAllMessage").click(function(){
    $("#userNameId").attr("disabled","disabled");
    $("#phoneNumber").attr("disabled","disabled");
    $("#userEmail").attr("disabled","disabled");
    $("#userIdentifyNum").attr("disabled","disabled");
    $("#userAddress").attr("disabled","disabled");
    $("#userBirthday").attr("disabled","disabled");
    $(".userMessageButton").css("display","none");
  });
  

  
})






