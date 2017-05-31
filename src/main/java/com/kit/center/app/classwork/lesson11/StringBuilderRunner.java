package com.kit.center.app.classwork.lesson11;

public class StringBuilderRunner {
    public static void main (String[]args){
    long start = System.currentTimeMillis();
        String c = "start";
        StringBuilder stringBuilder = new StringBuilder(c);
        String b = "finish";
        for (int i = 0; i < 1000000; i++) {
            c.concat(b);
        }
        //stringBuilder.append(b);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

