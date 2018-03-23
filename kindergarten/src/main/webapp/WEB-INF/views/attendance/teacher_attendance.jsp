<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"src="<c:url value="/resources/vendor/js/jquery.min.js"/>"></script>
<script>
	$(document).ready(function() {
		$('#attendanceButton').click(function() {
			$('#teacherAttendanceForm').submit();
		})
	})
</script>
<title>teacher attendance</title>
</head>
<body>
	<div class="container">
		<h2>출석 폼</h2>
		<form id="teacherAttendanceForm" action="${pageContext.request.contextPath}/teacher_attendance" method="post">
			<button id="attendanceButton" type="button">출근</button>	
		</form>
	</div>
</body>
</html>