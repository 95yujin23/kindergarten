<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
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
<link href="resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript"src="<c:url value="/resources/vendor/js/jquery.min.js"/>"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#searchButton').click(function(){
				$('#searchCityForm').submit();
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
		<!-- 검색처리 시작 
			<form action="${pageContext.request.contextPath}/attendance/teacher_all_attendance_list?keyword=${keyword}" method="get" id="searchAttendanceForm" class="col-lg-3 col-sm-3 form-inline">
				<div class="input-group">
					<input id="searchNm" name="keyword" type="text" class="form-control" placeholder="Search">
					<div class="input-group-btn">
						<button id="searchButton" type="button" class="btn btn-primary">Search</button>
					</div>
				</div>
			</form>
			 검색처리 끝 -->
			<div class="col-lg-1"></div>
			<div class="col-lg-11">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>출근일</th>
							<th>출근시간</th>
							<th>퇴근시간</th>
							<th>지각조퇴구분</th>
						</tr>
					</thead>
					<c:forEach var="attendanceList" items="${list}">
						<tbody>
							<tr>
								<td>${attendanceList.teacherAttendanceDay}</td>
								<td>${attendanceList.teacherAttendance}</td>
								<td>${attendanceList.teacherGetOff}</td>
								<td>${attendanceList.teacherRestLateType}</td>
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
</body>
</html>