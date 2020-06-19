package com.twschool.practice;

import org.apache.commons.lang.ArrayUtils;

public class MarsRover {

    private MarsLocation marsLocation;

    MarsRover(MarsLocation initLocation) {
        this.marsLocation = initLocation;
    }

    MarsLocation getMarsLocation(String command) {

        Character[] commandList = ArrayUtils.toObject(command.toCharArray());
        for (Character singleCommand : commandList) {
            if ("M".equals(String.valueOf(singleCommand))) {
                marsLocation.advance();
            }
            if ("L".equals(String.valueOf(singleCommand))) {
                marsLocation.turnLeft();
            }
            if ("R".equals(String.valueOf(singleCommand))) {
                //调用转向
                marsLocation.turnRight();
            }
        }
        return marsLocation;
    }
}