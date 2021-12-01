package com.pattern.GoF.builder.pattern;

public class CarProduct {

    private CarBuilder carBuilder;

    public CarProduct(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car BMW(){
        return carBuilder
                .brand("BMW")
                .engine("V8 twin turbo")
                .susAndWheel("air", "21 inch")
                .getCar();
    }

    public Car Tesla(){
        return carBuilder.brand("Tesla")
                .engine(null)
                .susAndWheel("spring", "22 inch")
                .getCar();
    }
}
