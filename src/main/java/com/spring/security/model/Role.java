package com.spring.security.model;

import java.util.Set;

public class Role {
    
    private Long id;
    private String roleName;
    private Set<User> users;
}
