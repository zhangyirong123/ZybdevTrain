package com.twschool.practice;

public class GuessNumber {

    private final int maxGuessTime = 6;
    private CheckAnswer checkAnswer;
    private GameStatus gameStatus = GameStatus.TryAgain;
    private int residueTimes = maxGuessTime;

    public GuessNumber(CheckAnswer checkAnswer) {
        this.checkAnswer = checkAnswer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void checkResult(String userNumber) {

        if ("4A0B".equals(checkAnswer.check(userNumber))) {
            this.gameStatus = GameStatus.Success;
        } else {
            residueTimes--;
        }
        if (residueTimes == 0) {
            this.gameStatus = GameStatus.Fail;
        }
    }
}
