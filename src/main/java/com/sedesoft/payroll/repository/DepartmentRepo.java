package com.sedesoft.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sedesoft.payroll.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

}
