package com.cars;

import org.springframework.stereotype.Component;

import com.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Sedan from toyota";
	}

}
