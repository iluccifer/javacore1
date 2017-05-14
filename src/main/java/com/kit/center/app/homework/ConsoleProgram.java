package com.kit.center.app.homework;


import java.util.Scanner;

public class ConsoleProgram {

    public static void ageProgram() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Ваше имя: " + name + "   Ваш возраст: " + age);
    }

        public static void numberProgram() {
            int number;
            Scanner sr = new Scanner(System.in);
            System.out.print("Введите четное число: ");
            if(sr.hasNextInt()){
                number = sr.nextInt();
                if ((number % 2) == 0){
                    System.out.print("Четное число " + number);
                }else{System.out.print("Не четное число " + number);}
            }else{System.out.print("Вы ввели не целое число");}
        }
    }

