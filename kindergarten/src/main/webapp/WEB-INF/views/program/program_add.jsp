<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Program Insert</title>
</head>
<body>
	<div class="">
		<form id="ProgramAddForm" action="${pageContext.request.contextPath}/ProgramAdd" method="post">
			<table>
			<tr>
				<td></td>
			</tr>
				
			</table>
			<select name="resourceSelect">
					<c:forEach var="resource" items="${resource}">
						<option value="${resource.totalResourceCd}">${resource.resourceNm}</option>
					</c:forEach>
				</select>
				<select name="contractSelect">
					<c:forEach var="contract" items="${contract}">
						<option value="${contract.contractCd}">${contract.contractType}:${contract.contractContents}</option>
					</c:forEach>
				</select>
		</form>
	</div>
</body>
</html>