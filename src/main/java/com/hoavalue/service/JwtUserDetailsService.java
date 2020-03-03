package com.hoavalue.service;


import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("javainuse".equals(username)) { 
			return new User("javainuse", "password-WXx2lPk1C3G6",
					new ArrayList<>());
		} else if ("myuser".equals(username)) {
			return new User("javainuse", "password-kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>()); 
		} else if ("10".equals(username)) {
			return new User("10", "password-kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
		}
		else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}