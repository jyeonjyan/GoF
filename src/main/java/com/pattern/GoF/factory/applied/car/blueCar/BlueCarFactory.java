package com.pattern.GoF.factory.applied.car.blueCar;

import com.pattern.GoF.factory.applied.car.Car;
import com.pattern.GoF.factory.applied.car.CarFactory;

public class BlueCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BlueCar();
    }
}
