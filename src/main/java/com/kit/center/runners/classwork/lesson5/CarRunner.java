package com.kit.center.runners.classwork.lesson5;

import com.kit.center.app.classwork.lesson5.Car;

public class CarRunner {
    public static void main (String[] arg) {
        Car car = new Car();
        car.name = "BMW";

        System.out.println (car.name);
        Car car2 = new Car();
        car.name = "Audi";
        System.out.println (car.name);

        System.out.println (Car.speed);
        Car.speed = 15;
        Car.showSpeed();
    }
}
