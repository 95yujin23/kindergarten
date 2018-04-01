<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Bootstrap Admin Theme</title>

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
	</nav>
</div>
<div id="wrapper">
			<div class="row">
				<!-- 1. 프로젝트 및 팀 소개 메뉴 -->
				<div class="col-lg-6 col-lg-4">
				<div class="panel-body">
				<div class="panel  panel-warning">
					<div class="panel-heading"><i class="fa fa-home fa-fw"></i>Project & Team Introduce</div>			
						<ul>
							<li><a href="${pageContext.request.contextPath}/">Project</a></li>
							<li><a href="${pageContext.request.contextPath}/Team">Team</a></li>
						</ul>
				</div>
				</div>
				</div>
				<!-- 2. 프로젝트 시작 : 로그인 -->
				<div class="col-lg-6 col-lg-4">
				 <div class="panel-body">
				 <div class="panel  panel-warning">
				 <div class="panel-heading"><a href="${pageContext.request.contextPath}/Login"><i class="fa fa-sign-in fa-fw"></i>
						Project Start</a>
				</div>
				</div>
				</div>
				</div>			
				<!-- 3. 교직원 메뉴 -->	
				<div class="col-lg-6 col-lg-4">		
				 <div class="panel-body">
				 <div class="panel panel-warning">
				 <div class="panel-heading"><i class="fa fa-user fa-fw"></i>교직원 관리</div>
					<ul>
						<li>교직원
							<ul>
								<li><a href="${pageContext.request.contextPath}/TeacherList">교직원 전체 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/TeacherAdd">교직원 등록</a></li>
							</ul>	
						</li>
						<li>교직원 인건비 지급
							<ul>
								<li><a href="${pageContext.request.contextPath}/TeacherPayList">인건비 지급 전체 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/TeacherPayAdd">인건비 지급 등록</a></li>
							</ul>	
						</li>
						<li>교직원 근태
							<ul>
								<li><a href="${pageContext.request.contextPath}/TeacherAttendance">교직원 출퇴근 등록</a></li>
								<li><a href="${pageContext.request.contextPath}/TeacherAttendanceList">교직원 근태 전체 조회</a></li>
							</ul>	
						</li>
					</ul>
				</div>
				</div>
				</div>
				</div>
				<!-- 4. 영유아 메뉴 -->
				<div class="row">
				<div class="col-lg-6 col-lg-4">	
				 <div class="panel-body">
				 <div class="panel  panel-warning">
				 <div class="panel-heading"><i class="fa fa-child fa-fw"></i>영유아 관리</div>
					<ul>
						<li>영유아관리</li>
							<ul>
							<li><a href="${pageContext.request.contextPath}/KidsList">영유아 목록</a></li>
							<li><a href="${pageContext.request.contextPath}/KidsAdd">영유아 등록</a></li>
							</ul>
						<li>출석관리</li>
							<ul>
							<li><a href="${pageContext.request.contextPath}/KidsAttendance">등하원 등록</a></li>
							<li><a href="${pageContext.request.contextPath}/KidsAttendanceList">등하원 전체 조회</a></li>
							</ul>	
						<li>반 관리</li>
							<ul>
						<li><a href="${pageContext.request.contextPath}/KidsClass">반 현황</a></li>
							</ul>
					</ul>
				</div>
				</div>
				</div>
				<!-- 5. 영유아 일지 메뉴 -->
				<div class="col-lg-6 col-lg-4">	
				 <div class="panel-body">
				 <div class="panel  panel-warning">
				 <div class="panel-heading"><i class="fa fa-file-text-o fa-fw"></i>영유아 일지 관리</div>
					<ul>
						<li><a href="${pageContext.request.contextPath}/KidsReportList">일지목록</a></li>
						<li>일지관리
							<ul >
								<li><a href="${pageContext.request.contextPath}/ReportSetting">일지설정</a></li>
							</ul>
						</li>
					</ul>
				</div>
				</div>
				</div>
				<!-- 6. 계획안 메뉴 -->
				<div class="col-lg-6 col-lg-4">
				 <div class="panel-body">
				 <div class="panel  panel-warning">
				 <div class="panel-heading"><i class="fa fa-file-text fa-fw"></i>계획안 관리</div>

					<ul>
						<li><a href="${pageContext.request.contextPath}/PlanFormList">계획안양식 조회</a></li> <!-- 양식을 불러온 다음 등록? -->
						<li><a href="${pageContext.request.contextPath}/PlanList">계획안 목록 조회</a></li>
					</ul>
				</div>
				</div>
				</div>
				</div>
				<!-- 7. 특별활동 메뉴 -->
				<div class="row">
				<div class="col-lg-6 col-lg-4">
				<div class="panel-body">
				 <div class="panel  panel-warning">
				 <div class="panel-heading"><i class="fa fa-dribbble fa-fw"></i>특별활동 관리</div>
					<ul>
						<li>특별활동</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/ProgramList">특별활동조회</a></li>
								<li><a href="${pageContext.request.contextPath}/ProgramAdd">특별활동등록</a></li>
							</ul>
						<li>특별활동 신청</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/ProgramDetail">내특별활동</a></li>
								<li><a href="${pageContext.request.contextPath}/ProgramApplication">특별활동신청</a></li>
							</ul>
					</ul>
				</div>	
				</div>
				</div>
				<!-- 8. 급식 메뉴 -->
				<div class="col-lg-6 col-lg-4">
				<div class="panel-body">
				 <div class="panel  panel-warning">
				 <div class="panel-heading"><i class="fa fa-cutlery fa-fw"></i>급식 관리</div>
					<ul>
						<li>식단</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/FeedingMenuList">식단 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/FeedingMenuAdd">식단 등록</a></li>
							</ul>
						<li>급식신청</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/FeedingApplicationList">급식 신청 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/FeedingApplicationAdd">급식 신청 등록</a></li>
							</ul>
						<li>월별급식</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/FeedingMonthlyList">월 급식비 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/FeedingMonthlyAdd">월 급식비 등록</a></li>
							</ul>	
						<li>식중독발생및처리</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/FeedingPoisonningList">식중독발생및처리 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/FeedingPoisonningAdd">식중독발생및처리 등록</a></li>
							</ul>
					</ul>
				</div>
				</div>
				</div>
				<!-- 9. 안전교육및점검 메뉴 -->
				<div class="col-lg-6 col-lg-4">	
				<div class="panel-body">
				<div class="panel  panel-warning">
				 <div class="panel-heading"><i class="fa fa-fire-extinguisher fa-fw"></i>안전교육및점검 관리</div>
					<ul>
						<li><a href="${pageContext.request.contextPath}/SafetyList">안전교육및점검 목록 조회</a></li>
						<li><a href="${pageContext.request.contextPath}/SafetyAdd">안전교육및점검 등록</a></li>
					</ul>
				</div>
				</div>
				</div>
				</div>
				<!-- 10. 회계 메뉴 -->
				<div class="row">
				<div class="col-lg-6 col-lg-4">	
				<div class="panel-body">
				<div class="panel panel-warning">
				 <div class="panel-heading"><i class="fa fa-won fa-fw"></i>회계 관리</div>
					<ul>
						<li>전표 관리</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/StatementList">전표 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/StatementAdd">전표 등록</a></li>
							</ul>
						<li>전표분류 관리</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/StatementCategoryList">급식 신청 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/StatementCategoryAdd">급식 신청 등록</a></li>
							</ul>	
						<li>계약 관리</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/ContractList">계약 목록</a></li>
								<li><a href="${pageContext.request.contextPath}/ContractAdd">계약 등록</a></li>
							</ul>		
						<li>거래처 관리</li>
							<ul>
								<li><a href="${pageContext.request.contextPath}/ClientList">거래처 목록</a></li>
								<li><a href="${pageContext.request.contextPath}/ClientAdd">거래처 등록</a></li>
							</ul>	
					</ul>
					</div>
				</div>
				</div>
				<!-- 11. 통합자원코드 메뉴 -->
				<div class="col-lg-6 col-lg-4">	
				<div class="panel-body">
				<div class="panel  panel-warning">
				 <div class="panel-heading"><i class="fa fa-archive fa-fw"></i>통합자원코드 관리</div>
					<ul>
						<li><a href="${pageContext.request.contextPath}/TotalResourceAdd">통합자원코드 등록</a></li>
						<li><a href="${pageContext.request.contextPath}/TotalResourceList">통합자원코드 조회</a></li>
					</ul>
				</div>
				</div>
				</div>
				<!-- 12. 유치원라이센스 메뉴 -->
				<div class="col-lg-6 col-lg-4">	
				<div class="panel-body">
				<div class="panel  panel-warning">
				 <div class="panel-heading"><i class="fa fa-gears fa-fw"></i>유치원라이센스 관리</div>
					<ul>
						<li><a href="${pageContext.request.contextPath}/LicenseAdd">유치원라이센스 등록</a></li>
						<li><a href="${pageContext.request.contextPath}/LicenseList">유치원라이센스 조회</a></li>
						<li><a href="${pageContext.request.contextPath}/LicenseSelect">유치원정보 조회</a></li>
					</ul>
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
