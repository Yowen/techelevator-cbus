package com.techelevator.reviews.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.reviews.dao.IProductReviewDao;
import com.techelevator.reviews.exception.ProductReviewNotFoundException;
import com.techelevator.reviews.model.ProductReview;

@RestController
@RequestMapping("/api/reviews")
public class ProductReviewsController {

	private final IProductReviewDao productReviewDao;
	
	// Use Autowired if you have multiple constructors
	
	public ProductReviewsController(IProductReviewDao productReviewDao) {
		this.productReviewDao = productReviewDao;
	}
	
	@GetMapping
	public List<ProductReview> getProductReviews() {
		return productReviewDao.list();
	}
	
	@GetMapping("/{id}")
	public ProductReview getProductReview(@PathVariable int id) {
		ProductReview productReview = productReviewDao.read(id);
		if (productReview != null) {
			return productReview;
		}
		
		throw new ProductReviewNotFoundException(id, "Product review could not be found.");
	}
	
}
