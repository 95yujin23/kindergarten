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
<style>
	@import  url('https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css');
</style>
<title>Teacher Attendance List</title>

<!-- Bootstrap Core CSS -->
<link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet">
<!-- MetisMenu CSS -->
<link href="resources/vendor/css/metisMenu.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="resources/vendor/css/sb-admin-2.css" rel="stylesheet">
<!-- Morris Charts CSS -->
<link href="resources/vendor/css/morris.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css"></head>
<!-- jQuery -->
<script src="resources/vendor/js/jquery.min.js"></script>
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
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
			<h1 class="page-header">영유아 반 편성</h1>
	
	<table id="example" class="display" cellspacing="0" width="100%">
		<button id="unformationkids" class="btn btn-danger" style="float:right;margin-bottom:5px;">미편성 유아 보기</button>
        <thead>
            <tr>
                <th>반편성 코드</th>
                <th>구분</th>
                <th>이름</th>
                <th>반이름</th>
                <th>전화번호</th>
                <th>상세정보</th>
            </tr>
        </thead>
     	<td><button type="button" class="btn btn-primary">상세정보</button></td>
    </table>
   </div>
  </div>
 </div>
    
<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
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
	<script>
    'use strict';
	var $ = jQuery;
	$.getScript("https://cdn.datatables.net/v/dt/dt-1.10.13/datatables.min.js", function(){
       
            $('#example').DataTable( {
               /*  "paging":   true,
                "ordering": true,
                "info":     false, */
                ajax : {
                	url :"${pageContext.request.contextPath}/formationKidsList"
                	,type : "POST"
                	,dataType : "JSON"
                },
                
                columnDefs : [{
                	"targets" : -1
                	,"data" : null
                	,"render" : function (data,type,row,meta){
                		return '<a href="'+data+'">상세정보</a>';
                	}
                	   
                }],
                
                columns : [
					{data: "kidsClassFormationCd"},
					{data: "kidsParentPhone"},
					{data: "kidsNm"},
					{data: "classNm"},
					{data: "kidsParentPhone"},
					{data: "kidsCd"}	
                ]
            });
            // 미편성 유아 출력하기
            $('#unformationkids').click(function(){
            	$('#example').DataTable({
            		ajax : {
                		url : "${pageContext.request.contextPath}/unformationkids"
                		,type : "POST"
                		,dataType : "JSON"
                	},
                	
                	columnDefs : [{
                		"targets" : -1
                		,"data" : null
                		,"render" : function (data,type,row,meta){
                			return '<a href="'+data+'">상세정보</a>';
                		}
                	}],
                	
                	columns : [
                		{data: "kidsClassFormationCd"},
    					{data: "kidsParentPhone"},
    					{data: "kidsNm"},
    					{data: "classNm"},
    					{data: "kidsParentPhone"},
    					{data: "kidsCd"}	
                	]
                })
           })
            	
	});
	</script>
</body>
</html>