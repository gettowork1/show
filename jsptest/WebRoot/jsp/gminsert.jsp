<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
 <head>   
                <meta http-equiv="Content-Type" content="text/html; charset=gb2312">   
                <title>���Ĵ���</title>   
        </head>   
  <body>
   <h1><center>�����Ʒ</center></h1>
   <form action="/zhuji1/MySer" >
   <table border="1" align="center" >
   <tr><td>ID��</td><td><input type="text" name="id"></td></tr>
   <tr><td>Ʒ�ƣ�</td><td><input type="text" name="pinpai"></td></tr>
   <tr><td>�Կ���</td><td><input type="text" name="xianka"></td></tr>
   <tr><td>�ڴ棺</td><td><input type="text" name="neicun"></td></tr>
   <tr><td>������</td><td><input type="text" name="guangqu"></td></tr>
   <tr><td>�۸�</td><td><input type="text" name="price"></td></tr>
   <tr><td>cpu��</td><td><input type="text" name="cpu"></td></tr>
     <input type="hidden" name="status" value="insert">
   <input type="hidden" name="currentPage" value="${sessionScope.currentPage}"/>
   <tr><td><input type="submit" name="tijiao" value="�ύ">
   </td><td><input type="submit" name="tijiao" value="����"></td>
   </tr>
   </table>
   </form>
  </body>
</html>
