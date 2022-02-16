package com.pattern.GoF.crp._02_after;

import com.pattern.GoF.crp._01_before.MemberInfoDto;

public class Client {
    private final RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void run(){
        final MemberInfoDto jyeonjyanProfile = MemberInfoDto.builder()
                .name("jyeonjyan")
                .phoneNumber("+82 10-1234-1234")
                .language("utf-8")
                .build();

        requestHandler.handle(jyeonjyanProfile);
    }

    public static void main(String[] args) {
        // chaining
        RequestHandler chain = new KoreaPhoneNumberHandler(new Utf8CheckHandler(null));

        // run
        Client client = new Client(chain);
        client.run();
    }
}
