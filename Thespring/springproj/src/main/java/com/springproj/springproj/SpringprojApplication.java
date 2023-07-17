package com.springproj.springproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springproj.springproj.repository.StudentRepository;

@SpringBootApplication
public class SpringprojApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringprojApplication.class, args);
		System.out.println("hello all");
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student student1=new Student("manisha","chaudhari","abc@gmail.com");

	}
}
