<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My Home</title>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.5.1/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		<style type="text/css">
			.errClass {
				color: red;
			}
		</style>
	</head>
	<body>
		<section class="container-fluid mt-5">
			<form:form class="form-horizontal" action="${pageContext.request.contextPath}/student/addstudent" modelAttribute="student" method="post">
<%-- 				<form:button class="btn btn-link btn-block" type="button" id="btnPersonalInfo"><strong>Show Personal Info</strong></form:button> --%>
<!-- 				<div id="divPersonalInfo" style="display: none;" class="col-md-10 offset-md-4"> -->
				<div class="col-md-10 offset-md-4">
					<div class="form-group row">
						<label class="col-2 text-center">Enter First Name :: </label>
						<form:input class="col-3 form-control" path="fName" placeHolder="Enter First Name"/>&nbsp;
						<form:errors class="errClass" path="fName"></form:errors>
					</div>
					<div class="form-group row">
						<label class="col-2 text-center">Enter Middle Name :: </label>
						<form:input class="col-3 form-control" path="mName" placeHolder="Enter Middle Name"/>&nbsp;
						<form:errors class="errClass" path="mName"></form:errors>
					</div>
					<div class="form-group row">
						<label class="col-2 text-center">Enter Last Name :: </label>
						<form:input class="col-3 form-control" path="lName" placeHolder="Enter Last Name"/>
						<form:errors class="errClass" path="lName"></form:errors>						
					</div>
					<div class="form-group row">
						<label class="col-2 text-center">Enter Email :: </label>
						<form:input class="col-3 form-control" path="email" placeHolder="Enter Email"/>
						<form:errors class="errClass" path="email"></form:errors>
					</div>
					<div class="form-group row">
						<label class="col-2 text-center">Enter Birth Date :: </label>
						<form:input class="col-3 form-control" path="bDate" type="date"/>
						<form:errors class="errClass" path="bDate"></form:errors>						
					</div>
					<div class="form-group row">
						<label class="col-2 text-center">Select Gender :: </label>
						<form:radiobuttons path="gender"/>
						<form:errors class="errClass" path="gender"></form:errors>
					</div>		
<!-- 				</div> -->
<%-- 				<form:button class="btn btn-link btn-block" type="button" id="btnAddressInfo"><strong>Show Address Info</strong></form:button> --%>
<!-- 				<div id="divAddressInfo" style="display: none;" class="col-md-10 offset-md-4"> -->
					<div class="form-group row">
						<label class="col-2 text-center">Enter House No :: </label>
						<form:input class="col-3 form-control" path="address.houseNo" placeHolder="House Number"/>
						<form:errors class="errClass" path="address.houseNo"></form:errors>
					</div>
					<div class="form-group row">
						<label class="col-2 text-center">Enter Address :: </label>
						<form:textarea class="col-3 form-control" path="address.address" rows="3" cols="20"/>
						<form:errors class="errClass" path="address.address"></form:errors>
					</div>		
					<div class="form-group row">
						<label class="col-2 text-center">Enter City :: </label>
						<form:input class="col-3 form-control" path="address.city"/>
						<form:errors class="errClass" path="address.city"></form:errors>
					</div>
					<div class="form-group row">
						<label class="col-2 text-center">Enter State :: </label>
						<form:input class="col-3 form-control" path="address.state"/>
						<form:errors class="errClass" path="address.state"></form:errors>
					</div>		
<!-- 				</div> -->
				</div>
				<div class="form-group row">
					<form:button class="btn btn-lite btn-block" type="submit"><strong>SUBMIT</strong></form:button>
				</div>
			</form:form>
		</section>
	</body>
<!-- 	<script type="text/javascript" src="js/StudentAuthentication.js"></script> -->
	<script type="text/javascript">
		/* $("#btnPersonalInfo").click(function(){
			$("#divPersonalInfo").show();
			$("#btnPersonalInfo").hide();
		});
		$("#btnAddressInfo").click(function(){
			$("#divAddressInfo").show();
			$("#btnAddressInfo").hide();
		}); */
	</script>
</html>