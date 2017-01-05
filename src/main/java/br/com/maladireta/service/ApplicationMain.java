package br.com.maladireta.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.maladireta.service.utils.AppContext;

@SpringBootApplication
public class ApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(AppContext.class, args);
	}
}
