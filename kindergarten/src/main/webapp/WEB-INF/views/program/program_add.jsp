<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Program Insert</title>
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
<!-- jQuery -->
<script src="resources/vendor/js/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$('#ProgramAddButton').click(function() {
			$('#ProgramAddForm').submit();
		})
	})
</script>
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
				<h1 class="page-header">특별활동 등록</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
					   특별활동 등록
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-6">
								<form id="ProgramAddForm" action="${pageContext.request.contextPath}/ProgramAdd" method="post">
									<div class="form-group">
									    <label>통합자원코드</label>
									    <select name="totalResourceCd" class="form-control">
											<c:forEach var="resource" items="${resource}">
												<option value="${resource.totalResourceCd}">${resource.resourceNm}</option>
											</c:forEach>
										</select>
									</div>
									<div class="form-group">
									    <label>특별활동프로그램명</label>
									    <input class="form-control" type="text" name="programNm" placeholder="특별활동프로그램명">
									</div>
									<div class="form-group">
									    <label>주당운영횟수(회)</label>
									    <select class="form-control" name="programNumberWeek">
											<option value=1>1회</option>
											<option value=2>2회</option>
											<option value=3>3회</option>
											<option value=4>4회</option>
											<option value=5>5회</option>
										</select>
									</div>
									<div class="form-group">
									    <label>1회운영시간(분)</label>
									    <select class="form-control" name="programOperationTime">
											<option value=10>10분</option>
											<option value=20>20분</option>
											<option value=30>30분</option>
											<option value=40>40분</option>
											<option value=50>50분</option>
										</select>
									</div>
									<div class="form-group">
									    <label>외주금액</label>
									    <input class="form-control" type="number" name="programOutsourcingCost" placeholder="외주금액">
									</div>
									<div class="form-group">
									    <label>마감회계_지출특별활동비</label>
										<input class="form-control" type="text" name="programClosingCd" placeholder="예) 201803">								
									</div>
									<div class="form-group">
									    <label>마감유무</label>
									    <select class="form-control" name="programClosingDivision">
											<option value="마감전">마감전</option>
											<option value="마감완료">마감완료</option>
										</select>
									</div>
									<div class="form-group">
									    <label>계약코드</label>
									    <select class="form-control" name="contractCd">
											<c:forEach var="contract" items="${contract}">
												<option value="${contract.contractCd}">${contract.contractType}:${contract.contractContents}</option>
											</c:forEach>
										</select>
									</div>
									<div class="form-group">
									    <label>등록인</label>
									    <input class="form-control" type="text" name="programRegistrant" placeholder="등록인">
									</div>
									<button class="btn btn-default" id="ProgramAddButton" type="button">등록</button>
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