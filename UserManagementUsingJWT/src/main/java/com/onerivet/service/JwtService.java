package com.onerivet.service;

import java.security.Key;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {

	public String generateToken(String userName) {
		Map<String, Object> claims = new HashMap<>();
		return createToken(userName, claims);
	}

	private String createToken(String userName, Map<String, Object> claims) {
		// TODO Auto-generated method stub
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(userName)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
				.signWith(getSignKey(),SignatureAlgorithm.HS256).compact()
				;
	}

	private Key getSignKey() {
		// TODO Auto-generated method stub
		byte[] keyBytes=Decoders.BASE64.decode("655468576D5A7134743777217A25432A462D4A404E635266556A586E32723575");
		return Keys.hmacShaKeyFor(keyBytes);
	}

}
