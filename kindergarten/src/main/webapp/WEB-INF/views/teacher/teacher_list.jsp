<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>교직원 목록 화면</title>

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
			<h1 class="page-header">교직원 목록</h1>
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>교직원 이름</th>
							<th>생년월일</th>
							<th>연락처</th>
							<th>전자우편</th>
							<th>자택 주소</th>
							<th>입사일</th>
							<th>직급</th>
							<th>호봉</th>
							<th>수정</th>
							<th>삭제</th>
						</tr>
					</thead>
					<c:forEach var="teacherList" items="${list}">
						<tbody>
							<tr>
								<td>${teacherList.teacherNm}</td>
								<td>${teacherList.teacherDateOfBirth}</td>
								<td>${teacherList.teacherPhone}</td>
								<td>${teacherList.teacherEmail}</td>
								<td>${teacherList.teacherAddress}</td>
								<td>${teacherList.teacherEntryDate}</td>
								<td>${teacherList.teacherPosition}</td>
								<td>${teacherList.teacherPayStep}</td>
								<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/TeacherModify?teacherCd=${teacherList.teacherCd}"><i class="fa fa-pencil"></i></a></td> <!-- 수정화면 -->
								<td><a class="btn btn-danger" href="${pageContext.request.contextPath}/TeacherRemove?teacherCd=${teacherList.teacherCd}"><i class="fa fa-trash"></i></a></td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
				<div class="dataTables_paginate paging_simple_numbers" id="dataTables-example_paginate">
		<ul class="pagination justify-content-center">
			<c:set var="currentPage" value="${currentPage}"/>
			<c:set var="countPage" value="${countPage}"/>
			<c:choose>
				<c:when test="${currentPage eq 1}">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/TeacherList?currentPage=${currentPage}" aria-label="Previous">
						<span aria-hidden="true">&laquo;</span>
						<span class="sr-only">Previous</span>
						</a>
					</li>
				</c:when>
				<c:when test="${currentPage ne 1}">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/TeacherList?currentPage=${currentPage-1}" aria-label="Previous">
						<span aria-hidden="true">&laquo;</span>
						<span class="sr-only">Previous</span>
						</a>
					</li>
				</c:when>
			</c:choose>
			<c:forEach var="i" begin="1" end="${countPage}" step="1">
				<li class="page-item">
					<a class="page-link" href="${pageContext.request.contextPath}/TeacherList?currentPage=${i}">
						${i}
					</a>
				</li>
			</c:forEach>
			<c:choose>
				<c:when test="${currentPage eq countPage}">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/TeacherList?currentPage=${currentPage}" aria-label="Next">
							<span aria-hidden="true">&raquo;</span>
							<span class="sr-only">Next</span>
						</a>
					</li>
				</c:when>
				<c:when test="${currentPage ne countPage}">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/TeacherList?currentPage=${currentPage+1}" aria-label="Next">
							<span aria-hidden="true">&raquo;</span>
							<span class="sr-only">Next</span>
						</a>
					</li>
				</c:when>
			</c:choose>
		</ul>
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
