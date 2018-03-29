<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap Core CSS -->
<link href="./resources/vendor/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="./resources/vendor/css/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="./resources/vendor/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="./resources/vendor/css/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="./resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">

<script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js" integrity="sha384-SlE991lGASHoBfWbelyBPLsUlwY1GwNDJo3jSJO04KZ33K2bwfV9YBauFfnzvynJ" crossorigin="anonymous"></script>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
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
<!-- content -->
<div id="page-wrapper">
	<div class="row">
 <div class="col-lg-6">
  <div class="panel panel-default">
   <div class="panel-heading">
    <h2 class="page-header">일지구분</h2> <!--  ********************* 일지 구분 부분  ********************* -->
    <!-- reportdivision 메뉴 추가 -->
    <div>
    	 <a href="#demo" class="btn btn-success" data-toggle="collapse"><i class="fas fa-plus" ></i></a>
  <div id="demo" class="collapse">
    <!-- 내용 -->
    <form action="${pageContext.request.contextPath}/addReportDivision" method="POST">
    <div class="form-group col-xs-3">
    	<input type="text" id="addReportDivision" name="reportNm" class="form-control" size="10"  style="display:inline-block;float:left;">
    	</div>
    	<button type="submit" class="btn btn-primary btn-sm" style="display:inline-block;">추가</button>
    	
    </form>
  </div>
  </div>
    <table class="table table-hover">
     <thead>
      <tr>
      <th>일지자원코드</th>
      <th>일지명</th>
      <th style="text-align:center">수정</th>
      <th style="text-align:center">삭제</th>
      </tr>
     </thead>
     
     <c:forEach var="reportDivision" varStatus="status" items="${list}">
     <tbody>
      <tr>
       <td>${reportDivision.reportCd}</td>
       <td>${reportDivision.reportNm}</td>
       <td style="text-align:center">
       
       	<!-- Button trigger modal -->
	<a href="${pageContext.request.contextPath}/report/kids_report_setting?reportCd=${reportDivision.reportCd}" type="button" varStatus="status" class="btn btn-primary" data-toggle="modal" data-target="#myModal1}">
	  <i class="fas fa-pencil-alt"></i></a>
	 </td>
       <td style="text-align:center"><a class="btn btn-danger" href="${pageContext.request.contextPath}/removeReportDivision?reportCd=${reportDivision.reportCd}"><i class="fas fa-trash-alt"></i></a></td>
      </tr>
     </tbody>
     </c:forEach>
     
     <!-- Modal -->
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">일지명 수정</h4>
	      </div>
		      
	      <div class="modal-body">
	      <form action="${pageContext.request.contextPath}/modifyReportDivision" method="POST">
	        <label for="ex2">일지명 : </label>
	        <input type="hidden" name="reportCd" value="${reportDivision.reportCd }">
	        <input type="text" name="reportNm" value="${reportDivision.reportNm}">
	        <button type="submit" class="btn btn-primary">완료</button>
	       </form>
	      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
      </div>
    </div>
  </div>
</div>

<!-- /modal -->

    </table>
   </div>	
  
  </div>
 </div>
 
 
 

 <div class="col-lg-6">
  <div class="panel panel-default">
   <div class="panel-heading">
    <h2 class="page-header">일지자원</h2> <!--  ********************* 일지 구분 부분  ********************* -->
    <!-- reportdivision 메뉴 추가 -->
    
	  <div>
	    	 <a href="#demo1" class="btn btn-success" data-toggle="collapse"><i class="fas fa-plus" ></i></a>
	  <div id="demo1" class="collapse">
	    <!-- 내용 -->
	    <form action="${pageContext.request.contextPath}/addReportResource" method="POST">
	    <div class="input-group">
	    	<span class="input-group-addon" id="sizing-addon2">일지명</span>
	    	<input type="text" id="addReportDivision" class="form-control" name="groupNm" size="10">
	    	<span class="input-group-addon" id="sizing-addon2">상세내용</span>
	    	<input type="text" id="addReportDivision" class="form-control" name="detail" size="10">
	    	</div>
	    	<button type="submit" class="btn btn-primary btn-sm" style="float:right;">추가</button>
	    </form>
	    </div>
    <table class="table table-hover">
     <thead>
      <tr>
      <th>일지자원코드</th>
      <th>일지명</th>
      <th>상세내용</th>
      <th style="text-align:center">수정</th>
      <th style="text-align:center">삭제</th>
      </tr>
     </thead>
     
     <!--  -->
     <c:forEach var="reportResource" items="${resourceList}">
     <tbody>
      <tr>
       <td>${reportResource.reportResourceCd}</td>
       <td>${reportResource.groupNm}</td>
       <td>${reportResource.detail}</td>
       <td style="text-align:center">
       
	       	<!-- Button trigger modal -->
		<a  href="${pageContext.request.contextPath}/report/kids_report_setting?reportResourceCd=${reportResource.reportResourceCd}" type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal1">
		  <i class="fas fa-pencil-alt"></i>
		</a>
		
		<!-- Modal -->
		<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">일지자원 수정</h4>
		      </div>
			    
		      <div class="modal-body">
		      <form action="${pageContext.request.contextPath}/modifyReportResource" method="POST">
		        <label for="ex2">일지명 : </label>
		        <input type="hidden" name="reportResourceCd" value="${reportResource.reportResourceCd}">
		        <input type="text" name="groupNm" value="${reportResource.groupNm}">
		       	<label for="ex2">상세내용 : </label>
		        <input type="text" name="detail" value="${reportResource.detail}">
		        <button type="submit" class="btn btn-primary">완료</button>
		       </form>
		      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- /modal -->
       
       </td>
       <td style="text-align:center"><a class="btn btn-danger" href="${pageContext.request.contextPath}/removeReportResource?reportResourceCd=${reportResource.reportResourceCd}"><i class="fas fa-trash-alt"></i></a></td>
      </tr>
     </tbody>
     </c:forEach>
    </table>
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

	<!-- Morris Charts JavaScript -->
	<script src="resources/vendor/js/raphael.min.js"></script>
	<script src="resources/vendor/js/morris.min.js"></script>
	<script src="resources/vendor/js/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="resources/vendor/js/sb-admin-2.js"></script>
</body>
</html>