<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
 <head>   
                <meta http-equiv="Content-Type" content="text/html; charset=gb2312">   
                <title>中文传递</title>   
        </head>   
  <body>
   <h1><center>添加学生信息</center></h1>
   <form action="/TestMyMVC/InsertSer" >
   <table border="1" align="center" bgcolor="yellow">
   <tr><td>学号</td><td><input type="text" name="id"></td></tr>
   <tr><td>姓名</td><td><input type="text" name="name"></td></tr>
   <tr><td>年龄</td><td><input type="text" name="age"></td></tr>
   <tr><td><input type="submit" name="tijiao" value="提交"></td><td><input type="submit" name="tijiao" value="重置"></td></tr>
   
   </table>
   </form>
  </body>
</html>
