package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication //indicates its the starting point of this application.

@ComponentScan({"mvc.aspects","mvc.controller.ui","mvc.service"})

//repository/data accss layer package name
@EnableJpaRepositories("mvc.dataAccessLayer")
@EntityScan({"mvc.dataAccessLayer"})
@EnableTransactionManagement
public class MyJ2EEprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJ2EEprojectApplication.class, args);
	}

}
