package com.kit.center.runners.enumerations;



import com.kit.center.app.classwork.enumerations.Holidays;

public class HolydaysRunner {
    public static void main(String[] args) {
        for (Holidays holiday : Holidays.values()) {
            System.out.println(holiday.getSeason() + " holiday is on " + holiday.getType() + " " + holiday.getValue());
        }
    }
}