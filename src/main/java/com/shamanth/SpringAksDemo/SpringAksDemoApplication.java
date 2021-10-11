package com.shamanth.SpringAksDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shamanth")
public class SpringAksDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAksDemoApplication.class, args);
	}

}
