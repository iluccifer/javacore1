package com.kit.center.runners.classwork.polymorphizm.interfaces;


import com.kit.center.app.classwork.polymorphizm.interfaces.ACME;
import com.kit.center.app.classwork.polymorphizm.interfaces.BMA;
import com.kit.center.app.classwork.polymorphizm.interfaces.BMN;
import com.kit.center.app.classwork.polymorphizm.interfaces.Bicycle;

public class BycycleRunner {
    public static void main(String[] args) {
        Bicycle bma = new BMA();
        Bicycle acme = new ACME();
        Bicycle bmn = new BMN();
        changeGear(bma,20);
        changeGear (acme,40);
        shift(bmn);


    }
    public static void changeGear (Bicycle bicycle, int value){
        bicycle.changeGear(value);

    }
    public static void shift (Bicycle bicycle){
        bicycle.shift();

    }
}
