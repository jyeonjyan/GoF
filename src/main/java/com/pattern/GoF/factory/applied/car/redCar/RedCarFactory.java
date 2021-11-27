package com.pattern.GoF.factory.applied.car.redCar;

import com.pattern.GoF.factory.applied.car.Car;
import com.pattern.GoF.factory.applied.car.CarFactory;

public class RedCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new RedCar();
    }
}
