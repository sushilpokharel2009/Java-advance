

<%@ page import = "co.stosh.modal.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		LogIn lg2 = (LogIn)session.getAttribute("vdfUser");
	
		if(lg2 != null){ 
	%>
	
	Welcome:<%= lg2.getFirstName() %>
	
	<br>
	<br>
	
	
	<a href="logout.jsp">Logout</a>
	
	
	<h1>Home Page</h1>
	<p>
		Five centuries later Lorem Ipsum experienced a surge in popularity with the release of Letraset's dry-transfer sheets. These sheets of lettering could be rubbed on anywhere and were quickly adopted by graphic artists, printers, architects, and advertisers for their professional look and ease of use. Letraset included Lorem Ipsum passages in a panoply of fonts, styles, and sizes, solidifying the Latin-esque phrase's place in the print and graphics industry. Those with an eye for detail will have even caught a tribute to the classic text in an episode of Mad Men (S6E1 around 1:18:55 for anyone that didn't).
		
	</p>
	<%  } else{
		response.sendRedirect("SignUpLogin-Form.jsp");
	}%>
	
</body>
</html>