<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-content">

	<h2>Alien Weight Calculator</h2>

	<c:url var="formAction" value="/weightCalculator/calculate" />

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
			<label for="weight">Enter Your Earth Weight</label>
				
				<span class="column">
				<input
				type="text" id="weight" name="weight" />
					<input type="submit" value="Calculate Weight" />
				</span>
		</div>
	</form>

</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />