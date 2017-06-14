package com.kit.center.app.classwork.polymorphizm.interfaces;


public class ACME implements  Bicycle {


    @Override
    public void changeGear(int value) {
        System.out.println("Change gear to:" +value);
    }

    @Override
    public void shift() {
        System.out.println("BMN");
    }
}
