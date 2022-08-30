package com.portfolio.da.security.jwt;

import com.portfolio.da.model.UserLogin;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final long EXPIRE_DURATION = 24*60*60*1000;
    @Value("${app.jwt.secret}")
    private String secretKey;
    
    public String generateAccessToken(UserLogin login) {
        return Jwts.builder()
                .setSubject(login.getId() + "," + login.getMail())
                .setIssuer("DA")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }

    public boolean validateAccessToken(String token) { 
        try{
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return true;
        } 
        catch(ExpiredJwtException ex) {
            LOGGER.error("El JWT expiró", ex);
        } 
        catch(IllegalArgumentException ex) {
            LOGGER.error("El token es nulo, vacio, o solo tiene espacios en blanco", ex);
        }
        catch (MalformedJwtException ex) {
            LOGGER.error("JWT es inválido", ex);
        }
        catch (UnsupportedJwtException ex) {
            LOGGER.error("JWT no está soportado", ex);
        }
        catch (SignatureException ex) {
            LOGGER.error("La validación de la firma falló", ex);
        }
        
        return false;
    }
    
    public String getSubject(String token) {
        return parseClaims(token).getSubject();
    }
    
    public Claims parseClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }
    
}
