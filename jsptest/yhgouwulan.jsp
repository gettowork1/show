<%@ page language="java" import="java.util.*,java.sql.*,Bean.*,DBchuli.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
  <body>
  <center>
    <table border="1" algin="center">
    <tr><td>id</td><td>Ʒ��</td><td>�۸�</td><td>����</td><td>�޸�</td><td>ɾ��</td>
			</tr>
<%	ArrayList<gouwu> gouwus= (ArrayList) request.getAttribute("gouwus");
	if(gouwus!=null){
	for (int i = 0; i < gouwus.size(); i++) {%>
			<tr>
		        <td><%=gouwus.get(i).getId()%></td>
				<td><%=gouwus.get(i).getPingpai()%></td>
				<td><%=gouwus.get(i).getPrice()%></td>
				<td><%=gouwus.get(i).getBenshu()%></td>
			    <td><a href="/zhuji1/jsp/gouwuxiugai.jsp?id=<%=gouwus.get(i).getId()%>&pinpai=<%=gouwus.get(i).getPingpai()%>&price=<%=gouwus.get(i).getPrice()%>&benshu=<%=gouwus.get(i).getBenshu()%>">�޸�</a></td>
				<td><a href="/zhuji1/gouwudel?id=<%=gouwus.get(i).getId()%>">ɾ��</a></td>
			</tr>
			<%
				}
			}
			%>
		</table>
	<a href="/zhuji1/jsp/main.jsp">����</a><br/>
   <a href="/zhuji1/yhtijiao">����</a>
	</form>
 </center>
  </body>
</html>
