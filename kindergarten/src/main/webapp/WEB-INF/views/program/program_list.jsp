<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Program List</title>
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
			<h2>교직원용</h2>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>특별활동프로그램명</th>
						<th>주당운영횟수(회)</th>
						<th>1회운영시간(분)</th>
						<th>외주금액</th>
						<th>마감유무</th>
						<th>계약코드</th>
						<th>등록날짜</th>
						<th>등록인</th>
						<th>수정</th>
						<th>삭제</th>
					</tr>
				</thead>
				<c:forEach var="program" items="${list}">
					<tbody>
					<tr>
						<td>${program.programNm}</td>							
						<td>${program.programNumberWeek}</td>
						<td>${program.programOperationTime}</td>
						<td>${program.programClosingCd}</td>
						<td>${program.programClosingDivision}</td>
						<td>${program.contractCd}</td>
						<td>${program.programRegistrationDate}</td>
						<td>${program.programRegistrant}</td>
						<td><a class="btn btn-primary" href="${pageContext.request.contextPath}/ProgramModify?programCd=${program.programCd}"><i class="fa fa-pencil"></i></a></td>
						<td><a class="btn btn-danger" href="${pageContext.request.contextPath}"><i class="fa fa-trash"></i></a></td>
					</tr>
				</tbody>
				</c:forEach>
			</table>
			</div>
		</div>
	</div>	
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
</body>
</html>