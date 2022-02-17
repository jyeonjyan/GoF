package com.pattern.GoF.command._02_after;

public class Light {
    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("======= " + this.name + " on! =======");
    }

    public String getName() {
        return name;
    }
}
