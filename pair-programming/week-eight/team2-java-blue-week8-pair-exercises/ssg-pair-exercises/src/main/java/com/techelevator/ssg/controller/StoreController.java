package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;
import com.techelevator.ssg.model.store.ShoppingCart;

@Controller
@SessionAttributes("shoppingCart")
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String storeLanding(ModelMap map) {
		map.addAttribute("products", productDao.getAllProducts());
		return "store/products";
	}
	
	@RequestMapping(path="/productDetail", method=RequestMethod.GET) 
	public String getDetails(HttpServletRequest request, ModelMap map) {
		//long id = (long) map.get("id");
		long id = Long.parseLong(request.getParameter("id"));
		Product p = productDao.getProductById(id);
		map.addAttribute("product", p);
		
		return "store/productDetail";
	}
	
	@RequestMapping(path="/productDetail", method=RequestMethod.POST) 
	public String addToCart(@RequestParam int quantity, @RequestParam long id, ModelMap map) {
		Product p = productDao.getProductById(id);
		if (map.get("shoppingCart") == null) {
			map.addAttribute("shoppingCart", new ShoppingCart());
		}
		
		ShoppingCart shoppingCart = (ShoppingCart) map.get("shoppingCart");
		
		shoppingCart.addQuantity(p, quantity);
		
		return "redirect:/store/viewCart";
	}
	
	@RequestMapping("/viewCart")
	public String viewCart() {
		return "store/viewCart";
	}
}
