<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
					<li><a  href="${pageContext.request.contextPath}/listStxx">基础信息管理</a></li>
					<li><a href="进货单.html">进货管理</a></li>
					<li><a  href="出库单.html">销售管理</a></li>
					<li><a  href="${pageContext.request.contextPath}/listShitang">查询统计</a></li>
					<li><a href="库存盘点.html">库存管理</a></li>
					
					<li><a href="操作员管理.html">系统管理</a></li>
				</ul>
			</div>
			<div class="sysmenub">
				<p class="smenubtit">查询统计</p>
				<ul>
					<li><a  href="${pageContext.request.contextPath}/listShitang">食堂查询</a></li>
					<li><a href="${pageContext.request.contextPath}/listPro">商品查询</a></li>
					<li><a  href="${pageContext.request.contextPath}/listSupplier">供应商查询</a></li>
					<li><a  href="${pageContext.request.contextPath}/listOut">出库查询</a></li>
					
				</ul>
			</div>
			<div class="sysinfo">
				<p class="sinfotit">供应商查询</p>
				
				
				
				
				
				
				
				<script type="text/javascript">
		function goPage(pageNum){
			//alert(pageNum);
			document.getElementById('searchFrm').action = '${pageContext.request.contextPath }/listSupplier?page=' + pageNum;
			document.getElementById('searchFrm').submit();
		}
		
		
		function goAddUser(){
			window.location.href='${pageContext.request.contextPath}/goAddSupplier';
		}
	</script>

 
  	<h1>供应商信息</h1>
  	<form id="searchFrm" action="${pageContext.request.contextPath }/listSupplier" method="post">
  		供应商名：<input type="text" name="suName" value="${suName }"/><input type="submit" value="查询"/><input type="reset" value="重置"/>
  	</form>
    <table border="1" width="80%">
    	<tr><td>供应商名</td><td>供应商地址</td><td>供应商电话</td><td>供应商邮箱</td><td>操作</td></tr>
    	<c:forEach items="${supplierlist}" var="u">
    	<tr><td>${u.suName }</td><td>${u.suAddress }</td><td>${u.suTel }</td><td>${u.suMail }</td><td><input type="button" value="更新" onclick="goUpdateSupplier(${u.suId});" />&nbsp;<input type="button" value="删除" onclick="goDeleteSupplier(${u.suId});" /></td></tr> 
    	</c:forEach>
    </table>
    <p>总记录数：${page.total }&nbsp;总页数：${page.pages }&nbsp;当前第${page.pageNum }页&nbsp;<a href="javascript:void(0);" onclick="goPage(${page.firstPage});">首页</a>&nbsp;<a  href="javascript:void(0);" onclick="goPage(${page.prePage});">上一页</a>&nbsp;<a  href="javascript:void(0);" onclick="goPage(${page.nextPage});">下一页</a>&nbsp;<a  href="javascript:void(0);" onclick="goPage(${page.lastPage});">末页</a><span style="margin-left:100px;"><input type="button" value="增加供应商" onclick="goAddUser();" /></span></p>
    <script>
		function goUpdateSupplier(suId){
		 
			window.location.href='${pageContext.request.contextPath}/listAddSupplier?suId='+suId;
		
		
	
		}
		
		function goDeleteSupplier(suId){
		like=window.confirm("确定删除？")
		  
		  if(like==true){
			window.location.href='${pageContext.request.contextPath}/deleteSupplier?suId='+suId;
		}
		else{
		}
		}
	</script>
				
				
				
				
				
				
				
			</div> 
			<div class="sysinfo">
				<p class="sinfotit">供应商查询</p>
				
			</div>
		</div>
	</div>





</body>
</html>
