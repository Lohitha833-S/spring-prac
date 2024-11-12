package com.example.springboot.Service;

import com.example.springboot.Entity.Department;
import com.example.springboot.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {
    @Autowired
private DepartmentService departmentService;
@MockBean
private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp() {
        Department department=Department.builder().deptname("it")
                .dept_add("chennai").dept_code("013").depart_Id(1L).build();
        Mockito.when(departmentRepository.findByDeptname("it")).thenReturn(department);
    }
    @Test
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String deptname="it";
        Department found=departmentService.fetchdepartmentbyname(deptname);
        assertEquals(deptname,found.getDeptname());
    }
}