package com.techelevator.ssg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class ForumController {

	@Autowired
	private ForumDao forumDao;
	
	@RequestMapping(path="/forum", method=RequestMethod.GET)
	public String viewForum(ModelMap map) {
		map.addAttribute("posts", forumDao.getAllPosts());
		return "forum";
	}
	
	@RequestMapping(path="/forum", method=RequestMethod.POST)
	public String addForumPost(ForumPost post, ModelMap map) {
		forumDao.save(post);
		return "redirect:/forum";
	}
}
