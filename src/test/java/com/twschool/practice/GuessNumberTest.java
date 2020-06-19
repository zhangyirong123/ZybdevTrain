package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    @Test
    public void Should_Return_4A0B_when_given_gameAnswer_1234_userAnswer_1234(){
        //given
        String userNumber = "1234";
        String gameNumber = "1234";

        //when
        String result = GuessNumber.checkResult(userNumber,gameNumber);
        //then
        assertEquals("4A0B", result);
    }
}
