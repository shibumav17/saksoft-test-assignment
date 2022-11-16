package com.example.saksofttestassignment.service;

import com.example.saksofttestassignment.model.Employee;
import com.example.saksofttestassignment.repository.Employee_Jpa_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employee_Service {
    @Autowired
    Employee_Jpa_Repository repository;
    //POST
    public String add(Employee employee) {
        repository.save(employee);
        return "Employee successfully added";
    }
    //GET
    public List<Employee> getemployees(){
        return repository.findAll();
    }
    //PUT
    public String updateEmployee(Long id,String firstname){
        //step 1: find the object in database
        Employee employee= repository.getById(id);// finding object from DB based on given id
        employee.setFirstname(firstname);
        //step 2: save the object
        repository.save(employee);
        return "Successfully updated name as: "+firstname;
    }
    //DELETE
    public String deleteById(Long id){
        repository.deleteById(id);
        return "Successfully deleted student ";
    }
}
