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
			<form id="contractModifyForm" action="${pageContext.request.contextPath}/contract/contract_modify" method="post">
				<input type="hidden"class="form-control" value="${contract.contractCd}" name="contractCd">
				<div class="form-group">
					<label>계약시작일자</label>
					<input class="form-control" type="date" id="contractStartDate" name="contractStartDate" value="${contract.contractStartDate}" placeholder="계약시작일자">
				</div>
				<div class="form-group">
				    <label>계약종료일자</label>
				    <input class="form-control" type="date" id="contractEndDate" name="contractEndDate" value="${contract.contractEndDate}" placeholder="계약종료일자">
				</div>
				<div class="form-group">
		    		<label>거래처코드</label>
		    		<input  class ="form-control" name = "clientCd" value="${contract.clientCd}" readonly>
				</div>
				<div class="form-group">
				    <label>금액</label>
				    <input class="form-control" id="contractAmount" name="contractAmount" value="${contract.contractAmount}"  placeholder="금액">
				</div>
				<div class="form-group">
				    <label>내용</label>
				    <input class="form-control" id="contractContents" name="contractContents" value="${contract.contractAmount}" placeholder="내용">
				</div>
				<div class="form-group">
				    <label>계약구분</label>
				    <input class="form-control" id="contractType" name="contractType" value="${contract.contractType}" placeholder="계약구분">
				</div>
				<div class="form-group">
				    <label>등록인</label>
				    <input class="form-control" id="contractRegistrant" name="contractRegistrant" value="${contract.contractRegistrant}" placeholder="등록인">
				</div>
					<button type="submit">등록</button>
			</form>
			</div>
		</div>
	</div>	
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>