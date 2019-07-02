package com.techelevator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping("/actorSearch")
	public String showSearchActorForm() {
		return "actorList";
	}

	@RequestMapping("/actorSearch/search")
	public String searchActors(HttpServletRequest request) {
		String lastName = request.getParameter("lastName");
		List<Actor> results = actorDao.getMatchingActors(lastName);
		request.setAttribute("actors", results);
		
		// Name of view to return
		return "actorList";
	}
}
