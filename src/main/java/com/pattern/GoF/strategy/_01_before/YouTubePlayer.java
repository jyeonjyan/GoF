package com.pattern.GoF.strategy._01_before;

public class YouTubePlayer {
    private final int speed;
    private final String language;

    public YouTubePlayer(int speed, String language) {
        this.speed = speed;
        this.language = language;
    }

    /*
    speed method
     */
    public void playWithSpeed(){

        if (this.speed == 1){
            System.out.println("player now loading...");
        } else if (this.speed < 1){
            System.out.println("pl  ay er no w l  oa d i  ng...");
        } else{
            System.out.println("playernowloading");
        }
    }

    /*
    caption method
     */
    public void playWithCaption(){

        if (this.language.equals("ko")){
            System.out.println("안녕하세요 오늘은 무엇을 해볼거냐면");
        } else if (this.language.equals("en")){
            System.out.println("hello today we'll going to");
        } else{
            System.out.println("==== this language is not support ====");
        }
    }
}
