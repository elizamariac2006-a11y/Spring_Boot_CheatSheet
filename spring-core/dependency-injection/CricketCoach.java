package com.luv2code.springcoredome.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Now Spring creates two different object in memory2 beans)
// by default its singleton - only one object is created and shared.
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15  minutes!!!!";
    }

    @PostConstruct
    //I can have more, but I dont know how they will act... so its better to have one that manages
    //the rest in case they have a logical order..
    public void afterInitialization() {
        firstFuction();
        secondFunction();
    }

    private void firstFuction() {
        System.out.println("First part after constructor...");
    }

    private void secondFunction() {
        System.out.println("And now second part after constructor..");
    }

    @PreDestroy
    //Same logic, we dont know in which order they are called, so its better to have one..
    //FOR BEANS OF TYPE PROTOTYPE THE @PreDestroy IS NOT CALLED!!!!
    public void beforeDestructor() {
        functionBeforeDestruction1();
        functionBeforeDestruction2();
    }

    private void functionBeforeDestruction1() {
        System.out.println("The object will be destroyed...");
    }

    private void functionBeforeDestruction2() {
        System.out.println("Right after this message...");
    }
}
