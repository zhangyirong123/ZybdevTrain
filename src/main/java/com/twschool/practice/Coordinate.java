package com.twschool.practice;

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

    public void addCoordinateX() {
        coordinateX++;
    }

    public void minusCoordinateX() {
        coordinateX--;
    }

    public void addCoordinateY() {
        coordinateY++;
    }

    public void minusCoordinateY() {
        coordinateY--;
    }

}
