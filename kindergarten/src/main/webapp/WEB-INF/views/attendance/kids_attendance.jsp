<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>kids attendance</title>
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
			$('#kidsAttendanceInForm').submit();
		})
		$('#attendanceOutButton').click(function() {
			$('#kidsAttendanceOutForm').submit();
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
					<h2>영유아 등원 폼</h2>
					<form id="kidsAttendanceInForm" action="${pageContext.request.contextPath}/KidsAttendance" method="post">
						<span>영유아번호를 입력해주세요.</span>
						<input type="text" id="kidsCd" name="kidsCd">
						<span>특이사항이 있으면 입력해주세요.</span>
						<input type="text" id="kidsReason" name="kidsReason">
						<button id="attendanceInButton" type="button">등원</button>
					</form>
				</div>
				<div class="alert alert-danger">
					<h2>영유아 하원 폼</h2>
					<form id="kidsAttendanceOutForm" action="${pageContext.request.contextPath}/kids_attendance_update" method="post">
						<span>영유아번호를 입력해주세요.</span>
						<input type="text" id="kidsCd" name="kidsCd">
					 	<button id="attendanceOutButton" type="button">하원</button>
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