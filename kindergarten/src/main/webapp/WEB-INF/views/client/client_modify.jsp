<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Client Modify</title>
<link href="../resources/vendor/css/bootstrap.min.css" rel="stylesheet">
<!-- MetisMenu CSS -->
<link href="../resources/vendor/css/metisMenu.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="../resources/vendor/css/sb-admin-2.css" rel="stylesheet">
<!-- Morris Charts CSS -->
<link href="../resources/vendor/css/morris.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="../resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
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
			<h1 class="page-header">거래처 수정</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				   거래처 수정
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="addForm" action="${pageContext.request.contextPath}/client/client_modify" method="POST">
								<input type="hidden" value="${client.clientCd}" name="clientCd">
								<div class="form-group">
								    <label>거래처구분</label>
								   	<select class="form-control" name="clientType">
								   		<option value="특별활동">특별활동</option>
								   		<option value="급식">급식</option>
								   		<option value="조경">조경</option>
								   		<option value="렌트카">렌트카</option>
								   		<option value="보험">보험</option>				
								   	</select>
								</div>
								<div class="form-group">
								    <label>거래처이름</label>
								    <input class="form-control" id="clientNm" name="clientNm" value="${client.clientNm}" placeholder="거래처이름">
								</div>
								<div class="form-group">
								    <label>연락망</label>
								    <input class="form-control" id="clientPhone" name="clientPhone" value="${client.clientPhone}" placeholder="연락망">
								</div>										
								<div class="form-group">
								    <label>거래처 담당자</label>
								    <input class="form-control" id="clientManager" name="clientManager" value="${client.clientManager}" placeholder="거래처 담당자">
								</div>
								<div class="form-group">
								    <label>거래처 주소</label>
								    <input class="form-control" id="clientAddress" name="clientAddress" value="${client.clientAddress}" placeholder="거래처 주소">
								</div>
								<div class="form-group">
								    <label>등록인</label>
								    <input class="form-control" id="clientRegistrant" name="clientRegistrant" value="${client.clientRegistrant}" placeholder="등록인">
								</div>
										
								<button type="submit">수정</button>
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
</html>