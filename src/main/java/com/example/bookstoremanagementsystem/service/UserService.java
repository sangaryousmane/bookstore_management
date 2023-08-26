package com.example.bookstoremanagementsystem.service;

import com.example.bookstoremanagementsystem.entities.Users;
import com.example.bookstoremanagementsystem.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UsersRepository usersRepo;

    public UserService(UsersRepository usersRepo) {
        this.usersRepo = usersRepo;
    }

    public List<Users> getAllUsers(){
        return usersRepo.findAll();
    }
}
