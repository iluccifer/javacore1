package com.kit.center.runners.classwork.generics;
import com.kit.center.app.classwork.generics.BoxPrinter;


public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter (new Integer(10));
        System.out.println(boxPrinter);

        BoxPrinter boxPrinter1 = new BoxPrinter (new String ("Hello World"));
        System.out.println(boxPrinter1);

        Integer integer2 =(Integer) boxPrinter1.getVal();
        System.out.println(integer2);
    }
}
