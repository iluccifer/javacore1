package com.kit.center.runners.classwork.lesson_encapsulation;


import com.kit.center.app.classwork.lesson_encapsulation.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.color);

        String name = "KOMANCHE-PRO";
        Bicycle bicycle1 = new Bicycle(name);
        System.out.println(bicycle1.getName());
        System.out.println(bicycle1.getName());
        bicycle1.setName("KOMANCHE-PRO2");
        //bicycle1.name = "KOMANCHE-PRO2";
        //Bicycle bicycle1 = new Bicycle();
        System.out.println(bicycle1.getAlladinName());
        bicycle1.setAlladinName("KOMANCHE-PRO2");


    }

}
