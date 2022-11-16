package com.example.saksofttestassignment.controller;

import com.example.saksofttestassignment.model.Employee;
import com.example.saksofttestassignment.service.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employee_Controller {

    @Autowired
    Employee_Service service;
    @PostMapping("addempsak")
    public String add(@RequestBody Employee employee){

        return service.add(employee);
    }
    @GetMapping("getempsak")
    public List<Employee> getemployees(){
        return service.getemployees();
    }
    @PutMapping("updateempsak")
    public String updateEmployee(@RequestParam Long id,@RequestParam String firstname){
        return service.updateEmployee(id,firstname);
    }
    @DeleteMapping("deleteempsak")
    public String delete(@RequestParam Long id){

        return service.deleteById(id);
    }

}
