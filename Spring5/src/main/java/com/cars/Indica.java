package com.cars;

import org.springframework.stereotype.Component;

import com.interfaces.Car;

@Component("indica")
public class Indica implements Car {

	@Override
	public String specs() {
		return "Indica from Tata";
	}

}
