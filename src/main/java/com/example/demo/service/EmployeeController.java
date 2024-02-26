package com.example.demo.service;


import com.example.demo.repository.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.http.HttpResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Validated
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/{id}")
    public Mono<Employee> getEmployeeById(@PathVariable String id){
        System.out.println("employeeRepository " + employeeRepository);
        return employeeRepository.getEmployeeById(id);
    }

    @GetMapping(value="/all")
    public Flux<Employee> getAllEmployees() {
        return employeeRepository.findAllEmployees();
    }


    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        System.out.println("Employee added " + employee);
        return employee;
    }


}
