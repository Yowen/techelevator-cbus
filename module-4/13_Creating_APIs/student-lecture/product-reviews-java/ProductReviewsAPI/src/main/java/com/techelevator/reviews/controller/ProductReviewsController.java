package com.techelevator.reviews.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.reviews.dao.IProductReviewDao;
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
	
}
