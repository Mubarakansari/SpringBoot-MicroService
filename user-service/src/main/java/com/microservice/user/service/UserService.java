package com.microservice.user.service;

import com.microservice.user.entity.User;

import java.util.Map;

public interface UserService {
    User save(User user);

    Map<String, Object> findById(Long userId);
}
