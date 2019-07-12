<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-content">
	<h3 class="giftShopHeader">Solar System Geek Gift Shop</h3>

	<c:forEach var="product" items="${products}">
		<div class="product">
			<c:url var="productImgURL" value="/img/${product.imageName}" />
			<c:url var="productIdURL" value="/store/productDetail?id=${product.id}" />
			<a href="${productIdURL}"><img src="${productImgURL}" /></a>

			<div class="productInfo">
				<h5><a href="${productIdURL}">${product.name}</a></h5>
				<p class="productPrice">${product.price}</p>
			</div>
		</div>
	</c:forEach>
</div>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />