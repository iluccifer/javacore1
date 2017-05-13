package com.kit.center.runners.homework;


import com.kit.center.app.classwork.lesson5.CircleArea;
import com.kit.center.app.classwork.lesson6.CircleAread;

import java.util.Scanner;

public class ProgramRunner {
    public static void main (String[] args){
        System.out.println("Программа запустилась");
        System.out.println("Введите число1 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        if (numberOne == 1) {
            System.out.println("Число которое вы выбрали: "+ numberOne);
            CircleAread.circleAread();

        }
        else if (numberOne == 2){
            System.out.println("Число которое вы выбрали: "+ numberOne);

        }
        else if (numberOne == 3) {
            System.out.println("Число которое вы выбрали: " + numberOne);

        }
        else  {
            System.out.println("ВВеди норм число");
        }
    }
}
