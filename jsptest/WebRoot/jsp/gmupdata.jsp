<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <head>
  </head>
  <body> 
  	<h1><p align="center">������Ʒ��Ϣ </p></h1>
  	<table align="center">
     <form action="/zhuji1/Myser"  >
       <input type="hidden" name="status" value="update" />
     	ID:<input type="text" name="id" value="<%=new String(request.getParameter("id").getBytes("iso-8859-1"))%>"  readonly=readonly/><br/>
     	cpu:<input type="text" name="cpu" value="<%=new String(request.getParameter("cpu").getBytes("iso-8859-1"))%>" /><br/>
     	�۸�:<input type="text" name="price" value="<%=new String(request.getParameter("price").getBytes("iso-8859-1"))%>" /><br/>
     	Ʒ��:<input type="text" name="pinpai" value="<%=new String(request.getParameter("pinpai").getBytes("iso-8859-1"))%>" /><br/>
     	�Կ�:<input type="text" name="xianka" value="<%=new String(request.getParameter("xianka").getBytes("iso-8859-1"))%>" /><br/>
     	�ڴ�:<input type="text" name="neicun" value="<%=new String(request.getParameter("neicun").getBytes("iso-8859-1"))%>" /><br/>
     	����:<input type="text" name="guangqu" value="<%=new String(request.getParameter("guangqu").getBytes("iso-8859-1"))%>" /><br/>
     	<input type="hidden" name="currentPage" value="${sessionScope.currentPage}"/>
     	<input type="submit" value="�ύ" />
     	</table>
     </form>
  </body>
</html>
