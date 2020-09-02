<%@ page language="java" import="java.util.*,java.sql.*,Bean.*,DBchuli.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
  <body>
  <center>
    <table border="1" algin="center">
    <tr><td>id</td><td>买主</td><td>ip地址</td><td>提交日期</td><td>总价</td><td>交货状态</td><td>发货</td><td>删除订单</td>
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
				<td><a href="/zhuji1/Gmchangestatus?id=<%=dingdans.get(i).getId()%>">发货</a></td>
				<td><a href="/zhuji1/dingdandel?ip=<%=dingdans.get(i).getIp()%>">删除</a></td>
			</tr>
			<%
				}
			}
			%>
		</table>
		<a href="/zhuji1/jsp/gminsert.jsp">上架</a>
	<a href="/zhuji1/guanliyuan.jsp">返回</a>
 </center>
  </body>
</html>
