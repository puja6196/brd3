<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
    <c:forEach items="${list1}" var="user1" >
        <tr>
            <td> <c:out value=" ${user1.getUserCode()}"/></td>
            <td><c:out value="${user1.getUserName()}"/></td>
             <td><c:out value="${user1.getUserAddress1()}"/></td>
            <td><c:out value="${user1.getUserAddress2()}"/></td>
             <td><c:out value="${user1.getUserPinCode()}"/></td>
            <td><c:out value="${user1.getUserEmailAddress()}"/></td>
            <td><c:out value="${user1.getUserContactNo()} "/></td>
             <td><c:out value="${user1.getPrimaryContactPerson()}"/></td>
            <td><c:out value="${user1.getRecordStatus()}"/></td>
             <td><c:out value="${user1.getFlag()}"/></td>
            <td><c:out value="${user1.getCreateDate()}"/></td>
            <td><c:out value="${user1.getCreatedBy()}"/></td>
            <td><c:out value="${user1.getModifiedDate()}"/></td>
            <td><c:out value="${user1.getModifiedBy()}"/></td>
        </tr>
    </c:forEach>
</table>



</div>
</form>



</body>
</html>
