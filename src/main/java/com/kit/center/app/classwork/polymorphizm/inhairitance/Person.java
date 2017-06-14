package com.kit.center.app.classwork.polymorphizm.inhairitance;


public abstract class Person {
    protected String name;

    public Person (String name){
        this.name = name;
    }

    public String getResponce (String question) {
        return "My answer is" + question;
    }

    public abstract String getResponse(String question);
}