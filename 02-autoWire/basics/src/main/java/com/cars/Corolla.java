package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.engine.Engine;
import com.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {
//	@Autowired(required = false)
	@Autowired
	Engine engine;
	
	
//	public void setEngine(Engine engine) {
//		engine.setType("New ***v8*** Engine");
//		this.engine = engine;
//		
//	}
	
	public Corolla(Engine engine) {
		engine.setType("New ***v8*** Engine");
		this.engine = engine;
	}



	@Override
	public String specs() {
		String specs = "Sedan from toyota with engine type as " + engine.getType();
		return specs;
	}

}
