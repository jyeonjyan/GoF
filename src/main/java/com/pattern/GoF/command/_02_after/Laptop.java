package com.pattern.GoF.command._02_after;

public class Laptop {
    private String name;

    public Laptop(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("======= " + this.name + " on! =======");
    }

    public String getName() {
        return name;
    }
}
