package com.week1Assignment.AliceBakery.week1Assignment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1AssignmentApplication implements CommandLineRunner {

	private final CakeBaker cakeBaker;

	public Week1AssignmentApplication(CakeBaker cakeBaker){
		this.cakeBaker=cakeBaker;
	}
	public static void main(String[] args) {

		SpringApplication.run(Week1AssignmentApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.print(cakeBaker.bakeCake());

	}

}
