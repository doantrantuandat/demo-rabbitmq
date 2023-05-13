package com.example.demorabbitmq;

import com.example.runner.AppRunner;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableRabbit
public class DemoRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRabbitmqApplication.class, args);
	}

}
