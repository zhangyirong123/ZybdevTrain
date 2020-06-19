package com.twschool.practice;

public class GuessNumber {


    public static String checkResult(String userNumber, String gameNumber) {

        if (userNumber.equals(gameNumber)) {
            return "4A0B";
        }
        return "fail";

    }
}
