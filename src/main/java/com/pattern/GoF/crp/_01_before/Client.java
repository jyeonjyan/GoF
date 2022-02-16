package com.pattern.GoF.crp._01_before;

public class Client {
    public static void main(String[] args) {
        final MemberInfoDto jyeonjyanProfile = MemberInfoDto.builder()
                .name("jyeonjyan")
                .phoneNumber("+82 10-1234-1234")
                .language("utf-8")
                .build();

        // 한국 전화번호가 맞는지 확인하는 핸들러
        KoreanPhoneNumberHandler koreanPhoneNumberHandler = new KoreanPhoneNumberHandler();
        koreanPhoneNumberHandler.handler(jyeonjyanProfile);

        // 한국어가 맞는지 확인하는 핸들러
        Utf8CheckHandler utf8CheckHandler = new Utf8CheckHandler();
        utf8CheckHandler.handler(jyeonjyanProfile);

        /*
        ......
        handler의 지옥
        ......
         */

    }
}
