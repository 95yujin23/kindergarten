<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Kindergarten Total Management System</title>

<!-- Bootstrap Core CSS -->
<link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="resources/vendor/css/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="resources/vendor/css/sb-admin-2.css" rel="stylesheet">

<!-- Bootstrap Social CSS -->
<link href="resources/vendor/css/bootstrap-social.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">

<link rel="shortcut icon" href="resources/vendor/image/favicon.ico" type="image/x-icon">
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
		<br>
			<div class="col-lg-12">
				<div class="panel panel-default">
				<!-- 프로젝트 소개 목록 시작 -->
					<div class="panel-heading">
					<h1 class="page-header">프로젝트 소개</h1>
					</div>
					 <!-- /.panel-heading -->
					<div class="panel-body">
						<!-- Nav tabs -->
						<ul class="nav nav-tabs">
						    <li class="active"><a href="#home" data-toggle="tab">주제</a>
						    </li>
						    <li><a href="#profile" data-toggle="tab">목표</a>
						    </li>
						    <li><a href="#messages" data-toggle="tab">기대효과</a>
						    </li>
						    <li><a href="#settings" data-toggle="tab">개발환경</a>
						    </li>
		       			</ul>
		       	<!-- 프로젝트 소개 목록 끝-->
		       	
	       		<!-- 프로젝트 소개 시작 -->
					<div class="tab-content">
					<!-- 프로젝트 소개 1. 주제 -->
						<div class="tab-pane fade in active" id="home">
						<h3>주제</h3>
							<p><h3>영유아 교육기관 통합 관리 시스템 (Kindergarten Total Management System) &nbsp;
							<a href="${pageContext.request.contextPath}/Login" class="btn btn-app"><i class="fa fa-play"></i>프로젝트 시작</a>
							</h3>
							</p>
						</div>
					<!-- 프로젝트 소개 2. 목표 -->
						<div class="tab-pane fade" id="profile">
		                <h3>목표</h3>
		                	<p>영유아 교육기관의 업무 부담 감소로 인한 교육의 질적 향상 도모</p>
            			</div>
            		<!-- 프로젝트 소개 3. 기대효과 -->
						<div class="tab-pane fade" id="messages">
			 			<h3>기대효과</h3>
							<p><table class="table">
									<tbody>
										<tr>
											<td>1</td>
											<td>지면서류로 이루어지는 여러 작업을 하나의 시스템으로 통합 해 업무 시간을 단축한다.</td>
										</tr>
										<tr>
											<td>2</td>
											<td>유치원 현황 정보를 시스템 내에서 즉각 확인함으로써 편리함과 동시에 원할한 관리가 가능해진다.</td>
										</tr>
										<tr>
											<td>3</td>
											<td>교육부 지정 유아 교육기관 평가 인증 대비에 도움을 준다.</td>
										</tr>
									</tbody>
								</table>
							</p>
						</div>
					<!-- 프로젝트 소개 4. 개발환경 -->
						<div class="tab-pane fade" id="settings">
						<h3>개발환경</h3>
							<p><table class="table table-striped">
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
							</p>
						</div>
					</div>
				<!-- 프로젝트 소개 끝 -->
				</div>
			</div>
		</div>
	</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h2>프로젝트 관련 자료</h2>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-striped">
								<tbody>
									<tr>
										<td><strong>GITHUB</strong></td>
										<td><a href="https://github.com/hanboa1026/kindergarten.git"
										 	class="btn btn-social btn-github">
										<i class="fa fa-github"></i> https://github.com/hanboa1026/kindergarten.git </a></td>
									</tr>
									<tr>
										<td><strong>ERD</strong></td>
										<td><a class="btn btn-default" href="/resources/img/ERD_logical.png">논리ERD</a><b></b>
										<a class="btn btn-default" href="/resources/img/ERD_physical.png">물리ERD</a></td>
									</tr>
									<tr>
										<td><strong>DOCUMENT</strong></td>
										<td><a class="btn btn-danger" id="filedown">개발문서 다운로드</a></td>
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
