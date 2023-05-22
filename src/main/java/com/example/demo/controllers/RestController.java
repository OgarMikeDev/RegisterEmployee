package com.example.demo.controllers;

import com.example.demo.model.Employee;
import com.example.demo.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@WebServlet("\\login-servlet")
public class RestController extends HttpServlet {

    private final Repository repository;

    @PostMapping("/")
    private Employee addEmployee(@RequestBody Employee employeeInput) {
        Employee employee = new Employee();
        employee.setEmail(employeeInput.getEmail());

        return repository.save(employee);
    }
}
