<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Jsp</title>
</head>
<body>
	<h1>Welcome to My Application from jsp</h1>
	<form action="MsgServlet" method="get">
		<label for="name">Enter Name:</label> 
		<input type="text" id="name" name="username"/>
		<br>
		<input type="submit" name="submit"/>
	</form>
</body>
</html>