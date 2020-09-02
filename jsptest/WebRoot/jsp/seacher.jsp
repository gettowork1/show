<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
  <body>
  <h1><center>查询</h1></center>
  <table align="center">
   <form action="/zhuji1/search" >
   输入查询的id:
   <input name="id" type="text">
   <input type="hidden" name="status" value="serch">
   <input type="submit" value="提交">
   </form>
   </table>
  </body>
</html>