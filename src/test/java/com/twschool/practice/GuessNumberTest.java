package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {

    @Test
    public void Should_Return_TryAgain_when_given_gameAnswer_1234_userAnswer_1432() {
        //given
        String userNumber = "1 4 3 2";
        CheckAnswer checkAnswer = new CheckAnswer("1 2 3 4");
        GuessNumber guessNumber = new GuessNumber(checkAnswer);
        //when
        guessNumber.checkResult(userNumber);
        //then
        assertEquals(GameStatus.TryAgain, guessNumber.getGameStatus());
    }

    @Test
    public void Should_Return_Success_when_given_gameAnswer_1234_userAnswer_1234() {
        //give
        String userNumber = "1 2 3 4";
        CheckAnswer checkAnswer = new CheckAnswer("1 2 3 4");
        GuessNumber guessNumber = new GuessNumber(checkAnswer);
        //when
        guessNumber.checkResult(userNumber);
        //then
        assertEquals(GameStatus.Success, guessNumber.getGameStatus());
    }

    @Test
    public void Should_Return_Fail_when_given_gameAnswer_1234_userAnswer_1324() {
        //give
        String userNumber = "1 3 2 4";
        CheckAnswer checkAnswer = new CheckAnswer("1 2 3 4");
        GuessNumber guessNumber = new GuessNumber(checkAnswer);
        //when
        guessNumber.checkResult(userNumber);
        guessNumber.checkResult(userNumber);
        guessNumber.checkResult(userNumber);
        guessNumber.checkResult(userNumber);
        guessNumber.checkResult(userNumber);
        guessNumber.checkResult(userNumber);

        //then
        assertEquals(GameStatus.Fail, guessNumber.getGameStatus());
    }
}
