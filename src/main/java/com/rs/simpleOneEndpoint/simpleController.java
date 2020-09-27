package com.rs.simpleOneEndpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class simpleController {

    @GetMapping(value = "/getHeartBeat")
    public  String getHearBeat(){
        return "I'm Alive and current time is : "+ LocalDateTime.now();

    }
}
