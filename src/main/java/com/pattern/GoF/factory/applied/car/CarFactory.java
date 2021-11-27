package com.pattern.GoF.factory.applied.car;

public interface CarFactory {
    default Car orderCar(String name, String email){
        validate(name, email);
        prepareFor(name);
        Car car = createCar();
        sendEmailTo(name, car);

        return car;
    }

    private void validate(String name, String email){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("자동차 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 생산 준비중..");
    }

    Car createCar();

    private void sendEmailTo(String email, Car car){
        System.out.println(email+" 여기로 "+car.logo+"가 출고 되었습니다.");
    }
}
