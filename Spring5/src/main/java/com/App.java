package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		//dependecy inversion
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean(Car.class);
		System.out.println(myCar.specs());
		context.close();

	}

}
