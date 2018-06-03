package com.bookingapp.agent.security;

import org.springframework.stereotype.Component;

import com.bookingapp.agent.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	private String secret = "tajnica";

	public JwtUser validate(String token) {
		
		JwtUser jwtUser = null;
		try {
		Claims body = Jwts.parser()
							.setSigningKey(secret)
							.parseClaimsJws(token)
							.getBody();
		
		jwtUser = new JwtUser(body.getSubject(), Long.parseLong((String)body.get("userId")), (String) body.get("role") );
//		jwtUser.setUsername(body.getSubject());
//		jwtUser.setId(Long.parseLong((String)body.get("userId")));
//		jwtUser.setRole((String) body.get("role"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return jwtUser;		
	}

}
