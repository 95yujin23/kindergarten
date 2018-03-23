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
<title>Program Modify</title>
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
			<form id="programModifyForm" action="${pageContext.request.contextPath}/program/program_list" method="post">
				<input type="hidden" value="${program.programCd}" name="programCd">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>특별활동프로그램명</th>
							<th>주당운영횟수(회)</th>
							<th>1회운영시간(분)</th>
							<th>외주금액</th>
							<th>마감유무</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" value="${program.programNm}" name="programNm"></td>							
							<td>
								<select name="programNumberWeek">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
								</select>
							</td>
							<td>
								<select name="programOperationTime">
									<option value="10">10</option>
									<option value="20">20</option>
									<option value="30">30</option>
									<option value="40">40</option>
									<option value="50">50</option>
									<option value="60">60</option>
								</select>
							</td>
							<td><input type="text" value="${program.programOutsourcingCost}" name="programOutsourcingCost"></td>
							<td>
								<select name="programClosingoption">
									<option value="마감전">마감전</option>
									<option value="마감완료">마감완료</option>
								</select>
							</td>
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