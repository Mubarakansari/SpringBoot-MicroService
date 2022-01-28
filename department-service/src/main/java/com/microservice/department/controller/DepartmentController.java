package com.microservice.department.controller;

import com.microservice.department.entity.Department;
import com.microservice.department.service.DepartmentService;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;

@RestController
@RequestMapping("departments/")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    private DepartmentService departmentService;
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping( value ="save")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("saveDepartment");
        return departmentService.save(department);
    }

    @GetMapping("findById/{departmentId}")
    public Department findDepartmentById(@PathVariable Long departmentId) {
        LOGGER.info("findDepartmentById");
        return departmentService.findById(departmentId);
    }

    @GetMapping("getAll")
    public List<Department> getAllDepartments() {
        LOGGER.info("getAllDepartments");
        return departmentService.fetchAllDepartment();
    }

}
