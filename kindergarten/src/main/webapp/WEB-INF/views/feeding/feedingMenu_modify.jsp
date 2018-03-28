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
<title>feedingMenu Modify</title>
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
			<h2>식단 수정화면</h2>
			<form id="feedingMenuModifyForm" action="${pageContext.request.contextPath}/feeding/feedingMenu_modify" method="post">
					<table class="table table-hover">
					<thead>
						<tr>
							<th>식단코드</th>
							<th>식단일자</th>
							<th>중식(열량/단백질)</th>
							<th>오전간식</th>
							<th>오후간식</th>
							<th>원산지</th>
							<th>담당자</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" value="${feedingMenu.feedingMenuCd}" name="feedingMenuCd"></td>	
							<td><input type="text" value="${feedingMenu.menuDate}" name="menuDate"></td>	
							<td><input type="text" value="${feedingMenu.lunchCaloryProtein}" name="lunchCaloryProtein"></td>	
							<td><input type="text" value="${feedingMenu.morningSnack}" name="morningSnack"></td>	
							<td><input type="text" value="${feedingMenu.afternoonSnack}" name="afternoonSnack"></td>	
							<td><input type="text" value="${feedingMenu.origin}" name="origin"></td>							
							<td><input type="text" value="${feedingMenu.menuManager}" name="menuManager"></td>
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