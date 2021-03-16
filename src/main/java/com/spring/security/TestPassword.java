package com.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class TestPassword {


    public static void main(String[] args) {


        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String en = encoder.encode("Ahmed123");
       boolean  dd = encoder.matches(en,"$2a$10$ebv5AZLYygpnZ9VnXEf22ugv/vFQRmg/IboAfID236Tl9iR45e4vi");
        System.out.println(dd);
      System.out.println(en);
    }
}
