package com.pattern.GoF.crp._02_after;

import com.pattern.GoF.crp._01_before.MemberInfoDto;

public class KoreaPhoneNumberHandler extends RequestHandler{

    public KoreaPhoneNumberHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(MemberInfoDto memberInfoDto) {

        if (memberInfoDto.getPhoneNumber().startsWith("+82")){
            System.out.println("member country is: korea");
        } else {
            throw new IllegalArgumentException("member의 전화번호가 한국 전화번호에 맞지 않음");
        }

        super.handle(memberInfoDto);
    }
}
