package com.springapigatway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User service is taking longer then Excepted." + "Please try again later";
    }

    @GetMapping("/departmentServiceFallBck")
    public String departmentServiceFallBackMethod() {
        return "Department Service is taking longer then Excepted." + "Please try again later";
    }
}
