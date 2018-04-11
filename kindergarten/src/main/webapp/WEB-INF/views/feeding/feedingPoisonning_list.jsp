<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>식중독 현황 목록 화면</title>

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
			<h1 class="page-header">식중독현황 목록</h1>
			</div>
			<div class="panel-body">
			<form class="form-inline">
				<input class="form-control" id="search" type="text" placeholder="Search..">
			</form>
			 <br>
				<table class="table table-striped table-bordered table-hover">
					<thead>
					<tr>
						<th>식중독종류</th>					
						<th>월별급식코드</th>
						<th>발생일자</th>
						<th>전체아동수</th>
						<th>발생아동수</th>
						<th>처리결과</th>
						<th>등록날짜</th>
						<th>등록인</th>
						<th>수정</th>
						<th>삭제</th>						
					</tr>
				</thead>
				<c:forEach var="fepo" items="${list}">
					<tbody id="feedingPoisonningTable">
						<tr>
							<td>${fepo.fopoFoodPoisonningKids}</td>
							<td>${fepo.feedingMonthlyCd}</td>
							<td>${fepo.fepoGenerationDate}</td>
							<td>${fepo.fopoWholeKidsCount}</td>
							<td>${fepo.fopoGeneratedKidsCount}</td>
							<td>${fepo.fopoProcessingResult}</td>
							<td>${fepo.fopoRegistrationDate}</td>
							<td>${fepo.registrant}</td>
							<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/feeding/feedingPoisonning_modify?foodPoisonningGenerationCd=${fepo.foodPoisonningGenerationCd}"><i class="fa fa-pencil"></i></a></td>
							<td><a class="btn btn-danger" href="${pageContext.request.contextPath}/FeedingPoisonningDelete?foodPoisonningGenerationCd=${fepo.foodPoisonningGenerationCd}"><i class="fa fa-trash"></i></a></td>
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
									<a class="page-link" href="${pageContext.request.contextPath}/FeedingPoisonningList?currentPage=${currentPage}" aria-label="Previous">
									<span aria-hidden="true">&laquo;</span>
									<span class="sr-only">Previous</span>
									</a>
								</li>
							</c:when>
							<c:when test="${currentPage ne 1}">
								<li class="page-item">
									<a class="page-link" href="${pageContext.request.contextPath}/FeedingPoisonningList?currentPage=${currentPage-1}" aria-label="Previous">
									<span aria-hidden="true">&laquo;</span>
									<span class="sr-only">Previous</span>
									</a>
								</li>
							</c:when>
						</c:choose>
						<c:forEach var="i" begin="1" end="${countPage}" step="1">
							<li class="page-item">
								<a class="page-link" href="${pageContext.request.contextPath}/FeedingPoisonningList?currentPage=${i}">
									${i}
								</a>
							</li>
						</c:forEach>
						<c:choose>
							<c:when test="${currentPage eq countPage}">
								<li class="page-item">
									<a class="page-link" href="${pageContext.request.contextPath}/FeedingPoisonningList?currentPage=${currentPage}" aria-label="Next">
										<span aria-hidden="true">&raquo;</span>
										<span class="sr-only">Next</span>
									</a>
								</li>
							</c:when>
							<c:when test="${currentPage ne countPage}">
								<li class="page-item">
									<a class="page-link" href="${pageContext.request.contextPath}/FeedingPoisonningList?currentPage=${currentPage+1}" aria-label="Next">
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
	    $("#feedingPoisonningTable tr").filter(function() {
	      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
	    }); 
	  });
	});
	</script>
</body>
</html>
