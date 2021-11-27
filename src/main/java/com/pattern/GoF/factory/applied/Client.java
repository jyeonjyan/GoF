package com.pattern.GoF.factory.applied;

import com.pattern.GoF.factory.applied.car.blueCar.BlueCarFactory;
import com.pattern.GoF.factory.applied.car.Car;
import com.pattern.GoF.factory.applied.car.redCar.RedCarFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Car redCar = new RedCarFactory().orderCar("redCar", "jihwan@mail.com");
        System.out.println(redCar);

        Car blueCar = new BlueCarFactory().orderCar("blueCar", "jihwan@mail.com");
        System.out.println(blueCar);
    }
}
