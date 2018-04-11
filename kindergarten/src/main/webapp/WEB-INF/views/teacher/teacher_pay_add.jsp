<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>교직원 인건비 등록</title>

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
			<h1 class="page-header">교직원 인건비 등록</h1>
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
							<form id="addForm" name=form action="${pageContext.request.contextPath}/TeacherPayAdd" method="POST">
								<div class="form-group">
								    <label>교직원 이름</label>
								    <select name="teacherCd" class="form-control">
									<option value="" <c:out value=""/>>이름</option>
									<c:forEach var="teacher" items="${list}">
									<!-- list에 담긴 teacher List를 반복문이 끝날 때까지 출력 
										value값은 teacherCd -> teacherCd를 가지고 해당 교직원의 인건비를 등록함
										teacherNm은 화면에 보여줄 것, 선택 시에 코드를 보고 누군지 알수 없으므로-->
									<option value="${teacher.teacherCd}" <c:out value="${teacherCd}"/>>${teacher.teacherNm}</option>
									</c:forEach>
									</select>
								</div>
								<div class="form-group">
								    <label>지급할 금액</label>
								    <input class="form-control" id="payPayment" name="payPayment"  type="text" name="A_EMONEY" placeholder="지급금액(단위:원)" 
								    		onkeypress="NUM_HAN(this.value, 3, document.form.EMONEY_HAN)" 
								   			onkeyup="this.value=numchk(this.value);NUM_HAN(this.value, 3, document.form.EMONEY_HAN)">
								   			&nbsp; <input type="text" name="EMONEY_HAN" readonly style="border:0;" size="50">
								</div>
								<div class="form-group">
								    <label>등록인</label>
								    <input class="form-control" id="payRegistrant" name="payRegistrant" placeholder="등록인">
								</div>
								<button type="submit">등록</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</div>
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

	<!-- Money JavaScript -->
	<script src="resources/vendor/js/money.js"></script>
	
</body>
</html>
