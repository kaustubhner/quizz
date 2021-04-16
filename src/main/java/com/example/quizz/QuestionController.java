package com.example.quizz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;
    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Question>> getAllQuestion(){
        List<Question> questions = questionService.findAllQuestion();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question){
        Question question1 = questionService.addQuestion(question);
        return new ResponseEntity<>(question1, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Question> updateQuestion(@RequestBody Question question){
        Question question1 = questionService.updateQuestion(question);
        return new ResponseEntity<>(question1, HttpStatus.OK);
    }
/*
    @DeleteMapping("/delete/{qid}")
    public ResponseEntity<Question> deleteQuestion(@PathVariable("qid") Long qid){
        questionService.deleteQuestion(qid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
*/

}
