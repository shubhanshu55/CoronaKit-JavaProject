<%@page import="com.corona.prevention.kit.admin.model.AdminModel"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Corona Prevention Kit - Welcome Guest User</title>
</head>
<body>
<h1>Corona Prevention Kit - Welcome Guest User</h1>
<jsp:include page="header.html"></jsp:include>

<br/>


<%List<AdminModel> objadminmodel=(List<AdminModel>) request.getAttribute("objadminmodel");%>

<table border="1"  width="100%">

<thead>
<th>NAME-Guest</th>
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
<td><a href="admin?action=addnewitem &id=<%=objadminmodel2.getId()%>"><button>Checkout</button></a></td>

</tr>
<% }%>
</tbody>

</table>
<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>