<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
      $(function(){
         $("#btn").click(function(){
             $.ajax({
               url:"${pageContext.request.contextPath }/loginVali",
               success:function(data){
               //解析对象
               //alert(data.uname+"\n"+data.age);
               //解析map
               //alert(data.info.age+"\n"+data.info.uname);
               //解析list
               //$.each(data,function(i,dom){
              // alert(dom);
               //});
               if(data==null){
                alert(data)
               }
              
               //var jsonDate = '{ "name":"周星驰","age":23 }';
               //var jsonObj = JSON.parse(data); 
               //alert(jsonObj.name);
              alert(JSON.stringify(data));
              //alert(jsonObj)
               }
             });
         });
      });
    </script>
  </head>
  
  <body>
    <input type="button" value="ajax" id="btn"/>
    
  </body>
</html>