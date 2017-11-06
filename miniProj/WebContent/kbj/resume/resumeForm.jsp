<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.sch{
	width:100px;
	height:30px;
	border-radius:15px; 
}

</style>
</head>
<body>
<form action="joinReg.jsp" method="post">
	<table border=1>
		<tr>
			<td>id</td>
			<td><input type="text" name="id" size="10" maxlength="8" />
			<input type="button" name="sch" class="sch" value="id중복확인"/>
			</td>
		</tr>
		<tr>
			<td>pw</td>
			<td><input type="password" name="pw" /></td>
		</tr>
		<tr>
			<td>grade</td>
			<td><input type="text" name="grade" /></td>
		</tr>
		<tr>
			<td>생일</td>
			<td><input type="text" name="birth" /></td>
		</tr>
		
		<tr>
			<td>성별</td>
			<td>
				<input type="radio" name="gender" checked="checked" value="m"/>남
				<input type="radio" name="gender"  value="f"/>여
			</td>
		</tr>
		<tr>
			<td>취미</td>
			<td>
			<input type="checkbox" name="hobby" value="read"/>독서
			<input type="checkbox" name="hobby" value="game" checked="checked"/>게임
			<input type="checkbox" name="hobby" value="fish" checked="checked"/>낚시
			</td>
		</tr>
		<tr>
			<td>사진등록</td>
			<td><input type="file" name="profilepic" /></td>
		</tr>
		<tr>
			<td>포트폴리오등록</td>
			<td><input type="file" name="portfoliofile" /></td>
		</tr>
		<tr>
			<td>email</td>
			<td>
				<input type="text" name="email1">@
				<select name="email2">
					<option value="naver.com">네이버</option>
					<option value="gmail.com">구글</option>
					<option value="daum.net" selected="selected">다음</option>
					<option value="yahoo.co.kr">야후</option>
					<option value="jum.com">줌</option>
				</select>
			</td>
		</tr>
	
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="이력서등록" class="sch" />
			<input type="reset" value="초기화" class="sch"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>