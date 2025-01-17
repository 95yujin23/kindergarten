<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Program List</title>
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
<!-- jQuery -->
<script src="resources/vendor/js/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#search").on("keyup", function() {
			var value = $(this).val().toLowerCase();
			$("#programTable tr").filter(function() {
				$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
			});
		});
	});
</script>
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
						<h1 class="page-header">특별활동 목록</h1>
					</div>
				</div>
				<div class="panel-body">
					<!-- 검색처리 시작 -->
					<form class="form-inline" style="float: left;">
						<input class="form-control" id="search" type="text" placeholder="Search..">
					</form>
					<!-- 검색처리 끝 -->
					<table class="table table-hover">
						<thead>
							<tr>
								<th>통합자원코드</th>
								<th>특별활동프로그램명</th>
								<th>주당운영횟수(회)</th>
								<th>1회운영시간(분)</th>
								<th>외주금액</th>
								<th>마감유무</th>
								<th>계약내용</th>
								<th>등록날짜</th>
								<th>등록인</th>
								<th>수정</th>
								<th>삭제</th>
							</tr>
						</thead>
						<c:forEach var="program" items="${list}">
							<tbody id="programTable">
							<tr>
								<td>${program.resourceNm}</td>
								<td>${program.programNm}</td>							
								<td>${program.programNumberWeek}</td>
								<td>${program.programOperationTime}</td>
								<td>${program.programClosingCd}</td>
								<td>${program.programClosingDivision}</td>
								<td>${program.contractContents}</td>
								<td>${program.programRegistrationDate}</td>
								<td>${program.programRegistrant}</td>
								<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/ProgramModify?programCd=${program.programCd}"><i class="fa fa-pencil"></i></a></td>
								<td><a class="btn btn-danger" href="${pageContext.request.contextPath}/ProgramDelete?programCd=${program.programCd}"><i class="fa fa-trash"></i></a></td>
							</tr>
						</tbody>
						</c:forEach>
					</table>
					<!-- 페이징 시작 -->
					<nav aria-label="Page navigation example">
						<ul class="pagination justify-content-center">
							<c:forEach var="i" begin="1" end="${countPage}" step="1">
								<li class="page-item">
									<a class="page-link" href="${pageContext.request.contextPath}/ProgramList?currentPage=${i}">${i}</a>
								</li>
							</c:forEach>
						</ul>
					</nav>
					<!-- 페이징 끝 -->
				</div>
			</div>
		</div>
	</div>	
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
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