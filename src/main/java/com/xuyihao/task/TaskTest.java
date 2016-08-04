package com.xuyihao.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Xuyh at 2016/08/04 下午 07:53.
 *
 * 测试Spring-Task的功能
 */
@Component("taskTest")
public class TaskTest {
    private int i = 0;

    /**
     * 定时任务
     *
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void taskTest(){
        i++;
        System.out.println("Execute once ... for " + i + " times");
    }
}
