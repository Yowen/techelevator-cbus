<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<h1>Step Two: What state is the city in?</h1>

<c:url var="stepTwoPostURL" value="/addCity/stepTwo"/>

<form action="${stepTwoPostURL}" method="POST">
	<input type="text" name="state" />
	<input type="submit" value="Next >>" />
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />