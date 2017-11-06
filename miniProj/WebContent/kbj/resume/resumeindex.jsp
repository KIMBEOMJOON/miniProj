
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
${serviceUrl }이력서 현황
<ul>
<li>
이력서는 최대 5개까지 작성하여 등록 가능합니다.
</li>
<li>
지원하고자 하는 회사마다 이력서 내용을 다르게 하여 지원 가능합니다.
(입사지원을 한 후 이력서의 내용을 수정해도 이전에 지원한 이력서의 내용은 변경되지 않습니다.)
</li>
<li>
인재정보는 1개의 이력서만 공개 가능합니다.
</li>


</ul>



<table border="">
	<tr>
		<td>번호</td>	
		<td>이력서제목</td>
		<td>작성일</td>
		<td>인재등록</td>
		
	</tr>


<c:forEach items="${data }" var="vo" varStatus="no">
<tr>
		<td>${no.index+1 }</td>
		
		
		<td><a href="detail.jsp?id=${vo.id }">${vo.title }</a></td>
		<td><fmt:formatDate value="${vo.regDate }" pattern="yyyy-MM-dd" /> </td>
	</tr>
</c:forEach>

	<tr>
		<td colspan="4" align="right">
			<a href="resumeForm.jsp">이력서 등록</a>
		</td>
	</tr>
</table>
