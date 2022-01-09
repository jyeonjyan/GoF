package com.pattern.GoF.adapter.security;

public class LoginHandler {
    private UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password){
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)){
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
