package com.pattern.GoF.command._02_after;

public class MySwitch {
    private final Command command;

    public MySwitch(Command command) {
        this.command = command;
    }

    public void press(){
        command.execute();
    }

    public static void main(String[] args) {
        MySwitch mySwitch = new MySwitch(new LaptopCommand(new Laptop("macbook")));
        mySwitch.press();

        MySwitch mySwitch1 = new MySwitch(new LightCommand(new Light("필립스")));
        mySwitch1.press();
    }
}
