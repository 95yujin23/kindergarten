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
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
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
<div class="panel panel-default">
<div class="panel-heading">
<h1 class="page-header">영유아 일지 목록</h1>
					
				<!-- reportdivision 메뉴 추가 -->
	<div>
	    <div>
	    	 <a href="#demo" class="btn btn-success" data-toggle="collapse"><i class="fa fa-plus" aria-hidden="true"></i></a>
	  			<div id="demo" class="collapse">
	    		<!-- 내용 -->
			<!-- 전송퐁 시작 -->
			<!-- 반 생성 addkidsClass  -->
    <form action="${pageContext.request.contextPath}/addKidsClass" id="addKidsClassForm" name="addKidsClassForm" method="POST" class="form-inline addKidsClassForm">
		    	<div class="form-group">
				    <label for="kdisclasNm">반이름</label> <!-- input id가 바뀌면 label이름도 바꿔준다. -->
				    <input type="text" class="form-control" id="classNm" name="classNm">
				 </div>
				  <div class="form-group">
				    <label for="createDate">생성날짜</label>
				    <input type="date" class="form-control" id="createDate" name="createDate">
				  </div>
				  <div class="form-group">
				    <label for="classKidsAge">해당 나이</label>
				    <input type="text" class="form-control" id="classKidsAge" name="classKidsAge">
				  </div>
				  <button type="submit" class="btn btn-primary btn-sm addKidsClass" onclick="return addKidsClassBtn()">추가</button>
			</form>
		</div>	
	  </div>
	<!-- 전송폼 종료 -->
			<table class="table table-hover">
				<thead>

					<tr>
						<th>영유아반코드</th>
						<th>반이름</th>
						<th>반생성년도</th>
						<th>반영유아나이</th>
						<th>수정</th>
						<th>삭제</th>

					</tr>
				</thead>
				<c:forEach var="kidsClassList" items="${list}">
					<tbody>
						<tr>
							<td>${kidsClassList.kidsClassCd}</td>
							<td>${kidsClassList.classNm}</td>
							<td>${kidsClassList.createDate}</td>
							<td>${kidsClassList.classKidsAge}</td>
							<td> 
								<button type="button" class="btn btn-primary mod" data-toggle="modal" data-target="#myModal"><i class="fa fa-pencil" aria-hidden="true"></i></button>
							</td>
							<td><a class="btn btn-danger" href="${pageContext.request.contextPath}/removeKidsClass?kidsClassCd=${kidsClassList.kidsClassCd}"><i class="fa fa-trash" aria-hidden="true"></i></a></td>
						</tr>
					</tbody>
		<!-- small modal start -->
		<div class="modal fade bs-example-modal-sm" id="myModal">
		  <div class="modal-dialog modal-sm">
		  <!-- modal content -->
		    <div class="modal-content">
		    <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">반정보 수정</h4>
		      </div>
		      <!-- Modal body -->
		       <div class="modal-body">
		      <form action="${pageContext.request.contextPath}/modifyKidsClass" name="modifyKidsClassForm" id="modifyKidsClassForm" method="POST">
		        <label for="reportDivisionCd">일지명 : </label>
		        <input id="modifyKidsClassCd" type="text" name="kidsClassCd">
		        <input id="modifyClassNm" type="text" class="form-control" name=classNm>
		        <input id="modifyCreateDate" type="date" class="form-control" name="createDate">
		        <input id="modifyClassAge" type="text" class="form-control" name="classKidsAge">
		        <button type="submit" class="btn btn-primary" onclick="return modifyKidsClassBtn()">완료</button>
		       </form>
		    </div>
		  </div>
		</div>
	</div>
	<!-- /small modal -->
				</c:forEach>
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
	//1차 서브밋
	function addKidsClassBtn() {
		var form = document.addKidsClassForm;
		if(!form.classNm.value){
			alert("아이디 값이 없습니다.");
			form.classNm.focus();
			return false;
		}
		if(!form.createDate.value){
			alert("생성날짜를 입력하세요!");
			form.createDate.focus();
			return false;
		}
		if(!form.classKidsAge.value){
			alert("반 나이를 입력하세요 !");
			form.classKidsAge.focus();
			return false;
		}		
		return true;
	}
	//2차 서브밋
	function modifyKidsClassBtn(){
		//현재문서의 modifyKidsClassForm의 정보를 modifyForm에 담는다
		//document = 현재 페이지, modifyKidsClassForm = form tag
		var modifyForm = document.modifyKidsClassForm;
		//#modifyClassNm의 value값이 비어있다면 (! <-- 느낌표는 현재 값의 반대를 말한다 true이면 false false이면 true를 반환한다.)
		if(!$("#modifyClassNm").val()){
			//alert를 보여준다.
			alert("수정할 반이름이 비어있습니다.");
			//해당 input으로 커서를 보낸다.
			$("#modifyClassNm").focus();
			return false;
		}
		if(!$("#modifyCreateDate").val()){
			alert("수정할 생성날짜가 비어있습니다..");
			$("#modifyCreateDate").focus();
			return false;
		}
		if(!$("#modifyClassAge").val()){
			alert("수정할 반 나이가 비어있습니다..");
			$("#modifyClassAge").focus();
			return false;
		}
		return true;
	}
	
	jQuery("#side-menu").metisMenu();
	$(document).ready(function() {
		var modal = $("#myModal");
		
		var vm = $(this).parent().parent().parent();
		console.log(vm);
		
		$(".mod").on("click", function (e) { 
			
			var vm = $(this).parent().parent().children();
			console.log($(vm[0]).text());
			console.log($(vm[1]).text());
			console.log($(vm[2]).text());
			
			var modifyKidsClassCd = $(vm[0]).text();
			var modifyClassNm = $(vm[1]).text();
			var modifyCreateDate = $(vm[2]).text();
			var modifyClassAge = $(vm[3]).text();
			
			$("#modifyKidsClassCd").val(modifyKidsClassCd)
			$("#modifyClassNm").val(modifyClassNm)
			$("#modifyCreateDate").val(modifyCreateDate)
			$("#modifyClassAge").val(modifyClassAge)
		})
	})
	</script>

</body>
</html>