<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>교직원 등록 화면</title>

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
			<h1 class="page-header">영유아 정보 수정</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				    영유아 정보 수정 화면 입니다.
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="modiForm" action="${pageContext.request.contextPath}/KidsModify?kidsCd=${kids.kidsCd}" method="POST">
								<div class="form-group">
								    <label>이름</label>
								    <input class="form-control" id="kidsNm" name="kidsNm" value="${kids.kidsNm}">
								</div>
								<div class="form-group">
								    <label>생년월일</label>
								    <input class="form-control" id="kidsDateOfBirth" name="kidsDateOfBirth" value="${kids.kidsDateOfBirth}">
								</div>
								<div class="form-group">
								    <label>주소</label>
								    <input class="form-control" id="kidsAddress" name="kidsAddress" value="${kids.kidsAddress}">
								</div>
								<div class="form-group">
								    <label>보호자연락처</label>
								    <input class="form-control" id="kidsParentPhone" name="kidsParentPhone" value="${kids.kidsParentPhone}">
								</div>
								<div class="form-group">
								    <label>보호자예비연락처</label>
								    <input class="form-control" id="kidsSparePhone" name="kidsSparePhone" value="${kids.kidsSparePhone}">
								</div>
								<div class="form-group">
								    <label>성별</label>
								    <input class="form-control" id="kidsGender" name="kidsGender" value="${kids.kidsGender}">
								</div>
								<div class="form-group">
								    <label>통학방법</label>
								    <input class="form-control" id="kidsCommutiogType" name="kidsCommutiogType" value="${kids.kidsCommutiogType}">
								</div>
								<div class="form-group">
								    <label>주의사항</label>
								    <input class="form-control" id="kidsCaution" name="kidsCaution" value="${kids.kidsCaution">
								</div>								
								<button type="submit">수정</button>
							</form>
						</div>
					</div>
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
