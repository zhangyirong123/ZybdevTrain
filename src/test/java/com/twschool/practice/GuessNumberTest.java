package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    @Test
    public void Should_Return_4A0B_when_given_gameAnswer_1234_userAnswer_1234() {
        //given
        String userNumber = "1 2 3 4";
        GuessNumber guessNumber = new GuessNumber("1 2 3 4");

        //when
        String result = guessNumber.checkResult(userNumber);
        //then
        assertEquals("4A0B", result);
    }

    @Test
    public void Should_Return_4A0B_when_given_gameAnswer_1234_userAnswer_1432() {
        //given
        String userNumber = "1 4 3 2";
        GuessNumber guessNumber = new GuessNumber("1 2 4 3");
        //when
        String result = guessNumber.checkResult(userNumber);
        //then
        assertEquals("1A3B", result);
    }
}
