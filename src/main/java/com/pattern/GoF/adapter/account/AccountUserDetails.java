package com.pattern.GoF.adapter;

import com.pattern.GoF.adapter.security.UserDetails;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetails implements UserDetails {

    private final Account account;

    @Override
    public String getUsername() {
        return this.account.getUsername();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
