package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class DefaultController {

    @RequestMapping("/page")
    public String index() {
        return "index";
    }
}
