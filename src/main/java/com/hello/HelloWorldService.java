package com.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String getWelcome(){
        return "Hello World";
    }
}
