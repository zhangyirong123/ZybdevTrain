package com.twschool.practice;

public class GuessNumberMain {

    private GuessNumber guessNumber;

    public GuessNumberMain(GuessNumber guessNumber) {
        this.guessNumber = guessNumber;
    }

    public String checkResult(String userNumber) {
        if ("4A0B".equals(guessNumber.check(userNumber))) {
            return "Success";
        }
        return "TryAgain";
    }
}
