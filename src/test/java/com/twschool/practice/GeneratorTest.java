package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratorTest {
    @Test
    public void Should_Return_GameNumber_when_given_Generator() {
        //given
        Generator generator = new Generator();
        //when
        String gameNumber = generator.getGameNumber();
        //then
        assertNotNull(gameNumber);
    }


}
