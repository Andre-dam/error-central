package com.project.errorcentral.service.impl;

import com.project.errorcentral.entity.User;
import com.project.errorcentral.repository.UserRepository;
import com.project.errorcentral.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> findById(String email) {
        return userRepository.findById(email);
    }
}
