package com.portfolio.da.security;

public class AuthResponse {
    
    private String mail;
    private String accessToken;

    public AuthResponse() {
    }

    public AuthResponse(String mail, String accessToken) {
        this.mail = mail;
        this.accessToken = accessToken;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
