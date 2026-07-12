package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that returns hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    //expose a new endpoint for "workout\"
    @GetMapping("/workout")
    public String get_daily_workout() {
        return "Run a hard 5k!";
    }

    //expose a new endpoint for fortune
    @GetMapping("/fortune")
    public String get_daily_fortune() {
        return "Today is your lucky day";
    }

}
