package com.pattern.GoF.factory.applied;

import com.pattern.GoF.factory.applied.car.CarFactory;
import com.pattern.GoF.factory.applied.car.blueCar.BlueCarFactory;
import com.pattern.GoF.factory.applied.car.redCar.RedCarFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        client.print(new RedCarFactory(), "redCar", "jihwan@mail.com");
        client.print(new BlueCarFactory(), "blueCar", "jihwan@mail.com");
    }

    private void print(CarFactory carFactory, String color, String email) {
        System.out.println(carFactory.orderCar(color, email));
    }
}
