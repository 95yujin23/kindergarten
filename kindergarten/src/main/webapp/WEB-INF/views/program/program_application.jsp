<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Program Application Insert</title>
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
		$('#ProgramApplAddButton').click(function() {
			$('#ProgramApplAddForm').submit();
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
				<h1 class="page-header">특별활동신청</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
					   특별활동신청
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-6">
								<form id="ProgramApplAddForm" action="${pageContext.request.contextPath}/ProgramApplication" method="post">
									<div class="form-group">
									    <label>신청 영유아</label>
									    <select name="kidsCd" class="form-control">
											<c:forEach var="kids" items="${kids}">
												<option value="${kids.kidsCd}">${kids.kidsNm}</option>
											</c:forEach>
										</select>
									</div>
									<div class="form-group">
									    <label>특별활동프로그램</label>
									    <select name="programCd" id="programCd" class="form-control">
											<c:forEach var="program" items="${program}">
												<option value="${program.programCd}">${program.programNm}&colon;주${program.programNumberWeek}회&lpar;${program.programOperationTime}분&rpar;&comma; ${program.programOutsourcingCost}</option>
											</c:forEach>
										</select>
									</div>
									<div class="form-group">
									    <label>입금여부</label>
									    <select name="PRAPDivision" class="form-control">
											<option value="입금전">입금전</option>
											<option value="입금완료">입금완료</option>
										</select>
									</div>
									<div class="form-group">
									    <label>특별활동비</label>
									    <input type="text" name="PRAPCost" class="form-control" placeholder="금액">원
									</div>
									<div class="form-group">
									    <label>마감회계_수입특별활동비</label>
										<input class="form-control" type="text" name="PRAPClosingCd" placeholder="예) 201803">								
									</div>
									<div class="form-group">
									    <label>마감유무</label>
									    <select class="form-control" name="PRAPClosingDivision">
											<option value="마감전">마감전</option>
											<option value="마감완료">마감완료</option>
										</select>
									</div>
									<div class="form-group">
									    <label>등록인</label>
									    <input class="form-control" type="text" name="PRAPRegistrant" placeholder="등록인">
									</div>
									<button class="btn btn-default" id="ProgramApplAddButton" type="button">등록</button>
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
</html></html>