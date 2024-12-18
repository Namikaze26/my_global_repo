package com.kafka.kafkaDemo.controller;

import com.kafka.kafkaDemo.service.messagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messageController {
    @Autowired
    private messagePublisher publisher;
    @GetMapping("/message/{message}")
    public ResponseEntity<?> getMessage(@PathVariable String message){
        try{
             publisher.getMessage(message);
             return ResponseEntity.ok("Communication Established");
        }
        catch(Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }
}
