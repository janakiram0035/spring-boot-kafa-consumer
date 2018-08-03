package com.java.spring.springbootkafkaconsumer.bean;

import java.io.Serializable;

public class User implements Serializable{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String name;

    private  Long Salary;

    private String address;

    public User() {

    }
    public User(String name, Long salary, String address) {
        this.name = name;
        Salary = salary;
        this.address = address;
    }
}
