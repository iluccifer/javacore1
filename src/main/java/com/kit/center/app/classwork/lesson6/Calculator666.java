package com.kit.center.app.classwork.lesson6;


import java.util.Scanner;

public class Calculator666 {

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int result = scanner.nextInt()%2;
        System.out.println(result);
        if (result == 0) {
            System.out.println("Деление целого числа");
        } else {
            System.out.println("Деление не целого числа");
        }

    }

}