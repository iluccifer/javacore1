package com.kit.center.runners.homework;



import com.kit.center.app.classwork.lesson4.NarrowingCasting;
import com.kit.center.app.classwork.lesson6.Calculator666;
import com.kit.center.app.classwork.lesson6.CircleAread;
import com.kit.center.app.classwork.lesson6.PiRadius;

import java.util.Scanner;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println("Программа запустилась");
        System.out.println("Введите число 1 для определения < или >");
        System.out.println("Введите число 2 для деления целого числа");
        System.out.println("Введите число 3 для определения радиуса");
        System.out.println("Введите число 4 для выхода из программы");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        if (numberOne == 1) {
            System.out.println("вы выбрали: " + numberOne);
            CircleAread.circleAread();

        } else if (numberOne == 2) {
            System.out.println("Число которое вы выбрали: " + numberOne);
            Calculator666.calculate();

        } else if (numberOne == 3) {
            System.out.println("Число которое вы выбрали: " + numberOne);
            PiRadius.calculate();

        } else if (numberOne == 4) {
            System.out.println("Удачи!");
            System.exit(4);

        }
        else {
            while (numberOne > 4 || numberOne <= 0) {
                System.out.println("Неверное число! Введите еще раз");
                System.out.println("Введите число из предложенных выше");
                numberOne = scanner.nextInt();
            }
        }
    }
}