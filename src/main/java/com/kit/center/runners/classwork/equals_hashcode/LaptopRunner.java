package com.kit.center.runners.classwork.equals_hashcode;


import com.kit.center.app.classwork.equals_hashcode.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {

        Laptop mac = new Laptop();
        mac.setName ("Mac");
        mac.setColor ("White");
        mac.setCpu (4);
        mac.setRam (16);

        Laptop hp = new Laptop();
        hp.setName ("HP");
        hp.setColor ("Black");
        hp.setCpu (4);
        hp.setRam (16);


        System.out.println(mac.equals(hp));

        String s1 = null;
        String s2= "KIT";
        //null safe
        //System.out.println(s1.equals(s2));
        //NullPointerException
        System.out.println(s2.equals(s1));

        Object macObject = mac;
        Object hpObject = hp;
        mac = (Laptop) macObject;
        hp = (Laptop) hpObject;


    }
    
}
