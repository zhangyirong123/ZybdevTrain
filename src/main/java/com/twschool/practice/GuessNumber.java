package com.twschool.practice;

public class GuessNumber {

    private final int maxGuessTime = 6;
    private Answer answer;
    private GameStatus gameStatus = GameStatus.TryAgain;
    private int residueTimes = maxGuessTime;

    public GuessNumber(Answer answer) {
        this.answer = answer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void checkResult(String userNumber) {

        if ("4A0B".equals(answer.check(userNumber))) {
            this.gameStatus = GameStatus.Success;
        } else {
            residueTimes--;
        }
        if (residueTimes == 0) {
            this.gameStatus = GameStatus.Fail;
        }

    }
}
