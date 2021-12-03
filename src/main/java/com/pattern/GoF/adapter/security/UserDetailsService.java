package com.pattern.GoF.adapter.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
