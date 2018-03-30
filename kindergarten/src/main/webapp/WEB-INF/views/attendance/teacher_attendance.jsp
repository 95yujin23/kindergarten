<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>teacher attendance</title>
<!-- Bootstrap Core CSS -->
<link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet">
<!-- MetisMenu CSS -->
<link href="resources/vendor/css/metisMenu.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="resources/vendor/css/sb-admin-2.css" rel="stylesheet">
<!-- Morris Charts CSS -->
<link href="resources/vendor/css/morris.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
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
</head>
<body>
	<div id="wrapper">
		<!-- TOP : Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
		<c:import url="../inc/top.jsp"></c:import>
		<!-- TOP -->
		<!-- LEFT : Navigation -->
		<c:import url="../inc/left.jsp"></c:import>
		<!-- LEFT -->
		</nav>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-1"></div>
			<div class="col-lg-11">
				<div class="alert alert-success">
					<h2>출근 폼</h2>
					<form id="teacherAttendanceInForm" action="${pageContext.request.contextPath}/TeacherAttendance" method="post">
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
		</div>
	</div>
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>