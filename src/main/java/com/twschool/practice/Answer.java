package com.twschool.practice;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class Answer {

    private List<String> gameNumberList;

    public Answer(String gameNumber) {

        List<String> gameNumberList = Arrays.asList(gameNumber.split(" "));
        this.gameNumberList = gameNumberList;
    }

    public String check(String userNumber) {

        int A = 0;
        int B = 0;

        List<String> userNumberList = Arrays.asList(userNumber.split(" "));
        for (int index = 0; index < userNumberList.size(); index++) {
            if (userNumberList.get(index).equals(gameNumberList.get(index))) {
                A++;
            } else if (gameNumberList.contains(userNumberList.get(index))) {
                B++;
            }
        }
        System.out.println(A + "A" + B + "B");
        return A + "A" + B + "B";
    }
}
