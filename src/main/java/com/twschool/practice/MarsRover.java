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
                //调用前进
                marsLocation.advance();
            } else {
                //调用转向
                marsLocation.veer(String.valueOf(singleCommand));
            }
        }
        return marsLocation;
    }
}