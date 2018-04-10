<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>FeedingMonthly List</title>
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
	<div id ="wrapper">
		<!-- TOP : Navigation -->
		<c:import url="../inc/top.jsp"></c:import>
		<!-- TOP -->
		<!-- LEFT : Navigation -->
		<c:import url="../inc/left.jsp"></c:import>
		<!-- LEFT -->
	</div>
	<div  id="page-wrapper">
		<div class="row">
			<div class="col-lg-1"></div>
			<div class="col-lg-11">
			<h2>월별급식 리스트</h2>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>급식실시(년,월)</th>
						<th>급식운영방식</th>						
						<th>조리사(명)</th>
						<th>집단급식소신고여부</th>
						<th>계약코드</th>
						<th>지출급식비</th>
						<th>마감회계(지출급식비)</th>
						<th>마감유무</th>
						<th>등록날짜</th>
						<th>등록인</th>
						<th>수정</th>
						<th>삭제</th>						
					</tr>
				</thead>
				<c:forEach var="femo" items="${list}">
					<tbody>
						<tr>
							<td>${femo.femoFeedingYearMonth}</td>							
							<td>${femo.femoOperationMethod}</td>
							<td>${femo.femoCook}</td>
							<td>${femo.femoCafeteriaReportedCheck}</td>
							<td>${femo.contractCd}</td>
							<td>${femo.femoExpenditureCost}</td>
							<td>${femo.femoClosingCost}</td>
							<td>${femo.femoClosingOption}</td>
							<td>${femo.femoRegistrationDate}</td>
							<td>${femo.femoRegistrant}</td>
							<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/feeding/feedingMonthly_modify?feedingMonthlyCd=${femo.feedingMonthlyCd}"><i class="fa fa-pencil"></i></a></td>
							<td><a class="btn btn-danger" href="${pageContext.request.contextPath}/FeedingMonthlyDelete?feedingMonthlyCd=${femo.feedingMonthlyCd}"><i class="fa fa-trash"></i></a></td>
						</tr>
					</tbody>	
					</c:forEach>
			</table>
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