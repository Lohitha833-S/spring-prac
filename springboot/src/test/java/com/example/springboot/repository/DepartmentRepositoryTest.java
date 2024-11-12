package com.example.springboot.repository;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest

class DepartmentRepositoryTest {
    @Autowired
private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp() {
    }
}