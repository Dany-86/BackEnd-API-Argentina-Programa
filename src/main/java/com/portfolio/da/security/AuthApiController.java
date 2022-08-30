package com.portfolio.da.security;

import com.portfolio.da.model.UserLogin;
import com.portfolio.da.security.jwt.JwtTokenUtil;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://myportfolio-da.web.app")

public class AuthApiController {
    
    @Autowired
    AuthenticationManager authManager;
    
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    
    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody @Valid AuthRequest request) {
        try {
            Authentication authentication = authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getMail(), request.getPassword()));
            UserLogin login = (UserLogin) authentication.getPrincipal();
            String accessToken = jwtTokenUtil.generateAccessToken(login);
            AuthResponse response = new AuthResponse(login.getMail(), accessToken);
            return ResponseEntity.ok().body(response);
        }
        catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
    
}
