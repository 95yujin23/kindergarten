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

<!-- Report CSS -->
<link href="./resources/vendor/css/report.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="./resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">

<!-- DataTables CSS -->
<link rel="stylesheet" type="text/css" href="resources/vendor/css/datatables.min.css"/>

</head>
<body>
 <div class="container">
         <div class="row">
            <div class="col-12 mt-4">
               <div class="text-white text-center d-block mb-1"><h4 class="titulo pb-2 pt-2">일지 등록</h4></div>
               <div class="mb-2 pl-2 text-white d-block titulo">일지 정보</div>
               <table class="table table-sm">
                  <tbody>
                     <tr>
                        <td class="w-25 text-center" style="border-right:1px #41719C solid;border-top:5px #41719C solid">일지종류<span class="text-danger">*</span></td>
                        <td colspan="3" class="w-75" style="background-color:#D6E6F4;border-top:5px #41719C solid;border-right:1px #41719C solid;">
                           <input type="text" name="paciente" id="paciente" class="w-100 no-print-required">
                        </td>
                     </tr>
                     <tr>
                        <td style="width:200px;border-right:1px #41719C solid;" class="text-center">유아 반<span class="text-danger">*</span></td>
                        <td>
                           <input type="text" name="dtNascimento" id="dtNascimento" class="w-100 element-white no-print-required">
                        </td>
                        <td class="text-right">유아이름 <span class="text-danger">*</span></td>
                        <td style="border-right:1px #41719C solid;"><input type="text" name="nrAtendimento" id="nrAtendimento" class="w-100 no-print-required element-white"></td>
                     </tr>
                     <tr>
                        <td style="width:200px;border-right:1px #41719C solid;" class="text-center">등록자 <span class="text-danger">*</span></td>
                        <td style="background-color:#D6E6F4;">
                           <input type="text" name="medicoSolicitante" id="medicoSolicitante" class="w-100 no-print-required">
                        </td>
                        <td style="background-color:#D6E6F4;" class="text-right">보호자 연락처 <span class="text-danger">*</span></td>
                        <td style="border-right:1px #41719C solid;background-color:#D6E6F4; "><input type="text" name="crm" id="crm" class="w-100 no-print-required"></td>
                     </tr>
                     <tr>
                        <td style="width:200px;border-right:1px #41719C solid;" class="text-center" >일지 업로드 <span class="text-danger">*</span></td>
                        <td colspan="3" style="border-right:1px #41719C solid;">
                           <div class="select-wrapper">
                              	<input type="file">                             
                           </div>
                        </td>
                     </tr>
                  </tbody>
               </table>
               <hr style="border : 1px solid gray">
               <table class="display formationkidsList" cellspacing="0" width="100%" style="float:right;">
		        <thead>
		            <tr>
		                <th>유아이름</th>
		                <th>성별</th>
		                <th>유아 반</th>
		                <th>성별</th>
		                <th>부모님 전화번호</th>
		                <th>정보</th>
		                <th>선택</th>
		            </tr>
		        </thead>
		    </table>
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
	                	url :"${pageContext.request.contextPath}/KidsReportSelect"
	                	,type : "POST"
	                	,dataType : "JSON"
	                },
	                columns : [
						{data: "kidsNm"},
						{data: "kidsGender"},
						{data: "classNm"},
						{data: "kidsGender"},
						{data: "kidsParentPhone"},
						{data: "kidsClassCd"
						,render: function (data,type,row,meta){
							return '<a href="${pageContext.request.contextPath}/reportDetail?kidsReportCd='+data+'" class="btn btn-primary">정보</a>';
						 }
						}
						,{data: "kidsReportCd"
							,render: function (data,type,row,meta){
								return '<button class="btn btn-primary" id="selectKids">선택</button>';
							 }
							}
	                ]
	            });
				
			</script>

</body>
</html>