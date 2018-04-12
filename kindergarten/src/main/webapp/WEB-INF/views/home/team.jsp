<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>영유아 관리 시스템</title>

<!-- Bootstrap Core CSS -->
<link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="resources/vendor/css/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="resources/vendor/css/sb-admin-2.css" rel="stylesheet">

<!-- Bootstrap Social CSS -->
<link href="resources/vendor/css/bootstrap-social.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
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
			<div class="panel panel-default">
				<div class="panel-heading">
					<h1 class="page-header">팀원 소개</h1>
				</div>
				<div class="panel-body">
					<div class="row">
					<!-- 한보아 소개 시작 -->
			        	<div class="col-lg-3">
			            	<div class="panel panel-danger">
			                	<div class="panel-heading">
			                    	<center><h4><strong>한보아</strong></h4><small>팀장</small></center>
			                    </div>
			                    <div class="panel-body">
			                    	<div>
										<ul class="list-unstyled">
											<li>
												<strong>담당업무</strong>
											</li>
												<div class="clearfix"></div>
											<li>
												교직원 관리
											</li>
											<li>
												영유아 관리
											</li>
											<li>
												안전 관리
											</li>
											<li>
												통합자원 관리
											</li>
											<li>
												유치원라이센스 관리
											</li>
										</ul>
			                        </div>
			                   </div>
			                   <div class="panel-footer">
				                   <center>
				                     <a class="btn btn-social btn-google-plus btn-sm" href="http://blog.naver.com/hanboa1026" class="btn btn-danger btn-block"><i class="fa fa-bold"></i>Blog</a>
				                 	 <a class="btn btn-social btn-github btn-sm" href="https://github.com/hanboa1026" class="btn btn-danger btn-block"><i class="fa fa-github"></i>Git</a>
				                    <a class="btn btn-social btn-bitbucket btn-sm" href="#" class="btn btn-danger btn-block"><i class="fa fa-h-square"></i>Host</a>
								</div>
							</div>
							<div class="panel panel-danger">
								<div class="panel-heading">
									<center><strong>한보아 자기기술서</strong></center>
								</div>
			                    <div class="panel-body">
			                    	<div class="panel-group" id="accordion">
			                        	<div class="panel panel-red">
			                            	<div class="panel-heading">
				                              	<h4 class="panel-title">
				                                  	<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">구현한 기능</a>
				                                </h4>
			                           		</div>
					                            <div id="collapseOne" class="panel-collapse collapse in">
						                            <div class="panel-body">
						                            	@@
						                            </div>
					                            </div>
			                        	</div>
			                            <div class="panel panel-red">
			                            	<div class="panel-heading">
			                                	<h4 class="panel-title">
			                                   		<a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">미완성된 기능</a>
			                                    </h4>
			                           		</div>
			                                    <div id="collapseTwo" class="panel-collapse collapse">
			                                        <div class="panel-body">
			                                        	@@
			                                        </div>
			                                    </div>
			                           	</div>
										</div>
									</div>
			                    </div>
			                </div>
			                <!-- 한보아 소개 끝 -->
			                
			                <!-- 박미란 소개 시작 -->
			                <div class="col-lg-3">
			                    <div class="panel panel-warning">
			                        <div class="panel-heading">
			                        	<center><h4><strong>박미란</strong></h4><small>팀원</small></center>
			                        </div>
			                        <div class="panel-body">
			                        	<div>
											<ul class="list-unstyled">
												<li>
													<strong>담당업무</strong>
												</li>
												<div class="clearfix"></div>
												<li>
													급식관리
												</li>
												<li>
													거래처 관리
												</li>
												<li>
													계약 관리
												</li>
											</ul>
			                        	</div>
			                        </div>
			                        <div class="panel-footer">
			  							<center>
				                        <a class="btn btn-social btn-google-plus btn-sm" href="#" class="btn btn-danger btn-block"><i class="fa fa-bold"></i>Blog</a>
				                      	<a class="btn btn-social btn-github btn-sm" href="https://github.com/duemiran" class="btn btn-danger btn-block"><i class="fa fa-github"></i>Git</a>
				                        <a class="btn btn-social btn-bitbucket btn-sm" href="#" class="btn btn-danger btn-block"><i class="fa fa-h-square"></i>Host</a>
			                        </div>
			                    </div>
			                    <div class="panel panel-warning">
			                    	<div class="panel-heading">
			                        	<center><strong>박미란 자기기술서</strong></center>
			                        </div>
			                        <!-- .panel-heading -->
			                        <div class="panel-body">
			                            <div class="panel-group" id="accordion">
			                                <div class="panel panel-yellow">
			                                    <div class="panel-heading">
			                                        <h4 class="panel-title">
			                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne2">구현한 기능</a>
			                                        </h4>
			                                    </div>
			                                    <div id="collapseOne2" class="panel-collapse collapse in">
			                                        <div class="panel-body">
			                                       		@@
			                                        </div>
			                                    </div>
			                                </div>
			                                <div class="panel panel-yellow">
			                                    <div class="panel-heading">
			                                        <h4 class="panel-title">
			                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo2">미완성된 기능</a>
			                                        </h4>
			                                    </div>
			                                    <div id="collapseTwo2" class="panel-collapse collapse">
			                                        <div class="panel-body">
			                                       		@@
			                                        </div>
			                                    </div>
			                                </div>
			                            </div>
			                        </div>
			                    </div>
			                </div>
			                <!-- 박미란 소개 끝 -->
			                
			                <!-- 정은화 소개 시작 -->
			                <div class="col-lg-3">
			                    <div class="panel panel-success">
			                        <div class="panel-heading">
			                         <center><h4><strong>정은화</strong></h4><small>팀원</small></center>
			                        </div>
			                        <div class="panel-body">
			                        <div>
										<ul class="list-unstyled">
											<li>
												<strong>담당업무</strong>
											</li>
											<div class="clearfix"></div>
											<li>
												출결 관리
											</li>
											<li>
												계획안 관리
											</li>
											<li>
												특별활동 관리
											</li>
										</ul>
			                        </div>
			                        </div>
			                         
			                        <div class="panel-footer">
			   						<center>
			                          <a class="btn btn-social btn-google-plus btn-sm" href="https://blog.naver.com/dmsghk6049" class="btn btn-danger btn-block"><i class="fa fa-bold"></i>Blog</a>
			                      	 <a class="btn btn-social btn-github btn-sm" href="https://github.com/behyun" class="btn btn-danger btn-block"><i class="fa fa-github"></i>Git</a>
			                         <a class="btn btn-social btn-bitbucket btn-sm" href="#" class="btn btn-danger btn-block"><i class="fa fa-h-square"></i>Host</a>
			                        </div>
			                     
			                    </div>
			                     <div class="panel panel-success">
			                        <div class="panel-heading">
			                           <center><strong>정은화 자기기술서</strong></center>
			                        </div>
			                        <!-- .panel-heading -->
			                        <div class="panel-body">
			                            <div class="panel-group" id="accordion">
			                                <div class="panel panel-green">
			                                    <div class="panel-heading">
			                                        <h4 class="panel-title">
			                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne3">구현한 기능</a>
			                                        </h4>
			                                    </div>
			                                    <div id="collapseOne3" class="panel-collapse collapse in">
			                                        <div class="panel-body">
			                                        @@
			                                        </div>
			                                    </div>
			                                </div>
			                                <div class="panel panel-green">
			                                    <div class="panel-heading">
			                                        <h4 class="panel-title">
			                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo3">미완성된 기능</a>
			                                        </h4>
			                                    </div>
			                                    <div id="collapseTwo3" class="panel-collapse collapse">
			                                        <div class="panel-body">
			                                       	@@
			                                        </div>
			                                    </div>
			                                </div>
			                            </div>
			                        </div>
			                    </div>
			                </div>
			                <!-- 정은화 소개 끝 -->
			                
			                <!-- 김규원 소개 시작 -->
			                <div class="col-lg-3">
			                    <div class="panel panel-info">
			                        <div class="panel-heading">
			                             <center><h4><strong>김규원</strong></h4><small>팀원</small></center>
			                        </div>
			                        <div class="panel-body">
			                        <div>
										<ul class="list-unstyled">
											<li>
												<strong>담당업무</strong>
											</li>
											<div class="clearfix"></div>
											<li>
												반편성 관리
											</li>
											<li>
												일지 관리
											</li>
											<li>
												전표 관리
											</li>
										</ul>
			                        </div>
			                        </div>
			                        <div class="panel-footer">
			 							<center>
				                        <a class="btn btn-social btn-google-plus btn-sm" href="http://universecoding.tistory.com/" class="btn btn-danger btn-block"><i class="fa fa-bold"></i>Blog</a>
				                      	<a class="btn btn-social btn-github btn-sm" href="https://github.com/kyuwonism" class="btn btn-danger btn-block"><i class="fa fa-github"></i>Git</a>
				                        <a class="btn btn-social btn-bitbucket btn-sm" href="#" class="btn btn-danger btn-block"><i class="fa fa-h-square"></i>Host</a>
			                    	</div>
			                     </div>
			                     <div class="panel panel-info">
			                        <div class="panel-heading">
			                        	<center><strong>김규원 자기기술서</strong></center>
			                        </div>
			                        <div class="panel-body">
			                            <div class="panel-group" id="accordion">
			                                <div class="panel panel-primary">
			                                    <div class="panel-heading">
			                                        <h4 class="panel-title">
			                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne4">구현한 기능</a>
			                                        </h4>
			                                    </div>
			                                    <div id="collapseOne4" class="panel-collapse collapse in">
			                                        <div class="panel-body">
			                                        @@
			                                        </div>
			                                    </div>
			                                </div>
			                                <div class="panel panel-primary">
			                                    <div class="panel-heading">
			                                        <h4 class="panel-title">
			                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo4">미완성된 기능</a>
			                                        </h4>
			                                    </div>
			                                    <div id="collapseTwo4" class="panel-collapse collapse">
			                                        <div class="panel-body">
			                                        @@
			                                        </div>
			                                    </div>
			                                </div>
			                            </div>
			                   		</div>
			                 	</div>
			                </div>
			                <!-- 김규원 소개 끝 -->
						</div>
					</div>    
				</div>
			</div>
				<div class="col-lg-12"><br>
			 		<div class="panel panel-default">
	 					<div class="panel-heading">
							<h1 class="page-header">교육 과정</h1>
						</div>
						<!-- /.panel-heading -->
	                    <div class="panel-body">
	                     	<div class="panel-group">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                           	교육 기관
                                        </h4>
                                    </div>
                                    <div class="panel-collapse collapse in">
                                        <div class="panel-body">
                                      		 한국스마트정보교육원
                                        </div>
                                    </div>
                                </div>
                           </div>
                           <div class="panel-group" id="accordion">
                               <div class="panel panel-default">
                                   <div class="panel-heading">
                                       <h4 class="panel-title">
                                       		교육명
                                       </h4>
                                   </div>
                                   <div class="panel-collapse collapse in">
                                       <div class="panel-body">
                                      	 국가 기간/전략 산업 직종 훈련 (NCS) - 웹/어플 제품 SW개발자양성 (응용SW 및 DB엔지니어링 융합)
                                       </div>
                                   </div>
                               </div>    
							</div>
							<div class="panel-group" id="accordion">
                               <div class="panel panel-default">
                                   <div class="panel-heading">
                                       <h4 class="panel-title">
                                       		교육 내용
                                       </h4>
                                   </div>
                                   <div class="panel-collapse collapse in">
                                       <div class="panel-body">
                                      	1. 웹/모바일웹 화면 개발언어 : HTML5, JavaScript, JQuery, JQuery Mobile, Json 등 <br/>
										2. 웹/모바일웹 서버측 개발언어 : Java, JSP, Servlet 등 <br/>
										3. Framework : Spring, Mybatis 등 <br/>
										4. Model : Model1, Model2, MVC <br/>
										5. 팀프로젝트 실무
                                       </div>
                                   </div>
                               </div>    
							</div>
							<div class="panel-group" id="accordion">
                               <div class="panel panel-default">
                                   <div class="panel-heading">
                                       <h4 class="panel-title">
                                       		교육 기간
                                       </h4>
                                   </div>
                                   <div class="panel-collapse collapse in">
                                       <div class="panel-body">
                                      	2017.10.16 ~ 2018.04.20
                                       </div>
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
</div>

</body>
</html>
