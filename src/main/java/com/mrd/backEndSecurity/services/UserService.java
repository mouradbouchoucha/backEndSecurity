package com.mrd.backEndSecurity.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface UserService {
    UserDetailsService userDetailsService();

}
