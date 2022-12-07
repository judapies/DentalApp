package com.example.dentalapp.util;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {
	public static final String SECRETKEY= "clave";
	
	public static String getToken(String login,String roles) {
		List<GrantedAuthority> autoridadesAceptadas=AuthorityUtils.commaSeparatedStringToAuthorityList(roles);
		String jwt = Jwts.builder()
				.setId("JWT"+login)
				.setSubject(login)
				.claim("authorities",autoridadesAceptadas.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+30000))
				.signWith(SignatureAlgorithm.HS512, SECRETKEY.getBytes())
				.compact();
		return jwt;
	}
}