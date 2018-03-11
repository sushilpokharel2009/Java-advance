<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="StudentServlet3" method = "post">
		<div>
			<label for = "Name">Name</label>
			<input type ="text" name = "Name">
		</div>
		<div>
			<label for = "address">Address</label>
			<input type ="text" name = "address">
		</div>
		<div	>
			<label for = "age">Age</label>
			<input type ="text" name = "age">
		</div>
		<div>
			<button type = "submit" name = "add">Add</button>
		</div>
	
	</form>
</body>
</html>