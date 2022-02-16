package com.pattern.GoF.crp._02_after;

import com.pattern.GoF.crp._01_before.MemberInfoDto;

public class Utf8CheckHandler extends RequestHandler{

    public Utf8CheckHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(MemberInfoDto memberInfoDto) {
        if (memberInfoDto.getLanguage().equals("utf-8")){
            System.out.println("setting language is: " + memberInfoDto.getLanguage());
        } else{
            throw new IllegalArgumentException("회원 정보에 한국어 설정이 포함되어 있지 않음");
        }

        super.handle(memberInfoDto);
    }
}
