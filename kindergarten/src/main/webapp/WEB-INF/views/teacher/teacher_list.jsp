<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>교직원 전체 목록</title>
</head>
<body>
<h1>교직원 목록</h1>
<table>
	<thead>
		<tr>
			<th>교직원 코드</th>
			<th>교직원 이름</th>
			<th>생년월일</th>
			<th>연락처</th>
			<th>전자우편</th>
			<th>자택 주소</th>
			<th>입사일</th>
			<th>직급/th>
			<th>호봉</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
	</thead>
	<c:forEach var="teacherList" items="${list}">
		<tbody>
			<tr>
				<td>${teacherList.teacherCd}</td>
				<td>${teacherList.teacherNm}</td>
				<td>${teacherList.teacherDateOfBirth}</td>
				<td>${teacherList.teacherPhone}</td>
				<td>${teacherList.teacherEmail}</td>
				<td>${teacherList.teacherAddress}</td>
				<td>${teacherList.teacherEntryDate}</td>
				<td>${teacherList.teacherPosition}</td>
				<td>${teacherList.teacherPayStep}</td>
				<td><a href="${pageContext.request.contextPath}/TeacherModify">수정</a></td> <!-- 수정화면 -->
				<td><a href="${pageContext.request.contextPath}/TeacherRemove">삭제</a></td>
			</tr>
		</tbody>
	</c:forEach>
</table>
</body>
</html>