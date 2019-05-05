package com.example.demoelasticsearch.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    @Scheduled(cron = "0-4 * * * * 0-7")
    public void doSth(){
        System.out.println("定时任务");
    }
}
