<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>유치원 요약 정보</title>

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

<script src="resources/vendor/js/jquery.min.js"></script>
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
	<c:set var="kindergarten" value="${license}"/>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">${kindergarten.kindergartenNm} 정보 요약</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-6">
				<table class="table table-striped table-bordered table-hover">
					<tr>
						<td>대표자명</td>
						<td>${kindergarten.kindergartenLeader}</td>
					</tr>
					<tr>
						<td>설립유형</td>
						<td>${kindergarten.kindergartenTypeOfFoundation}</td>
					</tr>
					<tr>
						<td>설립(개원)일</td>
						<td>${kindergarten.kindergartenDateOfFoundation}</td>
					</tr>
					<tr>
						<td>홈페이지</td>
						<td><a href="${kindergarten.kindergartenHomepage}">${kindergarten.kindergartenHomepage}</a></td>
					</tr>
					<tr>
						<td>전화번호</td>
						<td>${kindergarten.kindergartenPhone}</td>
					</tr>
					<tr>
						<td>운영시간</td>
						<td>${kindergarten.kindergartenOpenHour}</td>
					</tr>
					<tr>
						<td>주소</td>
						<td>${kindergarten.kindergartenAddress}</td>
					</tr>
					<tr>
						<td>우편번호</td>
						<td>${kindergarten.kindergartenPostCd}</td>
					</tr>
				</table>
			</div>
				<div class="col-lg-6">
				<table class="table table-striped table-bordered table-hover">
					<tr><td><div id="map" style="width:100%;height:400px;"></div></td></tr>
				</table>
				</div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=25d7e7832ecdbf853a349bb2f0f1b86f&libraries=services"></script>
		<script>
			var container = document.getElementById('map'); // 지도를 표시할 div
			var options = {
				center: new daum.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
				level: 3 // 지도의 확대 레벨
			};
			// 1. 지도를 생성합니다.
			var map = new daum.maps.Map(container, options);
			// 2. 주소-좌표 변환 객체를 생성합니다. : services 라이브러리 추가 (&libraries=services)
			var geocoder = new daum.maps.services.Geocoder();
			// 3. 주소로 좌표를 검색합니다. : addressSearch
			
			geocoder.addressSearch('${kindergarten.kindergartenAddress}', function(result, status){
				// 4. 정상적으로 검색이 완료 : 타입 비교 (===)
				if(status === daum.maps.services.Status.OK){
					var coords = new daum.maps.LatLng(result[0].y, result[0].x);
						//coords 객체에 좌표값 대입
					// 5. 결과값으로 받은 위치를 마커로 표시합니다.
					var marker = new daum.maps.Marker({
						map : map,
						position : coords
					});
					// 6. 인포윈도우로 장소에 대한 설명을 표시합니다.
					var infowindow = new daum.maps.InfoWindow({
						content: '<div style="width:150px;text-align:center;padding:6px 0;">유치원 위치</div>'
					});
					infowindow.open(map, marker);
					// 7. 지도의 중심을 결과값으로 받은 위치로 이동시킵니다.
					map.setCenter(coords);
				}
			});
		</script>
		</div>
	<!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->
	</div>	
	
	<!-- jQuery -->
	
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
