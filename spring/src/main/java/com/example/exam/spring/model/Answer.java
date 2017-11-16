package com.example.exam.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        long id;

        String answer;

    public Answer( String answer ) {
        this.answer = answer;
    }

    public Answer() {
    }

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer( String answer ) {
        this.answer = answer;
    }
}
