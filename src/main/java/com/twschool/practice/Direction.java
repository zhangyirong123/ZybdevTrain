package com.twschool.practice;

public enum Direction {
    N {
        @Override
        public void move(MarsLocation location) {
            location.setY(location.getY() + 1);
        }
    }, E {
        @Override
        public void move(MarsLocation location) {

        }
    }, S {
        @Override
        public void move(MarsLocation location) {

        }
    }, W {
        @Override
        public void move(MarsLocation location) {

        }
    };

    public abstract void move(MarsLocation location);
}
