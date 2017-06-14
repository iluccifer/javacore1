package com.kit.center.runners.classwork.polymorphizm.abstraction;


import com.kit.center.app.classwork.polymorphizm.abstraction.Circle;
import com.kit.center.app.classwork.polymorphizm.abstraction.Cube;
import com.kit.center.app.classwork.polymorphizm.abstraction.Figure;
import com.kit.center.app.classwork.polymorphizm.abstraction.Rectangle;

public class FigureRunner {
    public static void main(String[] args) {
        Figure circle = new Circle(10);
        Figure rectangle = new Rectangle(10,15);
        Figure cube = new Cube(15);
        double circlePerimeter = getPerimeter(circle);
        double rectanglePerimeter = getPerimeter(rectangle);
        double cubePerimeter = getPerimeter(cube);
        System.out.println(circlePerimeter);
        System.out.println(rectanglePerimeter);
        System.out.println(cubePerimeter);


    }
    public static double getPerimeter (Figure figure){
       return figure.getPerimeter();

    }
}
