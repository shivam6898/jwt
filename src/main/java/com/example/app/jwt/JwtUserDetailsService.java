package com.example.app.jwt;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Replace this with your user retrieval logic (e.g., database lookup)
        if ("admin".equals(username)) {
            return new User("admin", "password", Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")));
        } else if ("manager".equals(username)) {
            return new User("manager", "password", Arrays.asList(new SimpleGrantedAuthority("ROLE_MANAGER")));
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
