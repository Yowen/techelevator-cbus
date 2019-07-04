<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Favorite Things Exercise</h1>

<h2>What is your favorite food?</h2>

<c:url var="foodURL" value="/FavoriteThings/Page2" />
<form action="${foodURL}" method="POST">
	<input type="text" name="input" />
	<input type="submit" value="Next >>>" />
</form>