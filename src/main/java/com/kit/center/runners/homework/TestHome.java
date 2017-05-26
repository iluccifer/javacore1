package com.kit.center.runners.homework;

public class TestHome {
    static int[] num = new int[5];

    public static void main(String[] args) {

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        for (int i = 0; i < num.length; i++) {
            System.out.println(i + ":" + num[i]);

        }

    }
}
