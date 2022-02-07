package com.pattern.GoF.proxy._02_after;

public class DefaultGameService implements GameService {

    public void gameStart() throws InterruptedException {
        Thread.sleep(2000L);
        System.out.println("======= Game started ========");
    }

}
