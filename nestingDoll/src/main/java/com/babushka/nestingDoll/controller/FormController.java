package com.babushka.nestingDoll.controller;

import com.babushka.nestingDoll.DataBaseConnection;
import com.babushka.nestingDoll.Dog;
import com.babushka.nestingDoll.domain.Fact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {

    @Autowired
    DataBaseConnection repository;
    Dog dog = new Dog();

    @GetMapping ("/nestingdoll")
    public String nestingdoll(Model model){
        model.addAttribute("text", "");
        return "nestingdoll";
    }

    @GetMapping("/ajax")
    @ResponseBody
    public Fact dataViaAjax(){
        Fact fact = new Fact();
        fact.setMsg(dog.dogFact());
        return fact;
    }


    @GetMapping ("/")
    public String start(){
        return "index";
    }
    @GetMapping ("/index")
    public String index(){
        return "index";
    }

    @GetMapping ("/about")
    public String about(){
        return "about";
    }

    @PostMapping("/nestingdoll")
    public String postNestingdoll(){
        return "nestingdoll";
    }

}