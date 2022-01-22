package com.company;

public class Honda extends Car{

    public Honda(String name, String years) {
        super(name);
        this.years = years;
    }

    private String years;

    public String getYears() {
        return years;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getYears());

    }
}
