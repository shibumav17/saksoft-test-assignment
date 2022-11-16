package com.example.saksofttestassignment.repository;

import com.example.saksofttestassignment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_Jpa_Repository extends JpaRepository<Employee,Long> {

}
