package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masai.model.IdCard;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ShifaVaccinationPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShifaVaccinationPortalApplication.class, args);
	
	}

}
