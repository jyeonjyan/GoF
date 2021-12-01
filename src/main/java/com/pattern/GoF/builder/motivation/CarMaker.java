package com.pattern.GoF.builder.motivation;

public class CarMaker {
    public static void main(String[] args) {
        /**
         * Gasoline-based car
         * engine 이 존재한다.
         */
        Car car = new Car();
        car.setBrand("BMW");
        car.setEngine("v8");
        car.setSuspension("m-sports");
        car.setWheel("m-sports-wheel");


        /**
         * Electric-based car
         * engine 이 존재하지 않는다.
         */
        System.out.println(car);
        Car electricCar = new Car();
        electricCar.setBrand("Tesla");
        electricCar.setSuspension("press");
        electricCar.setWheel("less-air-resistance");

        // 결론적으로 불안정한 인스턴스를 생성하게 된다.
    }
}
