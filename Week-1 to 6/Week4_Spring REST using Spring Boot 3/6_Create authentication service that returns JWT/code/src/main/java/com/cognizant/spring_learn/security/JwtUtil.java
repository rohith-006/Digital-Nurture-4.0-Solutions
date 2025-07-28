package com.cognizant.spring_learn.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtil {
    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256); // Secret key

    public static String generateToken(String username) {
        long nowMillis = System.currentTimeMillis();
        long expiryMillis = nowMillis + 10 * 60 * 1000; // 10 minutes

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(nowMillis))
                .setExpiration(new Date(expiryMillis))
                .signWith(key)
                .compact();
    }
}
