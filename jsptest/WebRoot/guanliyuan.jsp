<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
<style type="text/css">    
     body{    
        background-image: url(img/4.jpg);    
        background-size:cover;  
     }    
 </style> 
  <head>
  </head> 
  <body><center>
  <h1>管理员登录</h1>
  <table align="center">
 <form action="/zhuji1/ygzeng">
 管理员姓名:<input type="text" name="name" /><br/>
 管理员密码:<input type="text" name="mima"/><br/>
<input type="hidden" name="status1" value="guanli">
 <input type="hidden" name="currentPage" value="1"/>
 <input type="submit" value="登录"/><input type="reset" value="重置"/>
 </form>
 </table>
  </body>
  </center>
</html>
