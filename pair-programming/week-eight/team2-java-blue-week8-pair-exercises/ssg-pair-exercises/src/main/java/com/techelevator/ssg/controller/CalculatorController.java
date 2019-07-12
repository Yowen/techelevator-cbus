package com.techelevator.ssg.controller;

import java.text.DecimalFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.ssg.model.AgeCalculator;
import com.techelevator.ssg.model.DriveTimeCalculator;
import com.techelevator.ssg.model.WeightCalculator;

@Controller
public class CalculatorController {

	@Autowired
	private WeightCalculator weightCalculator;
	@Autowired
	private AgeCalculator ageCalculator;
	@Autowired
	private DriveTimeCalculator driveTimeCalculator;

	@RequestMapping("/weightCalculator")
	public String displayWeightCalculator() {

		return "weightCalculator";
	}

	@RequestMapping("/weightCalculator/calculate")
	public String displayWeightCalculatorResult(HttpServletRequest request) {
		String weight = request.getParameter("weight");
		String planet = request.getParameter("planet");
		String planetTitleCase = planet.substring(0, 1).toUpperCase() + planet.substring(1);

		String result = weightCalculator.calculateNewWeight(weight, planet);
		request.setAttribute("planetTitleCase", planetTitleCase);
		request.setAttribute("newWeight", result);

		return "alienWeight";
	}

	@RequestMapping("/ageCalculator")
	public String displayAgeCalculator() {

		return "ageCalculator";
	}

	@RequestMapping("/ageCalculator/calculate")
	public String displayAgeCalculatorResult(HttpServletRequest request) {
		String age = request.getParameter("age");
		String planet = request.getParameter("planet");
		String planetTitleCase = planet.substring(0, 1).toUpperCase() + planet.substring(1);

		double result = ageCalculator.calculateNewAge(age, planet);
		request.setAttribute("planetTitleCase", planetTitleCase);
		DecimalFormat df = new DecimalFormat("0.00##");
		String newAge = df.format(result);
		request.setAttribute("newAge", newAge);

		return "alienAge";
	}

	@RequestMapping("/driveTimeCalculator")
	public String displayDriveTimeCalculator() {

		return "driveTimeCalculator";
	}

	@RequestMapping("/driveTimeCalculator/calculate")
	public String displayDriveTimeCalculatorResult(HttpServletRequest request) {
		String age = request.getParameter("age");
		String transport = request.getParameter("transport");
		String planet = request.getParameter("planet");
		String planetTitleCase = planet.substring(0, 1).toUpperCase() + planet.substring(1);
		request.setAttribute("planetTitleCase", planetTitleCase);

		double travelDuration = driveTimeCalculator.calculateDriveTime(planet, transport);
		double newAge = driveTimeCalculator.calculateNewAge(age);
		DecimalFormat df = new DecimalFormat("0.00##");
		String newAgeString = df.format(newAge);
		String travelDurationString = df.format(travelDuration);
		request.setAttribute("newAge", newAgeString);
		request.setAttribute("travelDuration", travelDurationString);

		return "driveTime";
	}

}
