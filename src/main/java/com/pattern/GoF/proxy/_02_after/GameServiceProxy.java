package com.pattern.GoF.proxy._02_after;

import static java.lang.System.currentTimeMillis;

public class GameServiceProxy implements GameService {

    private final GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    public void gameStart() throws InterruptedException {
        final long startTime = currentTimeMillis();
        gameService.gameStart();
        System.out.println(currentTimeMillis() - startTime + " ms");
    }

}
