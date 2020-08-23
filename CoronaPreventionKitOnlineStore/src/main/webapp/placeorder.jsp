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

<form action="admin?action=s" method="post"> 
<div>
<label for="Street Address 1">Street Address 1:</label>
  <input type="text" id="pname" name="pname" required>
  
 <label for="Street Address 2">Street Address 2:</label>
  <input type="text" id="pcost" name="pcost" required>
  
<label for="City">City:</label>
  <input type="text" id="pdesc" name="pdesc" required>
  
  <label for="State">State:</label>
  <input type="text" id="pdesc" name="pdesc" required>
  
  <label for="Country">Country:</label>
  <input type="text" id="pdesc" name="pdesc" required>
  
<div><input type="submit" value="Place Order"> </div>

</div>

</form>





<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>