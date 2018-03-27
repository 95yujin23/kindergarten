<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap Core CSS -->
<link href="./resources/vendor/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="./resources/vendor/css/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="./resources/vendor/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="./resources/vendor/css/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="./resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">

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
<!-- content -->
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-3" style="display:inline; float:left">
			<div class="panel panel-default">
				<div class="panel-heading">
				<h2 class="page-header">일지설정</h2>
<table class="table table-hover">
	<thead>
		<tr>
		<th>일지자원코드</th>
		<th>일지명</th>
		</tr>
	</thead>
	
	<!--  -->
	<c:forEach var="reportDivision" items="${list}">
	<tbody>
		<tr>
			<td>${reportDivision.reportCd}</td>
			<td>${reportDivision.reportNm}</td>
		</tr>
	</tbody>
	</c:forEach>
</table>
				</div>
			</div>
		</div>
	</div>
	
	<div class="row">
		<div class="col-lg-3" style="display:inline; float:left">
			<div class="panel panel-default">
				<div class="panel-heading">
				<h2 class="page-header">일지설정</h2>
<table class="table table-hover">
	<thead>
		<tr>
		<th>일지자원코드</th>
		<th>일지명</th>
		</tr>
	</thead>
	
	<!--  -->
	<c:forEach var="reportDivision" items="${list}">
	<tbody>
		<tr>
			<td>${reportDivision.reportCd}</td>
			<td>${reportDivision.reportNm}</td>
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