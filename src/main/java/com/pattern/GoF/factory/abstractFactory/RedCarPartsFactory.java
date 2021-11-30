package com.pattern.GoF.factory.abstractFactory;

public class RedCarPartsFactory implements CarPartsFactory {

    @Override
    public Body createBody() {
        return new RedBody();
    }

    @Override
    public Wheel createWheel() {
        return new RedWheel();
    }
}
