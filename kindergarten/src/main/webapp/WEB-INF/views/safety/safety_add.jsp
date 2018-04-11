<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>안전교육및점검 등록</title>

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
		<div class="col-lg-12">
			<h1 class="page-header">안전 교육 및 점검 등록</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				    교직원에게 지급한 인건비를 등록해주세요
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="addForm" action="${pageContext.request.contextPath}/TeacherPayAdd" method="POST">
								<div class="form-group">
								    <label>구분</label>
								    <input class="form-control" id="safetyDivision" name="safetyDivision" placeholder="교육 또는 안전">
								</div>
								<div class="form-group">
								    <label>주제</label>
								    <select name="totalResourceCd" class="form-control">
									<option value="" <c:out value=""/>>안전교육 및 점검 주제</option>
									<c:forEach var="totalResource" items="${list}">
									<!-- list에 담긴 teacher List를 반복문이 끝날 때까지 출력 
										value값은 totalResourceCd -> totalResourceCd를 가지고 해당 안전실행을 등록함
										teacherNm은 화면에 보여줄 것, 선택 시에 코드를 보고 누군지 알수 없으므로-->
									<option value="${totalResource.totalResourceCd}" <c:out value="${totalResourceCd}"/>>${totalResource.resourceGroupNm},${totalResource.resourceNm}</option>
									</c:forEach>
									</select>
								</div>
								<div class="form-group">
								    <label>실행시간</label>
								    <input class="form-control" id="safetyTime" name="safetyTime" placeholder="시간(분)">
								</div>
								<div class="form-group">
								    <label>영유아(명)</label>
								    <input class="form-control" id="safetyKidsCount" name="safetyKidsCount" placeholder="실시아동수(명)">
								</div>
								<div class="form-group">
								    <label>주최</label>
								    <input class="form-control" id="safetyHost" name="safetyHost" placeholder="자체 또는 위탁">
								</div>
								<div class="form-group">
								    <label>비용</label>
								    <input class="form-control" id="safetyExpenditureCost" name="safetyExpenditureCost" placeholder="지급금액(단위:원)">
								</div>
								<div class="form-group">
								    <label>등록인</label>
								    <input class="form-control" id="safetyRegistrant" name="safetyRegistrant" placeholder="등록인">
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
</html>
