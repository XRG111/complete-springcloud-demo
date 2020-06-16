package com.complete.store.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/complete")
public class LoginController {

    @GetMapping("/login")
    public String login (){
        return "SpringCloud开始了";
    }
}
