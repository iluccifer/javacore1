package com.kit.center.runners.classwork.generics;


import com.kit.center.app.classwork.lesson5.Car;

public class CastingRunner {
    public static void main(String[] args) {
       Car car = new Car();


       Object objectCar = car;
       objectCar.toString();
       car = (Car)objectCar;
    }
}
