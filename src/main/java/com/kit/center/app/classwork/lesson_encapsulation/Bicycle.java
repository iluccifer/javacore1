package com.kit.center.app.classwork.lesson_encapsulation;


public class Bicycle {
    public int whileSize;
    public String color;
    private String name = "KOMANCHE-2";
    private String alladinName = "ALLADIN";

    public String getAlladinName() {
        return alladinName;
    }

    public void setAlladinName(String alladinName) {
        this.alladinName = alladinName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bicycle(){ // не принимает параментры
        System.out.println("Override default constructor");
    }

    public Bicycle (String name){ // принимает 1 параметр
        this.name = name;
    }

    public Bicycle (String name, String color){ // принимает 2 параментра
        this(name);
        this.color = color;
    }
    //это называется overloader конструктор (Применяется когда разное кол-во параметров)

    public Bicycle(int whileSize, String name, String color,String alladinName) {
        this(name, color);
        this.whileSize = whileSize;
        this.alladinName = alladinName;
        this.printMe();
    }
        public void printMe(){
            System.out.println("Print");
    }
}