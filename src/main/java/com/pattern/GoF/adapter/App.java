package com.pattern.GoF.adapter;

import com.pattern.GoF.adapter.account.AccountService;
import com.pattern.GoF.adapter.account.AccountUserDetailsService;
import com.pattern.GoF.adapter.security.LoginHandler;
import com.pattern.GoF.adapter.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String jihwan = loginHandler.login("jihwan", "1234");
        System.out.println(jihwan);
    }
}
