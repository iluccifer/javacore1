package com.kit.center.app.classwork.generics;


public class BoxPrinter {

    private Object val;

    public BoxPrinter(Object val) {

        this.val = val;
    }

    public  Object getVal(){
        return val;
    }

    @Override
    public String toString() {

        return "{" + val + "}";

    }

    public Object getValue() {
        return val;}

}