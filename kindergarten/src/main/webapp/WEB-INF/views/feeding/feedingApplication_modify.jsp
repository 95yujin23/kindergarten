<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Program Application Modify</title>
<!-- Bootstrap Core CSS -->
<link href="../resources/vendor/css/bootstrap.min.css" rel="stylesheet">
<!-- MetisMenu CSS -->
<link href="../resources/vendor/css/metisMenu.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="../resources/vendor/css/sb-admin-2.css" rel="stylesheet">
<!-- Morris Charts CSS -->
<link href="../resources/vendor/css/morris.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="../resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
<!-- jQuery -->
<script src="../resources/vendor/js/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$('#ProgramApplicationModifyButton').click(function() {
			$('#ProgramApplicationModifyForm').submit();
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
				<h1 class="page-header">급식신청 수정</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
					    급식신청 수정
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form id="addForm" action="${pageContext.request.contextPath}/feeding/feedingApplication_modify" method="POST">
								<input class="form-control" type="hidden" value="${feedingApplication.feedingApplicationCd}" name="feedingApplicationCd" placeholder="수입급식비">
								<div class="form-group">
								    <label>영유아이름</label>								   
								    <input name="kidsCd" type="hidden" class="form-control" value="${kidsFemo.kidsCd}" placeholder="영유아코드">	
								    <input name="kidsNm" class="form-control" value="${kidsFemo.kidsNm}" readonly placeholder="영유아네임">								
								</div>
								<div class="form-group">
								    <label>신청급식(년/월)</label>
								    <input name="femoFeedingYearMonth" class="form-control" value="${kidsFemo.femoFeedingYearMonth}" value="${kidsFemo.femoFeedingYearMonth}" readonly placeholder="신청급식(년/월)">	
								</div>
								<div class="form-group">
								    <label>수입급식비</label>
								    <input class="form-control" id="feapExpenseMonth" name="feapExpenseMonth" value="${feedingApplication.feapExpenseMonth}" placeholder="수입급식비">
								</div>
								<div class="form-group">
								    <label>마감회계_수입급식비</label>
								    <input class="form-control" id="feapClosingIncome" name="feapClosingIncome" value="${feedingApplication.feapClosingIncome}" placeholder="마감회계_수입급식비">
								</div>
								<div class="form-group">
								    <label>마감유무</label>
								    <select name="feapClosingOption" class="form-control">
								    <option value="마감전">마감전</option>
								    <option value="마감">마감</option>
								    </select>								    
								</div>
								<div class="form-group">
								    <label>급식구분자</label>
								    <select name="feapDivision" class="form-control">
								    <option value="미납">미납</option>
								    <option value="완납">완납</option>
								    </select>
								</div>
								<div class="form-group">
								    <label>등록인</label>
								    <input class="form-control" id="feapRegistrant" value="${feedingApplication.feapRegistrant}" name="feapRegistrant" placeholder="등록인">
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
	<!-- Bootstrap Core JavaScript -->
	<script src="../resources/vendor/js/bootstrap.min.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script src="../resources/vendor/js/metisMenu.min.js"></script>
	<!-- Morris Charts JavaScript -->
	<script src="../resources/vendor/js/raphael.min.js"></script>
	<script src="../resources/vendor/js/morris.min.js"></script>
	<script src="../resources/vendor/js/morris-data.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="../resources/vendor/js/sb-admin-2.js"></script>
</body>
</html>