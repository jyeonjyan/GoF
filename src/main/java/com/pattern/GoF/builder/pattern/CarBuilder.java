package com.pattern.GoF.builder.pattern;

public interface CarBuilder {
    CarBuilder brand(String brand);
    CarBuilder engine(String engine);
    CarBuilder susAndWheel(String sus, String wheel);

    Car getCar();
}
