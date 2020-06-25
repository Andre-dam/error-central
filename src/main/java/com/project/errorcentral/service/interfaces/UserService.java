package com.project.errorcentral.service.interfaces;

import com.project.errorcentral.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findById(String email);
}
