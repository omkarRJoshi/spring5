package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}
	
	@RequestMapping(value = "/displayname")
	public ModelAndView displayName(@RequestParam("firstName") String firstName) {
		ModelAndView modelAndView = new ModelAndView("displayName");
		Date date = new Date();
		List<String> list = new ArrayList();
		list.add("omkar");
		list.add("akash");
		list.add("more");
		list.add("suraj");
		list.add("patole");
		list.add(firstName);
		modelAndView.addObject("name", firstName);
		modelAndView.addObject("todaysDate", date);
		modelAndView.addObject("team", list);
		return modelAndView;
	}
}
