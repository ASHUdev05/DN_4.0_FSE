package com.cognizant.load_country_xml.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START authenticate()");
        LOGGER.debug("Authorization Header: {}", authHeader);

        String user = getUser(authHeader);
        LOGGER.debug("User from Authorization Header: {}", user);
        
        Map<String, String> map = new HashMap<>();
        String token = generateJwt(user);
        map.put("token", token);

        LOGGER.info("END authenticate()");
        return map;
    }
    
    private String getUser(String authHeader) {
    	LOGGER.info("START getUser()");
        LOGGER.debug("Authorization Header: {}", authHeader);

        String base64Credentials = authHeader.substring("Basic".length()).trim();

        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String decodedCredentials = new String(decodedBytes);

        LOGGER.debug("Decoded Credentials: {}", decodedCredentials);

        // Extract username before the colon
        String username = decodedCredentials.split(":", 2)[1];

        LOGGER.debug("Extracted Username: {}", username);
        LOGGER.info("END getUser()");
        return username;
    }
    
    private String generateJwt(String user) {
        LOGGER.debug("START generateJwt() for user: {}", user);

        JwtBuilder builder = Jwts.builder();
        builder.setSubject(user);
        builder.setIssuedAt(new Date());
        builder.setExpiration(new Date((new Date()).getTime() + 1200000)); // 20 mins
        builder.signWith(SignatureAlgorithm.HS256, "secretkey");

        String token = builder.compact();

        LOGGER.debug("Generated JWT token: {}", token);
        LOGGER.debug("END generateJwt()");
        return token;
    }

    
}
