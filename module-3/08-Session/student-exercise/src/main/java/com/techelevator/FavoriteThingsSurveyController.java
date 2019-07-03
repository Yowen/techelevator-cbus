package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/FavoriteThings")
public class FavoriteThingsSurveyController {
	
	@RequestMapping(path="/Page1")
	public String showStepOne() {
		return "wizard/Page1";
	}
}
