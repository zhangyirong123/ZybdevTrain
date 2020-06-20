package com.twschool.practice;

public class GuessNumberMain {

    private final int maxGuessTime = 6;
    private GuessNumber guessNumber;
    private GameStatus gameStatus = GameStatus.TryAgain;
    private int residueTimes = maxGuessTime;

    public GuessNumberMain(GuessNumber guessNumber) {
        this.guessNumber = guessNumber;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void checkResult(String userNumber) {

        if ("4A0B".equals(guessNumber.check(userNumber))) {
            this.gameStatus = GameStatus.Success;
        } else {
            residueTimes--;
        }
        if (residueTimes == 0) {
            this.gameStatus = GameStatus.Fail;
        }
    }
}
