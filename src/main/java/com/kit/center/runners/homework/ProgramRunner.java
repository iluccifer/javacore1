package com.kit.center.runners.homework;


import com.kit.center.app.classwork.lesson5.CircleArea;
import com.kit.center.app.classwork.lesson6.CircleAread;

import java.util.Scanner;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println("Программа запустилась");
        System.out.println("Введите число 1 для деления");
        System.out.println("Введите число 2 для умножения");
        System.out.println("Введите число 3 для суммы");
        System.out.println("Введите число 4 для выхода из программы");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        if (numberOne == 1) {
            System.out.println("вы выбрали: " + numberOne);
            CircleAread.circleAread();

        } else if (numberOne == 2) {
            System.out.println("Число которое вы выбрали: " + numberOne);

        } else if (numberOne == 3) {
            System.out.println("Число которое вы выбрали: " + numberOne);

        } else if (numberOne == 4) {
            System.out.println("Удачи!");
            System.exit(4);

        } else {
            while (numberOne > 4 || numberOne <= 0) {
                System.out.println("Неверное число! Введите еще раз");
                System.out.println("Введите число из предложенных выше");
                numberOne = scanner.nextInt();
            }
            while (numberOne == 1 || numberOne == 2 || numberOne == 3 || numberOne == 4){
                System.out.println("Число которое вы выбрали: " + numberOne);
                break;
            }
        }
    }
}
