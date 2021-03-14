package com.spring.security.model;


import java.util.Set;

public class User {

    private Long id;
    private String username;
    private String password;
    private String age;
    private String address;
    private Set<Role> roles;
    private Set<Authorities> authorities;
}
