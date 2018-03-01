<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Upper HTML Website Template</title>
    <!-- load stylesheets -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  
    <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="font-awesome-4.5.0/css/font-awesome.min.css">                
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/bootstrap.min.css">                                      
    <!-- Bootstrap style -->
    <link rel="stylesheet" href="css/hero-slider-style.css">                              
    <!-- Hero slider style (https://codyhouse.co/gem/hero-slider/) -->
    <link rel="stylesheet" href="css/magnific-popup.css">                                 
    <!-- Magnific popup style (http://dimsemenov.com/plugins/magnific-popup/) -->
    <link rel="stylesheet" href="css/templatemo-style.css">                                   
    <!-- Templatemo style -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
          <style type="text/css">
          	  /*为了使菜单居中*/
    body {
       
        text-align:center; 
    }
    
    
    /* -------------菜单css代码----------begin---------- */
    
    
    /* 设置二级菜单绝对定位，并隐藏 */
     #nav-item ul{list-style:none; position:relative;  }

     #tmNavbar > ul > li > ul {
 
        position: absolute;
        display:none;

    }

    #tmNavbar > ul > li > ul > li > a {
        width: 144px;
        line-height: 36px;
        color: #456;
        background-color: #eff;
        text-align: center;
        border: 1px solid #ccc;
        border-top: none;
        display: block;
 float: none;
    }
  
    /* 鼠标放在一级菜单上，显示二级菜单 */
    #tmNavbar > ul > li:hover ul {
        display: block;
        float: none;
        position: absolute;

    }

  
     
    
    
    /* 在二级菜单中，鼠标放上去的样式 */
    #tmNavbar > ul > li > ul > li > a:hover {
        color: #a4f;
        background-color: #cdf;
    }
    /* -------------菜单css代码----------end---------- */
    
          </style>
</head>
<title>食堂出入库管理</title>
    <body>
        
        <!-- Content -->
        <div class="cd-hero">

            <!-- Navigation -->        
            <div class="cd-slider-nav">
                <nav class="navbar">
                    <div class="tm-navbar-bg">
                        
                        <a class="navbar-brand text-uppercase" href="#"><i class="fa fa-flash tm-brand-icon"></i><font size="5">智愚食堂出入库管理</font></a>

                        
                        <div class="collapse navbar-toggleable-md text-xs-center text-uppercase tm-navbar" id="tmNavbar">
                            <ul class="nav navbar-nav">
                                <li class="nav-item active selected">
                                    <a class="nav-link"  data-no="1">首页 <span class="sr-only">(current)</span></a>
                                    
                                </li>                                
                                <li class="nav-item">
                                    <a class="nav-link" >基础信息管理</a>
                                    <ul>
                    <li><a href="">食堂信息管理</a></li>
                    <li><a href="">商品信息管理</a></li>
                    <li><a href="#">供应商管理</a></li>
                    <li><a href="">价格查询</a></li>
                					</ul>
                                </li>
                                 <li class="nav-item">
                                    <a class="nav-link" href="#0" data-no="5">统计查询</a>
                                    <ul>
                    <li><a href="">食堂查询</a></li>
                    <li><a href="">商品查询</a></li>
                   <li><a href="">供应商查询</a></li>
                    <li><a href="">出库查询</a></li>
                					</ul>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#0" data-no="6">系统管理</a>
                                     <ul>
                    <li><a href="">操作员管理</a></li>
                    <li><a href="">更改密码</a></li>
                    <li><a href="">权限管理</a></li>
                					</ul>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#0" data-no="3">进货管理</a>
                                    <ul>
                    <li><a href="">进货单</a></li>
                    <li><a href="">进货退货</a></li>
                   
                					</ul>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#0" data-no="4"> 销售管理</a>
                                    <ul>
                    <li><a href="">出库单</a></li>
                    <li><a href="">出库退货</a></li>
                   
                					</ul>
                                </li>
                               
                                <li class="nav-item">
                                    <a class="nav-link" href="#0" data-no="6">库存管理</a>
                                     <ul>
                    <li><a href="">库存盘点</a></li>
                    
                   
                					</ul>
                                </li>
                                
                            </ul>
                        </div>                        
                    </div>

                </nav>
            </div> 

            <ul class="cd-hero-slider">
           

                   

</body>
</html>