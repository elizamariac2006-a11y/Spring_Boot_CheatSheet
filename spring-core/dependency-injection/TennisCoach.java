package com.luv2code.springcoredome.common;

import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
