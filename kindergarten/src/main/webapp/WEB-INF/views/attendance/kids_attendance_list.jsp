<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Teacher Attendance List</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>학생코드</th>
						<th>등원일</th>
						<th>등원시간</th>
						<th>하원시간</th>
						<th>지각조퇴구분</th>
					</tr>
				</thead>
				<c:forEach var="attendanceList" items="${list}">
					<tbody>
						<tr>
							<td>${attendanceList.kidsCd}</td>
							<td>${attendanceList.kidsAttendanceDay}</td>
							<td>${attendanceList.kidsAttendance}</td>
							<td>${attendanceList.kidsComeHome}</td>
							<td>${attendanceList.kidsRestLateType}</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>