package com.xuyihao.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Xuyh at 2016/08/04 下午 08:10.
 */
public class TestMain {
    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:app-context-*.xml");
    }
}
