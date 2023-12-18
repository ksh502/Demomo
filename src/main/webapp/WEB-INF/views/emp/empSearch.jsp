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
	
	<h2>사원 조회</h2>
	
	<form action="empSearch" method="post" name="empSearch">
		<table border="1">
			<tr>
				<td>주민등록번호</td>
				<td>
					<input type="text" name="emp_idnumber1" id="emp_idnumber1" required="required">
					-
					<input type="text" name="emp_idnumber2" id="emp_idnumber2" required="required">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="조회">
					<input type="button" value="취소" onclick="location.reload()">
				</td>
			</tr>
		</table>
	</form>

	<hr>
	
	<c:choose>
		<c:when test="${not empty empList }"> 
			<h3>사원 조회 결과</h3>
			<table border="1">
				<c:forEach var="emp" items="${empList }">
					<tr>
						<td>사원번호</td>
						<td>${emp.emp_number }</td>
					</tr>
					<tr>
						<td>성명</td>
						<td>${emp.emp_name }</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		
		<c:when test="${empList eq null }"> 
			조회하기를 원하는 사원의 주민등록번호를 입력하세요.
		</c:when>
		
		<c:otherwise>
			<h3>일치하는 사원이 없습니다.</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>