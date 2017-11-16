package com.example.exam.spring.controller;


import com.example.exam.spring.model.Answer;
import com.example.exam.spring.model.Asking;
import com.example.exam.spring.model.Question;
import com.example.exam.spring.model.Response;
import com.example.exam.spring.repository.AnswerRepo;
import com.example.exam.spring.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepo questionRepo;

    @Autowired
    AnswerRepo answerRepo;

    @GetMapping("/questions")
    public Iterable<Question> listQuestion() {
        return questionRepo.findAll();
    }

    @GetMapping("/questions?id=5")
    public Question listQuestionfive(@RequestParam Long id) {
        return questionRepo.findOne(id);
    }

    @GetMapping("/question")
    public Asking listing() {
        return new Asking(1, questionRepo.findAll());
    }

    @PostMapping("/answers")
    public Iterable<Answer> answering() {
        return answerRepo.findAll();
    }

    @PostMapping("/answer")
    public Response responding() {
        return new Response(1,answerRepo.findAll());
    }

    /*@PostMapping("/api/message/receive")
    @ResponseBody
    public ReturnMessage sending( @RequestBody Response response) {

        if (response.getMessage() == null) {
            return new ReturnMessage("Missing fields ", HttpStatus.BAD_REQUEST);
        } else {
            chatRepo.save(response.getMessage());
            return new ReturnMessage(HttpStatus.OK);
        }
    }*/

}
