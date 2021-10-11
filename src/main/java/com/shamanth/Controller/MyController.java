package com.shamanth.Controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test")
    public String getData(){
        return "hello welcome to Spring Docker and Kubernetes Demo";
    }

}
