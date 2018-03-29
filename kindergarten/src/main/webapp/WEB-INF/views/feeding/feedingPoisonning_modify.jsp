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
<title>feedingPoisonning Modify</title>
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
			<h2>식중독발생처리현황 수정화면</h2>
			<form id="feedingMonthlyModifyForm" action="${pageContext.request.contextPath}/feeding/feedingPoisonning_modify" method="post">
					<table class="table table-hover">
					<thead>
						<tr>
							<th>식중독발생및처리 코드</th>
							<th>월별급식코드</th>
							<th>발생일자</th>
							<th>전체아동수</th>
							<th>발생아동수</th>
							<th>식중독종류</th>
							<th>처리결과</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" value="${feedingPoisonning.foodPoisonningGenerationCd}" name="foodPoisonningGenerationCd"></td>	
							<td><input type="text" value="${feedingPoisonning.feedingMonthlyCd}" name="feedingMonthlyCd"></td>	
							<td><input type="text" value="${feedingPoisonning.fepoGenerationDate}" name="fepoGenerationDate"></td>	
							<td><input type="text" value="${feedingPoisonning.fopoWholeKidsCount}" name="fopoWholeKidsCount"></td>	
							<td><input type="text" value="${feedingPoisonning.fopoGeneratedKidsCount}" name="fopoGeneratedKidsCount"></td>							
							<td><input type="text" value="${feedingPoisonning.fopoFoodPoisonningKids}" name="fopoFoodPoisonningKids"></td>
							<td><input type="text" value="${feedingPoisonning.fopoProcessingResult}" name="fopoProcessingResult"></td>			
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