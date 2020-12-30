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
		<section class="container-fluid">
			<div class="row">
				<div class="col-4"></div>
				<a class="btn btn-primary col-4 mt-4" href="${pageContext.request.contextPath}/showstudnetpage">Add Student</a>
				<div class="col-4"></div>
			</div>
			<div>
				<c:if test="${not empty successMsg}">
					<div class="row">
						<h2 class="successClass">${successMsg}</h2>	
					</div>
				</c:if>
				<c:choose>
					<c:when test="${not empty listStudent}">
						<div class="row">
							<h3 class="col-md-10 offset-md-5 mt-4">Student Detail</h3>
							<table class="table table-bordered mt-4">
								<thead>
									<tr>
										<th>Full Name</th>
										<th>Email</th>
										<th>Gender</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listStudent}" var="stud">
										<tr>
											<td>${stud.fName} ${stud.mName} ${stud.lName}</td>
											<td>${stud.email}</td>
											<td>${stud.gender}</td>
											<td>
												<a class="btn btn-primary" href="${pageContext.request.contextPath}/deletestudent/${stud.studId}">Delete</a>
												<a class="btn btn-primary" href="${pageContext.request.contextPath}/updatestudent/${stud.studId}">Update</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<%-- <h3 class="col-md-10 offset-md-5">Address Detail</h3>
							<table class="table table-bordered">
								<thead>
									<tr>
										<th>House No</th>
										<th>Address</th>
										<th>City</th>
										<th>State</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listStudent}" var="stud">
										<tr>
											<td>${stud.address.houseNo}</td>
											<td>${stud.address.address}</td>
											<td>${stud.address.city}</td>
											<td>${stud.address.state}</td>
											<td>
												<a class="btn btn-primary">Delete</a>
												<a class="btn btn-primary">Update</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table> --%>
						</div>
					</c:when>
					<c:otherwise>
						<h3 class="col-md-10 offset-md-4">No Record Found...</h3>
					</c:otherwise>
				</c:choose>
			</div>
		</section>
	</body>
	<script type="text/javascript">
		function setAddressDetail(id){
			console.log(id);
		}
	</script>
</html>