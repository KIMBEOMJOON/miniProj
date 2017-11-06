<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="kbj.FreejoinDAO"%>
<%@page import="kbj.FreejoinVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");

	//개발분야 목록들 받아서 입력.
	String [] deveArr =request.getParameterValues("development");
	String [] deArr =request.getParameterValues("design");
	String [] plannArr =request.getParameterValues("planning");
	String [] specialArr =request.getParameterValues("specialty");
	String [] regionArr =request.getParameterValues("region");
/* 	String [] deArr =request.getParameterValues("development");
	String [] deArr =request.getParameterValues("development"); */
	
	String development ="";
	String design ="";
	String planning ="";
	String specialty ="";
	String region ="";

	
	for(int i =0;i<deveArr.length;i++)
	{
		development+=deveArr[i];
		if(i<deveArr.length-1)
			development+=",";
	}
	for(int i =0;i<deArr.length;i++)
	{
		design+=deArr[i];
		if(i<deArr.length-1)
			design+=",";
	}
	for(int i =0;i<plannArr.length;i++)
	{
		planning+=plannArr[i];
		if(i<plannArr.length-1)
			planning+=",";
	}
	for(int i =0;i<specialArr.length;i++)
	{
		specialty+=specialArr[i];
		if(i<specialArr.length-1)
			specialty+=",";
	}
	for(int i =0;i<regionArr.length;i++)
	{
		region+=regionArr[i];
		if(i<regionArr.length-1)
			region+=",";
	}
	
	
	String email = request.getParameter("email1")+
			"@"+request.getParameter("email2");
	
	FreejoinVO mem = new FreejoinVO();
	
	mem.setId(request.getParameter("id"));
	mem.setPw(request.getParameter("pw"));
	mem.setGender(request.getParameter("gender"));
	mem.setGrade(Integer.parseInt(request.getParameter("grade")));

	
	mem.parseBirth(request.getParameter("birth"));
	
	mem.setHobby(development);
	mem.setEmail(email);
	
	
	FreejoinDAO dao = new FreejoinDAO();
	dao.insert(mem);
	
	%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	alert('회원가입 되었습니다');
	location.href = 'detail.jsp?id=<%=mem.getId()%>';
</script>
</body>
</html>