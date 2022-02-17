package com.pattern.GoF.command._02_after;

public class LaptopCommand implements Command{

    private final Laptop laptop;

    public LaptopCommand(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void execute() {
        laptop.on();
    }
}
