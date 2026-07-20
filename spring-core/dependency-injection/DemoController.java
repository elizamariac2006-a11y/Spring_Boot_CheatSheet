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

//    define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach theCoach) {
        //we used @Qualifier to tell Spring which implementation we want
        //(Spring has 4 Beans from the Coach interface)
        //We use the BEAN ID - NAME OF THE CLASS WITH THE FIRST LETTER LOWER
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
