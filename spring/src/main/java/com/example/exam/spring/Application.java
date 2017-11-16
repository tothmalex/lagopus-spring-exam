package com.example.exam.spring;

import com.example.exam.spring.model.GroupOfQuestions;
import com.example.exam.spring.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	QuestionRepo questionRepo;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run( String... args ) throws Exception {
	questionRepo.save(GroupOfQuestions.questions);
	}
}
