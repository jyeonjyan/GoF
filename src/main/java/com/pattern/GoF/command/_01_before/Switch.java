package com.pattern.GoF.command._01_before;

public class Switch {
    private final Light light;

    public Switch(Light light) {
        this.light = light;
    }

    public void press(){
        light.on();
    }

    public static void main(String[] args) {
        final Switch aSwitch = new Switch(new Light());
        aSwitch.press();
    }
}
