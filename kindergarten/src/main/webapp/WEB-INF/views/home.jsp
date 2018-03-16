<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Bootstrap Admin Theme</title>

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
	<c:import url="./inc/top.jsp"></c:import>
	<!-- TOP -->

	<!-- LEFT : Navigation -->
	<c:import url="./inc/left.jsp"></c:import>
	<!-- LEFT -->
	</nav>
</div>
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h5><strong>프로젝트 주제</strong></h5>
					<h3>
						영유아 교육기관 통합 관리 시스템 (Kindergarten Total Management System) &nbsp;
						<a href="/start" class="btn btn-app"><i class="fa fa-play"></i> 프로젝트 시작 </a>
					</h3>
				</div>
		</div>
			
			<div class="row">
				<div class="col-lg-12 col-md-12">
					<div class="panel">
						<div class="panel-heading">
							<div class="row">
								<div class="col-xs-12">
								<h2>프로젝트 목표</h2>
								<div class="clearfix"></div>
								</div>
								<div class="col-xs-12">
				
									<div>--</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="col-lg-12 col-md-12">
					<div class="panel">
						<div class="panel-heading">
							<div class="row">
								<div class="col-xs-12">
									<h2>기대효과</h2>
									<div class="clearfix"></div>
								</div>
								<div class="col-xs-12 ">
								<table class="table">
							<tbody>
								<tr>
									<td>1</td>
									<td>---</td>
								</tr>
								<tr>
									<td>2</td>
									<td>---</td>
								</tr>
								<tr>
									<td>3</td>
									<td>---</td>
								</tr>
							</tbody>
						</table>
								</div>
							</div>
						</div>
	
					</div>
				</div>
		<div class="col-lg-12 col-md-12">
		<div class="panel">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-12">
						<h2>개발환경</h2>
						<div class="clearfix"></div>
					</div>
					<div class="col-xs-12 ">
								<table class="table">
							<tbody>
								<tr>
									<td><strong>OS</strong></td>
									<td>Windows 10</td>
								</tr>
								<tr>
									<td><strong>Web Browser</strong></td>
									<td>Chrome</td>
								</tr>
								<tr>
									<td><strong>WAS</strong></td>
									<td>apache-tomcat 8.0</td>
								</tr>
								<tr>
									<td><strong>DB</strong></td>
									<td>MySQL 5.5.17</td>
								</tr>
								<tr>
									<td><strong>DB Tool</strong></td>
									<td>HeidiSQL 9.5.0</td>
								</tr>
								<tr>
									<td><strong>Development Tool</strong></td>
									<td>Spring Tool Suite 3.9.0</td>
								</tr>
								<tr>
									<td><strong>Plan Management Tool</strong></td>
									<td>Trello</td>
								</tr>
								<tr>
									<td><strong>Language</strong></td>
									<td>Java 1.8, Javascript, JSP, HTML 5</td>
								</tr>
								<tr>
									<td><strong>Framework</strong></td>
									<td>jQuery 2.2.4, Json, Ajax, Mybatis 3.4.5, bootStrap
										3.3.6, Spring 4.3.12, Maven 2.5.1, tiles 3.0.5</td>
								</tr>
								<tr>
									<td><strong>API</strong></td>
									<td>JSTL 1.2, EL, Gson 2.8.0, Log4j 1.2.15, Mybatis-Spring
										1.3.1, Datatables, chart.js 2.7.1, Kakao 우편번호</td>
								</tr>
							</tbody>
						</table>
								</div>
		
		</div>
		</div>
			</div>
			<div class="col-lg-12 col-md-12">		
			<div class="panel">
					<div class="panel-heading">
						<h2>프로젝트 관련 자료</h2>
						<div class="clearfix"></div>
					</div>
					<div class="panel-content">
						<table class="table">
							<tbody>
								<tr>
									<td></td>
									<td>▼ 클릭하세요 ▼</td>
								</tr>
								<tr>
									<td><strong>GITHUB 주소</strong></td>
									<td><a href="https://github.com/hanboa1026/kindergarten.git">
											https://github.com/hanboa1026/kindergarten.git </a></td>
								</tr>
								<tr>
									<td><strong>ERD</strong></td>
									<td><a href="/resources/img/ERD_logical.png">논리ERD</a> / <a
										href="/resources/img/ERD_physical.png">물리ERD</a></td>
								</tr>
								<tr>
									<td><strong>개발문서</strong></td>
									<td><a id="filedown">개발문서 다운로드</a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			</div>
			</div>
</div>
	<!-- FOOTER : Navigation -->
	<c:import url="./inc/footer.jsp"></c:import>
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
<script>
	$(document).ready(function() {
		$(document).on('click', '#filedown', function(e) {
			var answer = confirm("다운로드 하시겠습니까 ?")
			if (answer) {
				 e.preventDefault();
		         window.open("/resources/files/CafeSystem.docx", "_blank");
			}
		});
	});
</script>
</body>
</html>
