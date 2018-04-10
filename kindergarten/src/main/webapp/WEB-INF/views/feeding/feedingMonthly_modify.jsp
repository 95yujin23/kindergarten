<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>FeedingMonthly Modify</title>
<link href="../resources/vendor/css/bootstrap.min.css" rel="stylesheet">
<!-- MetisMenu CSS -->
<link href="../resources/vendor/css/metisMenu.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="../resources/vendor/css/sb-admin-2.css" rel="stylesheet">
<!-- Morris Charts CSS -->
<link href="../resources/vendor/css/morris.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="../resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
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
			<h1 class="page-header">월별급식 수정</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				   월별급식 수정
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="addForm" action="${pageContext.request.contextPath}/feeding/feedingMonthly_modify" method="POST">
								<input type="hidden" value="${feedingMonthly.feedingMonthlyCd}" name="feedingMonthlyCd">
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
								    <select class="form-control" id="femoOperationMethod" name="femoOperationMethod" >
								    	<option value="자체급식">자체급식</option>
								    	<option value="위탁급식">위탁급식</option>
								    </select>								    
								</div>
								<div class="form-group">
								    <label>집단급식소신고여부</label>
								    <select class="form-control" id="femoCafeteriaReportedCheck" name="femoCafeteriaReportedCheck" >
									   	<option value="신고">신고</option>
									   	<option value="미신고">미신고</option>
									   	<option value="해당사항없음">해당사항없음</option>
								    </select>								 
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
								    <select class="form-control" id="femoClosingOption" name="femoClosingOption" >
									    	<option value="마감완료">마감완료</option>
									    	<option value="마감전">마감전</option>									    	
								    </select>								   
								</div>							
								<div class="form-group">
								    <label>등록인</label>
								    <input class="form-control" id="femoRegistrant" name="femoRegistrant" placeholder="등록인">
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