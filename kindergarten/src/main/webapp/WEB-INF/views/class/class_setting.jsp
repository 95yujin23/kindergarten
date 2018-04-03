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

<title>반 현황</title>

<!-- Bootstrap Core CSS -->
<link href="./resources/vendor/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="./resources/vendor/css/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="./resources/vendor/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="./resources/vendor/css/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="./resources/vendor/fonts/font-awesome.min.css"
	rel="stylesheet" type="text/css">

</head>
<body>
	<div id="wrapper">

		<!-- TOP : Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
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
					
				<!-- reportdivision 메뉴 추가 -->
	<div>
	    <div>
	    	 <a href="#demo" class="btn btn-success" data-toggle="collapse"><i class="fa fa-plus" aria-hidden="true"></i></a>
	  			<div id="demo" class="collapse">
	    		<!-- 내용 -->
			<!-- 전송퐁 시작 -->	    
    		<form action="${pageContext.request.contextPath}/addKidsClass" method="POST">
		    		<div class="form-group col-xs-3">
	    				<div class="row">
						  <div class="col-xs-4">
						    <input type="text" class="form-control" placeholder=".col-xs-2">
						  </div>
						  <div class="col-xs-4">
						    <input type="text" class="form-control" placeholder=".col-xs-3">
						  </div>
						  <div class="col-xs-4">
						    <input type="text" class="form-control" placeholder=".col-xs-4">
						  </div>
						</div>
	    				<button type="submit" class="btn btn-primary btn-sm">추가</button>
	    			</div>	
		    </form>
		   </div>
			<!-- 전송폼 종료 -->
			<table class="table table-hover">
				<thead>

					<tr>
						<th>영유아반코드</th>
						<th>반이름</th>
						<th>반생성년도</th>
						<th>반영유아나이</th>

					</tr>
				</thead>
				<c:forEach var="kidsClassList" items="${list}">
					<tbody>
						<tr>

							<td>${kidsClassList.kidsClassCd}</td>
							<td>${kidsClassList.classNm}</td>
							<td>${kidsClassList.createDate}</td>
							<td>${kidsClassList.classKidsAge}</td>

						</tr>
					</tbody>
				</c:forEach>
			</table>

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
</html>