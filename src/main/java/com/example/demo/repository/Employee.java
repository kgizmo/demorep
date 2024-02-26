package com.example.demo.repository;

import jakarta.validation.constraints.Size;

public class Employee {
    int id;

    public int getId() {
        return id;
    }

    @Size(min = 5, max = 10)
    public String getName() {
        return name;
    }

    String name;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
}
