<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-content">
	<h5 class="giftShopHeader">Solar System Geek Gift Shop</h5>
	<div class="product">
		<c:set var="grandTotal" value="0" />
		<table>
			<tr>
				<th></th>
				<th>Name</th>
				<th>Price</th>
				<th>Qty.</th>
				<th>Total</th>
			</tr>
			<c:forEach var="product" items="${shoppingCart.products}">
				<tr>
					<c:url var="productImgURL" value="/img/${product.key.imageName}" />
					<td><img src="${productImgURL}" /></td>
					<td>${product.key.name}</td>
					<td>${product.key.price}</td>
					<td>${product.value}</td>
					<c:set var="total"
						value="${(product.key.price.dollars * product.value)+((product.key.price.cents * product.value) / 100)}" />
					<c:set var="grandTotal" value="${total + grandTotal}" />
					<td><fmt:formatNumber value="${total}" type="currency" /></td>
			</c:forEach>
		</table>



	</div>
	<div class="checkOut">
		<p>
			<span class="bold">Grand Total</span> <fmt:formatNumber value="${grandTotal}" type="currency" />
		</p>
		<p>
			<a href="">Check out</a>
		</p>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />