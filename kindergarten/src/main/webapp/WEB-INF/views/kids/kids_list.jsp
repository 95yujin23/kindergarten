<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>영유아 목록 화면</title>

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
			<h1 class="page-header">편성반이 없는 모든 영유아 목록</h1>
			<form action="${pageContext.request.contextPath}/KidsList" method="post">
					<select name="keyword" class="form-control">
					<!-- 검색 조건을 검색 처리후 결과화면에 보여주기 위해 c:out 출력태그 사용 (삼항연산자) -->
					<option value="">전체보기</option>
					<option value="행복반">행복반</option>
					<option value="사랑반">사랑반</option>
					<option value="소망반">소망반</option>
					</select> 
					<button class="btn btn-success" type="submit" value="검색">검색</button>
				</form>
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>이름</th>
							<th>생년월일</th>
							<th>주소</th>
							<th>보호자연락처</th>
							<th>보호자예비연락처</th>
							<th>성별</th>
							<th>통학방법</th>
							<th>주의사항</th>
							<th>입학날짜</th>
							<th>졸업날짜</th>
							<th>수정</th>
							<th>삭제</th>
						</tr>
					</thead>
					<c:forEach var="kidsList" items="${list}">
						<tbody>
							<tr>
								<td>${kidsList.kidsNm}</td>
								<%-- <td><img src="${pageContext.request.contextPath}/resources/upload/kids/e950bf0e-7b47-4248-95e7-3d8eac06ab29.jpg"></td> --%>
								<!-- 영유아코드별로 사진받아오기 -->
								<td>${kidsList.kidsDateOfBirth}</td>
								<td>${kidsList.kidsAddress}</td>
								<td>${kidsList.kidsParentPhone}</td>
								<td>${kidsList.kidsSparePhone}</td>
								<td>${kidsList.kidsGender}</td>
								<td>${kidsList.kidsCommutingType}</td>
								<td>${kidsList.kidsCaution}</td>
								<td>${kidsList.kidsAdmission}</td>
								<td>${kidsList.kidsGraduation}</td>
								<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/KidsModify?kidsCd=${kidsList.kidsCd}"><i class="fa fa-pencil"></i></a></td>
								<td><a class="btn btn-danger" href="${pageContext.request.contextPath}/KidsRemove?kidsCd=${kidsList.kidsCd}"><i class="fa fa-trash"></i></a></td>
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
