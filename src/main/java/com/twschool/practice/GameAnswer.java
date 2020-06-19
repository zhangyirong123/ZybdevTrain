package com.twschool.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameAnswer {
    public GameAnswer(String answerString) {
    }

    public String check(String userAnswerString) {
        List<String> userAnswerNumber = Arrays.asList(userAnswerString.split(","));
        return "4A0B";
    }
}
