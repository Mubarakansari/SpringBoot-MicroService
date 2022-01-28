package com.microservice.department.service.impl;

import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;
import com.microservice.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
