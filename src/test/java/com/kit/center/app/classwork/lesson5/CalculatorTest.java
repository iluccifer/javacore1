package com.kit.center.app.classwork.lesson5;

import org.junit.*;


public class CalculatorTest {
    int numberOne,numberTwo;

    /*
    Initialize test data for Calculator functionality
     */
    @BeforeClass
    public static void setBeforeClassSetUp() {

    }


    @Before
        public void setUp() {
        numberOne = 10;
        numberTwo = 40;
}
    @Test
    public void substractTest (){
        int expectedResult = -30;
        Calculator calculator = new Calculator();
        int actualResult = (int) calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown (){
        System.out.println ("Postconditions for class test");
    }



    public double divicion(double numberOne, double numberTwo){
        double result;
        if (numberTwo == 0){
            result = 0;
            System.out.println("Incorrect input parameters");
        } else {
            result = numberOne / numberTwo;
        }
        return result;
    }

@Test
public void divicionTest1(){
        double expectedResult = 189;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(378, 2);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
        }

@Test
public void divicionTest2(){
        double expectedResult = 2;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(5, 2.5);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
        }

@Test
public void divicionTest3(){
        double expectedResult = -49;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(98, -2);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
        }

@Test
public void divicionTest4(){
        double expectedResult = 3.75;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(-105, -28);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
        }

@Test
public void divicionTest5(){
        double expectedResult = 1.628162815E8;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(325632563, 2);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
        }

@Test
public void divicionTest6(){
        double expectedResult = 0;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(985, 0);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
        }

}