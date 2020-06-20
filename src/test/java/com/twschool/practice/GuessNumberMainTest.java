package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberMainTest {

    @Test
    public void Should_Return_TryAgain_when_given_gameAnswer_1234_userAnswer_1432() {
        //given
        String userNumber = "1 4 3 2";
        GuessNumber guessNumber = new GuessNumber("1 2 3 4");
        GuessNumberMain guessNumberMain = new GuessNumberMain(guessNumber);
        //when
        String result = guessNumberMain.checkResult(userNumber);
        //then
        assertEquals("TryAgain", result);
    }

    @Test
    public void Should_Return_Success_when_given_gameAnswer_1234_userAnswer_1234() {
        //given
        String userNumber = "1 2 3 4";
        GuessNumber guessNumber = new GuessNumber("1 2 3 4");
        GuessNumberMain guessNumberMain = new GuessNumberMain(guessNumber);
        //when
        String result = guessNumberMain.checkResult(userNumber);
        //then
        assertEquals("Success", result);
    }
}
