<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product Entry Form</title>
</head>
<body>
<jsp:include page="header.html"></jsp:include>

<form action="admin?action=insertuser" method="post"> 

<div>
<label for="Enter Name">Enter Name:</label>
  <input type="text" id="userpname" name="userpname" required>
  
  <label for="Enter Email">Enter Email:</label>
  <input type="text" id="userpemail" name="userpemail" required>
  
  <label for="Enter Contact">Enter Contact:</label>
  <input type="text" id="userpcontact" name="userpcontact" required>
  
<div><input type="submit" value="Submit"> </div>

</div>

</form>





<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>