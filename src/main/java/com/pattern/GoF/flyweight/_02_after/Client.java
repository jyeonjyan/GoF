package com.pattern.GoF.flyweight._02_after;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('j', "white", fontFactory.getFont("D2Coding:12"));
    }
}
