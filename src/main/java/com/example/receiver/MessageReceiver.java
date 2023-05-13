package com.example.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
    @RabbitListener(queues = "#{ '${my.queue.name}' }")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
