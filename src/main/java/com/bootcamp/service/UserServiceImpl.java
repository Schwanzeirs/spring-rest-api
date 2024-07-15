package com.bootcamp.service;

import org.springframework.stereotype.Service;

import com.bootcamp.adapter.UserAdapter;
import com.bootcamp.dto.UserRequest;
import com.bootcamp.entities.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    
    private final UserAdapter userAdapter;

    public UserServiceImpl(UserAdapter userAdapter) {
        this.userAdapter = userAdapter;
    }

    @Override
    public User insertUser(UserRequest request) {
        try {
            return userAdapter.insert(new User(request));
        } catch (Exception exception) {
            throw exception;
        }
    }

    @Override
    public User validateUser(UserRequest request) {
        try {
            User user = userAdapter.findByUsername(request.getUsername());

            if(user != null) {
                if(user.getPassword().equals(request.getPassword())) {
                    return user;
                }
            }

            return null;
        } catch (Exception exception) {
            throw exception;
        }
    }
}
