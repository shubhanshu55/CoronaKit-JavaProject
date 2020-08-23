<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
<jsp:include page="header.html"></jsp:include>

<form action="admin?action=Update" method="post"> 
<div>

<input type="hidden" name="id" value="${param['id']}" />
<br/>
<label for="Enter Product Name">Enter Product Name:</label>
  <input type="text" id="pname" name="pname" required>
  
 <label for="Enter Product Cost">Enter Product Cost:</label>
  <input type="text" id="pcost" name="pcost" required>
  
<label for="nter Product Description">Enter Product Description:</label>
  <input type="text" id="pdesc" name="pdesc" required>
  
<div><input type="submit" value="Update"> </div>

</div>

</form>





<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>