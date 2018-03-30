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
			<table border="1">
			<tr>
				<td>통합자원코드</td>
				<td>
					<select name="resourceSelect">
						<c:forEach var="resource" items="${resource}">
							<option value="${resource.totalResourceCd}">${resource.resourceNm}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>특별활동프로그램명</td>
				<td>
					<input type="text" name="programNm">
				</td>
			</tr>
			<tr>
				<td>주당춘영횟수(회)</td>
				<td>
					<select>
						<option value=1>1회</option>
						<option value=2>2회</option>
						<option value=3>3회</option>
						<option value=4>4회</option>
						<option value=5>5회</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>1회운영시간(분)</td>
				<td>
					<select>
						<option value=10>10분</option>
						<option value=20>20분</option>
						<option value=30>30분</option>
						<option value=40>40분</option>
						<option value=50>50분</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>외주금액</td>
				<td>
					<input type="number" name="programNm">
				</td>
			</tr>
			<tr>
				<td>마감회계_지출특별활동비</td>
				<td>
					<input type="number" name="programNm">
				</td>
			</tr>
			<tr>
				<td>마감유무</td>
				<td>
					<select>
						<option value="마감전">마감전</option>
						<option value="마감완료">마감완료</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>계약코드</td>
				<td>
					<select name="contractSelect">
						<c:forEach var="contract" items="${contract}">
							<option value="${contract.contractCd}">${contract.contractType}:${contract.contractContents}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>등록인</td>
				<td>
					<input type="text" name="programRegistrant">
				</td>
			</tr>
			</table>
			<button id="ProgramAddButton" type="button">등록</button>
		</form>
	</div>
</body>
</html>