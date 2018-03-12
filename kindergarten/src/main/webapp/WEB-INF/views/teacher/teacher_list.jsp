<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Teacher List</h1>
<table>
	<thead>
		<tr>
			<th>TEACHER_CD</th>
			<th>TEACHER_NM</th>
			<th>DATE_OF_BIRTH</th>
			<th>PHONE</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
			<th>ADDRESS</th>
			<th>ENTRY_DATE</th>
			<th>POSITION</th>
			<th>BANK</th>
			<th>ACCOUNT</th>
			<th>PAY_STEP</th>
			<th>LICENSE_KINDERGARTEN</th>
		</tr>
	</thead>
	<c:forEach var="teacherList" items="${list}">
		<tbody>
			<tr>
				<td>${teacherList.teacherCd}</td>
				<td>${teacherList.teacherNm}</td>
				<td>${teacherList.dateOfBirth}</td>
				<td>${teacherList.phone}</td>
				<td>${teacherList.password}</td>
				<td>${teacherList.email}</td>
				<td>${teacherList.address}</td>
				<td>${teacherList.entryDate}</td>
				<td>${teacherList.position}</td>
				<td>${teacherList.bank}</td>
				<td>${teacherList.account}</td>
				<td>${teacherList.payStep}</td>
				<td>${teacherList.licenseKindergarten}</td>
			</tr>
		</tbody>
	</c:forEach>
</table>
</body>
</html>