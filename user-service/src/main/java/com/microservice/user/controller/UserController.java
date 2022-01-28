package com.microservice.user.controller;

import com.microservice.user.entity.User;
import com.microservice.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping(value = "users/")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("save")
    public User save(@Valid @RequestBody User user) {
        log.info("saveUser");
        return userService.save(user);
    }

    @GetMapping("findByUserId/{userId}")
    public Map<String, Object> findUserById(@PathVariable Long userId) {
        log.info("findUserById");
        return userService.findById(userId);
    }
}
