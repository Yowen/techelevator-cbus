<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div>

	<c:url var="planetDescriptionUrl" value="/planetDescription">
		<c:param name="id" value="${planet.name}"/>
	</c:url>
	
	<h2><a href="${planetDescriptionUrl}"><c:out value="${planet.name}"/></a></h2>
	
	<h2>
		<c:out value="${planet.name}"/>
		<c:url var="planetImgUrl" value="/img/${planet.imageName}"/>
		<img src="${planetImgUrl}" style="width:200px;" />
	</h2>
	
	<p>
		<b> All from the Sun:</b> <c:out value="${planet.auFromSun}"/>
		<br />
		<b>Number of Moons:</b><c:out value="${planet.numberOfMoons}"/>
	</p>
</div>