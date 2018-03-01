<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'datatable1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/dataTables.bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/jquery.dataTables.css">
	
	
	 <script type="text/javascript" src="js/jquery.min.js"></script>  
	 
	<script type="text/javascript" src="js/jquery.dataTables.js"></script>  
	<script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
	
	
	
	  

    
  </head>
  

    <body>
<div class="row-fluid">
    <h3>JQuery DataTables插件自定义分页Ajax实现</h3>
    <table id="example" class="display table-striped table-bordered table-hover table-condensed" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th>ID</th>
            <th>电话</th>
            <th>密码</th>
            <th>确认密码</th>
            <th>验证码</th>
            <th>真实名字</th>
            <th>身份证号码</th>
            <th>电子邮箱</th>
            <th>居住城市</th>
            <th>注册名</th>
            <th>角色</th>
        </tr>
        </thead>
    </table>
</div>

<script type="text/javascript">
    $(function () {
        //提示信息
        var lang = {
           // 
           "searching": "hao",
            //"scrollX": true,
            "sProcessing": "加载中...",
            "sLengthMenu": "每页 _MENU_ 项",
            "sZeroRecords": "没有匹配结果",
            "sInfo": "当前显示第 _START_ 至 _END_ 项，共 _TOTAL_ 项。",
            "sInfoEmpty": "当前显示第 0 至 0 项，共 0 项",
            "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
            "sInfoPostFix": "",
            "sSearch": "搜索:",
            "sUrl": "",
            "sEmptyTable": "表中数据为空",
            "sLoadingRecords": "载入中...",
            "sInfoThousands": ",",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "上一页",
                "sNext": "下一页",
                "sLast": "末页",
                "sJump": "跳转"
            },
            "oAria": {
                "sSortAscending": ": 以升序排列此列",
                "sSortDescending": ": 以降序排列此列"
            }
        };

        //初始化表格
        /*     $( selector ).DataTable();
               $( selector ).dataTable().api();
               new $.fn.dataTable.Api( selector );  */
        var table = $("#example").dataTable({
             /* dom: 'Bfrtip',
             buttons: ['colvis', 'excel', 'print'], */
             
             
            //dom: 'Bfrtip',
           // buttons: ['colvis', 'excel', 'print'],
          // lengthMenu: [ 20, 30, 40, 50, 100 ],//代表你可以把表格设置为每页 20/30/40/50/100 条数据显示
            lengthMenu: [ [10, 25, 50, -1], [10, 25, 50, "所有"] ],
             /*第一个数组是具体的值，理解为 <option value=""></option> value 对应的值
                                     第二个数组是用来显示的文字，理解为 <option value="">显示的文字</option>这里需要提的是，数字要 >0 ，
                                      但是有个特殊值 -1 它代表显示全部数据*/
            search: { 
            caseInsensitive: false //关掉区分大小写过滤
            },
           
            //scrollY: 400,//设置表格高度为400
            scrollCollapse: true,//允许表格调整高度
            paging:true,//使用分页
            language:lang,  //提示信息,上面
            autoWidth: false,  //禁用自动调整列宽
            stripeClasses: ["odd", "even"],  //为奇偶行加上样式，兼容不支持CSS伪类的场合
            processing: true,  //隐藏加载提示,自行处理
            serverSide: true,  //启用服务器端分页
            searching: true,  //原生搜索
            orderMulti: true,  //启用多列排序
            //order: [],  //取消默认排序查询,否则复选框一列会出现小箭头
            order: [[ 4, 'asc' ]],//在index为四的列按升序排列
            renderer: "bootstrap",  //渲染样式：Bootstrap和jquery-ui
            pagingType: "full_numbers",  //分页样式：simple,simple_numbers,full,full_numbers
            //列表表头字段
            /* columns: [
                {title:"编号", data: "Id" },
                {title:"姓名", data: "Name" },
                {title:"性别", data: "Sex" }
            ], */
            columns: [
                {title:"ID", data: "umId" },
                {title:"电话", data: "umPhone" },
                {title:"密码", data: "umPassword" },
                {title:"确认密码", data: "umPasswordl" },
                {title:"验证码", data: "umVcode" },
                {title:"真实名字", data: "umName" },
                {title:"身份证号码", data: "umIdentifyNum" },
                {title:"电子邮箱", data: "umEmail" },
                {title:"居住城市", data: "umCity" },
                {title:"注册名", data: "umLoginName" },
                {title:"角色", data: "umRole" }
                
            ],
            columnDefs: [{
                "targets": 'nosort',  //列的样式名
                "orderable": false    //包含上样式名‘nosort’的禁止排序
            }],
            ajax: function (data, callback, settings) {//callback必须被执行，DataTables才能获取到数据;且将返回的数据作为callback()的唯一参数.(参数中可以配置Datatable的页面信息)
                //封装请求参数
                //data 发送给服务器的数据  settings:Datatables的设置对象
                var param = {};
                param.limit = data.length;//页面显示记录条数，在页面显示每页显示多少项的时候
                param.start = data.start;//开始的记录序号
                param.page = (data.start/data.length)+1;//当前页码
                //console.log(param);
                //ajax请求数据
                $.ajax({
                    type: "GET",
                    url: "${pageContext.request.contextPath }/requestAjax",
                    cache: false,  //禁用缓存
                    data: param,  //传入组装的参数
                    dataType: "json",
                    success: function (result) {
                         // var j=JSON.stringify(result[0]);
                          //  alert("123"+j+"123");
                        //console.log(result);
                        //setTimeout仅为测试延迟效果
                        setTimeout(function () {
                            //封装返回数据
                           /*  {"data":"createTime","render": function(data, type, full) { // 返回自定义内容
                                          return getFormatDateByLong(data, "yyyy-MM-dd hh:mm:ss");*/
                            var returnData = {};
                            returnData.draw = data.draw;//这里直接自行返回了draw计数器,应该由后台返回
                            returnData.recordsTotal = data.length;//返回数据全部记录
                            returnData.recordsFiltered = result[0].umLoginName-1;// (由 ?? 项结果过滤)后台不实现过滤功能，每次查询均视作全部结果
                            returnData.data = result;//.data;//返回的数据列表
                            console.log(returnData);
                            //调用DataTables提供的callback方法，代表数据已封装完成并传回DataTables进行渲染
                            //此时的数据需确保正确无误，异常判断应在执行此回调前自行处理完毕
                            callback(returnData);
                        }, 200);
                    }
                });
            },
            
        }).api()
        //此处需调用api()方法,否则返回的是JQuery对象而不是DataTables的API对象
        
        /* $('#example').on( 'page.dt', function () {
        var info = table.page.info();
        $('#pageInfo').html( 'Showing page: '+info.page+' of '+info.pages );
        } );//当页面发生改变 时触发事件 */
         
     
    });
   
</script>
</body>




</html>
