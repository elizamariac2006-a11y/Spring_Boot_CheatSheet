package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //inject properties for coach.name, coach.team
    @Value("${coach.name}")
    private String coach_name;
    @Value("${team.name}")
    private String team_name;

    //expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String get_team_info() {
        //it will be replaced with Eliza , and Borussia Dortmund
        return ("{ Coach name : " + coach_name + ", Team name : " + team_name + " }");
    }

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
