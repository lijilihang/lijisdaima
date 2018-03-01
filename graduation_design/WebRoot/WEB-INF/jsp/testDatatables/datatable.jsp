<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">  
<head>  
    <meta charset="UTF-8">  
    <title>Document</title>  
  
  
     <link rel="stylesheet" href="css/jquery.dataTables.css" type="text/css"> 
    <script type="text/javascript" src="js/jquery.min.js"></script>  
    <script type="text/javascript" src="js/jquery.dataTables.js"></script>  
</head>  
<body>  
    <table id="example" class="display" cellspacing="0" width="100%">  
        <thead>  
            <tr>  
                <th>Name</th>  
                <th>Position</th>  
                <th>Office</th>  
                <th>Age</th>  
                <th>Start date</th>  
                <th>Salary</th>  
            </tr>  
        </thead>  
   
        <tfoot>  
            <tr>  
                <th>Name</th>  
                <th>Position</th>  
                <th>Office</th>  
                <th>Age</th>  
                <th>Start date</th>  
                <th>Salary</th>  
            </tr>  
        </tfoot>  
   
        <tbody>  
            <tr>  
                <td>Tiger Nixon</td>  
                <td>System Architect</td>  
                <td>Edinburgh</td>  
                <td>61</td>  
                <td>2011/04/25</td>  
                <td>$320,800</td>  
            </tr>  
            <tr>  
                <td>Garrett Winters</td>  
                <td>Accountant</td>  
                <td>Tokyo</td>  
                <td>63</td>  
                <td>2011/07/25</td>  
                <td>$170,750</td>  
            </tr>  
            <tr>  
                <td>Ashton Cox</td>  
                <td>Junior Technical Author</td>  
                <td>San Francisco</td>  
                <td>66</td>  
                <td>2009/01/12</td>  
                <td>$86,000</td>  
            </tr>  
            <tr>  
                <td>Brielle Williamson</td>  
                <td>Integration Specialist</td>  
                <td>New York</td>  
                <td>61</td>  
                <td>2012/12/02</td>  
                <td>$372,000</td>  
            </tr>  
            <tr>  
                <td>Herrod Chandler</td>  
                <td>Sales Assistant</td>  
                <td>San Francisco</td>  
                <td>59</td>  
                <td>2012/08/06</td>  
                <td>$137,500</td>  
            </tr>  
            <tr>  
                <td>Rhona Davidson</td>  
                <td>Integration Specialist</td>  
                <td>Tokyo</td>  
                <td>55</td>  
                <td>2010/10/14</td>  
                <td>$327,900</td>  
            </tr>  
            <tr>  
                <td>Colleen Hurst</td>  
                <td>Javascript Developer</td>  
                <td>San Francisco</td>  
                <td>39</td>  
                <td>2009/09/15</td>  
                <td>$205,500</td>  
            </tr>  
            <tr>  
                <td>Sonya Frost</td>  
                <td>Software Engineer</td>  
                <td>Edinburgh</td>  
                <td>23</td>  
                <td>2008/12/13</td>  
                <td>$103,600</td>  
            </tr>  
            <tr>  
                <td>Jena Gaines</td>  
                <td>Office Manager</td>  
                <td>London</td>  
                <td>30</td>  
                <td>2008/12/19</td>  
                <td>$90,560</td>  
            </tr>  
            <tr>  
                <td>Haley Kennedy</td>  
                <td>Senior Marketing Designer</td>  
                <td>London</td>  
                <td>43</td>  
                <td>2012/12/18</td>  
                <td>$313,500</td>  
            </tr>  
            <tr>  
                <td>Tatyana Fitzpatrick</td>  
                <td>Regional Director</td>  
                <td>London</td>  
                <td>19</td>  
                <td>2010/03/17</td>  
                <td>$385,750</td>  
            </tr>  
            <tr>  
                <td>Michael Silva</td>  
                <td>Marketing Designer</td>  
                <td>London</td>  
                <td>66</td>  
                <td>2012/11/27</td>  
                <td>$198,500</td>  
            </tr>  
            <tr>  
                <td>Paul Byrd</td>  
                <td>Chief Financial Officer (CFO)</td>  
                <td>New York</td>  
                <td>64</td>  
                <td>2010/06/09</td>  
                <td>$725,000</td>  
            </tr>  
            <tr>  
                <td>Gloria Little</td>  
                <td>Systems Administrator</td>  
                <td>New York</td>  
                <td>59</td>  
                <td>2009/04/10</td>  
                <td>$237,500</td>  
            </tr>  
  
        </tbody>  
    </table>  
  
<script type="text/javascript">  
      
    $(document).ready(function() {  
     $('#example').dataTable();  
});  
</script>  
  
</body>  
</html> 