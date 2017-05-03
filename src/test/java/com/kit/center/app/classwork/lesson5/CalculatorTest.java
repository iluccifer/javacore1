package com.kit.center.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Лена on 03.05.2017.
 */
public class CalculatorTest {

    @Test
    public void substractTest (){
        int numberOne = 10;
        int numberTwo = 9;
        int expectedResult = 9;

        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

}