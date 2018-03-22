<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>KidsReport List</h1>
<table border=1>
	<thead>
		<tr>
			<th>영유아일지코드</th>
			<th>일지자원코드</th>
			<th>영유아일지구분코드</th>
			<th>영유아코드</th>
			<th>유치원라이센스</th>
			<th>일지주제</th>
			<th>일지소주제</th>
			<th>날씨</th>
			<th>목표</th>
			<th>관찰_영유아관찰내용</th>
			<th>상담_보호자명</th>
			<th>상담_교사의견</th>
			<th>상담_부모의견</th>
			<th>상담_상담방법</th>
			<th>보육_활동계획방법</th>
			<th>보육_평가</th>
			<th>등록인</th>
			<th>등록날짜</th>
		</tr>
	</thead>
	<c:forEach var="kidsReport" items="${list}">
		<tbody>
			<tr>
				<td>${kidsReport.kidsReportCd}</td>
				<td>${kidsReport.reportResourceCd}</td>
				<td>${kidsReport.reportCd}</td>
				<td>${kidsReport.kidsCd}</td>
				<td>${kidsReport.licenseKindergarten}</td>
				<td>${kidsReport.title}</td>
				<td>${kidsReport.subTitle}</td>
				<td>${kidsReport.weather}</td>
				<td>${kidsReport.objective}</td>
				<td>${kidsReport.observeContent}</td>
				<td>${kidsReport.parentNm}</td>
				<td>${kidsReport.teacherOpinion}</td>
				<td>${kidsReport.journalType}</td>
				<td>${kidsReport.plans}</td>
				<td>${kidsReport.evaluation}</td>
				<td>${kidsReport.registrant}</td>
				<td>${kidsReport.registrationDate}</td>
			</tr>
		</tbody>
	</c:forEach>
</table>

</body>
</html>