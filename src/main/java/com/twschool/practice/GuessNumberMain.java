package com.twschool.practice;

public class GuessNumberMain {

    private GuessNumber guessNumber;
    int maxGuessTime = 6;

    public GuessNumberMain(GuessNumber guessNumber) {
        this.guessNumber = guessNumber;
    }

    public String checkResult(String userNumber) {

        if ("4A0B".equals(guessNumber.check(userNumber))) {
            return "Success";
        } else {
            maxGuessTime--;
        }
        if (maxGuessTime == 0) {
            return "Fail";
        }
        return "TryAgain";
    }
}
