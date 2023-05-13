package com.example.runner;

import com.example.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class AppRunner implements CommandLineRunner {
    private MessageSender messageSender;

    @Autowired
    public AppRunner(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void run(String... args) throws Exception {
        messageSender.sendMessage("Hello, RabbitMQ!");

    }
}
