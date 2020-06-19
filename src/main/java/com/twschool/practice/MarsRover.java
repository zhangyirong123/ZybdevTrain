package com.twschool.practice;

import org.apache.commons.lang.ArrayUtils;

public class MarsRover {

    private MarsLocation marslocation;

    MarsRover(MarsLocation initLocation) {
        this.marslocation = initLocation;
    }

    MarsLocation getMarsLocation(String command) {

        MarsCommand marsCommand = new MarsCommand(marslocation);

        Character[] commandList = ArrayUtils.toObject(command.toCharArray());
        for (Character singleCommand : commandList) {
            if ("M".equals(String.valueOf(singleCommand))) {
                //调用前进
                marsCommand.marsLocation.advance(marslocation.getDirection());
            } else {
                //调用转向
                marsCommand.marsLocation.veer(String.valueOf(singleCommand));
            }
        }
        return marslocation;
    }
}