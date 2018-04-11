<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>반 현황</title>

<!-- Bootstrap Core CSS -->
<link href="./resources/vendor/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="./resources/vendor/css/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="./resources/vendor/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="./resources/vendor/css/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="./resources/vendor/fonts/font-awesome.min.css"
	rel="stylesheet" type="text/css">

</head>
<body>
	<div id="wrapper">
		<!-- TOP : Navigation -->
			<c:import url="../inc/top.jsp"></c:import>
			<!-- TOP -->
			<!-- LEFT : Navigation -->
			<c:import url="../inc/left.jsp"></c:import>
			<!-- LEFT -->
	</div>

<div id="page-wrapper">
<div class="row">
<div class="col-lg-12">
<div class="panel panel-default">
<div class="panel-heading">
<h1 class="page-header">회계 전표 등록</h1>
					<!-- 회계전표 tr,td 추가버튼 생성 -->
					<!-- /회계전표 tr,td 추가버튼 생성 -->
					<button id="addStatementBtn">전표추가</button>
			<table class="table table-hover" id="statementTable">
				<thead>
					<tr>
						<th>전표분류</th>
						<th>구분</th>
						<th>금액</th>
					</tr>
				</thead>
					<tbody>
						<tr>
							<%-- <td>
								<select class="form-control" style="width:150px;">
									<option value="">---- 전표 선택 ----</option>
								<c:forEach var="StatementCategory" items="${list}">
									<option value="${StatementCategory.statementCafeCd}">${StatementCategory.statementCafeNm}</option>
								</c:forEach>
								</select>
							</td>
							<td>
								<!-- 수입 / 지출 구분-->
								<select class="form-control" style="width:150px;">
									<option value="">---- 구분 선택 ----</option>
									<option value="수입">수입</option>
									<option value="지출">지출</option>
								</select>
								</td>
							<td>
								   <div class="form-group">
								    <label class="sr-only" for="exampleInputAmount">Amount (in dollars)</label>
								    <div class="input-group col-xs-4">
								      <input type="text" class="form-control" id="exampleInputAmount" placeholder="Amount">
								      <div class="input-group-addon">원</div>
								    </div>
								  </div>
							</td> --%>
						</tr>
					</tbody>
			</table>
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

	<!-- jQuery -->
	<script src="resources/vendor/js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/vendor/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="resources/vendor/js/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript	
	<script src="resources/vendor/js/raphael.min.js"></script>
	<script src="resources/vendor/js/morris.min.js"></script>
	<script src="resources/vendor/js/morris-data.js"></script> -->

	<!-- Custom Theme JavaScript -->
	<script src="resources/vendor/js/sb-admin-2.js"></script>
	
	<script>
	
	$.ajax({
		type : 'post'
		,url : '${pageContext.request.contextPath}/getStatementCategoryList'
		,dataType : 'JSON'
		,success : function(data){
			console.log(data);
			}
		
	})
	
	function test(data){
		console.log(data);
	}
		
	$("#addStatementBtn").click(function(){
		 

	})
		
	</script>

</body>
</html>