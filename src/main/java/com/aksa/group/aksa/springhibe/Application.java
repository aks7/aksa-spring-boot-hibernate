package com.aksa.group.aksa.springhibe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aksa.group.aksa.springhibe.impl.HibeImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	/*
	 * @Bean public CommandLineRunner demo() { return (args) -> {
	 * 
	 * }; }
	 */
	@Bean
	public HibeImpl getHibeImpl() {
		return new HibeImpl();
	}
}
