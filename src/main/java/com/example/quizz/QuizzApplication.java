package com.example.quizz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class QuizzApplication {

	public static void main(String[] args) {SpringApplication.run(QuizzApplication.class, args);}


//	@Bean
//	CommandLineRunner commandLineRunner(QuestionRepository questionRepository){
//		return args -> {
//			LocalDate date = LocalDate.now();
//			LocalTime time = LocalTime.now();
//
//			Question que = new Question(
//					123L,"What is the capital of India?", "New Delhi", date, time
//			);
//			questionRepository.save(que);
//		};
//	};

}
