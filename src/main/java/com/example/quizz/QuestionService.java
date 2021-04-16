package com.example.quizz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question addQuestion(Question question){
        return questionRepository.save(question);
    }

    public List<Question> findAllQuestion(){
        return questionRepository.findAll();
    }

    public Question updateQuestion(Question question){
        return questionRepository.save(question);
    }

    //public void deleteQuestion (Long qid){questionRepository.deleteQuestionById(qid);}
}
