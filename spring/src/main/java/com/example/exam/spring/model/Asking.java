package com.example.exam.spring.model;

import com.example.exam.spring.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class Asking {

    int id;
    Iterable questions;

    @Autowired
    QuestionRepo questionRepo;

    public Asking(int id, Iterable questions) {
        this.id = id;
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public Iterable getQuestions() {
        return questions;
    }

    public void setQuestions( Iterable questions ) {
        this.questions = questions;
    }
}