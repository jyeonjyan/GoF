package com.pattern.GoF.adapter;

import com.pattern.GoF.adapter.security.UserDetails;
import com.pattern.GoF.adapter.security.UserDetailsService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findByUsername(username);
        return new AccountUserDetails(account);
    }
}
