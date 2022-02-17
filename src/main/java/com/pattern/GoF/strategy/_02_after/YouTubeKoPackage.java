package com.pattern.GoF.strategy._02_after;

public class YouTubeKoPackage implements YouTubePlayerStrategy{

    @Override
    public void speed() {
        System.out.println("한국사람들은빠른걸조아합니다.");
    }

    @Override
    public void caption() {
        System.out.println("caption: ko");
    }
}
