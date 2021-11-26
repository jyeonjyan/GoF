package com.pattern.GoF.factory.motivation;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Car redCar = CarFactory.orderCar("redCar", "wow@gsm");
        System.out.println(redCar);

        Car blueCar = CarFactory.orderCar("blueCar", "wow@gsm");
        System.out.println(blueCar);
    }
}
