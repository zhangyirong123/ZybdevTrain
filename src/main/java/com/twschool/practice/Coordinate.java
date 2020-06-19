package com.twschool.practice;

import static com.twschool.practice.Direction.*;
import static com.twschool.practice.Direction.E;

public class Coordinate {

    private int coordinateX;
    private int coordinateY;

    public Coordinate(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Coordinate getCoordinate() {
        return this;
    }

    public void advance(Direction direction) {
        if (direction.equals(N))
            coordinateX++;
        if (direction.equals(W))
            coordinateX--;
        if (direction.equals(S))
            coordinateY++;
        if (direction.equals(E))
            coordinateY--;
    }


}
