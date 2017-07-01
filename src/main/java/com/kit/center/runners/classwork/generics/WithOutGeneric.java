package com.kit.center.runners.classwork.generics;


public class WithOutGeneric {
    static String[] strings = new String[3];
    static Integer[] integers = new Integer[3];

    public static void main(String[] args) {
        add("String");
        add(777);
    }

    public static void add (String item){
        strings[0]=item;
    }

    public static void add (Integer item){
        integers[0]=item;
    }

}
