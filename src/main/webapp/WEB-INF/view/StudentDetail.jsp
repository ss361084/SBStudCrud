<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sTag" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<%@include file="include/Head.jsp"%>
		<title><sTag:message code="label_studdetail_page_title"/></title>
	</head>
	<body>
		<section class="container-fluid">
			<div class="row">
				<div class="col-4"></div>
				<a class="btn btn-primary col-4 mt-4" href="${pageContext.request.contextPath}/showstudnetpage">
					<sTag:message code="label_add_student_btn"/>
				</a>
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
							<h3 class="col-md-10 offset-md-5 mt-4"><sTag:message code="label_studdetail_caption"/></h3>
							<table class="table table-bordered mt-4">
								<thead>
									<tr>
										<th><sTag:message code="label_studdetail_full_name"/></th>
										<th><sTag:message code="label_studdetail_email"/></th>
										<th><sTag:message code="label_studdetail_gender"/></th>
										<th><sTag:message code="label_studdetail_Action"/></th>
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
						</div>
					</c:when>
					<c:otherwise>
						<h3 class="col-md-10 offset-md-4 mt-4">
							<sTag:message code="label_studdetail_no_record_found"/>
						</h3>
					</c:otherwise>
				</c:choose>
			</div>
		</section>
	</body>
</html>