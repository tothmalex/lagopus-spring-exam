package com.example.exam.spring.repository;

import com.example.exam.spring.model.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepo extends CrudRepository<Question, Long> {
}
