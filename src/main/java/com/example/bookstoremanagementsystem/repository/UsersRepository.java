package com.example.bookstoremanagementsystem.repository;

import com.example.bookstoremanagementsystem.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

    @Query("SELECT u FROM Users u WHERE u.email=:email")
    Users findUsersByEmail(@Param("email") String email);
}
