<%@ page language="java" import="java.util.*,java.sql.*,Bean.*,DBchuli.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<html>
  <body >
  <center>
    <table border="1" algin="center">
    <tr><td>id</td><td>品牌</td><td>光驱</td><td>cpu</td><td>内存</td><td>显卡</td><td>价格</td><td>详细信息</td><td>放入购物车</td>
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
				<td><a href="yhdetail?id=<%=zhujis.get(i).getId()%>">详细信息</a></td>
			    <td><a href="/zhuji1/yhinsert?id=<%=zhujis.get(i).getId()%>&price=<%=zhujis.get(i).getPrice()%>&pinpai=<%=zhujis.get(i).getPinpai()%>">加入购物车</a></td>
			</tr>
			<%
				}
			}
			%>
		</table>
	<a href="/zhuji1/index.jsp">返回</a><br><a href="/zhuji1/yhdisplay">首页</a>
	<a href="/zhuji1/jsp/seacher.jsp" >查询</a>
    <a href="/zhuji1/gouwudis">查看购物车</a>
 </center>
  </body>
</html>
