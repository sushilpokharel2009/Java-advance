<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "co.stosh.controller.StudentServlet" %>
<%@ page import = "co.stosh.modal.Student" %>
<%@ page import = "co.stosh.studentDao.StudentDao" %>
<%@ page import = "co.stosh.util.DbConnection" %>




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>My Student List</h1>
	
	<%
		List <Student> li = (ArrayList)request.getAttribute("sList1");
	
	%>
	
	
	<table>
		<tr>
			<td>ID</td>
			<td>FirstName</td>
			<td>LastName</td>
			<td>Address</td>
		</tr>
	
	
	
	
	<% for(Student s : li){ %>
	
		<tr>
			<td><%=  s.getId() %></td>
			<td><%= s.getFirstName() %></td>
			<td><%= s.getLastName() %></td>
			<td><%= s.getAddress() %></td>
			<td><a href ="StudentServlet?idForEdit=<%= s.getId() %>">Edit</a></td>
			<td><a href ="StudentServlet?idForDelete=<%= s.getId() %>">Delete</a></td>
		
		
		</tr>
	<% } %>
	</table>
</body>
</html>