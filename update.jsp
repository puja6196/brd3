<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.nucleus.domain.UserInfo" %>
<title>Insert title here</title>
</head>



<body>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;    
}

</style>
</head>

<body>
<form action="CustomerServlet" method="get">
<table style="width:100%">

  
<tr><th>User Code:</th><td><input type="text" name="usercode"   value="${userInfo.getUserCode()}"/></td></tr><br>
<tr><th>User Name:</th><td><input type="text" name="username"  value="${userInfo.getUserName()}"/></td></tr><br>
<tr><th>User Address1:</th><td><input type="text" name="useraddress1"  value="${userInfo.getUserAddress1()}"/> </td></tr><br>
<tr><th>User Address2:</th><td><input type="text" name="useraddress2" value="${userInfo.getUserAddress2()}"/> </td></tr><br>
 <tr><th>User PinCode:</th><td><input type="text" name="userpincode"  value="${userInfo.getUserPinCode()}"/></td></tr><br>
 <tr><th>User EmailAddress:</th><td><input type="text" name="useremailaddress"  value="${userInfo.getUserEmailAddress()}"/></td></tr><br>
<tr><th> User Contact No:</th><td><input type="text" name="usercontactno"  value="${userInfo.getUserContactNo()}"/></td></tr><br>
<tr><th>Primary Contact Person:</th><td><input type="text" name="primarycontactperson"  value="${userInfo.getPrimaryContactPerson()}"/></td></tr><br>
<tr><th>Record Status </th><td><input type="text" name="recordstatus" value="${userInfo.getRecordStatus()}"/><br>
 <tr><th>Flag</th><td><input type="text" name="flag" value="${userInfo.getFlag()}"/><br>
 </table>
 <input type="submit" name="SubmitDetails"value="SubmitDetails">

</form>
 
</body>
</html>