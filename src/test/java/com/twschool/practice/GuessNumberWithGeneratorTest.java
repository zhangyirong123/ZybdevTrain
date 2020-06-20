package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberWithGeneratorTest {

    @Test
    public void Should_Return_TryAgain_when_given_Generator_userAnswer_1432() {
        //given

        Generator generator = new Generator();
        String gameNumber = generator.getGameNumber();
        Answer answer = new Answer(gameNumber);
        String userNumber = "1 4 3 2";
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        guessNumber.checkResult(userNumber);
        //then
        System.out.println(generator.getGameNumber());
        assertEquals(GameStatus.TryAgain, guessNumber.getGameStatus());
    }

    @Test
    public void should_return_success_when_given_generator_userAnswer_Generator() {
        //give
        Generator generator = new Generator();
        String gameNumber = generator.getGameNumber();
        Answer answer = new Answer(gameNumber);
        String userNumber = gameNumber;
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        guessNumber.checkResult(userNumber);
        //then
        assertEquals(GameStatus.Success, guessNumber.getGameStatus());
    }

    @Test
    public void Should_Return_Fail_when_given_gameAnswer_1234_userAnswer_1324() {
        //give
        Generator generator = new Generator();
        String gameNumber = generator.getGameNumber();
        Answer answer = new Answer(gameNumber);
        String userNumber = "1 4 3 2";
        GuessNumber guessNumber = new GuessNumber(answer);
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
