<%@ page language="java" import="java.util.*,java.sql.*,Bean.*,DBchuli.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
  <body >
  <center>
    <table border="1" algin="center">
    <tr><td>id</td><td>Ʒ��</td><td>����</td><td>cpu</td><td>�ڴ�</td><td>�Կ�</td><td>�۸�</td><td>��ϸ��Ϣ</td><td>���빺�ﳵ</td>
				</tr>
<%	ArrayList<zhuji> zhujis = (ArrayList) request.getAttribute("zhujis");
	if(zhujis!=null){
	for (int i = 0; i < zhujis.size(); i++) {%>
			<tr>
			    <td><%=zhujis.get(i).getId()%></td>
				<td><%=zhujis.get(i).getPinpai()%></td>
				<td><%=zhujis.get(i).getGuangqu()%></td>
				<td><%=zhujis.get(i).getCpu()%></td>
				<td><%=zhujis.get(i).getNeicun()%></td>
				<td><%=zhujis.get(i).getXianka()%></td>
				<td><%=zhujis.get(i).getPrice()%></td>
				<td><a href="yhdetail?id=<%=zhujis.get(i).getId()%>">��ϸ��Ϣ</a></td>
			    <td><a href="/zhuji1/yhinsert?id=<%=zhujis.get(i).getId()%>&price=<%=zhujis.get(i).getPrice()%>&pinpai=<%=zhujis.get(i).getPinpai()%>">���빺�ﳵ</a></td>
			</tr>
			<%
				}
			}
			%>
		</table>
	<a href="/zhuji1/index.jsp">����</a><br><a href="/zhuji1/yhdisplay">��ҳ</a>
	<a href="/zhuji1/jsp/seacher.jsp" >��ѯ</a>
    <a href="/zhuji1/gouwudis">�鿴���ﳵ</a>
 </center>
  </body>
</html>
