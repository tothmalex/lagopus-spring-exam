package com.example.exam.spring.model;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupOfQuestions {

    public static Question first = new Question("What is the color code of Green Fox?");
    public static Question second = new Question("When was the Green Fox founded?");
    public static Question third = new Question("What is the real name of Tojas?");
    public static Question fourth = new Question("What is the real name of Aze?");
    public static Question fifth = new Question("When will I finish this?");


    public static ArrayList<Question> questions = new ArrayList<Question>(Arrays.asList(
           first,second, third, fourth, fifth));



}
