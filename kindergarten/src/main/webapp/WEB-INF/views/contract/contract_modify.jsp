<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Contract Modify</title>
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
			<h2>수정화면</h2>
			<form id="contractModifyForm" action="${pageContext.request.contextPath}/contract/contract_list" method="post">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>계약구분</th>
							<th>계약시작일자</th>
							<th>계약종료일자</th>
							<th>계약내용</th>
							<th>계약금액</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" value="${contract.contractType}" name="contractType"></td>	
							<td><input type="text" value="${contract.contractStartDate}" name="contractStartDate"></td>	
							<td><input type="text" value="${contract.contractEndDate}" name="contractEndDate"></td>	
							<td><input type="text" value="${contract.contractContents}" name="contractContents"></td>							
							<td><input type="text" value="${contract.contractAmount}" name="contractAmount"></td>
						</tr>
					</tbody>
				</table>
				<button id="modifyButton" class="btn" type="submit">수정</button>
				<button class="btn" type="reset">초기화</button> 
			</form>
			</div>
		</div>
	</div>	
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>