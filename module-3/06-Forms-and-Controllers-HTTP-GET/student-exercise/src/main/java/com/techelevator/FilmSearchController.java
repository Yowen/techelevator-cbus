package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;

    @RequestMapping("/filmList")
    public String showFilmSearchForm() {
        return "filmList";
    }

    @RequestMapping("/filmList/search")
    public String searchFilms(HttpServletRequest request) {
    	String strMinLength = request.getParameter("minLength");
    	String strMaxLength = request.getParameter("maxLength");
    	String genre = request.getParameter("genre");
    	int minLength = Integer.parseInt(strMinLength);
    	int maxLength = Integer.parseInt(strMaxLength);
    	
    	List<Film> results = new ArrayList<Film>();
    	
    	results = filmDao.getFilmsBetween(genre, minLength, maxLength);
    	
    	request.setAttribute("films", results);
    	
        return "filmList";
    }

}