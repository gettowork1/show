<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>

<style type="text/css">    
     body{    
        background-image: url(img/1.jpeg);    
        background-size:cover;  
     }    
 </style> 
  <head>
  </head>
  <body >   
  <h1 style="color="yellow""><center>��¼ҳ��</center></h1>
  <center>
  <form action="/zhuji1/ygzeng" > 
  ����:<input type="text" name="name"><br/>
 ����:<input type="text" name="mima"/><br/>
 <input type="hidden" name="status1" value="login">
 <input type="submit" value="��¼"/><input type="reset" value="����"/>
 <a href="register.jsp">ע��</a>
   </form>
   <a href="guanliyuan.jsp">�����Ϊ����Ա�������˽������Ա��¼ҳ��</a>
   </center> 
  </body>
</html>
