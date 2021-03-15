package com.spring.security.base;


import com.spring.security.model.User;
import com.spring.security.repo.AuthoritiesRepo;
import com.spring.security.repo.RoleRepo;
import com.spring.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DataLoader implements CommandLineRunner {

    private UserRepo userRepo;
    private RoleRepo roleRepo;
    private AuthoritiesRepo authoritiesRepo;

    @Autowired
    public DataLoader(UserRepo userRepo, RoleRepo roleRepo, AuthoritiesRepo authoritiesRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
        this.authoritiesRepo = authoritiesRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Ahmed","Ahmed123", "30","Cairo",1);
        user.setRoles(this.roleRepo.findAll());
        user.setAuthorities(this.authoritiesRepo.findAll());
        userRepo.save(user);
    }
}
