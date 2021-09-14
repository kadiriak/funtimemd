package com.fun.time.security.jwt;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

import com.fun.time.security.UserPrincipal;

public interface IJwtProvider {
	String generateToken(UserPrincipal auth);

	Authentication getAuthentication(HttpServletRequest request);

	boolean validateToken(HttpServletRequest request);
}
