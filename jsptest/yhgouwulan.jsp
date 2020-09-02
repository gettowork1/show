<%@ page language="java" import="java.util.*,java.sql.*,Bean.*,DBchuli.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
  <body>
  <center>
    <table border="1" algin="center">
    <tr><td>id</td><td>品牌</td><td>价格</td><td>件数</td><td>修改</td><td>删除</td>
			</tr>
<%	ArrayList<gouwu> gouwus= (ArrayList) request.getAttribute("gouwus");
	if(gouwus!=null){
	for (int i = 0; i < gouwus.size(); i++) {%>
			<tr>
		        <td><%=gouwus.get(i).getId()%></td>
				<td><%=gouwus.get(i).getPingpai()%></td>
				<td><%=gouwus.get(i).getPrice()%></td>
				<td><%=gouwus.get(i).getBenshu()%></td>
			    <td><a href="/zhuji1/jsp/gouwuxiugai.jsp?id=<%=gouwus.get(i).getId()%>&pinpai=<%=gouwus.get(i).getPingpai()%>&price=<%=gouwus.get(i).getPrice()%>&benshu=<%=gouwus.get(i).getBenshu()%>">修改</a></td>
				<td><a href="/zhuji1/gouwudel?id=<%=gouwus.get(i).getId()%>">删除</a></td>
			</tr>
			<%
				}
			}
			%>
		</table>
	<a href="/zhuji1/jsp/main.jsp">返回</a><br/>
   <a href="/zhuji1/yhtijiao">结算</a>
	</form>
 </center>
  </body>
</html>
