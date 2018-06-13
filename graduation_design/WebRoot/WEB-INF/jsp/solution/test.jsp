<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
  </head>
  
  <body>
    This is my JSP page. <br>
    <div>  
        <form method="post" id="file" action="" enctype="multipart/form-data">  
            <h3>选择一个文件:</h3>  
            <input id="excelFile" type="file" name="uploadFile" />  
            <br/><br/>  
            <input type="button" value="上传" onclick="uploadFiles();"/>  
        </form>  
    </div>  
    <script type="text/javascript">
      function uploadFiles(){    
    //  var uploadFile = $('#excelFile').get(0).files[0];  
        var uploadFile = new FormData($("#file")[0]);  
        console.log(uploadFile);  
        if("undefined" != typeof(uploadFile) && uploadFile != null && uploadFile != ""){  
          $.ajax({  
            url:'${pageContext.request.contextPath }/upload',  
            type:'POST',
            data:uploadFile,  
            async: false,    
            cache: false,   
            contentType: false, //不设置内容类型  
            processData: false, //不处理数据  
            success:function(data){
              alert("kkk")
            },  
            error:function(){  
                alert("上传失败！");  
            }  
        })  
        }else {  
            alert("选择的文件无效！请重新选择");  
        }  
      }     
    </script>
  </body>
</html>
