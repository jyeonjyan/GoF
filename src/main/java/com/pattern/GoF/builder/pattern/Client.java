package com.pattern.GoF.builder.pattern;

public class Client {
    public static void main(String[] args) {
        CarProduct carProduct = new CarProduct(new DefaultCarBuilder());
        Car bmw = carProduct.BMW();
        Car tesla = carProduct.Tesla();

        System.out.println(bmw.getClass());
        System.out.println(tesla.getClass());
    }
}
