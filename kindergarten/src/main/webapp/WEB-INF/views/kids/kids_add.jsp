<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>영유아 등록 화면</title>

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
			<h1 class="page-header">영유아 등록</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				    현재 다니고 있는 영유아를 등록해주세요.
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="addForm" action="${pageContext.request.contextPath}/KidsAdd" method="POST"
								enctype="multipart/form-data">
								<div class="form-group">
								    <label>이름</label>
								    <input class="form-control" id="kidsNm" name="kidsNm" placeholder="이름">
								</div>
								<div class="form-group">
								    <label>생년월일</label>
								    <input type="date" class="form-control" id="kidsDateOfBirth" name="kidsDateOfBirth" placeholder="생년월일">
								</div>
								<div class="form-group">
								    <label>주소</label>
								    <input class="form-control" id="kidsAddress" name="kidsAddress" placeholder="주소">
								</div>
								<div class="form-group">
								    <label>보호자연락처</label>
								    <input class="form-control" id="kidsParentPhone" name="kidsParentPhone" placeholder="보호자연락처">
								</div>
								<div class="form-group">
								    <label>보호자예비연락처</label>
								    <input class="form-control" id="kidsSparePhone" name="kidsSparePhone" placeholder="보호자예비연락처">
								</div>
								<div class="form-group">
								    <label>성별</label>
								    <input class="form-control" id="kidsGender" name="kidsGender" placeholder="성별">
								</div>
								<div class="form-group">
								    <label>통학방법</label>
								    <input class="form-control" id="kidsCommutiogType" name="kidsCommutiogType" placeholder="통학방법">
								</div>
								<div class="form-group">
								    <label>주의사항</label>
								    <input class="form-control" id="kidsCaution" name="kidsCaution" placeholder="주의사항">
								</div>
								<div class="form-group">
								    <label>사진</label>
								    <input type="file" class="form-control" id="file" name="file" multiple="multiple">
								</div>
								<button type="submit">등록</button>
								<button type="reset">초기화</button>
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
