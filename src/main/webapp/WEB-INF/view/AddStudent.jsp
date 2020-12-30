<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sTag" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<%@include file="include/Head.jsp"%>
		<title><sTag:message code="label_home_page_title"/></title>
	</head>
	<body>
		<section class="container-fluid mt-5">
			<c:if test="${not empty errMsg}">
				<div class="errClass col-md-10 offset-md-4">
					<h3>${errMsg}</h3>
				</div>
			</c:if>
			<form:form class="form-horizontal" action="${pageContext.request.contextPath}/addstudent" modelAttribute="student" method="post">
				<div class="col-md-10 offset-md-4">
					<div class="form-group row">
						<form:hidden path="studId"/>
						<sTag:message code="label_add_student_first_name" var="firstName"/>
						<input type="hidden" id="opType" name="opType" value="${opType}">
						<label class="col-2 text-center">${firstName}</label>
						<form:input class="col-3 form-control" path="fName" placeHolder="${firstName}"/>&nbsp;
						<form:errors class="errClass" path="fName"></form:errors>
					</div>
					<div class="form-group row">
						<sTag:message code="label_add_student_middle_name" var="middleName"/>
						<label class="col-2 text-center">${middleName}</label>
						<form:input class="col-3 form-control" path="mName" placeHolder="${middleName}"/>&nbsp;
						<form:errors class="errClass" path="mName"></form:errors>
					</div>
					<div class="form-group row">
						<sTag:message code="label_add_student_last_name" var="lastName"/>
						<label class="col-2 text-center">${lastName}</label>
						<form:input class="col-3 form-control" path="lName" placeHolder="${lastName}"/>
						<form:errors class="errClass" path="lName"></form:errors>						
					</div>
					<div class="form-group row">
						<sTag:message code="label_add_student_email" var="email"/>
						<label class="col-2 text-center">${email}</label>
						<form:input class="col-3 form-control" path="email" placeHolder="${email}"/>
						<form:errors class="errClass" path="email"></form:errors>
					</div>
					<div class="form-group row">
						<sTag:message code="label_add_student_birth_date" var="birthDate"/>
						<label class="col-2 text-center">${birthDate}</label>
						<form:input class="col-3 form-control" path="bDate" type="date"/>
						<form:errors class="errClass" path="bDate"></form:errors>						
					</div>
					<div class="form-group row">
						<sTag:message code="label_add_student_gender" var="gender"/>
						<label class="col-2 text-center">${gender}</label>
						<form:radiobuttons path="gender"/>
						<form:errors class="errClass" path="gender"></form:errors>
					</div>
					</div>
					<div class="form-group row">
						<%@include file="AddressDetail.jsp" %>
					</div>
				<div class="form-group row">
					<div class="col-5"></div>
					<div class="col-1">
						<form:button class="btn btn-primary" type="submit">
							<strong>
								<c:choose>
									<c:when test="${opType eq 'edit'}"><sTag:message code="label_add_student_update_btn"/></c:when>
									<c:otherwise><sTag:message code="label_add_student_add_btn"/></c:otherwise>
								</c:choose>
							</strong>
						</form:button>
					</div>
					<div class="col-1">
						<a class="btn btn-primary" href="${pageContext.request.contextPath}/">
							<strong><sTag:message code="label_add_student_home_btn"/></strong>
						</a>
					</div>
					<div class="col-5"></div>
				</div>
			</form:form>
		</section>
	</body>
	<script type="text/javascript">
		
	</script>
</html>