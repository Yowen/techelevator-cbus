<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="#" />
	</c:import>

	<!-- Container for all of the Products -->
	<!-- The list of products is available using the `products` variable -->
	<div id="grid" class="main-content">

		<!-- The following HTML shows different examples of what HTML
		 could be rendered based on different rules. For purposes
		 of demonstration we've written it out so you can see it
		 when you load the page up. -->

		<c:forEach var="product" items="${products}">

			<c:url var="detailURL" value="/products/detail">
				<c:param name="id" value="${product.id}" />
			</c:url>

			<fmt:formatNumber var="formattedCost" type="currency"
				value="${product.price}" />

			<c:choose>
				<c:when test="${product.remainingStock == 0}">
					<div class="tile sold-out">
						<span class="banner">Sold Out</span>

						<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
						<a class="product-image" href="${detailURL}"> <img
							src="<c:url value="/images/product-images/${product.imageName}" />" />
						</a>
						<div class="details">
							<p class="name">${product.name}</p>

							<!-- .filled will make the star solid -->
							<div class="rating">
								<c:forEach begin="1" end="5" var="num">
									<c:choose>
										<c:when test="${product.averageRating >= num}">
											<span class="filled">&#9734;</span>
										</c:when>

										<c:otherwise>
											<span>&#9734;</span>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</div>

							<p class="price">${formattedCost}</p>
						</div>
					</div>
				</c:when>

				<c:otherwise>
					<div class="tile ">

						<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
						<a class="product-image" href="${detailURL}"> <img
							src="<c:url value="/images/product-images/${product.imageName}" />" />
						</a>
						<div class="details">
							<p class="name">${product.name}</p>

							<!-- .filled will make the star solid -->
							<div class="rating">
								<c:forEach begin="1" end="5" var="num">
									<c:choose>
										<c:when test="${product.averageRating >= num}">
											<span class="filled">&#9734;</span>
										</c:when>

										<c:otherwise>
											<span>&#9734;</span>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</div>

							<c:if test="${product.topSeller == true}">
								<p class="product-alert">Top Seller!</p>
							</c:if>

							<c:if
								test="${product.remainingStock > 0 && product.remainingStock <= 5}">
								<p class="product-alert">Only ${product.remainingStock}
									left!</p>
							</c:if>

							<p class="price">${formattedCost}</p>
						</div>
					</div>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />