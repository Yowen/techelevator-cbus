<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-content">
	<h2>Alien Age Calculator</h2>

	<c:url var="formAction" value="/forum" />

	<form action="${formAction}" method="POST">
		<div>
			<label for="username">Username</label> <input type="text"
				name="username">
		</div>
		<div>
			<label for="subject">Subject</label> <input type="text"
				name="subject">
		</div>
		<div>
			<label for="message">Message</label> <input type="text"
				name="message"> <input type="submit" value="Submit" />
		</div>
	</form>

	<div class="posts">
		<c:forEach var="post" items="${posts }">
			<div class="post">
				<h4>${post.subject}</h4>
				<p class="">by ${post.username} on ${post.datePosted} at
					${post.timePosted }</p>
				<p class="message">${post.message }</p>
			</div>
		</c:forEach>
	</div>

</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />