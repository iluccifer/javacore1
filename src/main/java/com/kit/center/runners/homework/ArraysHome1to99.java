package com.kit.center.runners.homework;


public class ArraysHome1to99 {

    public static void main(String[] args)  {
        int mass[] = new int[51];
        //заполнение массива
        for (int i=1; i<51; i++) {
            mass[i] = (i*2)-1;
        }
        //вывод элементов массива
        for (int i=1; i<mass.length; i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        //вывод элементов массива в обратном порядке
        for (int i=50; i>1; i--){
            System.out.print(mass[i] + " ");
        }


    }
}


