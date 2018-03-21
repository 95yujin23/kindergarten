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
			<h1 class="page-header">내 정보 수정</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				    선생님 개인정보 수정 화면 입니다.
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="modiForm" action="${pageContext.request.contextPath}/TeacherModify" method="POST">
								<div class="form-group">
								    <label>이름</label>
								    <input class="form-control" id="teacherNm" name="teacherNm" placeholder="이름">
								</div>
								<div class="form-group">
								    <label>생년월일</label>
								    <input class="form-control" id="teacherDateOfBirth" name="teacherDateOfBirth" placeholder="생년월일">
								</div>
								<div class="form-group">
								    <label>연락처</label>
								    <input class="form-control" id="teacherPhone" name="teacherPhone" placeholder="연락처">
								</div>
								<div class="form-group">
								    <label>전자우편</label>
								    <input class="form-control" id="teacherEmail" name="teacherEmail" placeholder="전자우편">
								</div>
								<div class="form-group">
								    <label>주소</label>
								    <input class="form-control" id="teacherAddress" name="teacherAddress" placeholder="주소">
								</div>
								<div class="form-group">
								    <label>급여은행</label>
								    <input class="form-control" id="teacherBank" name="teacherBank" placeholder="급여은행">
								</div>
								<div class="form-group">
								    <label>급여계좌</label>
								    <input class="form-control" id="teacherAccount" name="teacherAccount" placeholder="급여계좌">
								</div>
								<!-- 직급과 호봉은 원장만 수정 가능 -->
								<div class="form-group">
								    <label>직급</label>
								    <input class="form-control" id="teacherPosition" name="teacherPosition" placeholder="직급">
								</div>
								<div class="form-group">
								    <label>호봉</label>
								    <input class="form-control" id="teacherPayStep" name="teacherPayStep" placeholder="호봉">
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
