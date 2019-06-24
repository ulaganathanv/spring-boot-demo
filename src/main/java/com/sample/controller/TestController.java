package com.sample.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String home() throws Exception {
        Thread.sleep(500);
        return "Hello World!";
    }
}