<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Home</title>
</head>
<body>
	<c:url var="reviewURL" value="/review" />
	<a href="${reviewURL}">Add Review</a>

	<h1>
		<c:out value="Squirrel Cigar Parties For Dummies" />
	</h1>

	<c:url var="bookURL" value="etc/forDummies.png" />
	<img src="${bookURL}" alt="book" />

	<div>
		<c:forEach var="post" items="${posts}">
			<div class="post">
				<div>
					<strong><c:out value="${post.title}" /></strong>
					<c:out value="(${post.username})" />
				</div>
				<div>
					<c:forEach begin="1" end="${post.rating}" var="num">
						<c:url var="starURL" value="etc/star.png" />
						<img src="${starURL}" alt="gold star" />
					</c:forEach>
				</div>
				<p>${post.text}</p>
			</div>
		</c:forEach>
	</div>
</body>
</html>