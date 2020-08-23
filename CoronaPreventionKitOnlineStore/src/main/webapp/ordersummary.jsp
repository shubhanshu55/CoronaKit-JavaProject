<%@page import="com.corona.prevention.kit.admin.model.AdminModel"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Corona Prevention Kit - Order Summary</title>
</head>
<body>

<jsp:include page="header.html"></jsp:include>

<br/>
<a href="admin?action=newproduct"><button>Add New Product</button></a>

<%List<AdminModel> objadminmodel=(List<AdminModel>) request.getAttribute("objadminmodel");%>

<table border="1"  width="100%">

<thead>
<th>NAME</th>
<th>COST</th>
<th>DESCRIPTION</th>
<th></th>
<th></th>
</thead>

<tbody>
<% for (AdminModel objadminmodel2 : objadminmodel){%>
<tr>

<td><%=objadminmodel2.getPname() %></td>
<td><%=objadminmodel2.getPcost() %></td>
<td><%=objadminmodel2.getPdesc() %></td>


</tr>
<% }%>
</tbody>
</table>
<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>