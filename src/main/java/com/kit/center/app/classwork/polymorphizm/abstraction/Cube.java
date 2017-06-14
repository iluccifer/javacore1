package com.kit.center.app.classwork.polymorphizm.abstraction;


public class Cube extends Figure{

    private int radius;

    public Cube(int radius){

        this.radius = radius;

    }

    @Override

    public double getPerimeter() {

        return 3 * Math.PI * radius;

    }

}