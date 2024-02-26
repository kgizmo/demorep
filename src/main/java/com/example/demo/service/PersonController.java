package com.example.demo.service;

import com.example.demo.repository.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reactor.core.publisher.Mono;

@Controller
public class PersonController {
    EmployeeRepository employeeRepository;
    @Autowired
    private void setEmployeeRepository(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping(value="/person/{id}", method = RequestMethod.GET)
    public Mono<Employee> getPerson(@PathVariable String id){
        return employeeRepository.getEmployeeById(id);
    }
}
