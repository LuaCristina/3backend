package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Exercicio1Application {

	private Logger logger = Logger.getLogger(Exercicio1Application.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

}
