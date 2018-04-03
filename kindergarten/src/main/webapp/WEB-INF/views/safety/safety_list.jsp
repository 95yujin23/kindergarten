<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>안전 점검 및 교육 실행 목록</title>

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

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

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
			<div class="panel panel-default">
				<div class="panel-heading">
			<h1 class="page-header">안전 점검 및 교육 실행 목록</h1>
			<form action="${pageContext.request.contextPath}/SafetyList" method="post">
					<select name="year" class="form-control">
					<!-- 검색 조건을 검색 처리후 결과화면에 보여주기 위해 c:out 출력태그 사용 (삼항연산자) -->
					<option value=""	>모든 해</option>
					<option value="2016">2016년</option>
					<option value="2017">2017년</option>
					<option value="2018">2018년</option>					
					</select> 
					<select name="division" class="form-control">
					<!-- 검색 조건을 검색 처리후 결과화면에 보여주기 위해 c:out 출력태그 사용 (삼항연산자) -->
					<option value=""	>전체</option>
					<option value="점검">점검</option>
					<option value="교육">교육</option>
					</select> 
					<button class="btn btn-success" type="submit" value="검색">검색</button>
				</form>
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>안전 점검 및 교육 구분</th>
							<th>안전 교육 및 점검 명</th>
							<th>안전 실행시간(분)</th>
							<th>안전 실시아동수</th>
							<th>안전 주최</th>
							<th>안전 교육및점검비</th>
							<th>안전 마감유무</th>
							<th>안전 등록인</th>
							<th>안전 등록날짜</th>
							<th>수정</th>
							<th>삭제</th>
						</tr>
					</thead>
					<c:forEach var="safetyList" items="${list}">
						<tbody>
							<tr>
								<td>${safetyList.safetyDivision}</td>
								<td>${safetyList.resourceNm}</td>
								<td>${safetyList.safetyTime}</td>
								<td>${safetyList.safetyKidsCount}</td>
								<td>${safetyList.safetyHost}</td>
								<td>${safetyList.safetyExpenditureCost}</td>
								<td>${safetyList.safetyClosingDivision}</td>
								<td>${safetyList.safetyRegistrant}</td>
								<td>${safetyList.safetyRegistrationDate}</td>
								<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/SafetyModify?safetyExecutionCd=${safetyList.safetyExecutionCd}"><i class="fa fa-pencil"></i></a></td> <!-- 수정화면 -->
								<td><a class="btn btn-danger" href="${pageContext.request.contextPath}/SafetyRemove?safetyExecutionCd=${safetyList.safetyExecutionCd}"><i class="fa fa-trash"></i></a></td>
								
							</tr>
						</tbody>
					</c:forEach>
				</table>
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
