<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>

<!-- Form goes here -->
<c:url var="formAction" value="actorSearch/search" />
<form method="GET" action="${formAction}">
	<input type="text" name="lastName" /> 
	<input type="submit" value="Submit" />
</form>

<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	<c:forEach var="actor" items="${actors}">
		<tr>
			<td>
				<c:out value="${actor.firstName} ${actor.lastName}"/>
			</td>
		</tr>
	</c:forEach>
</table>
<%@include file="common/footer.jspf"%>