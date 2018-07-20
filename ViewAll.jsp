<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="BackButtond.jsp" %>
<%@ include file="MenuBar.jsp" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body>
<form action="CS" method="get">
<div align="center">
<table  border = "2" cellpadding="10" >
    <tr>
              <th>userCode</th>
              <th>userName</th>     
	          <th>userAddress1</th>
	          <th>userAddress2</th>
              <th>userPinCode</th>
              <th>userEmailAddress</th>
	          <th>userContactNo</th>
	          <th>primaryContactPerson</th>
	          <th>recordStatus</th>
	          <th>flag</th>
	          <th>createDate</th>
              <th>createdBy</th>
	          <th>modifiedDate</th>
	          <th>modifiedBy</th>
    </tr>
    <c:forEach items="${list}" var="user" >
        <tr>
            <td> <c:out value=" ${user.getUserCode()}"/></td>
            <td><c:out value="${user.getUserName()}"/></td>
             <td><c:out value="${user.getUserAddress1()}"/></td>
            <td><c:out value="${user.getUserAddress2()}"/></td>
             <td><c:out value="${user.getUserPinCode()}"/></td>
            <td><c:out value="${user.getUserEmailAddress()}"/></td>
            <td><c:out value="${user.getUserContactNo()} "/></td>
             <td><c:out value="${user.getPrimaryContactPerson()}"/></td>
            <td><c:out value="${user.getRecordStatus()}"/></td>
             <td><c:out value="${user.getFlag()}"/></td>
            <td><c:out value="${user.getCreateDate()}"/></td>
            <td><c:out value="${user.getCreatedBy()}"/></td>
            <td><c:out value="${user.getModifiedDate()}"/></td>
            <td><c:out value="${user.getModifiedBy()}"/></td>
        </tr>
    </c:forEach>
</table>



</div>
</form>



</body>
</html>