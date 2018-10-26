<%@page import="domain.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%-- <%
	ProductVO vo = (ProductVO)request.getAttribute("vo");
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="modify.do" method ="post">
	<table>
		<tr>
			<td>상품코드</td>
			<td><input type="text" name="prcode" required="required" value="${vo.prcode}" readonly="readonly"></td>		
		</tr>
		<tr>
			<td>상품명</td>
			<td><input type="text" name="prname" required="required" value="${vo.prname}"readonly="readonly"></td>		
		</tr>
		<tr>
			<td>가격</td>
			<td><input type="text" name="price" required="required" value="${vo.price}"></td>		
		</tr>
		<tr>
			<td>제조사</td>
			<td><input type="text" name="manufacture" required="required" value="${vo.manufacture}" readonly="readonly"></td>		
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="수정" >
				<input type="button" value="삭제" onclick="location.href ='delete.do?prcode=${vo.prcode}'">
			</td>
		</tr>
	</table>
	</form>

</body>
</html>