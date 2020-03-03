package com.hoavalue.util;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;

@Component
public class JwtTokenUtil implements Serializable {

	private static final long serialVersionUID = -2550185165626007488L;

	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

	@Value("${jwt.secret}")
	private String secret;

	//retrieve username from jwt token
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	}

	//retrieve expiration date from jwt token
	public Date getExpirationDateFromToken(String token) {
		return getClaimFromToken(token, Claims::getExpiration);
	}

	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);
	}
    //for retrieveing any information from token we will need the secret key
	private Claims getAllClaimsFromToken(String token) {
//		try {
//			String key2 = "appleFourEver$#!symbolsWork!HoaValue#WHOA!ZHOE";
//			String token2 = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI3IiwibmFtZSI6InNhbSBmaXNoZXIgYW5kIGh1Z2d5YmFpcmQiLCJpYXQiOjE1MTYyMzkwMjJ9.6wN8p1RXHrXH1GvS02w8iCsTYjlp7U8czOypSwcLkQg";
//			Claims claims = Jwts.parser()
//		            .setSigningKey(DatatypeConverter.parseBase64Binary(key2))
//		            .parseClaimsJws(token2).getBody();
//			String a = "got to here"; 
//		} catch (Exception e) {
//			System.out.println("ERROR - Getting claims from JWT token hoavalue.com");
//			System.out.println(e);
//		}
		try {
//			String token3 = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjcsIm5hbWUiOiJzYW0gZmlzaGVyIiwiaWF0IjoxNTgzMTE3MTE2LCJleHAiOjE1ODMyMDM1MTZ9.fsZO5GE1MQIhiaRiBZN8K40V_cH5i6XOA8CyirkQ5tY";
//			String key3 = "appleFourEver$#!symbolsWork!HoaValue#WHOA!ZHOE";
//			Claims claims = Jwts.parser()
//		            .setSigningKey(DatatypeConverter.parseBase64Binary(key3))
//		            .parseClaimsJws(token3).getBody();
			String a = "got to here"; 
			//return claims;
					
		} catch (Exception e) {
			System.out.println("ERROR - Getting claims from JWT token hoavalue.com");
			System.out.println(e);
		}
		Claims claims = Jwts.parser()
	            .setSigningKey(DatatypeConverter.parseBase64Binary(secret))
	            .parseClaimsJws(token).getBody();
		return claims;
		//return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
	}

	
	
	//check if the token has expired
	private Boolean isTokenExpired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}

	//generate token for user
	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		return doGenerateToken(claims, userDetails.getUsername());
	}

	//while creating the token -
	//1. Define  claims of the token, like Issuer, Expiration, Subject, and the ID
	//2. Sign the JWT using the HS512 algorithm and secret key.
	//3. According to JWS Compact Serialization(https://tools.ietf.org/html/draft-ietf-jose-json-web-signature-41#section-3.1)
	//   compaction of the JWT to a URL-safe string 
	private String doGenerateToken(Map<String, Object> claims, String subject) {

		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
				.signWith(SignatureAlgorithm.HS512, secret).compact();
	}

	//validate token
	public Boolean validateToken(String token, UserDetails userDetails) {
		final String username = getUsernameFromToken(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
}