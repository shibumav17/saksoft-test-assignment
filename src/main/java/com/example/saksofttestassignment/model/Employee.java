package com.example.saksofttestassignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Emp_Sak")
public class Employee {

    @Id
    @GeneratedValue
    Long id;

    private  String Firstname;
    private String Lastname;
    private String email;
    private int age;

    //Default Constructor
    public Employee(){
    }
    //Parametrized Constructor
    public Employee(Long id, String firstname, String lastname, String email, int age) {
        this.id = id;
        Firstname = firstname;
        Lastname = lastname;
        this.email = email;
        this.age = age;
    }
    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
