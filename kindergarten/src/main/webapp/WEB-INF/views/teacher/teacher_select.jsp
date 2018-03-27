<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>교직원 목록 화면</title>

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

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

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
			<div class="panel panel-default">
				<div class="panel-heading">
			<h1 class="page-header">교직원 개인정보</h1>
				<table class="table table-hover">
				<tr>
					<td class="active">교직원 이름</td>
					<td>${loginTeacher.teacherNm}</td>
				</tr>
				<tr>
					<td class="active">생년월일</td>
					<td>${loginTeacher.teacherDateOfBirth}</td>
				</tr>
				<tr>
					<td class="active">연락처</td>
					<td>${loginTeacher.teacherPhone}</td>
				</tr>	
				<tr>
					<td class="active">전자우편</td>
					<td>${loginTeacher.teacherEmail}</td>
				</tr>
				<tr>
					<td class="active">자택 주소</td>
					<td>${loginTeacher.teacherAddress}</td>
				</tr>
				<tr>
					<td class="active">입사일</td>
					<td>${loginTeacher.teacherEntryDate}</td>
				</tr>
				<tr>
					<td class="active">직급</td>
					<td>${loginTeacher.teacherPosition}</td>
				</tr>	
				<tr>
					<td class="active">호봉</td>
					<td>${loginTeacher.teacherPayStep}</td>
				</tr>
				<tr>
					<td class="active">급여 은행</td>
					<td>${loginTeacher.teacherBank}</td>
				</tr>
				<tr>
					<td class="active">계좌 번호</td>
					<td>${loginTeacher.teacherAccount}</td>
				</tr>
				</table>
				<a href="${pageContext.request.contextPath}/TeacherModify">수정</a>
			</div>
			</div>
		</div>
	</div>
</div>
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->

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
