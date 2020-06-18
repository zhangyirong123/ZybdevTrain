package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class MarsCommand {

    public MarsLocation marsLocation;

    public MarsCommand(MarsLocation initLocation) {
        this.marsLocation = initLocation;
    }

    //先注释掉 尝试多态
//    public void advance(String direction) {
//        if (direction.equals("N")) {
//            marsLocation.setY(marsLocation.getY() + 1);
//        }
//        if (direction.equals("W")) {
//            marsLocation.setX(marsLocation.getX() - 1);
//        }
//        if (direction.equals("S")) {
//            marsLocation.setY(marsLocation.getY() - 1);
//        }
//        if (direction.equals("E")) {
//            marsLocation.setX(marsLocation.getX() + 1);
//        }
//    }
    @Service
    public class north implements direction {
        @Override
        public void say() {
            System.out.println("北，Y+1");
        }
    }

    public void veer(String singleCommand) {
        List<String> stringList = Arrays.asList("N", "E", "S", "W");
        if (singleCommand.equals("L")) {
            int index = stringList.indexOf(marsLocation.getDirection());
            int newIndex = (index + 3) % 4;
            marsLocation.setDirection(stringList.get(newIndex));
        } else if (singleCommand.equals("R")) {
            int index = stringList.indexOf(marsLocation.getDirection());
            int newIndex = (index + 1) % 4;
            marsLocation.setDirection(stringList.get(newIndex));
        }
    }
}
