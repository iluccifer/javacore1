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