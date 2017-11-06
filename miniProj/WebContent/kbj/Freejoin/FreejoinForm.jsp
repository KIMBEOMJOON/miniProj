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
			<td>ID</td>
			<td><input type="text" name="id" size="10" maxlength="8" />
			<input type="button" name="sch" class="sch" value="ID중복확인" />
			</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pw"/></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type="text" name="tel" />('-'는 생략 후 입력해주세요)</td>
		</tr>
		<tr>
			<td>생일</td>
			<td><input type="text" name="birth" />ex )2002-06-06</td>
		</tr>
		
		<tr>
			<td>성별</td>
			<td>
				<input type="radio" name="gender" checked="checked" value="m"/>남
				<input type="radio" name="gender"  value="f"/>여
			</td>
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
			<td>프로필사진등록</td>
			<td><input type="file" name="profilepic" /></td>
		</tr>
			</table>
			<table border=1>

<tr>
<td> <font><strong>개발분야</strong></font>
</td>
</tr>

		<tr>
			<td rowspan="7">개발</td>
		
			<tr>
			<td><input type="checkbox" name="development" value=".NET"/>.NET</td>
			<td><input type="checkbox" name="development" value="ABAP"/>ABAP</td>
			<td><input type="checkbox" name="development" value="Android" />Android</td>
			<td><input type="checkbox" name="development" value="ASP"/>ASP</td>
			<td><input type="checkbox" name="development" value="ASP.NET"/>ASP.NET</td>
			</tr><tr>
			<td><input type="checkbox" name="development" value="C"/>C</td>
			<td><input type="checkbox" name="development" value="C#"/>C#</td>
			<td><input type="checkbox" name="development" value="C++"/>C++</td>
			<td><input type="checkbox" name="development" value="COBOL"/>COBOL</td>
			<td><input type="checkbox" name="development" value="CSS"/>CSS</td>
			</tr><tr>
			<td><input type="checkbox" name="development" value="DB"/>DB</td>
			<td><input type="checkbox" name="development" value="Delphi"/>Delphi</td>
			<td><input type="checkbox" name="development" value="Html"/>Html</td>
			<td><input type="checkbox" name="development" value="IOS"/>IOS</td>
			<td><input type="checkbox" name="development" value="Swift"/>Swift</td>
			</tr><tr>
			<td><input type="checkbox" name="development" value="Java"/>Java</td>
			<td><input type="checkbox" name="development" value="JS"/>JS</td>
			<td><input type="checkbox" name="development" value="Jsp"/>Jsp</td>
			<td><input type="checkbox" name="development" value="Linux"/>Linux</td>
			<td><input type="checkbox" name="development" value="Network"/>Network</td>
			</tr><tr>
			<td><input type="checkbox" name="development" value="PHP"/>PHP</td>
			<td><input type="checkbox" name="development" value="PowerBuilder"/>PowerBuilder</td>
			<td><input type="checkbox" name="development" value="Python"/>Python</td>
			<td><input type="checkbox" name="development" value="QA"/>QA</td>
			<td><input type="checkbox" name="development" value="Ruby"/>Ruby</td>
			</tr><tr>
			<td><input type="checkbox" name="development" value="ServerDevelopment"/>ServerDevelopment</td>	
			<td><input type="checkbox" name="development" value="VB"/>VB</td>
			<td><input type="checkbox" name="development" value="VC++"/>VC++</td>		
			<td><input type="checkbox" name="development" value="Windows"/>Windows</td>
			<td><input type="checkbox" name="development" value="Embedded"/>Embedded</td>		

		</tr>
	

		<tr>
			<td rowspan="4">디자인/퍼블리싱</td>
			<tr>
			<td><input type="checkbox" name="design" value="HTML5"/>HTML5</td>
			<td><input type="checkbox" name="design" value="GraphicDesign" />GraphicDesign</td>
			<td><input type="checkbox" name="design" value="Mobile" />Mobile</td>
			<td><input type="checkbox" name="design" value="ActionScript" />ActionScript</td>
			<td><input type="checkbox" name="design" value="WebDesign" />WebDesign</td>
			</tr><tr>
			<td><input type="checkbox" name="design" value="WebStandard" />WebStandard</td>
			<td><input type="checkbox" name="design" value="Powerpoint" />Powerpoint</td>
			<td><input type="checkbox" name="design" value="Publishing" />Publishing</td>
			<td><input type="checkbox" name="design" value="PhotoshopEditor" />PhotoshopEditor</td>
			<td><input type="checkbox" name="design" value="Flash" />Flash</td>
			</tr><tr>
			<td><input type="checkbox" name="design" value="3D" />3D</td>
			
			
			</tr>
		<tr>
			<td rowspan="2">기획/컨설턴트</td>
			<td><input type="checkbox" name="planning" value="OracleConsultant"/>OracleConsultant</td>
			<td><input type="checkbox" name="planning" value="PM"/>PM</td>
			<td><input type="checkbox" name="planning" value="PMO"/>PMO</td>
			<td><input type="checkbox" name="planning" value="SAPConsultant"/>SAPConsultant</td>
			<td><input type="checkbox" name="planning" value="Plan"/>Plan</td>
			</tr><tr>
			<td><input type="checkbox" name="planning" value="MobilePlan"/>MobilePlan</td>
			<td><input type="checkbox" name="planning" value="WebPlan"/>WebPlan</td>
	
		</tr>
	
	
		<tr>
			<td rowspan="10">전문분야</td>
			
			<td><input type="checkbox" name="specialty" value="Ajax"/>Ajax</td>
			<td><input type="checkbox" name="specialty" value="BI"/>BI</td>
			<td><input type="checkbox" name="specialty" value="BPM"/>BPM</td>
			<td><input type="checkbox" name="specialty" value="BUILDER"/>BUILDER</td>
			<td><input type="checkbox" name="specialty" value="Codeigniter"/>Codeigniter</td>
			</tr><tr>
			<td><input type="checkbox" name="specialty" value="DDK"/>DDK</td>
			<td><input type="checkbox" name="specialty" value="DJANGO"/>DJANGO</td>
			<td><input type="checkbox" name="specialty" value="DW"/>DW</td>
			<td><input type="checkbox" name="specialty" value="EJB"/>EJB</td>
			<td><input type="checkbox" name="specialty" value="ERP"/>ERP</td>
			</tr><tr>
			<td><input type="checkbox" name="specialty" value="GAUCE"/>GAUCE</td>
			<td><input type="checkbox" name="specialty" value="Git"/>Git</td>
			<td><input type="checkbox" name="specialty" value="Hadoop"/>Hadoop</td>
			<td><input type="checkbox" name="specialty" value="IBSHEET"/>IBSHEET</td>
			<td><input type="checkbox" name="specialty" value="JEUS"/>JEUS</td>
			</tr><tr>
			<td><input type="checkbox" name="specialty" value="JSTL"/>JSTL</td>
			<td><input type="checkbox" name="specialty" value="LabVIEW"/>LabVIEW</td>
			<td><input type="checkbox" name="specialty" value="LAFJ"/>LAFJ</td>
			<td><input type="checkbox" name="specialty" value="MFC"/>MFC</td>
			<td><input type="checkbox" name="specialty" value="MIPLATFORM"/>MIPLATFORM</td>
			</tr><tr>
			<td><input type="checkbox" name="specialty" value="MSTR"/>MSTR</td>
			<td><input type="checkbox" name="specialty" value="MVC"/>MVC</td>
			<td><input type="checkbox" name="specialty" value="OPENGL"/>OPENGL</td>
			<td><input type="checkbox" name="specialty" value="OZReport"/>OZReport</td>
			<td><input type="checkbox" name="specialty" value="PLM"/>PLM</td>
			</tr><tr>
			<td><input type="checkbox" name="specialty" value="SCM"/>SCM</td>
			<td><input type="checkbox" name="specialty" value="SITEMESH"/>SITEMESH</td>
			<td><input type="checkbox" name="specialty" value="SOAP"/>SOAP</td>
			<td><input type="checkbox" name="specialty" value="STRUTS"/>STRUTS</td>
			<td><input type="checkbox" name="specialty" value="SWING"/>SWING</td>
			</tr><tr>
			<td><input type="checkbox" name="specialty" value="TRUSTFORM"/>TRUSTFORM</td>
			<td><input type="checkbox" name="specialty" value="TUXEDO"/>TUXEDO</td>
			<td><input type="checkbox" name="specialty" value="UNITY3D"/>UNITY3D</td>
			<td><input type="checkbox" name="specialty" value="WDK"/>WDK</td>
			<td><input type="checkbox" name="specialty" value="WEBLOGIC"/>WEBLOGIC</td>
			</tr><tr>
			<td><input type="checkbox" name="specialty" value="WEBSPHERE"/>WEBSPHERE</td>
			<td><input type="checkbox" name="specialty" value="WEBSQURE"/>WEBSQURE</td>
			<td><input type="checkbox" name="specialty" value="XPLATFORM"/>XPLATFORM</td>
			<td><input type="checkbox" name="specialty" value="ResponsiveWeb"/>ResponsiveWeb</td>
			<td><input type="checkbox" name="specialty" value="SecurityDiagnosis"/>SecurityDiagnosis</td>
			</tr><tr>
			<td><input type="checkbox" name="specialty" value="BigData"/>BigData</td>
			<td><input type="checkbox" name="specialty" value="Receive"/>Receive</td>
			<td><input type="checkbox" name="specialty" value="Loan"/>Loan</td>
			<td><input type="checkbox" name="specialty" value="ForeignExchange"/>ForeignExchange</td>
			<td><input type="checkbox" name="specialty" value="WordPress"/>WordPress</td>
			</tr><tr>
			<td><input type="checkbox" name="specialty" value="WebAccessibility"/>WebAccessibility</td>
			<td><input type="checkbox" name="specialty" value="e-GovFrame"/>e-GovFrame</td>
			<td><input type="checkbox" name="specialty" value="CreaditCard"/>CreaditCard</td>
			<td><input type="checkbox" name="specialty" value="HybridApp"/>HybridApp</td>
			<td><input type="checkbox" name="specialty" value="Presentation"/>Presentation</td>
		</tr>
		<tr>
		<td rowspan=5>업무 가능 지역</td>
		<td>무관</td>
		<td><input type="checkbox" name="region" value="무관"/>무관</td>
		</tr>
		<tr>
		<td>서울</td>
		<td><input type="checkbox" name="region" value="서울무관"/>무관</td>
		<td><input type="checkbox" name="region" value="강북"/>강북</td>
		<td><input type="checkbox" name="region" value="강동"/>강동</td>
		<td><input type="checkbox" name="region" value="강남"/>강남</td>
		<td><input type="checkbox" name="region" value="강서"/>강서</td>
		</tr>
		<tr>
		<td>경기</td>
		<td><input type="checkbox" name="region" value="경기무관"/>무관</td>
		<td><input type="checkbox" name="region" value="용인"/>용인</td>
		<td><input type="checkbox" name="region" value="화성"/>화성</td>
		<td><input type="checkbox" name="region" value="일산"/>일산</td>
		<td><input type="checkbox" name="region" value="의정부"/>의정부</td>
		<td><input type="checkbox" name="region" value="성남"/>성남</td>
		<td><input type="checkbox" name="region" value="수원"/>수원</td>
		</tr>
		<tr>
		<td rowspan=2>그외</td>
		<td><input type="checkbox" name="region" value="충북"/>충북</td>
		<td><input type="checkbox" name="region" value="충남"/>충남</td>
		<td><input type="checkbox" name="region" value="대전"/>대전</td>
		<td><input type="checkbox" name="region" value="강원"/>강원</td>
		<td><input type="checkbox" name="region" value="경북"/>경북</td>
		<td><input type="checkbox" name="region" value="경남"/>경남</td>
		<td><input type="checkbox" name="region" value="대구"/>대구</td>
		<td><input type="checkbox" name="region" value="전북"/>전북</td>
		<td><input type="checkbox" name="region" value="전남"/>전남</td>
		</tr><tr>
		<td><input type="checkbox" name="region" value="광주"/>광주</td>
		<td><input type="checkbox" name="region" value="부산"/>부산</td>
		<td><input type="checkbox" name="region" value="울산"/>울산</td>
		<td><input type="checkbox" name="region" value="제주"/>제주</td>
		<td><input type="checkbox" name="region" value="일본"/>일본</td>
		<td><input type="checkbox" name="region" value="홍콩"/>홍콩</td>
		<td><input type="checkbox" name="region" value="중국"/>중국</td>
		<td><input type="checkbox" name="region" value="미국"/>미국</td>
		<td><input type="checkbox" name="region" value="유럽"/>유럽</td>

		</tr>
		
		</table>
		<table border=1>
		
		<tr>
			<td>포트폴리오등록</td>
			<td><input type="file" name="portfoliofile" /></td>
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