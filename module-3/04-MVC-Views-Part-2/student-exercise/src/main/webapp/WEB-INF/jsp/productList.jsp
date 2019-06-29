<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product List View" />
</c:import>

<div id="card-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="#" />
	</c:import>

	<div class="main-content">
		<!-- Container for Sorting Choices
         
         Each link should take the user to this current page and use any combination of the following
         querystring parameters to sort the page:
            - sortOrder (string) - PriceLowToHigh,PriceHighToLow,RatingHighToLow
    	-->
		<div id="sorting-options">
			<h3>Sort By</h3>
			<ul>
				<li><a href="#">Price - Low to High</a></li>
				<li><a href="#">Price - High to Low</a></li>
				<li><a href="#">Rating - High to Low</a></li>
			</ul>
		</div>


		<!-- Container for all of the Products -->
		<!-- The list of products is available using the `products` variable -->
		<div id="grid">
			<c:forEach var="product" items="${products}">
				<c:choose>
					<c:when test="${product.topSeller == true}">

						<div class="tile ">
							<span class="banner top-seller">Top Seller!</span>
							<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
							<a class="product-image" href="#"> <img
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

								<p class="price">$${product.price}</p>
							</div>
						</div>
					</c:when>

					<c:when
						test="${product.remainingStock > 0 && product.remainingStock <= 5}">
						<div class="tile ">

							<a class="product-image" href="#"> <img
								src="<c:url value="/images/product-images/${product.imageName}" />" />
							</a>
							<div class="details">
								<p class="name">${product.name}</p>

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
								<span class="product-alert">Only
									${product.remainingStock} left!</span>
								<p class="price">$${product.price}</p>
							</div>
						</div>
					</c:when>

					<c:when test="${product.remainingStock == 0}">
						<div class="tile sold-out">
							<span class="banner">Sold Out</span> 
							<a class="product-image" href="#"> <img
								src="<c:url value="/images/product-images/${product.imageName}" />" />
							</a>
							<div class="details">
								<p class="name">${product.name}</p>

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
								<span class="product-alert">Only
									${product.remainingStock} left!</span>
								<p class="price">$${product.price}</p>
							</div>
						</div>
					</c:when>

					<c:otherwise>
						<div class="tile ">
							<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
							<a class="product-image" href="#"> <img
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

								<p class="price">$${product.price}</p>
							</div>
						</div>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />