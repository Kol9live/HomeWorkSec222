package com.company;

import java.time.Year;

public class Toyota extends Car{

    public Toyota(String name, String years) {
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
