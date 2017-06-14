package com.kit.center.app.classwork.polymorphizm.abstraction;


public class Circle extends Figure{

    private int radius;

    public Circle(int radius){

        this.radius = radius;

    }

    @Override

    public double getPerimeter() {

        return 2 * Math.PI * radius;

    }

}
