package com.example.quizz;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long>  {
    //void deleteQuestionById(Long qid);
}
