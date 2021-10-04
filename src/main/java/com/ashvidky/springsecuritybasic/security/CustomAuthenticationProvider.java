package com.ashvidky.springsecuritybasic.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.util.Assert;

public class CustomAuthenticationProvider implements AuthenticationProvider{

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		String userName = authentication.getName();
		String password = (String)authentication.getCredentials();
		
		Assert.notNull(userName, "Username cannot be empty");
		Assert.notNull(password, "Password cannot be empty");
		
		// IMPLEMENT ANY CUSTOM LOGIC HERE
		
		if (userName.startsWith("alex") && password.startsWith("Test"))
			return new UsernamePasswordAuthenticationToken(authentication.getPrincipal(), password, null);
		else
			throw new BadCredentialsException("Username/password are incorrect.");

	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}
