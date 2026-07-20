package com.luv2code.springcoredome.rest;

import com.luv2code.springcoredome.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        //used @Primary on tennisCoach, but this will be the one used if i dont use @Qualifier
        //if i use @Qualifier, it has HIGHER priority than @Priority, so here cricketCoach will be used
        //@Qualifier > @priority
        this.myCoach = theCoach;
     }

    //define a setter for dependency injection
//    @Autowired
//    public void setCoach(Coach theCoach) {
//        this.myCoach = theCoach;
//    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
         return this.myCoach.getDailyWorkout();
    }
}
