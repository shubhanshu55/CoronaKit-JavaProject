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

<form action="admin?action=save" method="post"> 
<div>
<label for="Enter Product Name">Enter Product Name:</label>
  <input type="text" id="pname" name="pname" required>
  
 <label for="Enter Product Cost">Enter Product Cost:</label>
  <input type="text" id="pcost" name="pcost" required>
  
<label for="nter Product Description">Enter Product Description:</label>
  <input type="text" id="pdesc" name="pdesc" required>
  
<div><input type="submit" value="Add"> </div>

</div>

</form>





<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>