<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Container for Filter Choices
        Each link should take the user to this current page and use any combination of the following
        querystring parameters to filter the page:
        - maxPrice (number)
        - minPrice (number)
        - minRating (number)
        - category (string) - Home, Apparel, Jewelry, Garden

        NOTE: A parameter is passed to this view that is called `baseRoute`. `baseRoute`
        refers to the page that the filters should be associated with. For instance, if you are on the products
        page, the value of the `baseRoute` should be the route for products and on the tiles page, should be the
        route for tiles.
        -->
<div id="filter-options">
	<h3>Refine By</h3>
	<ul>
		<c:url var="underTwentyFiveURL" value="">
			<c:param name="maxPrice" value="25"/>
		</c:url>
		
		<c:url var="betweenTwentyFiveAndFiftyURL" value="">
			<c:param name="minPrice" value="25"/>
			<c:param name="maxPrice" value="50"/>
		</c:url>
		
		<c:url var="aboveFiftyURL" value="">
			<c:param name="minPrice" value="50"/>
		</c:url>
	
		<li><a href="${underTwentyFiveURL}">Under $25</a></li>
		<li><a href="${betweenTwentyFiveAndFiftyURL}">$25 to $50</a></li>
		<li><a href="${aboveFiftyURL}">$50 &amp; Above</a></li>
	</ul>
	<p>Avg. Review</p>
	<ul>
		<c:url var="oneStarUpURL" value="">
			<c:param name="minRating" value="1"/>
		</c:url>
		
		<c:url var="twoStarUpURL" value="">
			<c:param name="minRating" value="2"/>
		</c:url>
		
		<c:url var="threeStarUpURL" value="">
			<c:param name="minRating" value="3"/>
		</c:url>
		
		<c:url var="fourStarUpURL" value="">
			<c:param name="minRating" value="4"/>
		</c:url>
	
		<li>
			<a class="rating" href="${fourStarUpURL}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${threeStarUpURL}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${twoStarUpURL}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${oneStarUpURL}">
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
	</ul>
	<p>Category</p>
	
	<c:url var="homeFilterURL" value="">
		<c:param name="category" value="Home"/>
	</c:url>
	
	<c:url var="apparelFilterURL" value="">
		<c:param name="category" value="Apparel"/>
	</c:url>
	
	<c:url var="jewelryFilterURL" value="">
		<c:param name="category" value="Jewelry"/>
	</c:url>
	
	<c:url var="gardenFilterURL" value="">
		<c:param name="category" value="Garden"/>
	</c:url>
	
	<ul>
		<li><a href="${homeFilterURL}">Home</a></li>
		<li><a href="${apparelFilterURL}">Apparel</a></li>
		<li><a href="${jewelryFilterURL}">Jewelry</a></li>
		<li><a href="${gardenFilterURL}">Garden</a></li>
	</ul>
</div>
