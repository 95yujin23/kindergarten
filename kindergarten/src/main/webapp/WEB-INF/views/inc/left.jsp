<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<div class="sidebar">
	<div class="navbar-default sidebar" role="navigation">
		<div class="sidebar-nav navbar-collapse">
			<ul class="nav" id="side-menu">
				<li class="sidebar-search">
					<div class="input-group custom-search-form">
						<input type="text" class="form-control" placeholder="Search...">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div> <!-- /input-group -->
				</li>
				<c:if test="${empty sessionScope.loginTeacher}">
				
				<!-- 1. 프로젝트 및 팀 소개 메뉴 -->
				<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
						Project & Team Introduce<span class="fa arrow"></span>
					</a>
						<ul class="nav nav-second-level">
							<li><a href="${pageContext.request.contextPath}/">
									Project
								</a>
							</li>
							<li><a href="${pageContext.request.contextPath}/team">
									Team
								</a>
							</li>
						</ul>
				</li>
				
				<!-- 2. 프로젝트 시작 : 로그인 -->
				<li><a href="${pageContext.request.contextPath}/Login"><i class="fa fa-dashboard fa-fw"></i>
						Project Start
					</a>
				</li>
				</c:if>		
				<!-- 3. 교직원 메뉴 -->				
				<li><a href="#"><i class="fa fa-table fa-fw"></i>
						교직원 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="#">교직원<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/TeacherList">교직원 전체 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/TeacherSelect">교직원 개인 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/TeacherAdd">교직원 등록</a></li>
							</ul>	
						<li><a href="#">교직원 인건비 지급<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/TeacherAdd">인건비 지급 전체 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/TeacherAdd">인건비 지급 개인 조회</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
							</ul>	
						<li><a href="#">교직원 근태<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="#">교직원 근태 전체 조회</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
							</ul>	
					</ul>
				</li>
				
				<!-- 4. 영유아 메뉴 -->
				<li><a href="#"><i class="fa fa-edit fa-fw"></i>
						영유아 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/kidsList">유아목록</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_monthly">반별현황</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_poisonning">유아출석현황</a></li>
					</ul>
				</li>
				
				<!-- 5. 영유아 일지 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						영유아 일지 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_menu">식단</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_application">급식신청</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_monthly">월별급식</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_poisonning">식중독발생및처리</a></li>
						<li><a href="icons.html"> Icons</a></li>
						<li><a href="grid.html">Grid</a></li>
					</ul>
				</li>
				
				<!-- 6. 계획안 메뉴 -->
				<li><a href="#"><i class="fa fa-sitemap fa-fw"></i>
						계획안 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_menu">식단</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_application">급식신청</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_monthly">월별급식</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_poisonning">식중독발생및처리</a></li>
						<li><a href="icons.html"> Icons</a></li>
						<li><a href="grid.html">Grid</a></li>
					</ul>
				</li>
					
				<!-- 7. 특별활동 메뉴 -->
				<li><a href="#"><i class="fa fa-sitemap fa-fw"></i>
						특별활동 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/program/programDetail">내특별활동</a></li> <!-- 영유아 -->
						<li><a href="${pageContext.request.contextPath}/program/programApplication">특별활동신청</a></li> <!-- 영유아 -->
						<li><a href="${pageContext.request.contextPath}/program/programAdd">특별활동등록</a></li> <!-- 교직원 -->
						<li><a href="${pageContext.request.contextPath}/program/programModify">특별활동수정</a></li> <!-- 교직원 -->
						<li><a href="${pageContext.request.contextPath}/program/programList">특별활동조회</a></li> <!-- 교직원 -->
					</ul>
				</li>
					
				<!-- 8. 급식 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						급식 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="">식단<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/feeding/feeding_menu">식단 조회</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
							</ul>
						</li>
						<li><a href="#">급식신청<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/feeding/feeding_application">급식 신청 조회</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
							</ul>					
						<li><a href="#">월별급식<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/feeding/feeding_monthly">월 급식비 조회</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
							</ul>					
						<li><a href="#">식중독발생및처리<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/feeding/feeding_poisonning">식중독발생및처리 조회</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
							</ul>					
					</ul>
				</li>
					
				<!-- 9. 안전교육및점검 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						안전교육및점검 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_menu">식단</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_application">급식신청</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_monthly">월별급식</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_poisonning">식중독발생및처리</a></li>
					</ul>
				</li>
				
				<!-- 10. 회계 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						회계 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_menu">식단</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_application">급식신청</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_monthly">월별급식</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_poisonning">식중독발생및처리</a></li>
					</ul>
				</li>	
				<!-- 11. 거래처관리 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						거래처 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/client/client_list">거래처목록</a></li>
						<li><a href="${pageContext.request.contextPath}/client/client_add">거래처등록</a></li>
						<li><a href="${pageContext.request.contextPath}/client/client_modify">거래처수정</a></li>
					</ul>
				</li>
				<!-- 12. 계약관리 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						계약 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/contract/contract_list">계약목록</a></li>
						<li><a href="${pageContext.request.contextPath}/contract/contract_add">계약등록</a></li>
						<li><a href="${pageContext.request.contextPath}/contract/contract_modify">계약수정</a></li>						
					</ul>
				</li>								

				<!-- 13. 통합자원코드 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						통합자원코드 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_menu">식단</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_application">급식신청</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_monthly">월별급식</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_poisonning">식중독발생및처리</a></li>
					</ul>
				</li>									

				<!-- 14. 유치원라이센스 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						유치원라이센스 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_menu">식단</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_application">급식신청</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_monthly">월별급식</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_poisonning">식중독발생및처리</a></li>
					</ul>
				</li>																	
					<!-- <ul class="nav nav-second-level">
						<li><a href="#">Second Level Item</a></li>
						<li><a href="#">Second Level Item</a></li>
						<li><a href="#">Third Level <span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
							</ul> /.nav-third-level</li>
					</ul> /.nav-second-level</li> -->
			</ul>
		</div>
		<!-- /.sidebar-collapse -->
	</div>
	</div>
</html>