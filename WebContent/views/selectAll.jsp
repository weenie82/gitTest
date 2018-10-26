<%@page import="domain.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%-- <%
	ArrayList <ProductVO>  list = (ArrayList<ProductVO>)request.getAttribute("list");    
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
			<tr>
				<td>코드</td>
				<td>상품명</td>
				<td>가격</td>
				<td>제조사</td>
			</tr>
			<c:forEach var="vo" items="${list}">
				<tr>
					<td><a href="select.do?prcode=${vo.prcode}">${vo.prcode}</a></td>
					<td>${vo.prname}</td>
					<td>${vo.price}</td>
					<td>${vo.manufacture}</td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>