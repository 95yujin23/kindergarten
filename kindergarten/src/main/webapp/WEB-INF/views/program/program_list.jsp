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
		$('#searchButton').click(function(){
				$('#searchForm').submit();
		})
	})
</script>
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
			<h2>특별활동 목록</h2>
			<!-- 검색처리 시작 -->
			<form action="${pageContext.request.contextPath}/ProgramList?searchOption=${searchOption}&keyword=${keyword}" method="get" id="searchForm" class="form-inline">
				<select name="searchOption">
					<option value="PROGRAM_NM">특별활동이름</option>
					<option value="PROGRAM_CLOSING_DIVISION">마감유무</option>
					<option value="PROGRAM_REGISTRANT">등록인</option>
				</select>
				<div class="input-group">
					<input id="keyword" name="keyword" type="text" class="form-control" placeholder="Search">
					<div class="input-group-btn">
						<button id="searchButton" type="button" class="btn btn-info"><i class="fa fa-search"></i></button>
					</div>
				</div>
			</form>
			<!-- 검색처리 끝 -->
			<table class="table table-hover">
				<thead>
					<tr>
						<th>특별활동프로그램명</th>
						<th>주당운영횟수(회)</th>
						<th>1회운영시간(분)</th>
						<th>외주금액</th>
						<th>마감유무</th>
						<th>계약코드</th>
						<th>등록날짜</th>
						<th>등록인</th>
						<th>수정</th>
						<th>삭제</th>
					</tr>
				</thead>
				<c:forEach var="program" items="${list}">
					<tbody>
					<tr>
						<td>${program.programNm}</td>							
						<td>${program.programNumberWeek}</td>
						<td>${program.programOperationTime}</td>
						<td>${program.programClosingCd}</td>
						<td>${program.programClosingDivision}</td>
						<td>${program.contractCd}</td>
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