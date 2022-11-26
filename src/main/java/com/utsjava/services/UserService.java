package com.utsjava.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utsjava.model.entities.User;
import com.utsjava.model.repos.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User save(User user) {
        return userRepo.save(user);
    }

    public Iterable<User> findAll() {
        return userRepo.findAll();
    }

    public User findOne(Long id) {
        Optional<User> user = userRepo.findById(id);
        if (!user.isPresent()) {
            return null;
        }
        return userRepo.findById(id).get();
    }

    public void removeOne(Long id) {
        userRepo.deleteById(id);
    }
}
