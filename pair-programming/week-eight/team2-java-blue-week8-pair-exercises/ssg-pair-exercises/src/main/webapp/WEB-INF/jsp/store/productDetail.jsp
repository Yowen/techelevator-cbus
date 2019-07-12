<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-content">
	<h5 class="giftShopHeader">Solar System Geek Gift Shop</h5>
	<div class="product">
		<div class="productImg">
			<c:url var="productImgURL" value="/img/${product.imageName}" />
			<img src="${productImgURL}" />
		</div>

		<div class="productInfo">
			<h3>${product.name}</h3>
			<p class="productPrice">${product.price}</p>
			<p class="description">${product.description}</p>

			<form action="<c:url value="/store/productDetail"/>" method="POST">
				<label for="quantity">Quantity to buy</label> 
				<input type="number" name="quantity" required />
				<input type="submit" value="Add to Cart" />
				<input type="text" name="id" value="${product.id}" hidden=true/>
			</form>
		</div>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />