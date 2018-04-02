<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>유치원 라이센스 등록 화면</title>

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
			<h1 class="page-header">유치원 라이센스 등록</h1>
									<!-- 관리자 전용 : 유치원 라이센스 등록 요청을 받았을 때 정보를 받아서 등록해줌. -->
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				    유치원 라이센스를 등록해주세요.
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="addForm" action="${pageContext.request.contextPath}/TeacherPayAdd" method="POST">
								<div class="form-group">
								    <label>유치원 명</label>
								    <input class="form-control" id="kindergartenNm" name="kindergartenNm" placeholder="라이센스 요청 유치원">
								</div>
								<div class="form-group">
								    <label>유치원 주소</label>
								    <input class="form-control" id="kindergartenAddress" name="kindergartenAddress" placeholder="해당 유치원 주소">
								</div>
								<div class="form-group">
								    <label>유치원 연락처</label>
								    <fieldset>
									<label for="local">지역번호:</label>
									<input type="text" name="local" id="local" list="local-list">
										<datalist id="local-list">
										<option value="0" label="선택">
										<option value="02-" label="서울특별시">
										<option value="031-" label="경기도">
										<option value="032-" label="인천광역시">
										<option value="033-" label="강원도">
										<option value="041-" label="충청남도">
										<option value="042-" label="대전광역시">
										<option value="043-" label="충청북도">
										<option value="044-" label="세종특별자치시">
										<option value="051-" label="부산광역시">
										<option value="052-" label="울산광역시">
										<option value="053-" label="대구광역시">
										<option value="054-" label="경상북도">
										<option value="055-" label="경상남도">
										<option value="061-" label="전라남도">
										<option value="062-" label="광주광역시">
										<option value="063-" label="전라북도">
										<option value="064-" label="제주특별자치도">
									</datalist>
									<input type="text" class="form-control" id="kindergartenPhone" name="kindergartenPhone" placeholder="지역번호를 제외한 나머지 번호를 입력해주세요.">
									</fieldset>
								   </div>
									<div class="form-group">
								    <label>라이센스 만료일</label>
								    <input type="date" class="form-control" id="licenseExpirationDay" name="licenseExpirationDay" placeholder="지급금액(단위:원)">
								</div>
								<button type="submit">등록</button>
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
