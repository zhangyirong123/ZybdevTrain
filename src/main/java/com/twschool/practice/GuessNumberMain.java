package com.twschool.practice;

import java.util.Scanner;

public class GuessNumberMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎来到猜字游戏！");

        Generator generator = new Generator();
        String gameNumber = generator.getGameNumber();
        Answer answer = new Answer(gameNumber);
        GuessNumber guessNumber = new GuessNumber(answer);
        while (true) {
            String userAnswer = scan.nextLine();
            guessNumber.checkResult(userAnswer);
            if (GameStatus.Success.equals(guessNumber.getGameStatus())) {
                System.out.println("恭喜您，成功了！");
                break;
            }
            if (GameStatus.Fail.equals(guessNumber.getGameStatus())) {
                System.out.println("不好意思，失败了，您可以重新开始！");
                break;
            }
            if (GameStatus.TryAgain.equals(guessNumber.getGameStatus())) {
                System.out.println("再试一次！");
            }
        }

    }
}
