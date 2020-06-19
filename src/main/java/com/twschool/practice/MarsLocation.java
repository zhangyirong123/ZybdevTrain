package com.twschool.practice;

import static com.twschool.practice.Direction.*;

public class MarsLocation {

    private Coordinate coordinate;
    private Direction direction;

    public MarsLocation(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void advance() {
        if (direction.equals(N)) getCoordinate().setCoordinateY(getCoordinate().getCoordinateY() + 1);
        if (direction.equals(W)) getCoordinate().setCoordinateX(getCoordinate().getCoordinateX() - 1);
        if (direction.equals(S)) getCoordinate().setCoordinateY(getCoordinate().getCoordinateY() - 1);
        if (direction.equals(E)) getCoordinate().setCoordinateX(getCoordinate().getCoordinateX() + 1);
    }

    public void turnLeft() {
        direction = direction.leftDirection();
    }

    public void turnRight() {
        direction = direction.rightDirection();
    }
}
