<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
		function goPage(pageNum){
			//alert(pageNum);
			document.getElementById('searchFrm').action = '${pageContext.request.contextPath }/listUser?page=' + pageNum;
			document.getElementById('searchFrm').submit();
		}
		
		
		function goAddUser(){
			window.location.href='${pageContext.request.contextPath}/goAddUser';
		}
	</script>

  </head>
  
  
  <body>
  	<h1>系统管理->用户管理</h1>
  	<form id="searchFrm" action="${pageContext.request.contextPath }/listUser" method="post">
  		用户名：<input type="text" name="userName" value="${userName }"/>&nbsp;姓名：<input type="text" name="trueName" value="${trueName }"/>&nbsp;<input type="submit" value="查询"/><input type="reset" value="重置"/>
  	</form>
    <table border="1" width="80%">
    	<tr><td>用户名</td><td>密码</td><td>姓名</td><td>备注</td><td>操作</td></tr>
    	<c:forEach items="${userlist}" var="u">
    	<tr><td>${u.userName }</td><td>${u.password }</td><td>${u.trueName }</td><td>${u.memo }</td><td>修改&nbsp;删除</tr>
    	</c:forEach>
    </table>
    <p>总记录数：${page.total }&nbsp;总页数：${page.pages }&nbsp;当前第${page.pageNum }页&nbsp;<a href="javascript:void(0);" onclick="goPage(${page.firstPage});">首页</a>&nbsp;<a  href="javascript:void(0);" onclick="goPage(${page.prePage});">上一页</a>&nbsp;<a  href="javascript:void(0);" onclick="goPage(${page.nextPage});">下一页</a>&nbsp;<a  href="javascript:void(0);" onclick="goPage(${page.lastPage});">末页</a><span style="margin-left:100px;"><input type="button" value="增加用户" onclick="goAddUser();" /></span></p>
    
  </body>
</html>
