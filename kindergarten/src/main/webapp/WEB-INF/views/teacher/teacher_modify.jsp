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
			<h1 class="page-header">내 정보 수정</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				    선생님 개인정보 수정 화면 입니다.
				    <!-- 선생님 본인만 수정가능 -->
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="modiForm" action="${pageContext.request.contextPath}/TeacherModify?teacherCd=${loginTeacher.teacherCd}" method="POST">
								<div class="form-group">
								    <label>이름</label>
								    <input class="form-control" id="teacherNm" name="teacherNm" value="${loginTeacher.teacherNm}">
								</div>
								<div class="form-group">
								    <label>생년월일</label>
								    <input class="form-control" id="teacherDateOfBirth" name="teacherDateOfBirth" value="${loginTeacher.teacherDateOfBirth}">
								</div>
								<div class="form-group">
								    <label>연락처</label>
								    <input class="form-control" id="teacherPhone" name="teacherPhone" value="${loginTeacher.teacherPhone}">
								</div>
								<div class="form-group">
								    <label>전자우편</label>
								    <input class="form-control" id="teacherEmail" name="teacherEmail" value="${loginTeacher.teacherEmail}">
								</div>
								<div class="form-group">
								    <label>자택주소</label>
								    <input class="form-control" id="teacherAddress" name="teacherAddress" value="${loginTeacher.teacherAddress}">
								</div>
								<div class="form-group">
								    <label>급여은행</label>
								    <input class="form-control" id="teacherBank" name="teacherBank" value="${loginTeacher.teacherBank}">
								</div>
								<div class="form-group">
								    <label>급여계좌</label>
								    <input class="form-control" id="teacherAccount" name="teacherAccount" value="${loginTeacher.teacherAccount}">
								</div>
								<!-- 직급과 호봉은 원장만 수정 가능 -->
								<div class="form-group">
								    <label>직급</label>
								    <input class="form-control" id="teacherPosition" name="teacherPosition" value="${loginTeacher.teacherPosition}">
								</div>
								<div class="form-group">
								    <label>호봉</label>
								    <input class="form-control" id="teacherPayStep" name="teacherPayStep" value="${loginTeacher.teacherPayStep}">
								</div>								
								<button type="submit">수정</button>
							</form>
						</div>
					</div>
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
