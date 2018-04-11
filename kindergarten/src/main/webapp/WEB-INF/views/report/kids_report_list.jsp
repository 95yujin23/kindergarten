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

<title>영유아 일지 목록</title>

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
<!-- DataTables CSS -->
<link rel="stylesheet" type="text/css" href="resources/vendor/css/datatables.min.css"/>
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
			<h1 class="page-header">영유아 반 편성</h1>
	<div id="formationkidsdiv" class="show formationkidsdiv">
		<button class="btn btn-success .upMod" data-toggle="modal" data-target="#myModal" style="float:right;margin-bottom:5px;">일지 업로드</button>
	<table class="display formationkidsList" cellspacing="0" width="100%">
	
        <thead>
            <tr>
                <th>선택</th> <!-- 리포트 코드가 들어감 -->
                <th>일지명</th>
                <th>유아이름</th>
                <th>유아반</th>
                <th>등록자</th>
                <th>등록시기</th>
                <th>일지열람</th>
                <th>수정</th>
                <th>삭제</th>
            </tr>
        </thead>
    </table>
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
			<!-- dataTables -->
			<script type="text/javascript" src="resources/vendor/js/datatables.min.js"></script>
			
			<script>
			  'use strict';
				var $ = jQuery;
				$('.formationkidsList').DataTable( {
	                ajax : {
	                	url :"${pageContext.request.contextPath}/kidsReportList"
	                	,type : "POST"
	                	,dataType : "JSON"
	                },
	                
	                columnDefs : [{
	                	"targets" : 0, "width" : "10%"
	                	,"data" : 'kidsReportCd'
	                	,"render" : function (data,type,row,meta){
	                		return '<input type="checkbox" vlaue="'+data+'">';
	                	}
	                }],
	                
	                columns : [
						{data: "kidsReportCd"},
						{data: "reportNm"},
						{data: "kidsNm"},
						{data: "classNm"},
						{data: "registrant"},
						{data: "registrationDate"},
						{data: "kidsReportCd"
						,render: function (data,type,row,meta){
							return '<a href="${pageContext.request.contextPath}/reportDetail?kidsReportCd='+data+'" class="btn btn-primary">일지열람</a>';
						 }
						}
						,{data: "kidsReportCd"
							,render: function (data,type,row,meta){
								return '<a href="${pageContext.request.contextPath}/modifyReport?kidsReportCd='+data+'" class="btn btn-primary"><i class="fa fa-pencil" aria-hidden="true"></i></a>';
							 }
							}
						,{data: "kidsReportCd"
							,render: function (data,type,row,meta){
								return '<a href="${pageContext.request.contextPath}/removeReport?kidsReportCd='+data+'" class="btn btn-danger"><i class="fa fa-trash" aria-hidden="true"></i></a>';
							 }
						}	
	                ]
	            });
			</script>
</body>
</html>