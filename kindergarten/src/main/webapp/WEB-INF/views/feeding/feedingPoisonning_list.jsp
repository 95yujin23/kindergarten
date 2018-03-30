<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>FeedingPoisonningProcessing List</title>
<link href="/resources/vendor/css/bootstrap.min.css" rel="stylesheet">
<!-- MetisMenu CSS -->
<link href="/resources/vendor/css/metisMenu.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="/resources/vendor/css/sb-admin-2.css" rel="stylesheet">
<!-- Morris Charts CSS -->
<link href="/resources/vendor/css/morris.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="/resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id= "wrapper">
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
			<h2>식중독 발생 및 처리 리스트</h2>
			<table class="table table-hover">
				<thead> 
					<tr>
						<th>식중독발생및처리코드</th>
						<th>월별급식코드</th>
						<th>발생일자</th>
						<th>전체아동수</th>
						<th>발생아동수</th>
						<th>식중독종류</th>
						<th>처리결과</th>
						<th>등록날짜</th>
						<th>등록인</th>
						<th>유치원라이센스</th>
						<th>수정</th>
						<th>삭제</th>						
					</tr>
				</thead>
				<c:forEach var="fepo" items="${list}">
					<tbody>
						<tr>
							<td>${fepo.foodPoisonningGenerationCd}</td>
							<td>${fepo.feedingMonthlyCd}</td>
							<td>${fepo.fepoGenerationDate}</td>
							<td>${fepo.fopoWholeKidsCount}</td>
							<td>${fepo.fopoGeneratedKidsCount}</td>
							<td>${fepo.fopoFoodPoisonningKids}</td>
							<td>${fepo.fopoProcessingResult}</td>
							<td>${fepo.fopoRegistrationDate}</td>
							<td>${fepo.registrant}</td>
							<td>${fepo.licenseKindergarten}</td>
							<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/feeding/feedingPoisonning_modify?foodPoisonningGenerationCd=${fepo.foodPoisonningGenerationCd}"><i class="fa fa-pencil"></i></a></td>
							<td><a class="btn btn-danger" href="${pageContext.request.contextPath}"><i class="fa fa-trash"></i></a></td>
						</tr>
					</tbody>	
					</c:forEach>
			</table>
			</div>
		</div>
	</div>
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>