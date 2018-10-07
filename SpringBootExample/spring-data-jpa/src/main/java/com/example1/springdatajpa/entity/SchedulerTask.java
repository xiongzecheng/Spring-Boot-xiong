package com.example1.springdatajpa.entity;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2018/10/6.
 */
@Component
public class SchedulerTask {
    private int count = 0;

    @Scheduled(cron = "*/6 * * * * ?")
    private void process(){
        System.out.println("定时加一"+(count++));
    }
}
