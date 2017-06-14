package com.kit.center.app.classwork.polymorphizm.inhairitance;


public class Worker extends Person {
    public Worker(String name) {
        super(name);
    }

    @Override

    public String getResponse(String question){
        return "Im worker";
    }
}
