package com.microservice.user.service.Impl;

import com.microservice.user.entity.User;
import com.microservice.user.pojo.Department;
import com.microservice.user.repository.UserRepository;
import com.microservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Map<String, Object> findById(Long userId) {
        Map response = new HashMap();

        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User id not found"));
        response.put("user", user);

        response.put("department", restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/findById/"+ user.getDepartmentId(), Department.class));

        return response;
    }
}
