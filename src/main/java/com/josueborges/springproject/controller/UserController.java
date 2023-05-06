package com.josueborges.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.josueborges.springproject.model.Users;
import com.josueborges.springproject.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

   
	@Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<Users> getUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody Users user) {
        userRepository.save(user);
    }
}
