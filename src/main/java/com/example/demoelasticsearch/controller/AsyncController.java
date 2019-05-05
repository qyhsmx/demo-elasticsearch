package com.example.demoelasticsearch.controller;


import com.example.demoelasticsearch.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/hello")
    public String hello(){
        asyncService.sayHello();
        return "success";
    }
}
