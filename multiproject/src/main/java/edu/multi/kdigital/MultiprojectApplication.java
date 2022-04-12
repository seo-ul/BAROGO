package edu.multi.kdigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = mainController.class)
public class MultiprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiprojectApplication.class, args);
	}

}
