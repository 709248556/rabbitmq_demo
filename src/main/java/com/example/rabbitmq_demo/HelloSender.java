package com.example.rabbitmq_demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author yanlianglong
 * @Title: HelloSender.java
 * @Package com.example.rabbitmq_demo
 * @Description: 消息发送者
 * @date 2020/3/26 16:18
 */
@Component
public class HelloSender {


    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send() {
        String context = "hello----" + LocalDateTime.now();
        System.out.println("send:" + context);
        //往名称为 hello 的queue中发送消息
        this.amqpTemplate.convertAndSend("hello", context);
    }
}