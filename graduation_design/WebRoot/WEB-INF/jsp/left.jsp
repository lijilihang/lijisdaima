<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function switchMemu(menuId){
			switch(menuId){
			case "user_mgr":
				window.parent.frames["right"].location.href='listUser'; 
				break;
			case "role_mgr":
			window.parent.frames["right"].location.href='goRight';
				break;
			}
		}
	</script>
  </head>
  
  <body>
    <ul>
    	<li>系统管理
    		<ul>
    			<li><a href="javascript:void(0);" onclick="switchMemu('user_mgr');">用户管理</a></li>
    			<li><a href="javascript:void(0)" onclick="switchMemu('role_mgr');">角色管理</a></li>
    		</ul>
    	</li>
    	<li>员工管理</li>
    </ul>
    
  </body>
</html>
