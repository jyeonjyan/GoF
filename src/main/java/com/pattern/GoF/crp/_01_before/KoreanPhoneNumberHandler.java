package com.pattern.GoF.crp._01_before;

import lombok.Getter;

@Getter
public class KoreanPhoneNumberHandler {

    public void handler(MemberInfoDto memberInfoDto){
        if (memberInfoDto.getPhoneNumber().startsWith("+82")){
            System.out.println("member country is: korea");
        } else {
            throw new IllegalArgumentException("member의 전화번호가 한국 전화번호에 맞지 않음");
        }
    }

}
