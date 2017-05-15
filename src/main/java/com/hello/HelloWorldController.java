package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

   @GetMapping("/")
    public String printHello(){
      return helloWorldService.getWelcome();
    }

}
