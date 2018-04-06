<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>유치원 라이센스 등록 화면</title>

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

	<!-- LEFT : Navigation -->
	<c:import url="../inc/left.jsp"></c:import>
	<!-- LEFT -->
	</nav>
</div>
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">		
			<h1 class="page-header">유치원 라이센스 등록</h1>
			<!-- 등록은 원장 및 대표자 -> 관리자에게 등록 요청 -> 관리자 승인 시 등록완료 
				 - 관리자가 승인했을 때, 라이센스 코드를 생성하면서 데이터에 등록 -->
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
				    유치원 라이센스를 등록해주세요.
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-8">
							<form id="addForm" action="${pageContext.request.contextPath}/LicenseAdd" method="POST">
								<table class="table table-striped table-bordered table-hover">
									<tr>
										<td><label>유치원 명</label></td>
									    <td><input class="form-control" id="kindergartenNm" name="kindergartenNm" placeholder="라이센스 요청 유치원"></td>
									</tr>
									<tr>
								    	<td><label>유치원 주소</label><button type="button" id="postcodify_search_button">검색</button></td>
									 	<td><input class="postcodify_postcode5 form-control" type="text" id="kindergartenPostCd" name="kindergartenPostCd" placeholder="우편번호"></td>
									</tr>
									<tr>
										<td><input class="postcodify_address form-control" type="text" id="kindergartenAddress" name="kindergartenAddress" /></td>
										<td><input class="postcodify_extra_info form-control"  type="text" id="kindergartenExtraAddr" name="kindergartenExtraAddr" /></td>
									</tr>
									<tr>
								    <td><label>유치원 연락처</label>
								    <fieldset>
									<input class="form-control" placeholder="지역번호" type="text" name="local" id="local" list="local-list">
										<datalist id="local-list">
										<option value="0" label="선택">
										<option value="02-" label="서울특별시">
										<option value="031-" label="경기도">
										<option value="032-" label="인천광역시">
										<option value="033-" label="강원도">
										<option value="041-" label="충청남도">
										<option value="042-" label="대전광역시">
										<option value="043-" label="충청북도">
										<option value="044-" label="세종특별자치시">
										<option value="051-" label="부산광역시">
										<option value="052-" label="울산광역시">
										<option value="053-" label="대구광역시">
										<option value="054-" label="경상북도">
										<option value="055-" label="경상남도">
										<option value="061-" label="전라남도">
										<option value="062-" label="광주광역시">
										<option value="063-" label="전라북도">
										<option value="064-" label="제주특별자치도">
										</datalist>
									</fieldset></td>
									<td>
									<br>
									<input type="text" class="form-control" id="kindergartenPhone" name="kindergartenPhone" placeholder="지역번호를 제외한 나머지 번호를 입력해주세요."/></td>
								    </tr>
								</table>
								<button id="addButton" type="button">등록</button>
							</form>
							<!-- 승인되지 않은 키라고 나옴 why ? 
								<form name="form" id="form2" method="post">
							  <input type="hidden" name="currentPage" value="1"/>
							  요청 변수 설정 (현재 페이지. currentPage : n > 0)
							  <input type="hidden" name="countPerPage" value="10"/>
							  요청 변수 설정 (페이지당 출력 개수. countPerPage 범위 : 0 < n <= 100)
							  <input type="hidden" name="resultType" value="json" value="4"/> 			
							  요청 변수 설정 (검색결과형식 설정, json) 
							  <input type="hidden" name="confmKey" value="QGBndjl%2FUF07t9AbyWzr9Z7SnAHjhQ6e07x1MIXGOMkqC8ujpQXLcwYvIX6smzOSCPZb1dLgKoSgpvr0LdPWBw%3D%3D"/>		
							  요청 변수 설정 (승인키)  
							  <input type="text"   name="keyword" value="keyword" onkeydown="enterSearch();"/>	
							  요청 변수 설정 (키워드)
							  <input type="button" onClick="getAddr();" value="주소검색하기"/>
							  <div class="pop-address-search" id="list">
							  검색 결과 리스트 출력 영역 
							  <div class="paginate" id="pageApi"></div></div>
							</form> -->
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
	<!-- 도로명주소 OPEN API 팝업 -->
	<script >
/* 	// opener관련 오류가 발생하는 경우 아래 주석을 해지하고, 사용자의 도메인정보를 입력합니다. ("팝업API 호출 소스"도 동일하게 적용시켜야 합니다.)
	document.domain = "http://localhost:8080";
	
	$(function (goPopup)({
		
		// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
	   	var pop = window.open("${pageContext.request.contextPath}/license/jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
	    
		// 모바일 웹인 경우, 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrMobileLinkUrl.do)를 호출하게 됩니다.
	    //var pop = window.open("/popup/jusoPopup.jsp","pop","scrollbars=yes, resizable=yes"); 
	)};
	/** API 서비스 제공항목 확대 (2017.02) **/
	/*$(function (form)({(roadFullAddr,roadAddrPart1,addrDetail,roadAddrPart2,engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn
							, detBdNmList, bdNm, bdKdcd, siNm, sggNm, emdNm, liNm, rn, udrtYn, buldMnnm, buldSlno, mtYn, lnbrMnnm, lnbrSlno, emdNo){
		// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
		document.form.roadAddrPart1.value = roadAddrPart1;
		document.form.roadAddrPart2.value = roadAddrPart2;
		document.form.addrDetail.value = addrDetail;
		document.form.zipNo.value = zipNo;
	)}}; */
	</script>
	
	<!-- 도로명주소 OPEN API 검색 -->
	<script>
	function getAddr(){
		// AJAX 주소 검색 요청
		$.ajax({
			url:"${pageContext.request.contextPath}/sample/getAddrApi.do"// 고객사 API 호출할 Controller URL
			,type:"post"
			,data:$("#form2").serialize() 							// 요청 변수 설정
			,dataType:"json"											// 데이터 결과 : JSON
			,success:function(jsonStr){									// jsonStr : 주소 검색 결과 JSON 데이터
				$("#list").html("");									// 결과 출력 영역 초기화
				var errCode = jsonStr.results.common.errorCode; 		// 응답코드
				var errDesc = jsonStr.results.common.errorMessage;		// 응답메시지
				if(errCode != "0"){ 									// 응답에러시 처리
					alert(errCode+"="+errDesc);
				}else{
					if(jsonStr!= null){
						makeListJson(jsonStr);							// 결과 JSON 데이터 파싱 및 출력
					}
				}
			}
			,error: function(xhr,status, error){
				alert("에러발생");										// AJAX 호출 에러
			}
		});
	}
	
	function makeListJson(jsonStr){
		var htmlStr = "";
		htmlStr += '<table class="table table-striped table-bordered table-hover">';
		/* jquery를 이용한 JSON 결과 데이터 파싱 */
		$(jsonStr.results.juso).each(function(){
			htmlStr += "<tr>";
			htmlStr += "<td>"+this.roadAddr+"</td>";
			/* htmlStr += "<td>"+this.roadAddrPart1+"</td>";
			htmlStr += "<td>"+this.roadAddrPart2+"</td>";
			htmlStr += "<td>"+this.jibunAddr+"</td>";
			htmlStr += "<td>"+this.engAddr+"</td>"; */
			htmlStr += "<td>"+this.zipNo+"</td>";
			/* htmlStr += "<td>"+this.admCd+"</td>";
			htmlStr += "<td>"+this.rnMgtSn+"</td>";
			htmlStr += "<td>"+this.bdMgtSn+"</td>";
			htmlStr += "<td>"+this.detBdNmList+"</td>"; */
			/** API 서비스 제공항목 확대 (2017.02) **/
			/* htmlStr += "<td>"+this.bdNm+"</td>";
			htmlStr += "<td>"+this.bdKdcd+"</td>";
			htmlStr += "<td>"+this.siNm+"</td>";
			htmlStr += "<td>"+this.sggNm+"</td>";
			htmlStr += "<td>"+this.emdNm+"</td>";
			htmlStr += "<td>"+this.liNm+"</td>";
			htmlStr += "<td>"+this.rn+"</td>";
			htmlStr += "<td>"+this.udrtYn+"</td>";
			htmlStr += "<td>"+this.buldMnnm+"</td>";
			htmlStr += "<td>"+this.buldSlno+"</td>";
			htmlStr += "<td>"+this.mtYn+"</td>";
			htmlStr += "<td>"+this.lnbrMnnm+"</td>";
			htmlStr += "<td>"+this.lnbrSlno+"</td>";
			htmlStr += "<td>"+this.emdNo+"</td>"; */
			htmlStr += "</tr>";
		});
		htmlStr += "</table>";
		// 결과 HTML을 FORM의 결과 출력 DIV에 삽입
		$("#list").html(htmlStr);
	}
	
	function enterSearch() {
		var evt_code = (window.netscape) ? ev.which : event.keyCode;
		if (evt_code == 13) {    
			event.keyCode = 0;  
			getAddr(); //jsonp사용시 enter검색 
		} 
	}
	</script>
	<!-- 페이지 처리 -->	
	<script>
	//페이지 이동
	function goPage(pageNum){
		document.form.currentPage.value=pageNum;
		getAddr();
	}
	// json타입 페이지 처리 (주소정보 리스트 makeListJson(jsonStr); 다음에서 호출)
	/* 
	*  json타입으로 페이지 처리시 수정 
	*  function pageMake(jsonStr){ 
	*  	var total = jsonStr.results.common.totalCount; // 총건수 
	*/
	
	// xml타입 페이지 처리 (주소정보 리스트 makeList(xmlData); 다음에서 호출) 
	function pageMake(xmlStr){
		var total = $(xmlStr).find("totalCount").text(); // 총건수
		var pageNum = document.form.currentPage.value;// 현재페이지
		var paggingStr = "";
		if(total < 1){
		}else{
			var PAGEBLOCK=document.form.countPerPage.value;
			var pageSize=document.form.countPerPage.value;
			var totalPages = Math.floor((total-1)/pageSize) + 1;
			var firstPage = Math.floor((pageNum-1)/PAGEBLOCK) * PAGEBLOCK + 1;		
			if( firstPage <= 0 ) firstPage = 1;		
			var lastPage = firstPage-1 + PAGEBLOCK;
			if( lastPage > totalPages ) lastPage = totalPages;		
			var nextPage = lastPage+1 ;
			var prePage = firstPage-5 ;		
			if( firstPage > PAGEBLOCK ){
				paggingStr +=  "<a href='javascript:goPage("+prePage+");'>◁</a>  " ;
			}		
			for( i=firstPage; i<=lastPage; i++ ){
				if( pageNum == i )
					paggingStr += "<a style='font-weight:bold;color:blue;font-size:15px;' href='javascript:goPage("+i+");'>" + i + "</a>  ";
				else
					paggingStr += "<a href='javascript:goPage("+i+");'>" + i + "</a>  ";
			}		
			if( lastPage < totalPages ){
				paggingStr +=  "<a href='javascript:goPage("+nextPage+");'>▷</a>";
			}		
			$("#pageApi").html(paggingStr);
		}	
	}
	</script>
	
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
<!-- jQuery와 Postcodify를 로딩한다 -->
	<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>	
	
	<!-- "검색" 단추를 누르면 팝업 레이어가 열리도록 설정한다 -->
	<script>
		$(function() {
			$("#postcodify_search_button").postcodifyPopUp(); 
		});
	</script>
	
	<!-- 등록 버튼 클릭시 submit 적용 -->
	<script>
		$(function(){
			$("#addButton").click(function(){
				$("#addForm").submit();
			});
		});
	</script>
	
</body>
</html>
