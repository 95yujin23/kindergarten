<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>영유아 일지 목록</title>

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
			<h1 class="page-header">영유아 목록</h1>
			
<table border=1>
	<thead>
		<tr>
			<th>영유아일지코드</th>
			<th>일지자원코드</th>
			<th>영유아일지구분코드</th>
			<th>영유아코드</th>
			<th>유치원라이센스</th>
			<th>일지주제</th>
			<th>일지소주제</th>
			<th>날씨</th>
			<th>목표</th>
			<th>관찰_영유아관찰내용</th>
			<th>상담_보호자명</th>
			<th>상담_교사의견</th>
			<th>상담_부모의견</th>
			<th>상담_상담방법</th>
			<th>보육_활동계획방법</th>
			<th>보육_평가</th>
			<th>등록인</th>
			<th>등록날짜</th>
		</tr>
	</thead>
	<c:forEach var="kidsReport" items="${list}">
		<tbody>
			<tr>
				<td>${kidsReport.kidsReportCd}</td>
				<td>${kidsReport.reportResourceCd}</td>
				<td>${kidsReport.reportCd}</td>
				<td>${kidsReport.kidsCd}</td>
				<td>${kidsReport.licenseKindergarten}</td>
				<td>${kidsReport.title}</td>
				<td>${kidsReport.subTitle}</td>
				<td>${kidsReport.weather}</td>
				<td>${kidsReport.objective}</td>
				<td>${kidsReport.observeContent}</td>
				<td>${kidsReport.parentNm}</td>
				<td>${kidsReport.teacherOpinion}</td>
				<td>${kidsReport.journalType}</td>
				<td>${kidsReport.plans}</td>
				<td>${kidsReport.evaluation}</td>
				<td>${kidsReport.registrant}</td>
				<td>${kidsReport.registrationDate}</td>
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