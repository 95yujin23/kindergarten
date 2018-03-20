<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>Kids List</h1>
<table border=1>
	<thead>
		<tr>
			<th>ATTENDANCE_CD</th>
			<th>KIDS_CD</th>
			<th>KIDS_ATTENDANCE_TIME</th>
			<th>KIDS_COME_HOME_TIME</th>
			<th>KIDS_REST_LATE_TYPE</th>
			<th>KIDS_REASON</th>
			<th>LICENSE_KINDERGARTEN</th>
		</tr>
	</thead>
	<c:forEach var="kidsAttendance" items="${list}">
		<tbody>
			<tr>
				<td>${kidsAttendance.attendanceCd}</td>
				<td>${kidsAttendance.kidsCd}</td>
				<td>${kidsAttendance.kidsAttendanceTime}</td>
				<td>${kidsAttendance.kidsComeHomeTime}</td>
				<td>${kidsAttendance.kidsRestLateTime}</td>
				<td>${kidsAttendance.kidsReason}</td>
				<td>${kidsAttendance.licenseKindergarten}</td>
			</tr>
		</tbody>
	</c:forEach>
</table>


</body>
</html>