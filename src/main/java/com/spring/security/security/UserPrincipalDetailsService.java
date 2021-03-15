package com.spring.security.security;

import com.spring.security.model.User;
import com.spring.security.model.UserPrincipal;
import com.spring.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    private UserRepo userRepo;

    @Autowired
    public UserPrincipalDetailsService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        UserPrincipal  userPrincipal = new UserPrincipal(user);
        return userPrincipal;
    }
}
