package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberMainTest {

    @Test
    public void Should_Return_TryAgain_when_given_gameAnswer_1234_userAnswer_1432() {
        //given
        String userNumber = "1 4 3 2";
        GuessNumberMain guessNumberMain = new GuessNumberMain("1 2 4 3");
        //when
        String result = guessNumberMain.checkResult(userNumber);
        //then
        assertEquals("TryAgain", result);
    }
}
