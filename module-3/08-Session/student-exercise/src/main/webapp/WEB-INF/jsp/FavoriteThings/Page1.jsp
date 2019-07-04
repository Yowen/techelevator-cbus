<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Favorite Things Exercise</h1>

<h2>What is your favorite color?</h2>

<c:url var="colorURL" value="/FavoriteThings/Page1" />
<form action="${colorURL}" method="POST">
	<input type="text" name="input" />
	<input type="submit" value="Next >>>" />
</form>