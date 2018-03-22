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
<title>Client Modify</title>
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
			<form id="clientModifyForm" action="${pageContext.request.contextPath}/client/client_List" method="post">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>거래처이름</th>							
							<th>거래처 연락처</th>
							<th>거래처 담당자</th>
							<th>거래처 주소</th>
							<th>거래처 구분</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="hidden" value="${clientlist.clientCd}" name="clientCd"></td>
							<td><input type="text" value="${clientlist.clientNm}" name="clientNm"></td>										
							<td><input type="text" value="${clientlist.clientPhone}" name="clientPhone"></td>
							<td><input type="text" value="${clientlist.clientManager}" name="clientManager"></td>
							<td><input type="text" value="${clientlist.clientAddress}" name="clientAddress"></td>
							<td><input type="text" value="${clientlist.clientType}" name="clientType"></td> 
						</tr>
					</tbody>
				</table>
				<button id="modifyButton" class="btn" type="button">수정</button>
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