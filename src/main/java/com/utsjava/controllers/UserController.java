package com.utsjava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utsjava.model.entities.User;
import com.utsjava.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        userService.removeOne(id);
    }

    @CrossOrigin
    @GetMapping
    public Iterable<User> findAll() {
        return userService.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public User findOne(@PathVariable("id") Long id) {
        return userService.findOne(id);
    }

    @CrossOrigin
    @PutMapping
    public User update(@RequestBody User product) {
        return userService.save(product);
    }
}
