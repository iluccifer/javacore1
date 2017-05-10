package com.kit.center.app.classwork.lesson5;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTestw {


    public double divicion(double numberOne, double numberTwo) {
        double result;
        if (numberTwo == 0) {
            result = 0;
            System.out.println("Incorrect input parameters");
        } else {
            result = numberOne / numberTwo;
        }
        return result;
    }
   @Ignore ("Тут баЖОК")
    @Test (timeout = 10000) //input after 1000 ms
    public void bTest1() {
        double expectedResult = 189;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(378, 2);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void aTest2() {
        double expectedResult = 12.5;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(5, 2.5);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    /*@Test
    public void divicionTest3() {
        double expectedResult = -49;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(98, -2);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void divicionTest4() {
        double expectedResult = 3.75;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(-105, -28);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void divicionTest5() {
        double expectedResult = 1.628162815E8;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(325632563, 2);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void divicionTest6() {
        double expectedResult = 0;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(985, 0);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }
    */
}