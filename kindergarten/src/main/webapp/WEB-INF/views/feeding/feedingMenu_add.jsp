<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>FeedingMenu Add</title>
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
			<h1 class="page-header">식단 등록</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				   식단 등록
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="addForm" action="${pageContext.request.contextPath}/FeedingMenuAdd" method="POST">
								<div class="form-group">
								    <label>식단일자</label>
								    <input class="form-control" type="date" id="menuDate" name="menuDate" placeholder="식단일자">
								</div>
								<div class="form-group">
								    <label>중식(열량/단백질)</label>
								    <input class="form-control" id="lunchCaloryProtein" name="lunchCaloryProtein" placeholder="중식(열량/단백질)">
								</div>
								<div class="form-group">
								    <label>오전간식</label>
								    <input class="form-control" id="morningSnack" name="morningSnack" placeholder="오전간식">
								</div>
								<div class="form-group">
								    <label>오후간식</label>
								    <input class="form-control" id="afternoonSnack" name="afternoonSnack" placeholder="오후간식">
								</div>
								<div class="form-group">
								    <label>원산지</label>
								    <input class="form-control" id="origin" name="origin" placeholder="원산지">
								</div>
								<div class="form-group">
								    <label>담당자</label>
								    <input class="form-control" id="menuManager" name="menuManager" placeholder="담당자">
								</div>	
												
								<button type="submit">등록</button>
							</form>
						</div>
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
</html></html>