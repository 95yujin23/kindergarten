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
<h1>Kids List</h1>
<table>
	<thead>
		<tr>
			<th>KIDS_CD</th>
			<th>KIDS_NM</th>
			<th>DATE_OF_BIRTH</th>
			<th>KIDS_ADDRESS</th>
			<th>KIDS_PARENT_PHONE</th>
			<th>KIDS_SPARE_PHONE</th>
			<th>KIDS_GENDER</th>
			<th>KIDS_COMMUTING_TYPE</th>
			<th>KIDS_CAUTION</th>
			<th>KIDS_ADMISSION</th>
			<th>ACCKIDS_GRADUATIONOUNT</th>
			<th>LICENSE_KINDERGARTEN</th>
		</tr>
	</thead>
	<c:forEach var="kidsList" items="${list}">
		<tbody>
			<tr>
				<td>${kidsList.kidsCd}</td>
				<td>${kidsList.kidsNm}</td>
				<td>${kidsList.kidsDateOfBirth}</td>
				<td>${kidsList.kidsAddress}</td>
				<td>${kidsList.kidsParentPhone}</td>
				<td>${kidsList.kidsSparePhone}</td>
				<td>${kidsList.kidsGender}</td>
				<td>${kidsList.kidsCommutingType}</td>
				<td>${kidsList.kidsCaution}</td>
				<td>${kidsList.kidsAdmission}</td>
				<td>${kidsList.kidsGraduation}</td>
				<td>${kidsList.licenseKindergarten}</td>
			</tr>
		</tbody>
	</c:forEach>
</table>

</body>
</html>