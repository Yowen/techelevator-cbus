<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Planet Details"/>
</c:import>

<h1>${planet.name}</h1>

<c:import url="/WEB-INF/jsp/singlePlanet.jsp"/>

<c:import url="/WEB-INF/jsp/footer.jsp"/>