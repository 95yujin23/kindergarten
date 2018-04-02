<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<script type="text/javascript"src="<c:url value="/resources/vendor/js/jquery.min.js"/>"></script>
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
	<div class="container">
		<div class="row">
			<div class="col-lg-1"></div>
			<div class="col-lg-11">
				<h2>특별활동 신청 폼</h2>
				<form id="ProgramApplAddForm" action="${pageContext.request.contextPath}/ProgramApplication" method="post">
					<table class="table table-bordered">
					<tr>
						<td>신청 영유아</td>
						<td>
							<select name="kidsCd">
								<c:forEach var="kids" items="${kids}">
									<option value="${kids.kidsCd}">${kids.kidsNm}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>특별활동프로그램</td>
						<td>
							<select name="programCd" id="programCd">
								<c:forEach var="program" items="${program}">
									<option value="${program.programCd}">${program.programNm}&colon;주${program.programNumberWeek}회&lpar;${program.programOperationTime}분&rpar;&comma; ${program.programOutsourcingCost}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>입금여부</td>
						<td>
							<select name="PRAPDivision">
								<option value="입금전">입금전</option>
								<option value="입금완료">입금완료</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>특별활동비</td>
						<td>
							<input type="text" name="PRAPCost">원
						</td>
					</tr>
					<tr>
						<td>마감회계_수입특별활동비</td>
						<td>
							<input type="text" name="PRAPClosingCd" placeholder="예) 201803">
						</td>
					</tr>
					<tr>
						<td>마감유무</td>
						<td>
							<select name="PRAPClosingDivision">
								<option value="마감전">마감전</option>
								<option value="마감완료">마감완료</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>등록인</td>
						<td>
							<input type="text" name="PRAPRegistrant">
						</td>
					</tr>
					</table>
					<button id="ProgramApplAddButton" type="button">신청</button>
				</form>
			</div>
		</div>
	</div>
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>