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
			<h1 class="page-header">영유아 일지 목록</h1>
			
			<form action="${pageContext.request.contextPath}/reportSearch" method="post">
			유아 별 일지 검색
				<input type="text" id="kids_name">
			반 별 일지 검색
				<select name="classPointReport" >
				<option value='null'>--선택사항--</option>
				<!-- 반복문을 사용해서 데이터베이스 안에 있는 반을 모두 보여준다. -->
				<c:forEach var="classList" items="${kidsClass}">
					<option value="${classList.kidsClassCd}">${classList.classNm}</option>
				</c:forEach>
				</select>
				
			선생님 별 일지 검색
				<select name="teacherPointReport">
				<option value='null'>--선택사항--</option>
				<!-- 반복문을 사용해서 데이터베이스 안에 있는 선생님을 모두 보여준다. -->
					<c:forEach var="teacherList" items="${teacher}">
					<option value="${teacherList.teacherCd}">${teacherList.teacherNm}</option>
				</c:forEach>
				</select>
			일지 항목 별 검색
				<select name="reportPointList">
				<!-- 반복문을 사용해서 데이터베이스 안에 있는 일지항목을 모두 보여준다. -->
				<option value='null'>--선택사항--</option>
				<c:forEach var="reportDivisionList" items="${division}">
					<option value="${reportDivisionList.reportCd}">${reportDivisionList.reportNm}</option>
				</c:forEach>
				</select>
				<button class="btn btn-success" type="submit" value="검색">검색</button>
			</form>
<table border=1>
	<thead>
		
		<tr>
		<th>일지코드</th>
		<th>일지명</th>
		<th>유아명</th>
		<th>반이름</th>
		<th>담당자</th>
		<th>등록날짜</th>
		</tr>
	</thead>
	<c:forEach var="kidsReport" items="${list}">
		<tbody>
			<tr>
				
				<td>${kidsReport.kidsReportCd}</td>
				<td>${kidsReport.reportNm}</td>
				<td>${kidsReport.kidsNm}</td>
				<td>${kidsReport.classNm}</td>
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