package com.springboot.springcoredemo.rest;


import com.springboot.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("aqua") Coach theCoach) {
        System.out.println("In Constructor: " + this.getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
