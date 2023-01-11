package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}
	
	@RequestMapping(value = "/displayname")
//	public String displayName(HttpServletRequest request) {
	public String displayName(@RequestParam("firstName") String firstName, Model model) {
//		String firstName = request.getParameter("firstName");
//		request.setAttribute("firstName", firstName);
		
		model.addAttribute("name", firstName);
		return "displayName";
	}
}
