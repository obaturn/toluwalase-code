package com.example.Full_Ecommerce_App.Configuration.SecurityConfiguration;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.util.Base64;

public class SecretKeyGenerator {
    public static void  main(String[] args) {
        byte [] KeysByte = Keys.secretKeyFor(SignatureAlgorithm.HS384).getEncoded();
        String encodedKey = Base64.getEncoder().encodeToString(KeysByte);
        System.out.println("Generated key is"+encodedKey);
    }
}
