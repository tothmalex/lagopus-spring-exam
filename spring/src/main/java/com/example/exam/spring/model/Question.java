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

        String content;

    public Question( String content ) {
        this.content = content;
    }

    public Question() {
    }

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent( String content ) {
        this.content = content;
    }
}
