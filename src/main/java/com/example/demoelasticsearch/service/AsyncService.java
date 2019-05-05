package com.example.demoelasticsearch.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {


    @Async
    public String sayHello(){
        try {

            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("处理任务");

        return "hello";
    }
}
