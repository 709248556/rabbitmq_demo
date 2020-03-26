package com.example.rabbitmq_demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author yanlianglong
 * @Title: HelloReceiver.java
 * @Package com.example.rabbitmq_demo
 * @Description: 消息接受者
 * @date 2020/3/26 16:19
 */
@Component
@RabbitListener(queues = "hello") //监听 名称为 hello 的queue
public class HelloReceiver {

    //消息处理器
    @RabbitHandler
    public void process(String message){
        System.out.println("Receiver:"+message);

    }


}