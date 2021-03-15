package com.spring.security.base;


import com.spring.security.model.Authorities;
import com.spring.security.model.Role;
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

       User user =  this.userRepo.findByUsername("Ahmed");
        System.out.println(user.getAddress());
//        this.userRepo.deleteAll();
//        User admin = new User("Ahmed","Ahmed123", "30","Cairo",1);
//        admin.setRoles(this.roleRepo.findAll());
//        admin.setAuthorities(this.authoritiesRepo.findAll());
//        userRepo.save(admin);
//        //////////////////////////////////////
//        User manager = new User("Ali", "Ali123", "25","Giza",1);
//        Role managerRole1  = roleRepo.findById(2L).get();
//        Role managerRole2  = roleRepo.findById(3L).get();
//        Authorities managerAuthorities1 =  authoritiesRepo.findById(2L).get();
//        Authorities managerAuthorities2 =  authoritiesRepo.findById(3L).get();
//        manager.getRoles().add(managerRole1);
//        manager.getRoles().add(managerRole2);
//        manager.getAuthorities().add(managerAuthorities1);
//        manager.getAuthorities().add(managerAuthorities2);
//        userRepo.save(manager);
//        ///////////////////////////////////////
//        User user  = new User("Mohamed", "Mohamed123","35", "Shbra",1);
//        Role userRole = roleRepo.findById(3L).get();
//        Authorities userAuthorities = authoritiesRepo.findById(3L).get();
//        user.getRoles().add(userRole);
//        user.getAuthorities().add(userAuthorities);
//        userRepo.save(user);
    }
}
