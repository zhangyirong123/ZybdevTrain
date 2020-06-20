package com.twschool.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {

    public String getGameNumber() {
        List<String> gameNumberList = new ArrayList<String>(4) {
        };
        Random random = new Random();

        while (gameNumberList.size() < 4) {
            String currentRandom = String.valueOf(random.nextInt(10));
            if (!gameNumberList.contains(currentRandom)) {
                gameNumberList.add(currentRandom);
            }
        }
        return String.join(" ", gameNumberList);
    }

}
