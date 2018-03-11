<%@ page import ="co.stosh.modal.*" %>

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
		Student st6 = (Student)request.getAttribute("ss1");
	
		if(st6==null){
			st6 = new Student();
			st6.setId(0);
			st6.setFirstName("");
			st6.setLastName("");
			st6.setAddress("");
		}
	
	
	%>
	<form action="StudentServlet" method = "post">
		<div>
			 <input type="hidden" name = "id6" value =""> 
		</div>
		<div>
			<label for = "FirstName">FirstName</label>
			<input type ="text" name = "FirstName">
		</div>
		<div>
			<label for = "LastName">LastName</label>
			<input type ="text" name = "LastName">
		</div>
		<div	>
			<label for = "Address">Address</label>
			<input type ="text" name = "Address">
		</div>
		<div>
			<button type = "submit"  name = "add">Add</button>
		</div>
		<div>
			<button type = "submit"  name = "update">Update</button>
		</div>
	
	</form>
	
</body>
</html>