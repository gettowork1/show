<%@ page language="java" import="java.util.*,java.sql.*,Bean.*,DBchuli.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <body>
  <center>
    <table border="1" algin="center">
    <tr><td>id</td><td>品牌</td><td>光驱</td><td>cpu</td><td>显卡</td><td>内存</td><td>价格</td><td>删除</td>
			</tr>
			<c:forEach items="${requestScope.zhujis}" var="student" varStatus="num">
				<tr>
					
					<td>
						<c:out value="${student.id}" default="　" />
					</td>
					<td>
						<c:out value="${student.pinpai}" default="　" />
					</td>
					<td>
						<c:out value="${student.guangqu}" default="　" />
					</td>
					<td>
						<c:out value="${student.cpu}" default="　" />
					</td>
					<td>
						<c:out value="${student.xianka}" default="　" />
					</td>
					<td>
						<c:out value="${student.neicun}" default="　" />
					</td>
					<td>
						<c:out value="${student.price}" default="　" />
					</td>
					<td>
					<c:url value="/MySer" var="delete">
							<c:param name="id" value="${student.id}" />
							<c:param name="status" value="delete"></c:param>
							<c:param name="currentPage" value="${sessionScope.currentPage}"></c:param>
						</c:url>
						<a href="${delete}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	
	<a href="/zhuji1/MySer?status=dis&currentPage=1">首页</a>
		<c:choose>
			<c:when test="${sessionScope.currentPage==1}">
				上一页
			</c:when>
			<c:otherwise>
				<a href="/zhuji1/MySer?status=dis&currentPage=${sessionScope.currentPage-1}">上一页</a>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${sessionScope.currentPage==sessionScope.countPage}">
				下一页 
			</c:when>
			<c:otherwise>
				<a href="/zhuji1/MySer?status=dis&currentPage=${sessionScope.currentPage+1}">下一页 </a>
			</c:otherwise>
		</c:choose>
		<a href="/zhuji1/MySer?status=dis&currentPage=${sessionScope.countPage}">尾页 </a>
	<a href="/zhuji1/guanliyuan.jsp">返回</a>
		<a href="/zhuji1/gmdingdan">查看订单</a>
		<a href="/zhuji1/jsp/gminsert.jsp">上架</a>
 </center>
  </body>
</html>
