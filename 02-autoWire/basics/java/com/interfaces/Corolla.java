package com.interfaces;

import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Sedan from toyota";
	}

}
