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
<title>Teacher Attendance List</title>
<!-- Bootstrap Core CSS -->
<link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet">
<!-- MetisMenu CSS -->
<link href="resources/vendor/css/metisMenu.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="resources/vendor/css/sb-admin-2.css" rel="stylesheet">
<!-- Morris Charts CSS -->
<link href="resources/vendor/css/morris.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css"></head>
<!-- jQuery -->
<script src="resources/vendor/js/jquery.min.js"></script>
<body>
 <div id="wrapper">
	<!-- TOP : Navigation -->
	<c:import url="../inc/top.jsp"></c:import>
	<!-- TOP -->
	<!-- LEFT : Navigation -->
	<c:import url="../inc/left.jsp"></c:import>
	<!-- LEFT -->
	</div>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h1 class="page-header">영유아 등하원 목록</h1>
					</div>
				</div>
				<div class="panel-body">
					<form class="form-inline">
						<input class="form-control" id="search" type="text" placeholder="Search..">
					</form>
			 		<br>
					<table class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
								<th>학생코드</th>
								<th>등원일</th>
								<th>등원시간</th>
								<th>하원시간</th>
								<th>특이사항</th>
								<th>지각조퇴구분</th>
							</tr>
						</thead>
						<c:forEach var="attendanceList" items="${list}">
							<tbody id="KidsAttendanceTable">
								<tr>
									<td>${attendanceList.kidsCd}</td>
									<td>${attendanceList.kidsAttendanceDay}</td>
									<td>${attendanceList.kidsAttendance}</td>
									<td>${attendanceList.kidsComeHome}</td>
									<td>${attendanceList.kidsReason}</td>
									<td>${attendanceList.kidsRestLateType}</td>
								</tr>
							</tbody>
						</c:forEach>
					</table>
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
	<script>
	$(document).ready(function(){
	  $("#search").on("keyup", function() {
	    var value = $(this).val().toLowerCase();
	    $("#KidsAttendanceTable tr").filter(function() {
	      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
	    });
	  });
	});
	</script>
</body>
</html>