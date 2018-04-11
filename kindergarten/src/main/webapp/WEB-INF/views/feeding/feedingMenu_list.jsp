<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>식단 목록 화면</title>

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
	<c:import url="../inc/top.jsp"></c:import>
	<!-- TOP -->

	<!-- LEFT : Navigation -->
	<c:import url="../inc/left.jsp"></c:import>
	<!-- LEFT -->
</div>
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
			<div class="panel-heading">
			<h1 class="page-header">식단 목록</h1>
			</div>
			<div class="panel-body">
			<form class="form-inline">
				<input class="form-control" id="search" type="text" placeholder="Search..">
			</form>
			 <br>
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
						<th>식단일자</th>
						<th>중식(열량/단백질)</th>
						<th>오전간식</th>
						<th>오후간식</th>
						<th>원산지</th>
						<th>담당자</th>
						<th>수정</th>
						<th>삭제</th>						
					</tr>
				</thead>
				<c:forEach var="feme" items="${list}">
					<tbody id="feedingMenuTable" >
						<tr>
							<td>${feme.menuDate}</td>
							<td>${feme.lunchCaloryProtein}</td>
							<td>${feme.morningSnack}</td>
							<td>${feme.afternoonSnack}</td>
							<td>${feme.origin}</td>
							<td>${feme.menuManager}</td>
							<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/feeding/feedingMenu_modify?feedingMenuCd=${feme.feedingMenuCd}"><i class="fa fa-pencil"></i></a></td>
							<td><a class="btn btn-danger" href="${pageContext.request.contextPath}/FeedingMenuDelete?feedingMenuCd=${feme.feedingMenuCd}"><i class="fa fa-trash"></i></a></td>
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
									<a class="page-link" href="${pageContext.request.contextPath}/FeedingMenuList?currentPage=${currentPage}" aria-label="Previous">
									<span aria-hidden="true">&laquo;</span>
									<span class="sr-only">Previous</span>
									</a>
								</li>
							</c:when>
							<c:when test="${currentPage ne 1}">
								<li class="page-item">
									<a class="page-link" href="${pageContext.request.contextPath}/FeedingMenuList?currentPage=${currentPage-1}" aria-label="Previous">
									<span aria-hidden="true">&laquo;</span>
									<span class="sr-only">Previous</span>
									</a>
								</li>
							</c:when>
						</c:choose>
						<c:forEach var="i" begin="1" end="${countPage}" step="1">
							<li class="page-item">
								<a class="page-link" href="${pageContext.request.contextPath}/FeedingMenuList?currentPage=${i}">
									${i}
								</a>
							</li>
						</c:forEach>
						<c:choose>
							<c:when test="${currentPage eq countPage}">
								<li class="page-item">
									<a class="page-link" href="${pageContext.request.contextPath}/FeedingMenuList?currentPage=${currentPage}" aria-label="Next">
										<span aria-hidden="true">&raquo;</span>
										<span class="sr-only">Next</span>
									</a>
								</li>
							</c:when>
							<c:when test="${currentPage ne countPage}">
								<li class="page-item">
									<a class="page-link" href="${pageContext.request.contextPath}/FeedingMenuList?currentPage=${currentPage+1}" aria-label="Next">
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
	<script>
	$(document).ready(function(){
	  $("#search").on("keyup", function() {
	    var value = $(this).val().toLowerCase();
	    $("#feedingMenuTable tr").filter(function() {
	      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
	    });
	  });
	});
	</script>
</body>
</html>
