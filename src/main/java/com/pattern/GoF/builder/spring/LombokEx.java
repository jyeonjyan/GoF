package com.pattern.GoF.builder.spring;

import lombok.Builder;

@Builder
public class LombokEx {
    private final String name;
    private final String age;
    private final String sex;

    public static void main(String[] args) {
        LombokExBuilder builder = LombokEx.builder()
                .name("jihwan")
                .age("18")
                .sex("male");

        System.out.println(builder);
    }
}
