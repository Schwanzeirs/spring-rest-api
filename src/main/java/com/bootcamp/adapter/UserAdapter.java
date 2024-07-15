package com.bootcamp.adapter;

import org.springframework.stereotype.Component;

import com.bootcamp.entities.User;
import com.bootcamp.repository.UserRepository;

@Component
public class UserAdapter {
    
    private final UserRepository userRepository;

    public UserAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findById(long id) {
        return userRepository.findById(id).get();
    }
}
