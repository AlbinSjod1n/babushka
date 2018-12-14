package com.babushka.nestingDoll.controller;

import com.babushka.nestingDoll.DataBaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @Autowired
    DataBaseConnection repository;

    @GetMapping ("/")
    public String index(){
        return "index";
    }

    @GetMapping ("/nestingdoll")
    public String nestingdoll(){
        return "nestingdoll";
    }
}