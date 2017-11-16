package com.example.exam.spring.repository;

import com.example.exam.spring.model.Answer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepo extends CrudRepository<Answer, Long> {
}
