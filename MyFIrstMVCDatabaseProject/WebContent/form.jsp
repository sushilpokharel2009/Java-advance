<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="vendors/animation/animate.min.css">
	<link rel="stylesheet" href="vendors/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="vendors/normalize/normalize.css">
	<link rel="stylesheet" href="vendors/tether/dist/css/tether.min.css">
	<link rel="stylesheet" href="vendors/bootstrap/bootstrap.min.css">
	<link rel="stylesheet" href="css/style.css">
</head>
<body>



	<div class="myForm">
	<form action="MyServlet" method="post">
		<h1>My Form</h1>
			<fieldset>

				<div class="">
					<label for="studentFirstName">First Name</label>
					<input type="text" class="form-control" name ="studentFirstName">
				</div>
				<div class="">
					<label for="studentLastName">Last Name</label>
					<input type="text" class="form-control" name ="studentLastName">
				</div>
				<div class="">
					<label for="studentClass">Class</label>
					<input type="number" class="form-control" name ="studentClass">
				</div>
				<div class="">
					<label for="age">Age</label>
					<input type="number" class="form-control" name ="age">
				</div>
				<div class="">
					<label for="position">Position</label>
					<input type="text" class="form-control" name ="position">
				</div>
				<div class="">
					<label for="studentAddress">Home Address</label>
					<input type="text" class="form-control" name ="studentAddress">
				</div>
				<div class="">
					<label for="studentEmail">Email Address</label>
					<input type="email" class="form-control" name ="studentEmail">
				</div>
				<div class="">
					<label for="classTeacher">Teacher's Name</label>
					<input type="text" class="form-control" name ="classTeacher">
				</div>
				<div class="">
					<label for="parentsName">Parents' Name</label>
					<input type="text" class="form-control" name ="parentsName">
				</div>
				<div class="">
					<label for="studentPhoneNumber">Phone Number</label>
					<input type="number" class="form-control" name ="studentPhoneNumber">
				</div>
				<div class="submit">
					<input type="submit" value="Submit" class="sbt">
				</div>
				
			</fieldset>
		</form>
	</div>

	<script type="text/javascript" src="vendors/jquery/jquery-min.js"></script>
	<script type="text/javascript" src="vendors/tether/dist/js/tether.min.js"></script>
	<script type="text/javascript" src="vendors/jquery/bootstrap.min.js"></script>
	<script type="text/javascript" src="vendors/jquery/jquery-min.js"></script>
</body>
</html>