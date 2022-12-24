package com.guilherme.mitask.webSecurityConfig;

import java.util.Optional;

import com.guilherme.mitask.model.User;
import com.guilherme.mitask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = this.userService.findByEmail(email);

        if(user.isPresent()){
            return (UserDetails) user.get();
        }

        throw new UsernameNotFoundException("invalid credencials!");
    }
}
