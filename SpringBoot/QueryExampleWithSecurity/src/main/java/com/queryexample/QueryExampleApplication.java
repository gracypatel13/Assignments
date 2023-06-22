package com.queryexample;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QueryExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueryExampleApplication.class, args);
		System.out.println("hello world");
		
	}

    @Bean
    ModelMapper modelMapper()
	{
		return new ModelMapper();
	}

}
