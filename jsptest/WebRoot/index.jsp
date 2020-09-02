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
  <h1 style="color="yellow""><center>登录页面</center></h1>
  <center>
  <form action="/zhuji1/ygzeng" > 
  姓名:<input type="text" name="name"><br/>
 密码:<input type="text" name="mima"/><br/>
 <input type="hidden" name="status1" value="login">
 <input type="submit" value="登录"/><input type="reset" value="重置"/>
 <a href="register.jsp">注册</a>
   </form>
   <a href="guanliyuan.jsp">如果您为管理员，请点击此进入管理员登录页面</a>
   </center> 
  </body>
</html>
