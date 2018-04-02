<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<script type="text/javascript"src="<c:url value="/resources/vendor/js/jquery.min.js"/>"></script>
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
	<div class="container">
		<div class="row">
			<div class="col-lg-1"></div>
			<div class="col-lg-11">
				<form id="ProgramAddForm" action="${pageContext.request.contextPath}/ProgramAdd" method="post">
					<table class="table table-bordered">
					<tr>
						<td>통합자원코드</td>
						<td>
							<select name="totalResourceCd">
								<c:forEach var="resource" items="${resource}">
									<option value="${resource.totalResourceCd}">${resource.resourceNm}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>특별활동프로그램명</td>
						<td>
							<input type="text" name="programNm">
						</td>
					</tr>
					<tr>
						<td>주당운영횟수(회)</td>
						<td>
							<select name="programNumberWeek">
								<option value=1>1회</option>
								<option value=2>2회</option>
								<option value=3>3회</option>
								<option value=4>4회</option>
								<option value=5>5회</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>1회운영시간(분)</td>
						<td>
							<select name="programOperationTime">
								<option value=10>10분</option>
								<option value=20>20분</option>
								<option value=30>30분</option>
								<option value=40>40분</option>
								<option value=50>50분</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>외주금액</td>
						<td>
							<input type="number" name="programOutsourcingCost">
						</td>
					</tr>
					<tr>
						<td>마감회계_지출특별활동비</td>
						<td>
							<input type="text" name="programClosingCd" placeholder="예) 201803">
						</td>
					</tr>
					<tr>
						<td>마감유무</td>
						<td>
							<select name="programClosingDivision">
								<option value="마감전">마감전</option>
								<option value="마감완료">마감완료</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>계약코드</td>
						<td>
							<select name="contractCd">
								<c:forEach var="contract" items="${contract}">
									<option value="${contract.contractCd}">${contract.contractType}:${contract.contractContents}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>등록인</td>
						<td>
							<input type="text" name="programRegistrant">
						</td>
					</tr>
					</table>
					<button id="ProgramAddButton" type="button">등록</button>
				</form>
			</div>
		</div>
	</div>
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>