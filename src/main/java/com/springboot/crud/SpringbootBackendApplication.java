package com.springboot.crud;

import com.springboot.crud.repository.EmployeeRepository;
import com.springboot.crud.controller.*;
import com.springboot.crud.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springboot.crud.model.*;

@ComponentScan(basePackages = {"com.springboot.crud"})
@Configuration
@EnableWebMvc
@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Shawn");
//		employee.setLastName("Mendes");
//		employee.setEmailId("sm@gmail.com");
//		employeeRepository.save(employee);

//		Employee employee1 = new Employee();
//		employee1.setFirstName("Aadhya");
//		employee1.setLastName("B");
//		employee1.setEmailId("ab@gmail.com");
//		employeeRepository.save(employee1);
	}
}
