
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
${serviceUrl }�̷¼� ��Ȳ
<ul>
<li>
�̷¼��� �ִ� 5������ �ۼ��Ͽ� ��� �����մϴ�.
</li>
<li>
�����ϰ��� �ϴ� ȸ�縶�� �̷¼� ������ �ٸ��� �Ͽ� ���� �����մϴ�.
(�Ի������� �� �� �̷¼��� ������ �����ص� ������ ������ �̷¼��� ������ ������� �ʽ��ϴ�.)
</li>
<li>
���������� 1���� �̷¼��� ���� �����մϴ�.
</li>


</ul>



<table border="">
	<tr>
		<td>��ȣ</td>	
		<td>�̷¼�����</td>
		<td>�ۼ���</td>
		<td>������</td>
		
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
			<a href="resumeForm.jsp">�̷¼� ���</a>
		</td>
	</tr>
</table>
