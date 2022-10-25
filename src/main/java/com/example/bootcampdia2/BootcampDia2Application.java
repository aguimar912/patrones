package com.example.bootcampdia2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampDia2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BootcampDia2Application.class, args);
	}
	
	@Override
	public void run(String... arg) throws Exception {
		//System.out.print("hola");
	}

}
