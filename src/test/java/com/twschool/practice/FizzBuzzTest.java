package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_given_number_1() {
        //given
        int number;
        number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("1", result);
    }

    @Test
    public void should_return_2_given_number_2() {
        //given
        int number;
        number = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("2", result);
    }

    @Test
    public void should_return_Fizz_given_number_3() {
        //given
        int number;
        number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_given_number_5() {
        //given
        int number;
        number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Whizz_given_number_7() {
        //given
        int number;
        number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("Whizz", result);
    }

    @Test
    public void should_return_FizzBuzz_given_number_15() {
        //given
        int number;
        number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_FizzWhizz_given_number_21() {
        //given
        int number;
        number = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_number_105() {
        //given
        int number;
        number = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_Fizz_given_number_13() {
        //given
        int number;
        number = 13;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_given_number_31() {
        //given
        int number;
        number = 31;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_BuzzWhizz_given_number_35() {
        //given
        int number;
        number = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(number);

        //then
        assertEquals("BuzzWhizz", result);
    }

}
