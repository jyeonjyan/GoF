package com.pattern.GoF.crp._01_before;

public class Utf8CheckHandler {

    public void handler(MemberInfoDto memberInfoDto){
        if (memberInfoDto.getLanguage().equals("utf-8")){
            System.out.println("setting language is: " + memberInfoDto.getLanguage());
        } else{
            throw new IllegalArgumentException("회원 정보에 한국어 설정이 포함되어 있지 않음");
        }
    }

}
