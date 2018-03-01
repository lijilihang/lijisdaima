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
					<li><a  href="食堂信息管理.html">基础信息管理</a></li>
					<li><a class="current" href="进货单.html">进货管理</a></li>
					<li><a href="出库单.html">销售管理</a></li>
					<li><a  href="食堂查询.html">查询统计</a></li>
					<li><a href="库存盘点.html">库存管理</a></li>
					
					<li><a href="操作员管理.html">系统管理</a></li>
				</ul>
			</div>
			<div class="sysmenub">
				<p class="smenubtit">进货管理</p>
				<ul>
					<li><a  href="进货单.html">进货单</a></li>
					<li><a class="current" href="进货退货.html">进货退货</a></li>
					
				</ul>
			</div>
			<div class="sysinfo">
				<p class="sinfotit">进货退货</p>
				<form>
					<table style="background:#f4f5f6; width: 700px; height: 200px; margin:0 auto; "border="1" cellspacing="0" cellpadding="0" >
						<tr><td>进货ID</td><td>用户ID</td><td>产品ID</td><td>产品名称</td><td>产品价格</td><td>产品总数</td><td>供应商名称</td><td>进货日期</td><td>用户名称</td><td align="center">操作</td></tr>
						<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td><button style="margin-left: 10px;margin-right: 10px;">修改</button ><button style="margin-left: 10px;margin-right: 10px;">删除</button></td></tr>
						<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td><button style="margin-left: 10px;margin-right: 10px;">修改</button ><button style="margin-left: 10px;margin-right: 10px;">删除</button></td></tr>
						<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td><button style="margin-left: 10px;margin-right: 10px;">修改</button ><button style="margin-left: 10px;margin-right: 10px;">删除</button></td></tr>
						<tr align="center"><td colspan="10"><button style="margin-left: 10px;margin-right: 10px;">增加</button></td></tr>
						<tr align="center"><td colspan="10"><p><a href="#">首页&nbsp;</a><a href="#">&nbsp;末页&nbsp;</a><a href="#">&nbsp;上一页&nbsp;</a><a href="#">&nbsp;下一页</a></p><p>当前显示第<a>1/20</a>页，跳转到<input size="1" />页<button >go</button></p></td></tr>
					</table>
				</form>
			</div> 
			<div class="sysinfo">
				<p class="sinfotit">进货退货</p>
				
			</div>
		</div>
	</div>


</body>
</html>