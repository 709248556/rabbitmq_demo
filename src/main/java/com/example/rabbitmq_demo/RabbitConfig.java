package com.example.rabbitmq_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

/**
 * @author yanlianglong
 * @Title: RabbitConfig.java
 * @Package com.example.rabbitmq_demo
 * @Description: RabbitMQ 配置类
 * @date 2020/3/26 16:14
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("hello");
    }
}