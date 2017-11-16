package com.example.exam.spring.controller;


import com.example.exam.spring.model.Asking;
import com.example.exam.spring.model.GroupOfQuestions;
import com.example.exam.spring.model.Question;
import com.example.exam.spring.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepo questionRepo;

    @GetMapping("/questions")
    public Iterable<Question> listQuestion() {
        return questionRepo.findAll();
    }

    @GetMapping("/question")
    public Asking listing() {
        return new Asking(1, questionRepo.findAll());
    }

    @PostMapping("/answers")
    public Asking answering() {
        return new Asking(1, questionRepo.findAll());
    }

}
