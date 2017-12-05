package com.koitt.board.security;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component("customBasicAuthenticationEntryPoint")
public class CustomBasicAuthenticationEntryPoint extends BasicAuthenticationEntryPoint
{
	
}
