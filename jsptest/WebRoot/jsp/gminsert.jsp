<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
 <head>   
                <meta http-equiv="Content-Type" content="text/html; charset=gb2312">   
                <title>中文传递</title>   
        </head>   
  <body>
   <h1><center>添加物品</center></h1>
   <form action="/zhuji1/MySer" >
   <table border="1" align="center" >
   <tr><td>ID：</td><td><input type="text" name="id"></td></tr>
   <tr><td>品牌：</td><td><input type="text" name="pinpai"></td></tr>
   <tr><td>显卡：</td><td><input type="text" name="xianka"></td></tr>
   <tr><td>内存：</td><td><input type="text" name="neicun"></td></tr>
   <tr><td>光驱：</td><td><input type="text" name="guangqu"></td></tr>
   <tr><td>价格：</td><td><input type="text" name="price"></td></tr>
   <tr><td>cpu：</td><td><input type="text" name="cpu"></td></tr>
     <input type="hidden" name="status" value="insert">
   <input type="hidden" name="currentPage" value="${sessionScope.currentPage}"/>
   <tr><td><input type="submit" name="tijiao" value="提交">
   </td><td><input type="submit" name="tijiao" value="重置"></td>
   </tr>
   </table>
   </form>
  </body>
</html>
