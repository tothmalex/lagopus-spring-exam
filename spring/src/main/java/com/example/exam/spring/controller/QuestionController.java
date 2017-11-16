package com.example.exam.spring.controller;


import com.example.exam.spring.model.GroupOfQuestions;
import com.example.exam.spring.model.Question;
import com.example.exam.spring.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepo questionRepo;

    @GetMapping("/questions")
    public Iterable<Question> listQuestion() {
        return questionRepo.findAll();
    }
}
