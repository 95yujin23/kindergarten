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
							<li><a href="${pageContext.request.contextPath}/Team">
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
								<li><a href="${pageContext.request.contextPath}/TeacherAdd">교직원 등록</a></li>
							</ul>	
						</li>
						<li><a href="#">교직원 인건비 지급<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/TeacherPayList">인건비 지급 전체 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/TeacherPayAdd">인건비 지급 등록</a></li>
							</ul>	
						</li>
						<li><a href="#">교직원 근태<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/TeacherAttendance">교직원 출퇴근 등록</a></li>
								<li><a href="${pageContext.request.contextPath}/TeacherAttendanceList">교직원 근태 전체 조회</a></li>
							</ul>	
						</li>
					</ul>
				</li>
				
				<!-- 4. 영유아 메뉴 -->
				<li><a href="#"><i class="fa fa-edit fa-fw"></i>
						영유아 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="#">영유아관리<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
						<li><a href="${pageContext.request.contextPath}/KidsList">영유아 목록</a></li>
						<li><a href="${pageContext.request.contextPath}/KidsAdd">영유아 등록</a></li>
							</ul>
						<li><a href="#">출석관리<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/KidsAttendance">등하원 등록</a></li>
								<li><a href="${pageContext.request.contextPath}/KidsAttendanceList">등하원 전체 조회</a></li>
							</ul>	
						</li>
						<li><a href="${pageContext.request.contextPath}/KidsClass">반 현황</a></li>
					</ul>
				</li>
				
				<!-- 5. 영유아 일지 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						영유아 일지 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/KidsReportList">일지목록</a></li>
						<li><a href="#">일지관리<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/ReportSetting">일지설정</a></li>
							</ul>
						</li>
					</ul>
				</li>
				
				<!-- 6. 계획안 메뉴 -->
				<li><a href="#"><i class="fa fa-sitemap fa-fw"></i>
						계획안 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/PlanFormList">계획안양식 조회</a></li> <!-- 양식을 불러온 다음 등록? -->
						<li><a href="${pageContext.request.contextPath}/PlanList">계획안 목록 조회</a></li>
					</ul>
				</li>
					
				<!-- 7. 특별활동 메뉴 -->
				<li><a href="#"><i class="fa fa-sitemap fa-fw"></i>
						특별활동 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="#">특별활동<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/ProgramList">특별활동조회</a></li>
								<li><a href="${pageContext.request.contextPath}/ProgramAdd">특별활동등록</a></li>
							</ul>
						</li>
						<li><a href="#">특별활동 신청<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/ProgramDetail">내특별활동</a></li>
								<li><a href="${pageContext.request.contextPath}/ProgramApplication">특별활동신청</a></li>
							</ul>
						</li>
					</ul>
				</li>
					
				<!-- 8. 급식 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						급식 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="#">식단<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/FeedingMenuList">식단 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/FeedingMenuAdd">식단 등록</a></li>
							</ul>
						</li>
						<li><a href="#">급식신청<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/FeedingApplicationList">급식 신청 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/FeedingApplicationAdd">급식 신청 등록</a></li>
							</ul>
						</li>					
						<li><a href="#">월별급식<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/FeedingMonthlyList">월 급식비 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/FeedingMonthlyAdd">월 급식비 등록</a></li>
							</ul>	
						</li>				
						<li><a href="#">식중독발생및처리<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/FeedingPoisonningList">식중독발생및처리 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/FeedingPoisonningAdd">식중독발생및처리 등록</a></li>
							</ul>
						</li>					
					</ul>
				</li>
					
				<!-- 9. 안전교육및점검 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						안전교육및점검 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/SafetyList">안전교육및점검 목록 조회</a></li>
						<li><a href="${pageContext.request.contextPath}/SafetyAdd">안전교육및점검 등록</a></li>
					</ul>
				</li>
				
				<!-- 10. 회계 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						회계 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="#">전표 관리<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/StatementList">전표 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/StatementAdd">전표 등록</a></li>
							</ul>
						</li>
						<li><a href="#">전표분류 관리<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/StatementCategoryList">급식 신청 조회</a></li>
								<li><a href="${pageContext.request.contextPath}/StatementCategoryAdd">급식 신청 등록</a></li>
							</ul>	
						</li>					
						<li><a href="#">계약 관리<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/ContractList">계약 목록</a></li>
								<li><a href="${pageContext.request.contextPath}/ContractAdd">계약 등록</a></li>
							</ul>		
						</li>				
						<li><a href="#">거래처 관리<span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="${pageContext.request.contextPath}/ClientList">거래처 목록</a></li>
								<li><a href="${pageContext.request.contextPath}/ClientAdd">거래처 등록</a></li>
							</ul>	
						</li>				
					</ul>
				</li>

				<!-- 11. 통합자원코드 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						통합자원코드 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/TotalResourceAdd">통합자원코드 등록</a></li>
						<li><a href="${pageContext.request.contextPath}/TotalResourceList">통합자원코드 조회</a></li>
					</ul>
				</li>									

				<!-- 12. 유치원라이센스 메뉴 -->
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
						유치원라이센스 관리<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/LicenseAdd">유치원라이센스 등록</a></li>
						<li><a href="${pageContext.request.contextPath}/LicenseList">유치원라이센스 조회</a></li>
						<li><a href="${pageContext.request.contextPath}/LicenseSelect">유치원정보 조회</a></li>
					</ul>
				</li>																	
			</ul>
		</div>
	</div>
	</div>
</html>