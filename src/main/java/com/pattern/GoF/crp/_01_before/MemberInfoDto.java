package com.pattern.GoF.crp._01_before;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberInfoDto {
    private final String name;
    private final String phoneNumber;
    private final String language;

    @Builder
    public MemberInfoDto(String name, String phoneNumber, String language) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.language = language;
    }
}
