package com.example.springboot.repository;

import com.example.springboot.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findByDeptname(String deptname);
}
