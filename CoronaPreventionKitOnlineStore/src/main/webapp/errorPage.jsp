<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Corona Portal - Exception</title>
</head>
<body>

	<jsp:include page="header.html"/>
	<div>
		<h3>Something went wrong! We regret the inconvenience!</h3>
		<p>Error Message : <%=exception.getMessage()%> %></p>
		<p>Please Contact Administrator</p>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>