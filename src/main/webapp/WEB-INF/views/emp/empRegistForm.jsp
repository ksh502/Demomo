<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<!-- 헤더 표시 영역(inc/header.jsp 페이지 삽입) -->
		<jsp:include page="../inc/header.jsp"></jsp:include>
	</header>
	
	<h2>사원 등록</h2>
	<form action="empRegist" method="post" name="registForm">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="emp_name" id="emp_name" required="required"></td>
			</tr>
			<tr>
				<td>주민등록번호호호호</td>
				<td>
					<input type="text" name="emp_idnumber1" id="emp_idnumber1" required="required">
					-
					<input type="text" name="emp_idnumber2" id="emp_idnumber2" required="required">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="사원등록">
					<input type="button" value="취소" onclick="location.reload()">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>