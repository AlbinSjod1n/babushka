package com.babushka.nestingDoll.controller;

import com.babushka.nestingDoll.DataBaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @Autowired
    DataBaseConnection repository;

    @GetMapping ("/")
    public String start(){
        return "index";
    }
    @GetMapping ("/index")
    public String index(){
        return "index";
    }

    @GetMapping ("/nestingdoll")
    public String nestingdoll(){
        return "nestingdoll";
    }

    @GetMapping ("/about")
    public String about(){
        return "about";
    }

    @PostMapping("/nestingdoll")
    public String postNestingdoll(){
        return "nestingdoll";
    }

    //    @ResponseBody
//    @GetMapping("/nestingdollTextbox")
//    public Fact myFormGetAsync() {
//        int number = ThreadLocalRandom.current().nextInt(1, 11); //random number: [1,10]
//        Fact message = new Fact();
//        message.setMsg(Integer.toString(number));
//        System.out.println("Send object: " + message);
//        return message;
//    }
//}
}