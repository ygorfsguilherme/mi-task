package com.guilherme.mitask;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MiTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiTaskApplication.class, args);
	}

	@Component
	public static class Runner implements ApplicationRunner {
		@Value("${mitask.info}")
		String profile;
		@Override
		public void run(ApplicationArguments args) throws Exception {
			System.out.println("This is application is run in mode: " + profile);
		}
	}
}
