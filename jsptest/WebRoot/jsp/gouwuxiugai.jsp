<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <head>
  </head>
  <body> 
  <table align="center">
  	<h1>���¹�����Ϣ </h1>
     <form action="/zhuji1/gouwuupdata" >
     	ID:<input type="text" name="id" value="<%=new String(request.getParameter("id").getBytes("iso-8859-1"))%>"  readonly="readonly"/><br/>
     	Ʒ��:<input type="text" name="pinpai" value="<%=new String(request.getParameter("pinpai").getBytes("iso-8859-1")) %>" readonly="readonly"/><br/>
     	�۸�:<input type="text" name="price" value="<%=new String(request.getParameter("price").getBytes("iso-8859-1"))%>"/><br/>
     	����:<input type="text" name="benshu" value="<%=new String(request.getParameter("benshu").getBytes("iso-8859-1"))%>" /><br/>
     	<input type="submit" value="�ύ" />
     </form>
     </table>
  </body>
</html>

