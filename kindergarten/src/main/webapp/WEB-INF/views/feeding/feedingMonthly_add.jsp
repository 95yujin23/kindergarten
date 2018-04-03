<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>FeedingMonthly Add</title>
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
			<h1 class="page-header">월별급식 등록</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				   월별급식 등록
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="addForm" action="${pageContext.request.contextPath}/FeedingMonthlyAdd" method="POST">
								<div class="form-group">
								    <label>월별급식코드</label>
								    <input class="form-control" id="feedingMonthlyCd" name="feedingMonthlyCd" placeholder="월별급식코드">
								</div>
								<div class="form-group">
								    <label>급식실시(월)</label>
								    <input class="form-control" id="femoFeedingMonth" name="femoFeedingMonth" placeholder="급식실시(월)">
								</div>
								<div class="form-group">
								    <label>급식실시(년)</label>
								    <input class="form-control" id="femoFeedingYear" name="femoFeedingYear" placeholder="급식실시(년)">
								</div>
								<div class="form-group">
								    <label>조리사(명)</label>
								    <input class="form-control" id="femoCook" name="femoCook" placeholder="조리사(명)">
								</div>
								<div class="form-group">
								    <label>급식운영방식</label>
								    <input class="form-control" id="femoOperationMethod" name="femoOperationMethod" placeholder="급식운영방식">
								</div>
								<div class="form-group">
								    <label>집단급식소신고여부</label>
								    <input class="form-control" id="femoCafeteriaReportedCheck" name="femoCafeteriaReportedCheck" placeholder="집단급식소신고여부">
								</div>
								<div class="form-group">
								    <label>계약코드</label>
								    <input class="form-control" id="contractCd" name="contractCd" placeholder="담당자">
								</div>
								<div class="form-group">
								    <label>지출급식비</label>
								    <input class="form-control" id="femoExpenditureCost" name="femoExpenditureCost" placeholder="지출급식비">
								</div>
								<div class="form-group">
								    <label>마감회계_지출급식비</label>
								    <input class="form-control" id="femoClosingCost" name="femoClosingCost" placeholder="마감회계_지출급식비">
								</div>
								<div class="form-group">
								    <label>마감유무</label>
								    <input class="form-control" id="femoClosingOption" name="femoClosingOption" placeholder="마감유무">
								</div>
								<div class="form-group">
								    <label>등록날짜</label>
								    <input class="form-control" type="date" id="femoRegistrationDate" name="femoRegistrationDate" placeholder="등록날짜">
								</div>
								<div class="form-group">
								    <label>등록인</label>
								    <input class="form-control" id="femoRegistrant" name="femoRegistrant" placeholder="등록인">
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