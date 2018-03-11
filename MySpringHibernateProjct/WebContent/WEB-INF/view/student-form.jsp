<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Student Form</h1>

	<form action="add-student"  method="post">
	
		Student Name:<input type="text" name="studentName">
		Student Address:<input type="text" name="studentAddress">
		Student Email:<input type="email" name="studentEmail">
		<input type="submit" value="Add" name="add">
	
	</form>

</body>
</html>