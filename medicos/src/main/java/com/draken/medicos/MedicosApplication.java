package com.draken.medicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"com.draken.commons",
				"com.draken.medicos"
		}
)
public class MedicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicosApplication.class, args);
	}

}
