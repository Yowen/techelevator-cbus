package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view
	@RequestMapping(path="/registration", method = RequestMethod.GET)
	public String getRegistrationScreen(ModelMap map) {
		if (!map.containsAttribute("registrationURL")) {
			map.addAttribute("newRegistration", new Registration());
		}
		return "registration";
	}

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	// GET: /login
	// Return the empty login view
	@RequestMapping(path ="/login", method = RequestMethod.GET)
	public String getLoginScreen(ModelMap map) {
		if (!map.containsAttribute("loginURL")) { 
			map.addAttribute("newLogin", new Login());
		}
		return "login";
	}

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)
	@RequestMapping(path="/login", method = RequestMethod.POST)
	public String validateLoginInfo(@Valid @ModelAttribute("newLogin") Login newLogin, BindingResult result, ModelMap map, RedirectAttributes attr) {
		if (result.hasErrors()) {
			return "/login";
		}
		
		return "redirect:/confirmation";
	}
	
	// GET: /confirmation
	// Return the confirmation view
	@RequestMapping(path="/confirmation", method = RequestMethod.GET)
	public String getConfirmationScreen() {
		return "confirmation";
	}
}