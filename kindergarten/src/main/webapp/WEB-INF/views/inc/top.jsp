<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<!-- Bootstrap Social CSS -->
<link href="resources/vendor/css/bootstrap-social.css" rel="stylesheet">
	<div class="navbar-header">
		<!-- <button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="sr-only">Toggle navigation</span> <span
				class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
		</button> -->
		<a class="navbar-brand" href="${pageContext.request.contextPath}/">OHAYOU</a>
	</div>
	<ul class="nav navbar-top-links navbar-right">
	<li class="dropdown">
	<a class="btn btn-success btn-social-icon btn-lg" href="${pageContext.request.contextPath}/SiteMap"><i class="fa fa-sitemap"></i></a>
	</li>
		<!-- 교직원 상태창 : 교직원만 보이게 하기 (원장x)-->
		<li class="dropdown">
			<a class="dropdown-toggle btn btn-warning btn-social btn-lg" data-toggle="dropdown" href="#">
				<i class="fa fa-bell"></i><i class="fa fa-caret-down"></i>
			</a>
			<ul class="dropdown-menu dropdown-alerts">
				<li><a href="${pageContext.request.contextPath}/KidsListByClass">
						<i class="fa fa-comment fa-fw"></i>우리반 아이들
						<span class="pull-right text-muted small">내가 맡은 반</span>
					</a>
				</li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/TeacherAttendanceList">
						<i class="fa fa-twitter fa-fw"></i>출근 현황
						<span class="pull-right text-muted small">한달간</span>
					</a>
				</li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/TeacherPaySelect">
						<i class="fa fa-envelope fa-fw"></i>인건비 지급 내역
						<span class="pull-right text-muted small">1년간</span>
					</a>
				</li>
			</ul>
		</li>
		
		<!-- 개인 관리 창 -->
		<li class="dropdown"><a class="dropdown-toggle btn btn-primary btn-social btn-lg" 
			data-toggle="dropdown" href="#"> <i class="fa fa-user"></i>
				<i class="fa fa-caret-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-user">
				<li><a href="${pageContext.request.contextPath}/TeacherSelect"><i class="fa fa-user fa-fw"></i>내 정보</a></li>
				<li><a href="${pageContext.request.contextPath}/TeacherAttendanceAdd"><i class="fa fa-gear fa-fw"></i>출근</a>
				</li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/Logout"><i class="fa fa-sign-out fa-fw"></i>
						로그아웃</a></li>
			</ul>
		</li>
	</ul>
</html>