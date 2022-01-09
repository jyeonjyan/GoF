package com.pattern.GoF.adapter.account;

import java.time.LocalDateTime;

public class AccountService {

    // DB에서 찾았다고 생각하고 Account를 return 한다.
    public Account findByUsername(String username){
        return Account.builder()
                .username(username)
                .password("1234")
                .birth("0125")
                .createdDateTime(LocalDateTime.now())
                .createdDateTime(LocalDateTime.now())
                .sex(Account.Sex.MALE)
                .build();
    }

    public void createNewAccount(Account account){

    }

    public void updateAccount(Account account){

    }
}
