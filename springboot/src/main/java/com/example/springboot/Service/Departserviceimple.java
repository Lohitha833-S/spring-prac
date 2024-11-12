package com.example.springboot.Service;

import com.example.springboot.Entity.Department;
import com.example.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class Departserviceimple implements DepartmentService {
    @Autowired
    private DepartmentRepository departementrepo;

    @Override
    public Department saveDepartment(Department department) {
        return departementrepo.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departementrepo.findAll();
    }

    @Override
    public Department fetchdeparmentbyID(Long dept_Id) {
        return departementrepo.findById(dept_Id).get();
    }

    @Override
    public void deletedeptById(Long dept_id) {
        departementrepo.deleteById(dept_id);

    }

    @Override
    public Department updatedepartment(Long dept_id, Department department) {
        Department depdb=departementrepo.findById(dept_id).get();
        if(Objects.nonNull(department.getDeptname())&& !"".equalsIgnoreCase(department.getDeptname())){
         depdb.setDeptname(department.getDeptname());
        }
        if(Objects.nonNull(department.getDept_code())&& !"".equalsIgnoreCase(department.getDept_code())){
            depdb.setDept_code(department.getDept_code());
        }
        if(Objects.nonNull(department.getDept_add())&& !"".equalsIgnoreCase(department.getDept_add())){
            depdb.setDept_add(department.getDept_add());
        }
        return departementrepo.save(depdb);
    }

    @Override
    public Department fetchdepartmentbyname(String deptname) {
        return departementrepo.findByDeptname(deptname);
    }

}