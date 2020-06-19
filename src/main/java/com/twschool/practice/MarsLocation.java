package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class MarsLocation {
    private int x;
    private int y;
    private String direction;

    public MarsLocation(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void advance(String direction) {
        if (direction.equals("N")) {
            setY(getY() + 1);
        }
        if (direction.equals("W")) {
            setX(getX() - 1);
        }
        if (direction.equals("S")) {
            setY(getY() - 1);
        }
        if (direction.equals("E")) {
            setX(getX() + 1);
        }
    }

    public void veer(String singleCommand) {
        List<String> stringList = Arrays.asList("N", "E", "S", "W");
        if (singleCommand.equals("L")) {
            int index = stringList.indexOf(getDirection());
            int newIndex = (index + 3) % 4;
            setDirection(stringList.get(newIndex));
        } else if (singleCommand.equals("R")) {
            int index = stringList.indexOf(getDirection());
            int newIndex = (index + 1) % 4;
            setDirection(stringList.get(newIndex));
        }
    }
}
