package com.luv2code.springcoredome.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Now Spring creates two different object in memory2 beans)
// by default its singleton - only one object is created and shared.
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15  minutes!!!!";
    }
}
