$(function(){
	var w_w=$(window).width();
	var m_l=(1920-w_w)/2;
	$('.fw .fw_bg img').css('margin-left','-'+m_l+'px');
	$('.join .bg img').css('margin-left','-'+m_l+'px');
	$('.banner_s img').css('margin-left','-'+m_l+'px');
	
	$('.nav_m .n_icon').click(function(){
		$(this).siblings('ul').slideToggle();
	});
	$('.nav_m ul li').click(function(){
		$(this).parents('ul').slideUp();	
	});
	
	$('.solution li:last-child').css('margin-right',0+'px');
	$('.pro_l li:last-child').css('margin-right',0+'px');
	
	var srw=$('.scd').width();
	var s_lw=$('.scd_l').width()+45;
	$('.scd .scd_r').width(srw-s_lw+'px');
	var slh=$('.scd .scd_r').height();
	$('.scd .scd_l').height(slh+'px');
	
	$('.contact_m ul li:last-child').css('margin-right',0+'px');
	
	
	$(".aaa").click(function(){
    $(".scd_l .s_nav i").css("top","35px");
    $(".scd .scd_r").css("display","block");
    $(".scd .scd_b").css("display","none");
    $(".scd .scd_c").css("display","none");
    $(".scd .scd_d").css("display","none");
    $(".scd .scd_e").css("display","none");
  });
  
  
  $(".bbb").click(function(){
    $(".scd_l .s_nav i").css("top","112px");
    $(".scd .scd_b").css("display","block");
    $(".scd .scd_r").css("display","none");
    $(".scd .scd_c").css("display","none");
    $(".scd .scd_d").css("display","none");
    $(".scd .scd_e").css("display","none");
  });
	
	$(".ccc").click(function(){
    $(".scd_l .s_nav i").css("top","196px");
    $(".scd .scd_r").css("display","none");
    $(".scd .scd_b").css("display","none");
    $(".scd .scd_c").css("display","block");
    $(".scd .scd_d").css("display","none");
    $(".scd .scd_e").css("display","none");
  });
  
  $(".ddd").click(function(){
    $(".scd_l .s_nav i").css("top","276px");
    $(".scd .scd_r").css("display","none");
    $(".scd .scd_b").css("display","none");
    $(".scd .scd_c").css("display","none");
    $(".scd .scd_d").css("display","block");
    $(".scd .scd_e").css("display","none");
  });
  $(".eee").click(function(){
    $(".scd_l .s_nav i").css("top","355px");
    $(".scd .scd_r").css("display","none");
    $(".scd .scd_b").css("display","none");
    $(".scd .scd_c").css("display","none");
    $(".scd .scd_d").css("display","none");
    $(".scd .scd_e").css("display","block");
  });
  $(".scd_l").css("height","900px");

})

