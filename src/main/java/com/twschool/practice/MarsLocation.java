package com.twschool.practice;

public class MarsLocation {

    private Coordinate coordinate;
    private Direction direction;

    public MarsLocation(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        coordinate.advance(direction);
    }

    public void turnLeft() {
        direction = direction.leftDirection();
    }

    public void turnRight() {
        direction = direction.rightDirection();
    }
}
