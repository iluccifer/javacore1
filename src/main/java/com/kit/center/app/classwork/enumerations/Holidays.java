package com.kit.center.app.classwork.enumerations;


public enum Holidays {
    NEWYEAR(1, "January", "New Year"), HAPPYBE(4, "April", "HAPPY BERSDDEY");

    private int value;
    private String season;
    private String type;


    Holidays(int value, String season, String type) {
        this.value = value;
        this.season = season;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public String getSeason() {
        return season;
    }

    public String getType() {
        return type;
    }
}
