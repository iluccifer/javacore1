package com.kit.center.app.classwork.polymorphizm.interfaces;


public class BMA implements  Bicycle {


    @Override
    public void changeGear(int value) {

        System.out.println("BMA changing gear to:" +value);
    }

    @Override
    public void shift() {
        System.out.println("BMN");

    }
}
