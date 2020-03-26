package com.example.rabbitmq_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqDemoApplicationTests {
	@Autowired
	HelloSender helloSender;

	@Test
	public void contextLoads() {
		helloSender.send();

	}
}
