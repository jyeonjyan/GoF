package com.pattern.GoF.factory.motivation;

public class CarFactory {
    public static Car orderCar(String name, String email){
        // validate
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("자동차 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        prepareFor(name);


        Car car = new Car();
        car.setName(name);

        // setting logo
        if (name.equalsIgnoreCase("redCar")){
            car.setLogo("🚗");
        } else if (name.equalsIgnoreCase("blueCar")){
            car.setLogo("🚙");
        }

        // coloring
        if (name.equalsIgnoreCase("redCar")){
            car.setColor("RED");
        } else if (name.equalsIgnoreCase("blueCar")){
            car.setColor("BLUE");
        }

        sendEmailTo(email, car);

        return car;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 생산 준비중..");
    }

    private static void sendEmailTo(String email, Car car) {
        System.out.println(email+" 여기로 "+car.logo+"가 출고 되었습니다.");
    }
}
