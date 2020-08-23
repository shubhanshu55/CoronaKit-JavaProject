<%@ page import="java.time.LocalDateTime"%>
<hr/>
<h3><%=LocalDateTime.now().toString() %></h3>

<h1><%=application.getServletContextName()%>  this is from footer</h1>