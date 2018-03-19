<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Client List</h1>
<table>
	<thead>
		<tr>
			<th>CLIENT_CD</th>
			<th>CLIENT_PHONE</th>
			<th>CLIENT_TYPE</th>
			<th>CLEINT_NM</th>
			<th>CLIENT_MANAGER</th>
			<th>CLIENT_ADDRESS</th>
			<th>CLIENT_REGISTRATION_DATE</th>
			<th>CLIENT_REGISTRANT</th>
			<th>LICENSE_KINDERGARTEN</th>
		</tr>
	</thead>
	<c:forEach var="clientList" items="${list}">
	<tbody>
		<tr>
			<td>${clientList.clientCd}</td>
			<td>${clientList.clientPhone}</td>
			<td>${clientList.clientType}</td>
			<td>${clientList.clientNm}</td>
			<td>${clientList.clientManager}</td>
			<td>${clientList.clientAddess}</td>
			<td>${clientList.clientRegistrationDage}</td>
			<td>${clientList.clientRegistrant}</td>
			<td>${clientList.lecenseKindergarten}</td>
		</tr>			
	</c:forEach>
	</tbody>
</table>

</body>
</html>