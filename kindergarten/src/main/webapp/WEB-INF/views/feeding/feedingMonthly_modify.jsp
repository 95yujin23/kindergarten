<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>feedingMonthly Modify</title>
<!-- Bootstrap Core CSS -->
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
	<div class="container">
		<div class="row">
			<div class="col-lg-1"></div>
			<div class="col-lg-11">
			<h2>월별급식 수정화면</h2>
			<form id="feedingMonthlyModifyForm" action="${pageContext.request.contextPath}/feeding/feedingMonthly_modify" method="post">
					<table class="table table-hover">
					<thead>
						<tr>
							<th>월별급식 코드</th>
							<th>급식실시(월)</th>
							<th>급식실시(년)</th>
							<th>조리사(명)</th>
							<th>급식원영방식</th>
							<th>집단급식소신고여부</th>
							<th>계약코드</th>
							<th>지출급식비</th>
							<th>마감회계_지출급식비</th>
							<th>마감유무</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" value="${feedingMonthly.feedingMonthlyCd}" name="feedingMonthlyCd"></td>	
							<td><input type="text" value="${feedingMonthly.femoFeedingMonth}" name="femoFeedingMonth"></td>	
							<td><input type="text" value="${feedingMonthly.femoFeedingYear}" name="femoFeedingYear"></td>	
							<td><input type="text" value="${feedingMonthly.femoCook}" name="femoCook"></td>	
							<td><input type="text" value="${feedingMonthly.femoOperationMethod}" name="femoOperationMethod"></td>							
							<td><input type="text" value="${feedingMonthly.femoCafeteriaReportedCheck}" name="femoCafeteriaReportedCheck"></td>
							<td><input type="text" value="${feedingMonthly.contractCd}" name="contractCd"></td>	
							<td><input type="text" value="${feedingMonthly.femoExpenditureCost}" name="femoExpenditureCost"></td>	
							<td><input type="text" value="${feedingMonthly.femoClosingCost}" name="femoClosingCost"></td>	
							<td><input type="text" value="${feedingMonthly.femoClosingOption}" name="femoClosingOption"></td>							
						</tr>
					</tbody>
				</table>
				<button id="modifyButton" class="btn" type="submit">수정</button>
				<button class="btn" type="reset">초기화</button> 
			</form>
			</div>
		</div>
	</div>	
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>