package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cars.Corolla;
import com.cars.Swift;

@Configuration
@ComponentScan("com")
public class AppConfig {
	
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
}
