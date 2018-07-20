<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="BackButtond.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="USER.jsp">Welcome User</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="NEW.jsp">New</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">VIEW/VIEWALL<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Viewc.jsp">View</a></li>
          <li><a href="Viewallc.jsp">ViewInfo</a></li>
          
        </ul>
        <li class="active"><a href="delete.jsp">Delete</a></li>
      </li>
      <li><a href="updatec.jsp">Update</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="LOGINPAGE.jsp"><span class="glyphicon glyphicon-user"></span>Logout</a></li>
    
    </ul>
  </div>
</nav>
 

</body>
</html>

