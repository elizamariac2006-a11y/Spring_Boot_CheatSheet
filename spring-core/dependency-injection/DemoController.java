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
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach,
                          @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor : " + getClass().getSimpleName());
        this.myCoach = theCoach;
        this.anotherCoach = theAnotherCoach;
     }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
         return this.myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String compareCoachBeans() {
        if(this.myCoach == this.anotherCoach) {
            return "Same Bean!!";
        } else {
            return "Different Beans!!";
        }
    }
}
