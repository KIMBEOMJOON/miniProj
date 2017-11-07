<%@page import="Project.ProjectDAO"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Date"%>
<%-- <%@page import="kbj.FreejoinDAO"%> --%>
<%@page import="Person.PersonVO"%>
<%@page import="Person.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	String[] abArr = request.getParameterValues("person_ab");
	int sum=0;
	ProjectDAO dao = new ProjectDAO();
	int[] inputGrade = new int[abArr.length+2];
	HashMap<String, String> proj = new HashMap<>();
	String userId = request.getParameter("user_id");
	String proId = request.getParameter("p_id");
	session.setAttribute("pro", proId);
	proj.put(userId, proId);
	
	for(int i =0;i<abArr.length;i++){
		sum+=Integer.parseInt(abArr[i]);
		inputGrade[i]= Integer.parseInt(abArr[i]);
	}
	inputGrade[abArr.length]=sum;
	int avg= sum/abArr.length;
	inputGrade[abArr.length+1]=avg;
	dao.partGrade(proj,inputGrade);
	%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	alert('정상 반영 되었습니다! 감사합니다');
	 location.href = 'detail.jsp?userId=<%=userId%>';
</script>
</body>
</html>