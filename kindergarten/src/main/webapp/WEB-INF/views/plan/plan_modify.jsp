<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Plan Detail</title>
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
		$('#PlanModifyButton').click(function() {
			$('#PlanModifyForm').submit();
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
				<h1 class="page-header">계획안 수정</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
					   계획안 수정
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-6">
								<form id="PlanModifyForm" action="${pageContext.request.contextPath}/PlanModify" method="post">
									<input type="hidden" name="planCd" value="${plan.planCd}">
									<div class="form-group">
										<label>계획안명</label>
										<input class="form-control" name="planNm" value="${plan.planNm}">
									</div>
									<div class="form-group">
										<label>계획안 카테고리</label>
										<span class="form-control">${planCategory.cateNm}</span>						    
									</div>
									<div class="form-group">
										<label>영유아반</label>
										<span class="form-control">${kidsClass.classNm}</span>
									</div>
									<div class="form-group">
										<label>연,월,주,일 설정</label>
										<select class="form-control" name="planYMWDSet">
											<option value="연간">연간</option>
											<option value="월간">월간</option>
											<option value="주간">주간</option>
											<option value="일간">일간</option>
										</select>
									</div>
									<div class="form-group">
									    <label>내용</label>
									    <textarea name="planContent" rows="10" cols="82" style="resize:vertical">${plan.planContent}</textarea>
									</div>
									<div class="form-group">
									    <label>등록인</label>
									    <input class="form-control" name="planRegistrant" value="${plan.planRegistrant}">
									</div>
									<button class="btn btn-default" id="PlanModifyButton" type="button">수정</button>
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