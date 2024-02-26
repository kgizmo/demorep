package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class EmployeeRepository {
    public Mono<Employee> getEmployeeById(String id){
        return Mono.just(new Employee(1, "First"));
    }

    public Flux<Employee> findAllEmployees() {
        Employee e1 = new Employee(2, "second");
        Employee e2 = new Employee(3, "third");
        Employee e3 = new Employee(4, "fourth");

        return Flux.just(e1,e2,e3);
    }

}
