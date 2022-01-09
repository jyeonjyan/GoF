package com.pattern.GoF.adapter.security;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginHandler {
    private UserDetailsService userDetailsService;

    public String login(String username, String password){
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)){
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
