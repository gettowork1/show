<%@ page language="java" import="java.util.*,java.sql.*,Bean.*,DBchuli.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
  <body>
  <center>
    <table border="1" algin="center">
    <tr><td>id</td><td>����</td><td>ip��ַ</td><td>�ύ����</td><td>�ܼ�</td><td>����״̬</td><td>����</td><td>ɾ������</td>
			</tr>
<%	ArrayList<dingdan> dingdans= (ArrayList) request.getAttribute("dingdans");
	if(dingdans!=null){
	for (int i = 0; i < dingdans.size(); i++) {%>
			<tr>
		        <td><%=dingdans.get(i).getId()%></td>
				<td><%=dingdans.get(i).getName()%></td>
				<td><%=dingdans.get(i).getIp()%></td>
				<td><%=dingdans.get(i).getDate()%></td>
				<td><%=dingdans.get(i).getTotalprice()%></td>
				<td><%=dingdans.get(i).getDingdan()%></td>
				<td><a href="/zhuji1/Gmchangestatus?id=<%=dingdans.get(i).getId()%>">����</a></td>
				<td><a href="/zhuji1/dingdandel?ip=<%=dingdans.get(i).getIp()%>">ɾ��</a></td>
			</tr>
			<%
				}
			}
			%>
		</table>
		<a href="/zhuji1/jsp/gminsert.jsp">�ϼ�</a>
	<a href="/zhuji1/guanliyuan.jsp">����</a>
 </center>
  </body>
</html>
