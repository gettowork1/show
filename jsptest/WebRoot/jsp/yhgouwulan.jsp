<%@ page language="java" import="java.util.*,java.sql.*,Bean.*,DBchuli.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
  <body>
  <%! Double totalprice=0.0; %>
  <center>
    <table border="1" algin="center">
    <tr><td>id</td><td>Ʒ��</td><td>�۸�</td><td>����</td><td>�޸�</td><td>ɾ��</td>
			</tr>
<%	ArrayList<gouwu> gouwus= (ArrayList) request.getAttribute("gouwus");
	if(gouwus!=null){
	for (int i = 0; i < gouwus.size(); i++) {%>
			<tr>
			<% String price=gouwus.get(i).getPrice();
			String benshu=gouwus.get(i).getBenshu();%>
		        <td><%=gouwus.get(i).getId()%></td>
				<td><%=gouwus.get(i).getPingpai()%></td>
				<td><%=gouwus.get(i).getPrice()%></td>
				<td><%=gouwus.get(i).getBenshu()%></td>
			    <td><a href="/zhuji1/jsp/gouwuxiugai.jsp?id=<%=gouwus.get(i).getId()%>&pinpai=<%=gouwus.get(i).getPingpai()%>&price=<%=gouwus.get(i).getPrice()%>&benshu=<%=gouwus.get(i).getBenshu()%>">�޸�</a></td>
				<td><a href="/zhuji1/gouwudel?id=<%=gouwus.get(i).getId()%>">ɾ��</a></td>
				<% 
				Double p=Double.parseDouble(price);
				Double ben=Double.parseDouble(benshu);
				totalprice+=ben*p;%>
			</tr>
			<%
				}
			}
			%>
		</table>
		<%=totalprice %>
		<% String total=totalprice.toString(); %>
	<a href="/zhuji1/yhdisplay">����</a><br/>
	<a href="/zhuji1/yhtijiao?pricetotal=<%=total%>">�ύ����</a><br/>
	</form>
 </center>
  </body>
</html>
