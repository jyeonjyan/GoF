package com.pattern.GoF.strategy._02_after;

public class Client {
    public static void main(String[] args) {
        YouTubePlayer youTubePlayer = new YouTubePlayer();

        youTubePlayer.speed(new YouTubeKoPackage());
        youTubePlayer.caption(new YouTubeKoPackage());
    }
}
