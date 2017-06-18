package com.kit.center.app.classwork.equals_hashcode;


public class Laptop {

    private String name;
    private String color;
    private int cpu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    private int ram;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (getCpu() != laptop.getCpu()) return false;
        return getRam() == laptop.getRam();
    }

    @Override
    public int hashCode() {
        int result = getCpu();
        result = 31 * result + getRam();
        return result;
    }
}
