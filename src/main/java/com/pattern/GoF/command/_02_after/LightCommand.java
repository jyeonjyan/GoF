package com.pattern.GoF.command._02_after;

public class LightCommand implements Command{

    private final Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("======= " + light.getName() +" on! =======");
    }
}
