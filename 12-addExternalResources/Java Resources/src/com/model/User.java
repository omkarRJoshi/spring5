package com.model;

public class User {
	private String name;
	private String gender;
	private String country;
	private String intro;
	private String[] visitedCountries;
	
	public String[] getVisitedCountries() {
		return visitedCountries;
	}

	public void setVisitedCountries(String[] visitedCountries) {
		this.visitedCountries = visitedCountries;
	}

	
	
//	public User(String name, String gender) {
//		this.name = name;
//		this.gender = gender;
//	}

	public String getName() {
		return name;
	}
	
	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
