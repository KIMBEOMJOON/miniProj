<%@page import="Project.ProjectVO"%>
<%@page import="Project.ProjectDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	String proId = (String)session.getAttribute("pro");
	ProjectDAO dao = new ProjectDAO();
	ProjectVO vo = dao.detail(request.getParameter("userId"),proId);
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src='../js/member.js'></script>
</head>
<body>
<table border="">
	<tr>
		<td>유저아이디</td><td><%=vo.getUser_id() %></td>
	</tr><tr>
		<td>프로젝트명</td><td><%=vo.getP_id() %></td>
	</tr><tr>
		<td>업무능력</td><td><%=vo.getAbility() %></td>
	</tr><tr>
		<td>사회성</td><td><%=vo.getSocial() %></td>
	</tr><tr>
		<td>성실성</td><td><%=vo.getDiligent() %></td>
	</tr><tr>
		<td>창의성</td><td><%=vo.getCreativity() %></td>
	</tr><tr>
		<td>총점</td><td><%=vo.getSum() %></td>
	</tr><tr>
		<td>평균</td><td><%=vo.getAvg() %></td>	
	</tr>


	<tr>
		<td colspan="2" align="right">
			<a href="evaluateForm.jsp">돌아가기</a>
			<%-- <a href="deleteForm.jsp?id=<%=vo.getId() %>">회원탈퇴</a>
			<a href="modifyForm.jsp?id=<%=vo.getId() %>">정보수정</a> --%>
		</td>
	</tr>
</table>
</body>
</html>