<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>FeedingMenu List</title>
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
	<div id "wrapper">
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
			<h2>급식메뉴 리스트</h2>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>식단코드</th>
						<th>식단일자</th>
						<th>중식(열량/단백질)</th>
						<th>오전간식</th>
						<th>오후간식</th>
						<th>원산지</th>
						<th>담당자</th>
						<th>유치원 라이센스</th>
						<th>수정</th>
						<th>삭제</th>						
					</tr>
				</thead>
				<c:forEach var="feme" items="${list}">
					<tbody>
						<tr>
							<td>${feme.feedingMenuCd}</td>
							<td>${feme.menuDate}</td>
							<td>${feme.lunchCaloryProtein}</td>
							<td>${feme.morningSnack}</td>
							<td>${feme.afternoonSnack}</td>
							<td>${feme.origin}</td>
							<td>${feme.menuManager}</td>
							<td>${feme.licenseKindergarten}</td>
							<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/feeding/feedingMenu_modify?feedingMenuCd=${feme.feedingMenuCd}"><i class="fa fa-pencil"></i></a></td>
							<td><a class="btn btn-danger" href="${pageContext.request.contextPath}"><i class="fa fa-trash"></i></a></td>
						</tr>
					</tbody>	
					</c:forEach>
			</table>
			</div>
		</div>
	</div>
	<!-- FOOTER : Navigation -->
	<c:import url="./inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>