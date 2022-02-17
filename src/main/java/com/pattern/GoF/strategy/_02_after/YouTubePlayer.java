package com.pattern.GoF.strategy._02_after;

public class YouTubePlayer {
    public void speed(YouTubePlayerStrategy youTubePlayerStrategy){
        youTubePlayerStrategy.speed();
    }
    public void caption(YouTubePlayerStrategy youTubePlayerStrategy){
        youTubePlayerStrategy.caption();
    }
}
