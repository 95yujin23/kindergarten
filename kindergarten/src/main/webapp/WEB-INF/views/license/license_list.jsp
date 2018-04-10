<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>라이센스 목록 화면</title>

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
			<h1 class="page-header">라이센스 조회</h1>
<%-- 			<form action="${pageContext.request.contextPath}/KidsList" method="post">
					<select name="keyword" class="form-control">
					<!-- 검색 조건을 검색 처리후 결과화면에 보여주기 위해 c:out 출력태그 사용 (삼항연산자) -->
					<option value="">전체보기</option>
					<option value="행복반">행복반</option>
					<option value="사랑반">사랑반</option>
					<option value="소망반">소망반</option>
					</select> 
					<button class="btn btn-success" type="submit" value="검색">검색</button>
				</form> --%>
				<table style="text-align: center;" class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>대표자명</th>
							<th>설립유형</th>
							<th>설립(개원)일</th>
							<th>홈페이지</th>
							<th>전화번호</th>
							<th>운영시간</th>
							<th>주소</th>
							<th>우편번호</th>
<!-- 						<th>수정</th>
							<th>삭제</th>
 -->						</tr>
					</thead>
					<c:forEach var="kindergarten" items="${list}">
						<tbody>
							<tr>
								<td>${kindergarten.kindergartenLeader}</td>
								<td>${kindergarten.kindergartenTypeOfFoundation}</td>
								<td>${kindergarten.kindergartenDateOfFoundation}</td>
								<td><a href="${kindergarten.kindergartenHomepage}">${kindergarten.kindergartenHomepage}</a></td>
								<td>${kindergarten.kindergartenPhone}</td>
								<td>${kindergarten.kindergartenOpenHour}</td>
								<td>${kindergarten.kindergartenAddress}</td>
								<td>${kindergarten.kindergartenPostCd}</td>
<%-- 							<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/KidsModify?kidsCd=${kidsList.kidsCd}"><i class="fa fa-pencil"></i></a></td>
								<td><a class="btn btn-danger" href="${pageContext.request.contextPath}/KidsRemove?kidsCd=${kidsList.kidsCd}"><i class="fa fa-trash"></i></a></td>
 --%>							</tr>
						</tbody>
					</c:forEach>
				</table>
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
</body>
</html>
