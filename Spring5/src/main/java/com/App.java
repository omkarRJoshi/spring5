package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		//dependecy inversion
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar1 = context.getBean("indica", Car.class);
		Car myCar2 = context.getBean("swift", Car.class);
		System.out.println(myCar1.specs());
		System.out.println(myCar2.specs());
		context.close();

	}

}
