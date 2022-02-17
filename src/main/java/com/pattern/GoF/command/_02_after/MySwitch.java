package com.pattern.GoF.command._02_after;

public class Switch {
    private final Command command;

    public Switch(Command command) {
        this.command = command;
    }

    public void press(){
        command.execute();
    }

    public static void main(String[] args) {

    }
}
