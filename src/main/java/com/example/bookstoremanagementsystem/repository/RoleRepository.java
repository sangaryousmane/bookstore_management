package com.example.bookstoremanagementsystem.repository;

import com.example.bookstoremanagementsystem.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {
}
