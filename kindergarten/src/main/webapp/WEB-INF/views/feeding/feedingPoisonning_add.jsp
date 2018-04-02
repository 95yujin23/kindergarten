<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>FeedingMenu Add</title>
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
			<h1 class="page-header">식중독 발생및 처리현황 등록</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				   식중독 발생및 처리현황 등록
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="addForm" action="${pageContext.request.contextPath}/FeedingPoisonningAdd" method="POST">
								<div class="form-group">
								    <label>식중독발생및처리코드</label>
								    <input class="form-control" id="foodPoisonningGenerationCd" name="foodPoisonningGenerationCd" placeholder="식중독발생및처리코드">
								</div>
								<div class="form-group">
								    <label>월별급식코드</label>
								    <input class="form-control" id="feedingMonthlyCd" name="feedingMonthlyCd" placeholder="월별급식코드">
								</div>
								<div class="form-group">
								    <label>발생일자</label>
								    <input class="form-control" id="fepoGenerationDate" name="fepoGenerationDate" placeholder="발생일자">
								</div>
								<div class="form-group">
								    <label>전체아동수</label>
								    <input class="form-control" id="fopoWholeKidsCount" name="fopoWholeKidsCount" placeholder="전체아동수">
								</div>
								<div class="form-group">
								    <label>발생아동수</label>
								    <input class="form-control" id="fopoGeneratedKidsCount" name="fopoGeneratedKidsCount" placeholder="발생아동수">
								</div>
								<div class="form-group">
								    <label>식중독종류</label>
								    <input class="form-control" id="fopoFoodPoisonningKids" name="fopoFoodPoisonningKids" placeholder="식중독종류">
								</div>
								<div class="form-group">
								    <label>처리결과</label>
								    <input class="form-control" id="fopoProcessingResult" name="fopoProcessingResult" placeholder="처리결과">
								</div>
									<div class="form-group">
								    <label>등록날짜</label>
								    <input class="form-control" id="fopoRegistrationDate" name="fopoRegistrationDate" placeholder="등록날짜">
								</div>
								<div class="form-group">
								    <label>등록인</label>
								    <input class="form-control" id="registrant" name="registrant" placeholder="등록인">
								</div>		
								<div class="form-group">
								    <label>유치원 라이센스</label>
								    <input class="form-control" id="licenseKindergarten" name="licenseKindergarten" placeholder="유치원라이센스">
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
</html></html>