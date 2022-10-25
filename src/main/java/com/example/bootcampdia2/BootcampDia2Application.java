package com.example.bootcampdia2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import singleton.PersonaSingleton;

@SpringBootApplication
public class BootcampDia2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BootcampDia2Application.class, args);
	}
	
	@Override
	public void run(String... arg) throws Exception {
		PersonaSingleton pS = new PersonaSingleton();
		pS.setName("Andrea");
		pS.setAge(24);
		pS.singletonOperation();
	}

}
