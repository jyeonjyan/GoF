package com.pattern.GoF.builder.pattern;

public class DefaultCarBuilder implements CarBuilder{
    String brand;
    String engine;
    String suspension;
    String wheel;

    @Override
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder engine(String engine) {
        if (engine==null){
            this.engine = "motor";
        }
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder susAndWheel(String sus, String wheel) {
        this.suspension = sus;
        this.wheel = wheel;
        return this;
    }

    @Override
    public Car getCar() {
        return new Car(brand, engine, suspension, wheel);
    }
}
