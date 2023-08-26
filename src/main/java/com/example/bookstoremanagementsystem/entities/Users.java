package com.example.bookstoremanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "Users")
@Table(name = "users")
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
public class Users extends AbstractEntitySuper{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean enabled;

    @ManyToMany
    private Set<Roles> roles=new HashSet<>();
}
