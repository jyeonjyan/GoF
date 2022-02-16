package com.pattern.GoF.crp._02_after;

import com.pattern.GoF.crp._01_before.MemberInfoDto;

public abstract class RequestHandler {
    private final RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(MemberInfoDto memberInfoDto){
        if (nextHandler != null){
            nextHandler.handle(memberInfoDto);
        }
    }

}
