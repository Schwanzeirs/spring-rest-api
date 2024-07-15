package com.bootcamp.service;

import org.springframework.stereotype.Service;

import com.bootcamp.dto.UserRequest;
import com.bootcamp.entities.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface UserService {
    User insertUser(UserRequest request);
    User validateUser(UserRequest request);
}
