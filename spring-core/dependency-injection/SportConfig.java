package com.luv2code.springcoredome.config;

import com.luv2code.springcoredome.common.Coach;
import com.luv2code.springcoredome.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    //the name of the method = the bean id if i dont specify at the annotation
    public Coach swimCoach() {
        return new SwimCoach();
    }
    //great to use when using third party code..
}
