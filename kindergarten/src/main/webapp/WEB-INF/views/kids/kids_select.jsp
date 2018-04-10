<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>영유아 상세 정보</title>

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

<script src="resources/vendor/js/jquery.min.js"></script>
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
	<c:set var="kids" value="${kidsAndKidsFile}"/>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">${kindergarten.kindergartenNm} 영유아 상세정보</h1>
			</div>
		</div>
		<div class="row">
		<div class="col-lg-1">
				<table class="table table-striped table-bordered table-hover">
					<tr><td><img src="${pageContext.request.contextPath}/resources/upload/kids/${kids.kidsFileNm}.${kids.kidsFileExt}"></td></tr>
				</table>
				</div>
	<div class="col-lg-1"></div>
			<div class="col-lg-10">
				<table class="table table-striped table-bordered table-hover">
					<tr>
						<td>이름</td>
						<td>${kids.kidsNm}</td>
					</tr>
					<tr>
						<td>생년월일</td>
						<td>${kids.kidsDateOfBirth}</td>
					</tr>
					<tr>
						<td>주소</td>
						<td>${kids.kidsAddress}</td>
					</tr>
					<tr>
						<td>보호자연락처</td>
						<td>${kids.kidsParentPhone}</td>
					</tr>
					<tr>
						<td>보호자예비연락처</td>
						<td>${kids.kidsSparePhone}</td>
					</tr>
					<tr>
						<td>성별</td>
						<td>${kids.kidsGender}</td>
					</tr>
					<tr>
						<td>통학방법</td>
						<td>${kids.kidsCommutingType}</td>
					</tr>
					<tr>
						<td>주의사항</td>
						<td>${kids.kidsCaution}</td>
					</tr>
					<tr>
						<td>입학날짜</td>
						<td>${kids.kidsAdmission}</td>
					</tr>
					<tr>
						<td>졸업날짜</td>
						<td>${kids.kidsGraduation}</td>
					</tr>
				</table>
			</div>

		</div>
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
	</div>	
	
	<!-- jQuery -->
	
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
