package com.cars;

import org.springframework.stereotype.Component;

import com.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Hatchback from suzuki";
	}

}
