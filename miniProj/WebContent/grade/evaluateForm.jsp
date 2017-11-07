<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.sch{
	width:70px;
	height:30px;
	border-radius:15px; 
}

</style>
</head>
<body>
<form action="evaluateReg.jsp" method="post">
	<table border="1">
		<tr>
			<td colspan="2">사원의 실적을 평가해주세요!</td>
		</tr>
		<tr>
			<td>프로젝트명</td>
			<td><input type="text" name="p_id" /></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="user_id" /></td>
		</tr>
		<tr>
			<td>업무능력</td>
			<td><input type="number" name="person_ab" /></td>
		</tr>
		<tr>
			<td>사교성</td>
			<td><input type="number" name="person_ab" /></td>
		</tr>
		<tr>
			<td>성실성</td>
			<td><input type="number" name="person_ab" /></td>
		</tr>
		<tr>
			<td>창의력</td>
			<td><input type="number" name="person_ab" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="확인" class="sch" />
			<input type="reset" value="초기화" class="sch"/>
			<a href="memList.jsp">취소</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>