package com.kit.center.app.classwork.lesson6;

import java.util.Scanner;

public class CircleAread {
     public static final double Pl = 3.14d;

 public static void circleAread(){

     int r1 = 2;
     int r2 = 3;
     int area1 = 2;
     int area2 = 3;

     if ((r1 > r2) || (area1 > area2)) {
         System.out.println("Area1 is bigger");
         System.out.println("Area2 is smaller");
     } else {
         System.out.println("Area2 is bigger");
         System.out.println("Area1 is smaller");
     }

 }
 }

/* public class CircleAread {
    public static final double PI = 3.14d;
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        double circleArea = PI * Math.pow(radius, 2);
        double circleArea2 = PI * Math.pow(radius2, 2);
        System.out.println("Area is " + circleArea);
        System.out.println("Area2 is " + circleArea2);
        if ((radius > radius2) || (circleArea > circleArea2)) {
            System.out.println("Area1 is bigger");
            System.out.println("Area2 is smaller");
        } else {
            System.out.println("Area1 is smaller");
            System.out.println("Area2 is bigger");
        }
    }
}
*/