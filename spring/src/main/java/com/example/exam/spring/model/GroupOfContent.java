package com.example.exam.spring.model;

import com.example.exam.spring.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupOfContent {

    public static Question first = new Question("What is the color code of Green Fox?");
    public static Question second = new Question("When was the Green Fox founded?");
    public static Question third = new Question("What is the real name of Tojas?");
    public static Question fourth = new Question("What is the real name of Aze?");
    public static Question fifth = new Question("When will I finish this?");
    public static Question sixth = new Question("How much is gonna be your score?");
    public static Question seventh = new Question("Will it succeed?");
    public static Answer firstAns = new Answer("#345tht5");
    public static Answer secondAns = new Answer("2015");
    public static Answer thirdAns = new Answer("Tojas?");
    public static Answer fourthAns = new Answer("Gyulavári Ádám?");
    public static Answer fifthAns = new Answer("It ll feel short period of time");
    public static Answer sixthAns = new Answer("Hopefully over 60%");
    public static Answer seventhAns = new Answer("Yes, ofc");


    public static List<Question> questions = new ArrayList<Question>(Arrays.asList(
           first,second, third, fourth, fifth, sixth, seventh));

    public static List<Answer> answers = new ArrayList<Answer>(Arrays.asList(
           firstAns,secondAns, thirdAns, fourthAns, fifthAns, sixthAns, seventhAns));



/*

    List<Question> questionssss = new ArrayList<Question>();


    private static List<String> checking = new ArrayList<String>();
    String alex = "Alex";

    public void adding( List<String> checking ) {
    checking.add(alex);
}
*/

}
