<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="common/header.jspf" %>

<h1>New User Registration</h1>

<c:url var="registrationURL" value="/registration" />

<form:form action="${registrationURL}" method="POST" modelAttribute="newLogin">
	<label for="firstName">First Name</label>
	<label for="lastName">Last Name</label>
	<label for="email">Email</label>
	<label for="confirmEmail">Confirm Email</label>
	<label for="password">Password</label>
	<label for="confirmPassword">Confirm</label>
	<label for="birthday">Birthday</label>
	<label for="tickets"># of Tickets</label>
</form:form>

<%@include file="common/footer.jspf" %>