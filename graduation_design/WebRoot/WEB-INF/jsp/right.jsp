<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>食堂系统</title>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<meta name="keywords" content="食堂系统">
<meta name="discription" content="食堂系统">
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/system.css" />
<script src="js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#selectall").click(function(){
	var s=$(this).attr("src");
	if(s.indexOf("up")>0){//未选中状态
		$(".sysinfo .chk").attr("src","images/index/ck_down.gif")
		$(".sysinfo input:checkbox").attr("checked","checked");
	}
	else{
			$(".sysinfo .chk").attr("src","images/index/ck_up.gif")
			$(".sysinfo input:checkbox").removeAttr("checked");
		}
	});
	$(".list .chk").click(function(){
		var s=$(this).attr("src");
		if(s.indexOf("up")>0){//未选中状态
			$(this).attr("src","images/index/ck_down.gif")
			//$(".sysinfo input:checkbox").attr("checked","checked");
		}
		else{
				$(this).attr("src","images/index/ck_up.gif")
				//$(".sysinfo input:checkbox").removeAttr("checked");
			}
	});
});
</script>
</head>
<body id="sysmain">
	<div class="content">
		<div class="syshead">
			<div class="clearfix">
				<p class="left"><img alt="臻尚餐饮管理有限公司" title="臻尚餐饮管理有限公司" src="images/logo/syslogo.png" height="40" width="263"></p>
				<p class="right"><span>仓管员</span><a href="javascript:void(0);">张路</a><a class="outsys" title="退出系统" href="javascript:void(0);"><img src="images/index/outsys.gif" width="16" height="16" alt="" />退出</a></p>
			</div>
		</div>
		<div class="sysmain clearfix">
			<div class="sysmenua">
				<ul>
					<li><a  href="javascript:void(0);">基础信息管理</a></li>
					<li><a href="进货单.html">进货管理</a></li>
					<li><a  href="出库单.html">销售管理</a></li>
					<li><a class="current" href="食堂查询.html">查询统计</a></li>
					<li><a href="库存盘点.html">库存管理</a></li>
					
					<li><a href="操作员管理.html">系统管理</a></li>
				</ul>
			</div>
			<div class="sysmenub">
				<p class="smenubtit">查询统计</p>
				<ul>
					<li><a  href="食堂查询.html">食堂查询</a></li>
					<li><a href="商品查询.html">商品查询</a></li>
					<li><a class="current"  href="供应商查询.html">供应商查询</a></li>
					<li><a  href="出库查询.html">出库查询</a></li>
					
				</ul>
			</div>
			<div class="sysinfo">
				<p class="sinfotit">供应商查询</p>
				<form>
					<table border="2px" width="100px" height="100px">
						<tr><td></td><td></td><td></td></tr>
						<tr><td></td><td></td><td></td></tr>
						<tr><td></td><td></td><td></td></tr>
					</table>
				</form>
			</div> 
			<div class="sysinfo">
				<p class="sinfotit">供应商查询</p>
				
			</div>
		</div>
	</div>


</body>
</html>
