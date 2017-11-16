package com.example.exam.spring.model;

import com.example.exam.spring.repository.AnswerRepo;
import com.example.exam.spring.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class Response {

    int id;
    Iterable answers;

    @Autowired
    AnswerRepo answerRepo;

    public Response(int id, Iterable answers) {
        this.id = id;
        this.answers = answers;
    }

    public Response() {
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public Iterable getAnswers() {
        return answers;
    }

    public void setAnswers( Iterable answers ) {
        this.answers = answers;
    }
}
