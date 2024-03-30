package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean("Id")
	public LocalDate createDate()
	{
		return LocalDate.now();
		
	}
	public static void main(String[] args) {
		//Get Container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		SeasonFinder sf=(SeasonFinder) ctx.getBean("sf","SeasonFinder");
		String sesonName=sf.findSeason();
		System.out.println("Current Season is="+sesonName);
		((ConfigurableApplicationContext) ctx).close();
		
		
	}

}
