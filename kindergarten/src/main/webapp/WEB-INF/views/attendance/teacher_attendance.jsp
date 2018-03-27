<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"src="<c:url value="/resources/vendor/js/jquery.min.js"/>"></script>
<script>
	$(document).ready(function() {
		$('#attendanceInButton').click(function() {
			$('#teacherAttendanceInForm').submit();
		})
		$('#attendanceOutButton').click(function() {
			$('#teacherAttendanceOutForm').submit();
		})
	})
</script>
<title>teacher attendance</title>
</head>
<body>
	<div class="container">
		<div class="alert alert-success">
			<h2>출근 폼</h2>
			<form id="teacherAttendanceInForm" action="${pageContext.request.contextPath}/teacher_attendance" method="post">
				<button id="attendanceInButton" type="button">출근</button>	
			</form>
		</div>
		<div class="alert alert-danger">
			<h2>퇴근 폼</h2>
			<form id="teacherAttendanceOutForm" action="${pageContext.request.contextPath}/teacher_attendance_update" method="post">
			 	<button id="attendanceOutButton" type="button">퇴근</button>
			</form>
		</div>
	</div>
</body>
</html>