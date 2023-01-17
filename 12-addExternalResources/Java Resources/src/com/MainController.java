package com;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "India");
		countryMap.put("China", "China");
		countryMap.put("USA", "USA");
		countryMap.put("UK", "UK");
		
		Map<String, String> visitedCountriesMap = new HashMap<String, String>();
		visitedCountriesMap.put("India", "India");
		visitedCountriesMap.put("China", "China");
		visitedCountriesMap.put("USA", "USA");
		visitedCountriesMap.put("UK", "UK");
		
		modelAndView.addObject("genderMap", genderMap);
		modelAndView.addObject("countryMap", countryMap);
		modelAndView.addObject("visitedCountriesMap", visitedCountriesMap);
		modelAndView.addObject("user", user);
		
		return modelAndView;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfoView");
		modelAndView.addObject("userinfo", user);
		return modelAndView;
	}
	
}
