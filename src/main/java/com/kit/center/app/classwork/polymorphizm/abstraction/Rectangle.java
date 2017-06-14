package com.kit.center.app.classwork.polymorphizm.abstraction;


public class Rectangle extends Figure{

    private int side1, side2;

    public Rectangle(int side1, int side2){

        this.side1 = side1;

        this.side2 = side2;

    }

    @Override

    public double getArea() {

        return side1 * side2;

    }

    @Override

    public double getPerimeter() {

        return (side1 + side2) * 2;

    }

}