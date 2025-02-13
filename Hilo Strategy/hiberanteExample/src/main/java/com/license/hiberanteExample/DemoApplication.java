package com.license.hiberanteExample;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.license.hiberanteExample.entity.DrivingLicense;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@SpringBootApplication
public class DemoApplication {

	// @PersistenceContext
    // private EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(String[] args){
		return runner -> {
			
            System.out.println("fetchedLicense");
		};
	}

}
