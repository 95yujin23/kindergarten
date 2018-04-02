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
<title>FeedingApplication Modify</title>
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
			<h2>수정화면</h2>
			<form id="feedingApplicationModifyForm" action="${pageContext.request.contextPath}/feeding/feedingApplication_modify" method="post">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>급식신청 코드</th>							
							<th>영유아 코드</th>
							<th>월별급식 코드</th>
							<th>수입급식비</th>
							<th>마감회계(수입급식비)</th>
							<th>마감유무</th>
							<th>급식구분</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" value="${feedingApplication.feedingApplicationCd}" name="feedingApplicationCd"></td>
							<td><input type="text" value="${feedingApplication.kidsCd}" name="kidsCd"></td>										
							<td><input type="text" value="${feedingApplication.feedingMonthlyCd}" name="feedingMonthlyCd"></td>
							<td><input type="text" value="${feedingApplication.feapExpenseMonth}" name="feapExpenseMonth"></td>
							<td><input type="text" value="${feedingApplication.feapClosingIncome}" name="feapClosingIncome"></td>
							<td><input type="text" value="${feedingApplication.feapClosingOption}" name="feapClosingOption"></td> 
							<td><input type="text" value="${feedingApplication.feapDivision}" name="feapDivision"></td> 
						</tr>
					</tbody>
				</table>
				<button id="modifyButton" class="btn" type="button">수정</button>
				<button class="btn" type="reset">초기화</button>
			</form>
			</div>
		</div>
	</div>	
	<!-- FOOTER : Navigation -->
	<c:import url="./inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>