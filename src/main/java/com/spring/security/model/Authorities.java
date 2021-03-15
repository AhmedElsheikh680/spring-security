package com.spring.security.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authorities")
public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "authority_name")
    private String AythorityName;

    @ManyToMany(mappedBy = "authorities")
    private Set<User> users;
}