package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void should_return_destination_x0_y0_directionN_when_given_x0_y0_directionN_init() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(0, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.N, marslocation.getDirection());
    }

    //指令是M 前进 begin
    @Test
    public void should_return_destination_x0_y1_directionN_when_given_x0_y0_directionN_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "M";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(1, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.N, marslocation.getDirection());
    }

    @Test
    public void should_return_destination_x_negative1_y0_directionW_when_given_x0_y0_directionW_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.W);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "M";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(-1, coordinate.getCoordinateX());
        Assert.assertEquals(0, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.W, marslocation.getDirection());
    }

    @Test
    public void should_return_destination_x0_y_negative1_directionS_when_given_x0_y0_directionS_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.S);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "M";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(-1, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.S, marslocation.getDirection());
    }

    @Test
    public void should_return_destination_x1_y0_directionE_when_given_x0_y0_directionE_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.E);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "M";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(1, coordinate.getCoordinateX());
        Assert.assertEquals(0, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.E, marslocation.getDirection());
    }

    @Test
    public void should_return_destination_x0_y2_directionN_when_given_x0_y0_directionN_MM() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "MM";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(2, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.N, marslocation.getDirection());
    }

    //指令是M 前进 end
    //指令是L 左转 begin
    @Test
    public void should_return_destination_X0_Y0_directionW_when_given_x0_y0_directionN_L_() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "L";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(0, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.W, marslocation.getDirection());
    }

    @Test
    public void should_return_destination_x0_y0_directionS_when_given_x0_y0_directionN_LL() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "LL";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(0, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.S, marslocation.getDirection());
    }

    //指令是L 左转 end
    //指令是R 右转 begin
    @Test
    public void should_return_destination_x0_y0_directionE_when_given_x0_x0_directionN_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "R";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(0, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.E, marslocation.getDirection());
    }

    @Test
    public void should_return_destination_x0_y0_directionS_when_given_x0_x0_directionN_RR() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "RR";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(0, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.S, marslocation.getDirection());
    }

    //指令是R 右转 begin
    //作业场景 begin
    @Test
    public void should_return_destination_x0_y0_directionN_when_given_x0_y0_directionN() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(0, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.N, marslocation.getDirection());
    }

    @Test
    public void should_return_destination_x0_y4_directionN_when_given_x0_y0_directionN_MMMM() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "MMMM";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(4, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.N, marslocation.getDirection());
    }

    @Test
    public void should_return_destination_X0_Y0_directionW_when_given_x0_y0_directionN_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "L";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(0, coordinate.getCoordinateX());
        Assert.assertEquals(0, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.W, marslocation.getDirection());
    }

    @Test
    public void should_return_destination_X_negative1_Y1_directionN_when_given_x0_y0_directionN_MLMR() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        MarsLocation initLocation = new MarsLocation(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(initLocation);
        String Command = "MLMR";
        //when
        MarsLocation marslocation = marsRover.getMarsLocation(Command);

        //then
        Assert.assertNotNull(marslocation);
        Assert.assertEquals(-1, coordinate.getCoordinateX());
        Assert.assertEquals(1, coordinate.getCoordinateY());
        Assert.assertEquals(Direction.N, marslocation.getDirection());
    }
    //作业场景 end

}
