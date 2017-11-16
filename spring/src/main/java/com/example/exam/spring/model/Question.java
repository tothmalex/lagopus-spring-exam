package com.example.exam.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    public class Question {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        long id;

        String question;

    public Question( String content ) {
        this.question = question;
    }

    public Question() {
    }

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

        public String getQuestion() {
            return question;
        }

        public void setQuestion( String question ) {
            this.question = question;
        }
    }
