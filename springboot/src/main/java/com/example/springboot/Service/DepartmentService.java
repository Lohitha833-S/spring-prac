package com.example.springboot.Service;

import com.example.springboot.Entity.Department;

import java.util.List;

public interface DepartmentService {


    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchdeparmentbyID(Long dept_Id);


    public void deletedeptById(Long dept_id);

  public  Department updatedepartment(Long dept_id, Department department);

   public Department fetchdepartmentbyname(String deptname);
}
