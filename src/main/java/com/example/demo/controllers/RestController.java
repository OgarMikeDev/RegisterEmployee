//package com.example.demo.controllers;
//
//import com.example.demo.model.Employee;
//import com.example.demo.repository.Repository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@org.springframework.web.bind.annotation.RestController
//@RequiredArgsConstructor
//public class RestController {
//    private final Repository repository;
//
//
//    @PostMapping("/")
//    private Employee addEmployee(@RequestBody Employee employeeInput) {
//        Employee employee = new Employee();
//        employee.setEmail(employeeInput.getEmail());
//
//        return repository.save(employee);
//    }
//}
