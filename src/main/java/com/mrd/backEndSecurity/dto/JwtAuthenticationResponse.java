package com.mrd.backEndSecurity.dto;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {

    private String accessToken;
    private String refreshToken;
}
