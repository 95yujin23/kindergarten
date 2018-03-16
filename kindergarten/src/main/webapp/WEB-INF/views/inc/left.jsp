<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
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
				<li><a href="index.html"><i class="fa fa-dashboard fa-fw"></i>
						Dashboard</a></li>
				<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
						Charts<span class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="flot.html">Flot Charts</a></li>
						<li><a href="morris.html">Morris.js Charts</a></li>
					</ul> <!-- /.nav-second-level --></li>
				<li><a href="tables.html"><i class="fa fa-table fa-fw"></i>
						Tables</a></li>
				<li><a href="forms.html"><i class="fa fa-edit fa-fw"></i>
						Forms</a></li>
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i> 급식 관리<span class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_menu">식단</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_application">급식신청</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_monthly">월별급식</a></li>
						<li><a href="${pageContext.request.contextPath}/feeding/feeding_poisonning">식중독발생및처리</a></li>
						<li><a href="icons.html"> Icons</a></li>
						<li><a href="grid.html">Grid</a></li>
					</ul> <!-- /.nav-second-level --></li>
				<li><a href="#"><i class="fa fa-sitemap fa-fw"></i>
						Multi-Level Dropdown<span class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="#">Second Level Item</a></li>
						<li><a href="#">Second Level Item</a></li>
						<li><a href="#">Third Level <span class="fa arrow"></span></a>
							<ul class="nav nav-third-level">
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
								<li><a href="#">Third Level Item</a></li>
							</ul> <!-- /.nav-third-level --></li>
					</ul> <!-- /.nav-second-level --></li>
				<li><a href="#"><i class="fa fa-files-o fa-fw"></i>
						Sample Pages<span class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="blank.html">Blank Page</a></li>
						<li><a href="login.html">Login Page</a></li>
					</ul> <!-- /.nav-second-level --></li>
			</ul>
		</div>
		<!-- /.sidebar-collapse -->
	</div>
</html>