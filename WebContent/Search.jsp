<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- start navbar here -->
<h1><img src="images/bullhornlogo50x50.png" alt="Bullhorn Logo"/>&nbsp;Bullhorn!</h1>
<ul>
<li><a href="xx.jsp">Home</a></li>
<li><a href="xx.jsp">Feedback</a></li>
<li><a href="xx.jsp">Newsfeed</a></li>
<li><a href="ProfileServlet?userid=${user.userId}&action=viewprofile">Profile</a></li>
<li><a href="search.jsp">Search</a></li>
<li><a href="LoginServlet?action=logout">Log out</a></li>
</ul>
<!-- end navbar here -->


</body>
</html>