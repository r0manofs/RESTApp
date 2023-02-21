package ru.romanov.RestApplication.MyRestApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "HellOoOoOoO world!";
    }
}
