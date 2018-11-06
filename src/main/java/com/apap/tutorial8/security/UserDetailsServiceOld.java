package com.apap.tutorial8.security;

import org.springframework.security.core.userdetails.UserDetails;



/**
 * CarService
 */
public interface UserDetailsServiceOld {
	 UserDetails loadUserByUsername(String username);
	 
}
