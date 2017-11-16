package com.example.exam.spring.model;

import com.example.exam.spring.repository.QuestionRepo;
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
    public static Question sixth = new Question("How much is gonna be your score?");
    public static Question seventh = new Question("Will it succeed?");


    public static List<Question> questions = new ArrayList<Question>(Arrays.asList(
           first,second, third, fourth, fifth, sixth, seventh));

/*

    List<Question> questionssss = new ArrayList<Question>();


    private static List<String> checking = new ArrayList<String>();
    String alex = "Alex";

    public void adding( List<String> checking ) {
    checking.add(alex);
}
*/

}
