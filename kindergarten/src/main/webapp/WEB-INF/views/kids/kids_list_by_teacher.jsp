<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>영유아 목록 화면</title>

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
</head>

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
			<h1 class="page-header">영유아 목록</h1>
			</div>
			<div class="panel-body">
				<table border=1>
					<thead>
						<tr>
							<th>KIDS_CD</th>
							<th>KIDS_NM</th>
							<th>DATE_OF_BIRTH</th>
							<th>KIDS_ADDRESS</th>
							<th>KIDS_PARENT_PHONE</th>
							<th>KIDS_SPARE_PHONE</th>
							<th>KIDS_GENDER</th>
							<th>KIDS_COMMUTING_TYPE</th>
							<th>KIDS_CAUTION</th>
							<th>KIDS_ADMISSION</th>
							<th>ACCKIDS_GRADUATIONOUNT</th>
							<th>LICENSE_KINDERGARTEN</th>
						</tr>
					</thead>
					<c:forEach var="kidsList" items="${list}">
						<tbody>
							<tr>
								<td>${kidsList.kidsCd}</td>
								<td>${kidsList.kidsNm}</td>
								<td>${kidsList.kidsDateOfBirth}</td>
								<td>${kidsList.kidsAddress}</td>
								<td>${kidsList.kidsParentPhone}</td>
								<td>${kidsList.kidsSparePhone}</td>
								<td>${kidsList.kidsGender}</td>
								<td>${kidsList.kidsCommutingType}</td>
								<td>${kidsList.kidsCaution}</td>
								<td>${kidsList.kidsAdmission}</td>
								<td>${kidsList.kidsGraduation}</td>
								<td>${kidsList.licenseKindergarten}</td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>
			</div>
		</div>
	</div>
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</div>
	<!-- jQuery -->
	<script src="resources/vendor/js/jquery.min.js"></script>

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
