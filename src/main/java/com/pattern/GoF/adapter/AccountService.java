package com.pattern.GoF.adapter;

import java.time.LocalDateTime;

public class AccountService {

    public Account createAccount(String username, String password, String birth, Account.Sex sex){
        return Account.builder()
                .username(username)
                .password(password)
                .birth(birth)
                .createdDateTime(LocalDateTime.now())
                .createdDateTime(LocalDateTime.now())
                .sex(sex)
                .build();
    }

    public void createNewAccount(Account account){

    }

    public void updateAccount(Account account){

    }
}
