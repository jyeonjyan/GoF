package com.pattern.GoF.proxy._01_before;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        // start time in milliseconds
        gameService.startGame();
        // end time in milliseconds
    }
}
