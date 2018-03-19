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
	<c:import url="./inc/top.jsp"></c:import>
	<!-- TOP -->

	<!-- LEFT : Navigation -->
	<c:import url="./inc/left.jsp"></c:import>
	<!-- LEFT -->
	</nav>
</div>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Forms</h1>
				</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
  					<div class="panel-heading">
						Basic Form Elements
					</div>
				<div class="panel-body">
   				 	<div class="row">
						<div class="col-lg-12">
							<form role="form">
    							<div class="form-group">
									<label>Text Input</label>
									<input class="form-control">
									<p class="help-block">Example block-level help text here.</p>
    							</div>
    							<div class="form-group">
      								<label>Text Input with Placeholder</label>
									input class="form-control" placeholder="Enter text">
								</div>	
							</form>
						</div>
					</div>
				</div>
				</div>
			</div>
		</div>
	</div>
	<!-- FOOTER : Navigation -->
	<c:import url="./inc/footer.jsp"></c:import>
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
</body>
</html>
