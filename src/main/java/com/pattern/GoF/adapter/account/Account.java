package com.pattern.GoF.adapter;

import lombok.Builder;

import java.time.LocalDateTime;

public class Account {
    private String username;
    private String password;
    private String birth;
    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;
    private Sex sex;

    enum Sex {
        MALE, FEMALE
    }

    @Builder
    public Account(String username, String password, String birth, LocalDateTime createdDateTime, LocalDateTime modifiedDateTime, Sex sex) {
        this.username = username;
        this.password = password;
        this.birth = birth;
        this.createdDateTime = createdDateTime;
        this.modifiedDateTime = modifiedDateTime;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
