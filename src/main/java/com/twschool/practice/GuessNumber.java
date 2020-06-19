package com.twschool.practice;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class GuessNumber {


    public static String checkResult(String userNumber, String gameNumber) {

        int A = 0;
        int B = 0;
        List<String> userNumberList = Arrays.asList(userNumber.split(" "));
        List<String> gameNumberList = Arrays.asList(gameNumber.split(" "));
        for (int index = 0; index < userNumberList.size(); index++) {
            if (userNumberList.get(index).equals(gameNumberList.get(index))) {
                A++;
            } else if (gameNumberList.contains(userNumberList.get(index))) {
                B++;
                System.out.println(B);
            }
        }
        return A + "A" + B + "B";
    }
}
