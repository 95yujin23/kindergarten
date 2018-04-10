<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
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
<!-- jQuery -->
<script src="resources/vendor/js/jquery.min.js"></script>
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
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">영유아 등하원 폼</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-6">
				<div class="alert alert-success">
					<h2>영유아 등원 폼</h2>
					<form id="kidsAttendanceInForm" action="${pageContext.request.contextPath}/KidsAttendance" method="post">
						<span>영유아번호를 입력해주세요.</span>
						<input type="text" id="kidsCd" name="kidsCd"><br>
						<span>특이사항이 있으면 입력해주세요.</span>
						<input type="text" id="kidsReason" name="kidsReason">
						<button class="btn btn-default" id="attendanceInButton" type="button">등원</button>
					</form>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="alert alert-danger">
					<h2>영유아 하원 폼</h2>
					<form id="kidsAttendanceOutForm" action="${pageContext.request.contextPath}/kids_attendance_update" method="post">
						<br>
						<span>영유아번호를 입력해주세요.</span>
						<input type="text" id="kidsCd" name="kidsCd">
						<button class="btn btn-default" id="attendanceOutButton" type="button">하원</button>
					</form>
				</div>
			</div>
		</div>
		<!-- FOOTER : Navigation -->
		<c:import url="../inc/footer.jsp"></c:import>
		<!-- FOOTER -->
	</div>
	<!-- Bootstrap Core JavaScript -->
	<script src="resources/vendor/js/bootstrap.min.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script src="resources/vendor/js/metisMenu.min.js"></script>
	<!-- Morris Charts JavaScript -->
	<script src="resources/vendor/js/raphael.min.js"></script>
	<script src="resources/vendor/js/morris.min.js"></script>
	<script src="resources/vendor/js/morris-data.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="resources/vendor/js/sb-admin-2.js"></script>
</body>
</html>