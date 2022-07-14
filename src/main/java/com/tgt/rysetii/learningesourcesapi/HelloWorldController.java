package com.tgt.rysetii.learningesourcesapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String hello()
    {
        return "Hello world. First Spring boot app.";
    }
}
