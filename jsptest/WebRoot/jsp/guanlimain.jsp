<%@ page language="java" import="java.util.*,java.sql.*,Bean.*,DBchuli.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <body>
  <center>
    <table border="1" algin="center">
    <tr><td>id</td><td>Ʒ��</td><td>����</td><td>cpu</td><td>�Կ�</td><td>�ڴ�</td><td>�۸�</td><td>ɾ��</td>
			</tr>
			<c:forEach items="${requestScope.zhujis}" var="student" varStatus="num">
				<tr>
					
					<td>
						<c:out value="${student.id}" default="��" />
					</td>
					<td>
						<c:out value="${student.pinpai}" default="��" />
					</td>
					<td>
						<c:out value="${student.guangqu}" default="��" />
					</td>
					<td>
						<c:out value="${student.cpu}" default="��" />
					</td>
					<td>
						<c:out value="${student.xianka}" default="��" />
					</td>
					<td>
						<c:out value="${student.neicun}" default="��" />
					</td>
					<td>
						<c:out value="${student.price}" default="��" />
					</td>
					<td>
					<c:url value="/MySer" var="delete">
							<c:param name="id" value="${student.id}" />
							<c:param name="status" value="delete"></c:param>
							<c:param name="currentPage" value="${sessionScope.currentPage}"></c:param>
						</c:url>
						<a href="${delete}">ɾ��</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	
	<a href="/zhuji1/MySer?status=dis&currentPage=1">��ҳ</a>
		<c:choose>
			<c:when test="${sessionScope.currentPage==1}">
				��һҳ
			</c:when>
			<c:otherwise>
				<a href="/zhuji1/MySer?status=dis&currentPage=${sessionScope.currentPage-1}">��һҳ</a>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${sessionScope.currentPage==sessionScope.countPage}">
				��һҳ 
			</c:when>
			<c:otherwise>
				<a href="/zhuji1/MySer?status=dis&currentPage=${sessionScope.currentPage+1}">��һҳ </a>
			</c:otherwise>
		</c:choose>
		<a href="/zhuji1/MySer?status=dis&currentPage=${sessionScope.countPage}">βҳ </a>
	<a href="/zhuji1/guanliyuan.jsp">����</a>
		<a href="/zhuji1/gmdingdan">�鿴����</a>
		<a href="/zhuji1/jsp/gminsert.jsp">�ϼ�</a>
 </center>
  </body>
</html>
