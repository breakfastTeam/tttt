package com.smartwork.tttt.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PullDataTask {

    @Scheduled(initialDelay=1000, fixedRate=5*60*1000) //延迟1s开始，5分钟一次
    public void pull() {
        System.out.println("Start To Pull：" + LocalDateTime.now());
    }

}
