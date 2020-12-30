<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My Home</title>
		<%@include file="include/Head.jsp"%>
	</head>
	<body>
		<section class="container-fluid mt-5">
			<c:if test="${not empty errMsg}">
				<div class="errClass col-md-10 offset-md-4">
					<h3>${errMsg}</h3>
				</div>
			</c:if>
			<form:form class="form-horizontal" action="${pageContext.request.contextPath}/addstudent" modelAttribute="student" method="post">
<%-- 				<form:button class="btn btn-link btn-block" type="button" id="btnPersonalInfo"><strong>Show Personal Info</strong></form:button> --%>
<!-- 				<div id="divPersonalInfo" style="display: none;" class="col-md-10 offset-md-4"> -->
				<div class="col-md-10 offset-md-4">
					<div class="form-group row">
						<form:hidden path="studId"/>
						<input type="hidden" id="opType" name="opType" value="${opType}">
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
					<%-- <div class="form-group row">
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
					</div>	 --%>	
<!-- 				</div> -->
				</div>
				<div class="form-group row">
					<div class="col-5"></div>
					<div class="col-1">
						<form:button class="btn btn-primary" type="submit">
							<strong>
								<c:choose>
									<c:when test="${opType eq 'edit'}">Update</c:when>
									<c:otherwise>Submit</c:otherwise>
								</c:choose>
							</strong>
						</form:button>
					</div>
					<div class="col-1">
						<a class="btn btn-primary" href="${pageContext.request.contextPath}/"><strong>Home</strong></a>
					</div>
					<div class="col-5"></div>
				</div>
			</form:form>
		</section>
	</body>
</html>