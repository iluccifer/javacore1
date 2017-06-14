package com.kit.center.app.classwork.polymorphizm.inhairitance;


public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

     @Override

     public String getResponse(String question){
         return "Do not forget to make homework!";
     }
 }
