package com.example.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessageSender implements CommandLineRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Bean
    public Queue queue() {
        return new Queue("myQueue");
    }

    public static void main(String[] args) {
        SpringApplication.run(MessageSender.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String message = "Hello, RabbitMQ!";
        rabbitTemplate.convertAndSend("myQueue", message);
        System.out.println("Message sent: " + message);
    }
}
