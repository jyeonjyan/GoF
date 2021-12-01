package com.pattern.GoF.builder.motivation;

public class Car {
    String brand;
    String engine;
    String suspension;
    String wheel;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    // NoArgs
    public Car(){}

    // Gasoline
    public Car(String brand, String engine, String suspension, String wheel) {
        this.brand = brand;
        this.engine = engine;
        this.suspension = suspension;
        this.wheel = wheel;
    }

    // Electric
    public Car(String brand, String suspension, String wheel) {
        this.brand = brand;
        this.suspension = suspension;
        this.wheel = wheel;
    }git
}
