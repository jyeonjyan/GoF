package com.pattern.GoF.factory.abstractFactory;

public interface CarPartsFactory {
    Body createBody();
    Wheel createWheel();
}
