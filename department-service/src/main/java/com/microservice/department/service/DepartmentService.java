package com.microservice.department.service;

import com.microservice.department.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department save(Department department);

    List<Department> fetchAllDepartment();

    Department findById(Long departmentId);
}
