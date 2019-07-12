<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-content">

	<h2>Alien Age Calculator</h2>

	<c:url var="formAction" value="/ageCalculator/calculate" />

	<form action="${formAction}" method="GET">
		<div>
			<label for="planet">Choose a Planet</label> <select id="planet"
				name="planet">
				<option value="mercury">Mercury</option>
				<option value="venus">Venus</option>
				<option value="mars">Mars</option>
				<option value="jupiter">Jupiter</option>
				<option value="saturn">Saturn</option>
				<option value="uranus">Uranus</option>
				<option value="neptune">Neptune</option>
			</select>
		</div>
		<div>
			<label for="age">Enter Your Earth Age</label>
			<span class="column">
			<input
			type="text" id="age" name="age" />
				<input type="submit" value="Calculate Age" />
			</span>
		</div>
	</form>
</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />