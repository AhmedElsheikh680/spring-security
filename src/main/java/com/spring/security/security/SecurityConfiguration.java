package com.spring.security.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("Ahmed").password(passwordEncoder().encode("Ahmed123")).roles("ADMIN")
                .and()
                .withUser("Ali").password(passwordEncoder().encode("Ali123")).roles("MANAGER")
                .and()
                .withUser("Mohamed").password(passwordEncoder().encode("Mohamed123")).roles("USER");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/api/v1/main").permitAll()
                .antMatchers("/api/v1/profile").authenticated()
                .antMatchers("/api/v1/admin/**").hasRole("ADMIN")

                .antMatchers("/api/v1/management").hasAnyRole("ADMIN","MANAGER")
//                .anyRequest().authenticated()
                .and().httpBasic();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }
}
