package com.portfolio.da.security;

import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;

public class AuthRequest {
    @Email
    @Length(min = 7,  max = 45)
    private String mail;
    @Length(min = 4,  max = 45)
    private String password;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
