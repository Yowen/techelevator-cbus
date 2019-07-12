<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-content">

	<h2>Alien Age Calculator</h2>

	<c:url var="formAction" value="/driveTimeCalculator/calculate" />

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
			<label for="transport">Choose a Method of Transportation</label> <select id="transport"
				name="transport">
				<option value="walking">Walking</option>
				<option value="car">Car</option>
				<option value="bulletTrain">Bullet Train</option>
				<option value="boeing747">Boeing 747</option>
				<option value="concorde">Concorde</option>
			</select>
		</div>
		<div>
			<label for="age">Enter Your Age</label>
			<span class="column">
			<input
			type="text" id="age" name="age" />
				<input type="submit" value="Calculate Travel Time" />
			</span>
		</div>
	</form>
</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />