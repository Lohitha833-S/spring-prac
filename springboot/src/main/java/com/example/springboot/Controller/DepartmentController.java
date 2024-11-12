package com.example.springboot.Controller;

import com.example.springboot.Entity.Department;
import com.example.springboot.Service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentservice;
    private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody com.example.springboot.Entity.Department department) {
        logger.info("save dept is working fine");
        return departmentservice.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        logger.info("fetch dept is working fine");
        return departmentservice.fetchDepartmentList();

    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentbyId(@PathVariable("id") Long dept_Id) {
        return departmentservice.fetchdeparmentbyID(dept_Id);
    }

    @DeleteMapping("/departments/{id}")
    public String deletedeptById(@PathVariable("id") Long dept_id) {

        departmentservice.deletedeptById(dept_id);
        return "Department deleted successfully ";
    }

    @PutMapping("/departments/{id}")
    public Department updatedepartment(@PathVariable Long id, @RequestBody Department department) {
        return departmentservice.updatedepartment(id, department);
    }
    @GetMapping("/departments/name/{deptname}")
    public Department fetchdepartmentbyname(@PathVariable String deptname,String department)
    {
        return departmentservice.fetchdepartmentbyname(deptname);
    }
}