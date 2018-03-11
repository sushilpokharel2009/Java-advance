<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>My Form</h1>
	<form action="form-list.jsp" method="post">
		<label>Student Name:</label>
		<input type ="text" name = "StudentName">
		<label>Student Address:</label>
		<input type ="text" name = "StudentAddress">
		<button type="submit">Submit</button>
	</form>
	
	
	<% 
		int x = 5;
		int y = 4;
		
		int z = x + y;
		out.println(z);
	%>
	
	<%!
	
	
			int total;
			public int add(int i, int j){
				return total;
			}
	
	%>
	
	
	<%-- <%= out.println(z) %> --%>
	
</body>
</html>