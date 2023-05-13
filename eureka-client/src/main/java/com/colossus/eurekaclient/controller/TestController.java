package com.colossus.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping ("/test")
    public String test(){
        return "test controller is alive.";
    }
}
