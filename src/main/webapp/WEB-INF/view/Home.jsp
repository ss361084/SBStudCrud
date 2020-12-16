<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My Home</title>
		<link type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css">
		<script type="text/javascript" src="webjars/jquery/3.5.1/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div>
			<div>
				<form action="${pageContext.request.contextPath}/student/addstudent" method="post">
					<div>
						<label>Enter Name :: </label>
						<input type="text" id="name" placeholder="Enter Name" required="required">
					</div>
					<div>
						<label>Enter House Number :: </label>
						<input type="text" id="houseNo" placeholder="House Number">
					</div>
					<div>
						<label>Enter Address :: </label>
						<textarea rows="3" cols="20" id="adress" placeholder="Enter Address" required="required"></textarea>
					</div>
					<div>
						<label>Enter City :: </label>
						<input type="text" id="city" placeholder="Enter City" required="required">
					</div>
					<div>
						<label>Enter State :: </label>
						<input type="text" id="state" placeholder="Enter State" required="required">
					</div>
					<div>
						<label>Enter Mobile Number :: </label>
						<input type="text" id="mobileNumber" placeholder="Enter Mobile Number">
					</div>
					<div>
						<button>Submit</button>
					</div>
				</form>
			</div>
		</div>
	</body>
</html>