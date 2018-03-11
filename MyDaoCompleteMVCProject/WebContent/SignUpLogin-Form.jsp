<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Sign up for new users</h1>
	<%
		String in = request.getParameter("in");
			if(in!=null){
				out.println("Invalidate User.");
			}
	
	%>
	<form action="StudentServlet" method ="post">
	
		<!--  <div>
			 <input type="hidden" name = "id6" value =""> 
		</div>  -->
		<div>
			<label for = "firstName">FirstName</label>
			<input type ="text" name = "firstName">
		</div>
		<div>
			<label for = "lastName">LastName</label>
			<input type ="text" name = "lastName">
		</div>
		<div	>
			<label for = "password">Password</label>
			<input type ="password" name = "password">
		</div>
		<div	>
			<label for = "address">Address</label>
			<input type ="text" name = "address">
		</div>
		<div>
			<button type = "submit"  name = "createNewAccount">Create New Account</button>
		</div>
		<!-- <div>
			<button type = "submit"  name = "add">Add</button>
		</div>
		<div>
			<button type = "submit"  name = "update">Update</button>
		</div>
	 -->
	</form>
	
	
	
	<hr>
	<hr>
	
	
	
	<h1>Login for existing users</h1>
	
	<form action="StudentServlet" method ="post">
	
		 <div>
			 <input type="hidden" name = "id6" value =""> 
		</div> 
		<div>
			<label for = "firstName">FirstName</label>
			<input type ="text" name = "firstName">
		</div>
		<div>
			<label for = "lastName">LastName</label>
			<input type ="text" name = "lastName">
		</div>
		<div	>
			<label for = "password">Password</label>
			<input type ="password" name = "password">
		</div>
		<div	>
			<label for = "address">Address</label>
			<input type ="text" name = "address">
		</div>
		
		<div>
			 <button type = "login"  name = "Login">Login</button>
			
		</div>
		
	
	</form>
	
	
	
	
</body>
</html>