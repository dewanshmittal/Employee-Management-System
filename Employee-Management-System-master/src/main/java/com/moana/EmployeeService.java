package com.moana;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moana.model.Employees;

public interface EmployeeService extends JpaRepository<Employees,String>{

	boolean existsByEid(String eid);

}
