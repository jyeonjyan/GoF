package com.pattern.GoF.strategy._01_before;

public class User {

    public static void main(String[] args) {
        YouTubePlayer jihwanYouTubePlayer = new YouTubePlayer(1, "ko");

        jihwanYouTubePlayer.playWithSpeed();
        jihwanYouTubePlayer.playWithCaption();
    }
}
