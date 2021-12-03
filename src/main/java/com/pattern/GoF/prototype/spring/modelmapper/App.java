package com.pattern.GoF.prototype.spring.modelmapper;

import org.modelmapper.ModelMapper;

public class App {
    public static void main(String[] args) {
        MemberDetails jihwan = new MemberDetails(1L, "jihwan", "male", 18);
        MemberDetails siwony = new MemberDetails(2L, "siwony", "gay", 18);

        ModelMapper modelMapper =  new ModelMapper();
        MemberDto jihwanConverted = modelMapper.map(jihwan, MemberDto.class);

        System.out.println(jihwan);
        System.out.println("===============");
        System.out.println(jihwanConverted);
    }
}
