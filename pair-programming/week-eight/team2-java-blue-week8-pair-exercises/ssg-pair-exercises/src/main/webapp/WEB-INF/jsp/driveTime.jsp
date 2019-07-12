<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-content">
	<c:url var="planetURL" value="/img/${param.planet}.jpg" />
	<img src="${planetURL}" alt="">
	<span class="bold"><c:out value="Travelling by ${transport} you will reach ${planetTitleCase} in ${travelDuration} years. You will be ${newAge} years old."/></span>
</div>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />