package me.hifancy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class RouterController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/hello")
    public String welcome(ModelMap model) {

        return "query";
    }

    @RequestMapping("/")
    public String login(){
        return "signin";
    }

    @RequestMapping("/signup")
    public String logup(){
        return "signup";
    }


}
