<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
 <head>   
                <meta http-equiv="Content-Type" content="text/html; charset=gb2312">   
                <title>���Ĵ���</title>   
        </head>   
  <body>
   <h1><center>���ѧ����Ϣ</center></h1>
   <form action="/TestMyMVC/InsertSer" >
   <table border="1" align="center" bgcolor="yellow">
   <tr><td>ѧ��</td><td><input type="text" name="id"></td></tr>
   <tr><td>����</td><td><input type="text" name="name"></td></tr>
   <tr><td>����</td><td><input type="text" name="age"></td></tr>
   <tr><td><input type="submit" name="tijiao" value="�ύ"></td><td><input type="submit" name="tijiao" value="����"></td></tr>
   
   </table>
   </form>
  </body>
</html>
