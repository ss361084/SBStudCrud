<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Show Student Details</title>
		<%@include file="include/Head.jsp"%>
	</head>
	<body>
		<section class="container-fluid mt-5">
			<div class="col-md-10 offset-md-4">
				<c:if test="${not empty successMsg}">
					<div class="row">
						<h2 class="successClass">${successMsg}</h2>	
					</div>
				</c:if>
				<div class="row">
					Done...
				</div>
			</div>
		</section>
	</body>
</html>