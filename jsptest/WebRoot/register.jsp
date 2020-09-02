<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
<style type="text/css">    
     body{    
        background-image: url(img/2.jpg);    
        background-size:cover;  
     }    
 </style> 
  <head>  
  </head> 
  <body>
  <center>
  <form action="/zhuji1/ygzeng" >
  姓名:<input type="text" name="name"/><br/>
  密码:<input type="text" name="mima"/><br/>
 地址:<input type="text" name="dizhi"/><br/>
  电话:<input type="text" name="dianhua"/><br/>
  邮箱:<input type="text" name="youxiang"/><br/>
  <input type="hidden" name="status1" value="res">
  <input type="submit" value="提交"/><input type="reset" value="重置"/>
 </form>
 </center>
  </body>
</html>
