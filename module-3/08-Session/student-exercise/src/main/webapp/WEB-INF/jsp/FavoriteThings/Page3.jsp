<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Favorite Things Exercise</h1>

<h2>What is your favorite season?</h2>

<c:url var="seasonURL" value="/FavoriteThings/Page3" />
<form action="${seasonURL}" method="POST">
	<input type="text" name="input" />
	<input type="submit" value="Next >>>" />
</form>