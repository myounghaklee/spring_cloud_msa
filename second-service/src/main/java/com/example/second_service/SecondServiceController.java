package com.example.second_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
@Slf4j
public class SecondServiceController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to the First service.";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String header){
        log.info(header);
        return "hello word in second service";
    }


    @GetMapping("/check")
    public String check(){
       return "Hi, This is a message from Second Service";
    }
}
