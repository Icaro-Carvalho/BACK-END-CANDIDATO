package br.com.ProjetoCandidato.api.security.jwt;

import br.com.ProjetoCandidato.core.service.UserDetailsImpl;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.MalformedInputException;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtils {

    @Value("${menorAprendiz.jwtSecret}")
    private String jwtSecret;

    @Value("${menorAprendiz.jwtExpirationMs}")
    private int jwtExpirationMs;

    public String generateTokenFromUserDetailsImpl(UserDetailsImpl userDetails){
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + jwtExpirationMs))
                .signWith(getSigninKey(), SignatureAlgorithm.HS512).compact();
    }

    public Key getSigninKey() {
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
        return key;
    }

    public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(getSigninKey()).build().parseClaimsJws(authToken);
            return true;
        }catch(MalformedJwtException e) {
            System.out.println("Token inválido " + e.getMessage());
            //Adicionar o log4j aqui
        }catch(ExpiredJwtException e) {
            System.out.println("Token expirado " + e.getMessage());
            //Adicionar o log4j aqui
        }catch(UnsupportedJwtException e) {
            System.out.println("Token não suportado " + e.getMessage());
            //Adicionar o log4j aqui
        }catch(IllegalArgumentException e) {
            System.out.println("Token Argumento inválido " + e.getMessage());
            //Adicionar o log4j aqui
        }

        return false;
    }

}
