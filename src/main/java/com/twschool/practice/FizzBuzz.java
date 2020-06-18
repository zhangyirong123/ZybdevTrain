package com.twschool.practice;

import java.util.Objects;

public class FizzBuzz {
    public String say(int number) {

        String outPut = "";
        String flagContainsFive = "N";

        if (String.valueOf(number).contains("5")) {
            flagContainsFive = "Y";
        }

        if (String.valueOf(number).contains("3") &&  Objects.equals(flagContainsFive, "N")) {
            return "Fizz";
        }

        if (number % 3 == 0 && Objects.equals(flagContainsFive, "N")) {
            outPut = "Fizz";
        }
        if (number % 5 == 0) {
            outPut = outPut + "Buzz";
        }
        if (number % 7 == 0) {
            outPut = outPut + "Whizz";
        }
        if (outPut.equals("")) {
            return String.valueOf(number);
        } else {
            return outPut;
        }

    }
}
