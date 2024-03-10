package com.mrd.backEndSecurity.controllers;

import com.mrd.backEndSecurity.dto.JwtAuthenticationResponse;
import com.mrd.backEndSecurity.dto.SignInRequest;
import com.mrd.backEndSecurity.dto.SignUpRequest;
import com.mrd.backEndSecurity.models.User;
import com.mrd.backEndSecurity.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signUp(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signIn(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signIn(signInRequest));
    }

}
