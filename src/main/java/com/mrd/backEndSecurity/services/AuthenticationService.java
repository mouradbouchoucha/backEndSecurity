package com.mrd.backEndSecurity.services;

import com.mrd.backEndSecurity.dto.JwtAuthenticationResponse;
import com.mrd.backEndSecurity.dto.SignInRequest;
import com.mrd.backEndSecurity.dto.SignUpRequest;
import com.mrd.backEndSecurity.models.User;

public interface AuthenticationService {

    User signUp(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signIn(SignInRequest signInRequest);
}
