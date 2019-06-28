<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Name List Example</title>
	</head>
	<body>
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Adult</th>
			</tr>
			<c:forEach var="person" items="${personList}">
				<tr>
					<td><c:out value="${person.firstName}"/></td>
					<td><c:out value="${person.lastName}"/></td>
					<td><c:out value="${person.age}"/></td>
					<td><c:out value="${person.adult}"/></td>
				</tr>
			</c:forEach>
		</table>
		
		<div>
			<h1>${person.firstName} ${person.lastName}</h1>
			<p>${person.address.city}, ${person.address.state} ${person.address.zipcode}
		</div>
	</body>
</html>